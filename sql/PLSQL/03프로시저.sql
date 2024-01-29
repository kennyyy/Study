-- 저장 프로시저 (일련의 SQL처리 과정을 집합처럼 묶어서 사용하는 구조물)

SET SERVEROUTPUT ON;
CREATE OR REPLACE PROCEDURE NEW_JOB_PROC -- 프로시저명
IS -- 지역변수를 선언

BEGIN -- 실행구문

    DBMS_OUTPUT.PUT_LINE('HELLO WORLD');

END;

--실행문
EXEC NEW_JOB_PROC;

----------------------------------------------------
--프로시저의 매개변수 IN
CREATE OR REPLACE PROCEDURE NEW_JOB_PROC -- 동일한 이름으로 만들면 수정됩니다.
(P_JOB_ID IN JOBS.JOB_ID%TYPE,
 P_JOB_TITLE IN JOBS.JOB_TITLE%TYPE,
 P_MIN_SALARY IN JOBS.MIN_SALARY%TYPE,
 P_MAX_SALARY IN JOBS.MAX_SALARY%TYPE
)

IS
BEGIN
    INSERT INTO JOBS VALUES (P_JOB_ID, P_JOB_TITLE, P_MIN_SALARY, P_MAX_SALARY);

END;

--
EXEC NEW_JOB_PROC('SAMPLE', 'TEXT', 1000, 10000);


------------------------------------------------------------------------------
--디폴트 매개변수
CREATE OR REPLACE PROCEDURE NEW_JOB_PROC -- 동일한 이름으로 만들면 수정됩니다.
(P_JOB_ID IN JOBS.JOB_ID%TYPE,
 P_JOB_TITLE IN JOBS.JOB_TITLE%TYPE,
 P_MIN_SALARY IN JOBS.MIN_SALARY%TYPE := 0,
 P_MAX_SALARY IN JOBS.MAX_SALARY%TYPE := 1000
)

IS
BEGIN
    INSERT INTO JOBS_IT VALUES (P_JOB_ID, P_JOB_TITLE, P_MIN_SALARY, P_MAX_SALARY);

END;

--
EXEC NEW_JOB_PROC('SAMPLE', 'TEXT', 1000, 10000); --OK
EXEC NEW_JOB_PROC('TEST1', 'TEXT1', 1000); -- 마지막값은 기본매개변수로 전달
EXEC NEW_JOB_PROC('TEST2', 'TEXT2'); -- 마지막 2개의값은 디폴트 매개변수로 전달
EXEC NEW_JOB_PROC('TEST3'); -- 매개변수가 맞지 않기 때문에 ERR
SELECT * FROM JOBS_IT;

----------------------------------------------------------------------------------
--프로시저에서는 PL/SQL에서 사용한 모든 문법을 전부 사용가능합니다.
--JOB_ID가 존재하지 않으면 UPDATE, 존재하면 INSERT
CREATE OR REPLACE PROCEDURE NEW_JOB_PROC 
(P_JOB_ID IN JOBS.JOB_ID%TYPE,
 P_JOB_TITLE IN JOBS.JOB_TITLE%TYPE,
 P_MIN_SALARY IN JOBS.MIN_SALARY%TYPE := 0,
 P_MAX_SALARY IN JOBS.MAX_SALARY%TYPE := 1000
)
IS
    CNT NUMBER := 0; -- 지역변수
BEGIN
    SELECT COUNT(*) INTO CNT
    FROM JOBS_IT WHERE JOB_ID = P_JOB_ID; --매개변수로 들어온 값
    
    IF CNT = 0 THEN
        INSERT INTO JOBS_IT VALUES ( P_JOB_ID, P_JOB_TITLE, P_MIN_SALARY, P_MAX_SALARy); -- 매개변수 INSERT
       
    ELSE
        UPDATE JOBS_IT SET 
        JOB_TITLE = P_JOB_TITLE,
        MIN_SALARY = P_MIN_SALARY,
        MAX_SALARY = P_MAX_SALARY
        WHERE JOB_ID = P_JOB_ID;
    END IF;  
END;

EXEC NEW_JOB_PROC('ADMIN', 'ADMINISTRATION', 1000, 20000);
EXEC NEW_JOB_PROC('ADMIN', 'ADMINISTRATION DBA', 1000, 30000);

SELECT * FROM JOBS_IT WHERE JOB_ID = 'ADMIN';

---------------------------------------------------------------------------

--OUT매개변수 - 외부로 값을 돌려주기위한 매개변수
--OUT매개변수를 사용할려면 익명블록에서 호출해야 합니다.
CREATE OR REPLACE PROCEDURE NEW_JOB_PROC 
(P_JOB_ID IN JOBS.JOB_ID%TYPE,
 P_JOB_TITLE IN JOBS.JOB_TITLE%TYPE,
 P_MIN_SALARY IN JOBS.MIN_SALARY%TYPE := 0,
 P_MAX_SALARY IN JOBS.MAX_SALARY%TYPE := 1000,
 P_RESULT OUT NUMBER
)
IS
    CNT NUMBER := 0; -- 지역변수
BEGIN
    SELECT COUNT(*) INTO CNT
    FROM JOBS_IT WHERE JOB_ID = P_JOB_ID; --매개변수로 들어온 값
    
    IF CNT = 0 THEN
        INSERT INTO JOBS_IT VALUES ( P_JOB_ID, P_JOB_TITLE, P_MIN_SALARY, P_MAX_SALARy); -- 매개변수 INSERT
        
        --아웃 변수에 값을 대입
        P_RESULT := 0;
    ELSE
        UPDATE JOBS_IT SET 
        JOB_TITLE = P_JOB_TITLE,
        MIN_SALARY = P_MIN_SALARY,
        MAX_SALARY = P_MAX_SALARY
        WHERE JOB_ID = P_JOB_ID;
        
         --아웃 변수에 값을 대입
        P_RESULT := CNT;
        
    END IF;  
END;

DECLARE
    P_RESULT NUMBER;
BEGIN
    NEW_JOB_PROC('ADMIN2', 'ADMINISTRATION', 1000, 20000, P_RESULT); -- 매개변수가 5개 (아웃매개변수 자리에 외부 변수대입)
    DBMS_OUTPUT.PUT_LINE('아웃매개변수 결과 : '||P_RESULT);
END;

SELECT * FROM JOBS_IT WHERE JOB_ID = 'ADMIN2';

-----------------------------------------------------------------------------------------
CREATE OR REPLACE PROCEDURE TEST_PROC (
    VAR1 IN VARCHAR2,
    VAR2 OUT VARCHAR2,
    VAR3 IN OUT VARCHAR2 
    --VAR4 VARCHAR2 -- IN OUT 생략하면 IN 으로 자동적용됨
)
IS
BEGIN
    DBMS_OUTPUT.PUT_LINE(VAR1);
    DBMS_OUTPUT.PUT_LINE(VAR2); --OUT(매개변수 전달이X)
    DBMS_OUTPUT.PUT_LINE(VAR3);
    --VAR1 := '성공1'; -- IN매개변수는 할당불가
    VAR2 := '성공2';
    VAR3 := '성공3';
END;

DECLARE
    A VARCHAR2(30):= 'A'; --IN
    B VARCHAR2(30):= 'B'; --OUT
    C VARCHAR2(30):= 'C'; --IN OUT
BEGIN
    TEST_PROC(A,B,C);
    DBMS_OUTPUT.PUT_LINE(A);
    DBMS_OUTPUT.PUT_LINE(B); 
    DBMS_OUTPUT.PUT_LINE(C);
END;

----------------------------------------------------------------
--RETURN문장과 EXCETION WHEN OTHERS THEN 예외처리
CREATE OR REPLACE PROCEDURE NEW_JOB_PROC (
    P_JOB_ID IN JOBS_IT.JOB_ID%TYPE
)
IS
    S_RESULT NUMBER := 0; -- 최대급여합 저장할 변수
    CNT NUMBER := 0; -- 카운트
BEGIN
    SELECT COUNT(*) INTO CNT
    FROM JOBS_IT
    WHERE JOB_ID LIKE '%' || P_JOB_ID || '%';
    
    IF CNT = 0 THEN DBMS_OUTPUT.PUT_LINE(P_JOB_ID || '값이 없습니다');
        RETURN; -- 프로시저의 종료
    ELSE
        SELECT SUM(MAX_SALARY) INTO S_RESULT
        FROM JOBS_IT WHERE JOB_ID  LIKE '%' || P_JOB_ID || '%';
        
        DBMS_OUTPUT.PUT_LINE('최대 급여의 합:' || S_RESULT);
    END IF;
    EXCEPTION WHEN OTHERS THEN 
        DBMS_OUTPUT.PUT_LINE('예외가 발생했습니다');

    DBMS_OUTPUT.PUT_LINE('프로시저 정상종료');
END;


EXEC NEW_JOB_PROC('TETS');
EXEC NEW_JOB_PROC('MAN');








