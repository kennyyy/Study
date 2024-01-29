SET SERVEROUTPUT ON;
--제어문

-- IF ~ THEN
-- ELSIF ~ THEN
-- ELSE ~ 
-- END IF

DECLARE
    NUM NUMBER := TRUNC(DBMS_RANDOM.VALUE(1, 11)); -- 1~11미만 랜던함 정수
    NUM2 NUMBER := 5;
BEGIN
    IF NUM >= NUM2 THEN
        DBMS_OUTPUT.PUT_LINE(NUM || '  NUM가 큰수 입니다.');
    ELSE
        DBMS_OUTPUT.PUT_LINE(NUM2 || '  NUM2가 큰수 입니다.');
    END IF;  
END;

--ELSIF
DECLARE
    RAN_NUM NUMBER := TRUNC(DBMS_RANDOM.VALUE(1, 101)); -- 1~101미만 랜던함 정수
BEGIN
--    IF RAN_NUM >= 90 THEN
--        DBMS_OUTPUT.PUT_LINE('A학점 입니다.');
--    ELSIF RAN_NUM >= 80 THEN
--        DBMS_OUTPUT.PUT_LINE('B학점 입니다.');
--    ELSIF RAN_NUM >= 70 THEN
--        DBMS_OUTPUT.PUT_LINE('C학점 입니다.');
--    ELSE 
--        DBMS_OUTPUT.PUT_LINE('D학점 입니다.');
--    END IF;
    CASE 
    WHEN RAN_NUM >= 90 THEN DBMS_OUTPUT.PUT_LINE('A학점 입니다.');
    WHEN RAN_NUM >= 80 THEN DBMS_OUTPUT.PUT_LINE('B학점 입니다.');
    WHEN RAN_NUM >= 70 THEN DBMS_OUTPUT.PUT_LINE('C학점 입니다.');
    ELSE DBMS_OUTPUT.PUT_LINE('D학점 입니다.');
    END CASE;
END;

---------------------------------------------------------
--반복문 WHILE

DECLARE
    V_COUNT NUMBER := 1;
BEGIN
    WHILE V_COUNT <= 9
    LOOP
        DBMS_OUTPUT.PUT_LINE(V_COUNT);
        V_COUNT := V_COUNT +1;
    END LOOP;
END;
        


DECLARE
    V_DAN NUMBER := 3;
    V_COUNT NUMBER := 1;
BEGIN
    WHILE V_COUNT <= 9
    LOOP
        DBMS_OUTPUT.PUT_LINE(V_DAN || ' X ' || V_COUNT || ' = ' || V_DAN * V_COUNT );
        V_COUNT := V_COUNT +1;
    END LOOP;
END;


----------------------------------------------------------------------------------------
--반복문 FOR

DECLARE
   DAN NUMBER := 3;
BEGIN
   
   FOR i IN 1..9 -- ..을 두개씀
   LOOP
      DBMS_OUTPUT.PUT_LINE (DAN || ' X ' || i || ' = ' || DAN * i);
   END LOOP;
END;

---------------------------------------
--탈출문 EXIT WHEN 조건, CONTINUE WHEN 조건

DECLARE
BEGIN
    FOR I IN 1..10
    LOOP
        CONTINUE WHEN I = 5; -- NUM이 5면 다음으로
        DBMS_OUTPUT.PUT_LINE(I);
        -- EXIT WHEN I = 5; -- NUM이 5면 탈출
    
    END LOOP;
END;

-------------------------------------------------
--커서 : 질의 수행결과가 여러행일 때 한행씩 처리하는 방법
-- 반환되는 행이 여러행 이기떄문에, 처리가 불가능 (커서를 이용해서 처리)
DECLARE
    NM VARCHAR2(30);
    SALARY NUMBER;
BEGIN
    SELECT FIRST_NAME, SALARY 
    INTO NM, SALARY
    FROM EMPLOYEES WHERE JOB_ID = 'IT_PROG';
END;
---------------------------------------------
DECLARE
    NM VARCHAR2(30);
    SALARY NUMBER;
    CURSOR X IS SELECT FIRST_NAME, SALARY FROM EMPLOYEES WHERE JOB_ID = 'IT_PROG'; -- 1.커서 선언
BEGIN
    OPEN X; --2. 커서열기
    LOOP
        FETCH X INTO NM, SALARY; --3. 커서의 데이터를 읽어서 변수에 저장
        EXIT WHEN X%NOTFOUND; --4.커서에서 데이터를 찾을수 없으면 TRUE 반환 반복문 빠져나옴.
        DBMS_OUTPUT.PUT_LINE(NM);
        DBMS_OUTPUT.PUT_LINE(SALARY);
    END LOOP;
    DBMS_OUTPUT.PUT_LINE('결과 레코드수 : ' || X%ROWCOUNT);
    CLOSE X; --5. 커서 닫기
END;




--1. 모든 구구단을 출력하는 익명블록을 만드세요
--

DECLARE 
BEGIN
    FOR I IN 2..9
    LOOP
        FOR J IN 1..9
        LOOP
        DBMS_OUTPUT.PUT_LINE(I || ' X ' || J || ' = ' || I * J );
        END LOOP;  
    END LOOP;
END;
--2. 첫번째 값은 ROWNUM을 이용하면 됩니다.
--조건) 10~120사이의 10단위 랜덤한 번호를 이용해서 랜덤DEPARTMENT_ID 의 첫번째 행만 SELECT합니다.
--조건) 뽑은 사람의 SALARY가 9000이상이면 높음, 5000이상이면 중간, 나머지는 낮음으로 출력.
--
DECLARE 
    RAN_SALARY EMPLOYEES.SALARY%TYPE;
    RAN NUMBER := TRUNC(DBMS_RANDOM.VALUE(1, 13)) * 10;
    
BEGIN
    SELECT SALARY
    INTO  RAN_SALARY
    FROM EMPLOYEES 
    WHERE DEPARTMENT_ID = RAN AND ROWNUM = 1;

  
    IF RAN_SALARY >= 9000 THEN DBMS_OUTPUT.PUT_LINE('높음');
    ELSIF RAN_SALARY >= 5000 THEN DBMS_OUTPUT.PUT_LINE('중간');
    ELSE DBMS_OUTPUT.PUT_LINE('낮음');
    END IF;
    
    DBMS_OUTPUT.PUT_LINE('랜덤값 : '||RAN);
END;

--3. COURSE 테이블에 insert를 100번 실행하는 익명블록을 처리하세요.
--조건) NUM은 COURSE_SEQ를 이용하세요.
--
--NUM     NOT NULL NUMBER(10)   --시퀀스를 이용합니다.
--SUBJECT          VARCHAR2(20) 
--CONTENT          VARCHAR2(20) 
--ID               NUMBER(10)   --반복문의 INDEX 값으로 넣어주세요.
--
CREATE TABLE COURSE(
    NUM     NUMBER(10) NOT NULL,   --시퀀스를 이용합니다.
    SUBJECT          VARCHAR2(20), 
    CONTENT          VARCHAR2(20),
    ID               NUMBER(10) 
);

DROP TABLE COURSE;

CREATE SEQUENCE COURSE_SEQ

    NOCACHE;
    
DROP SEQUENCE COURSE_SEQ;


DECLARE
    C_SEQ NUMBER;
BEGIN
    FOR I IN 1..100
    LOOP
    INSERT INTO COURSE(COURSE_SEQ.NEXTVAL, SUBJECT, CONTENT, ID) VALUES (C_SEQ, 'TEST', 'TEST', I); 
    END LOOP;
END;
SELECT * FROM COURSE;
--4. 부서벌 급여합을 출력하는 커서구문을 작성해봅시다.
--

DECLARE
    SUM_SALARY NUMBER;
    DEPT_ID VARCHAR2(30);
    CURSOR C IS SELECT DEPARTMENT_ID, SUM(SALARY) FROM EMPLOYEES GROUP BY DEPARTMENT_ID;
BEGIN
    OPEN C;
    
    LOOP
        FETCH C INTO DEPT_ID, SUM_SALARY;
        EXIT WHEN C%NOTFOUND;
        DBMS_OUTPUT.PUT_LINE(DEPT_ID);
        DBMS_OUTPUT.PUT_LINE(SUM_SALARY);
    END LOOP;
    CLOSE C;
END;


--5. 사원테이블의 연도별 급여합을 구하여 EMP_SAL에 순차적으로 INSERT하는 커서구문을 작성해봅시다.

CREATE TABLE EMP_SAL(
    EMP_YEARS VARCHAR2(50),
    EMP_SALARY NUMBER(10)
);


SELECT * FROM  EMP_SAL;
SELECT  TO_CHAR(HIRE_DATE, 'YYYY'), SUM(SALARY) FROM EMPLOYEES
GROUP BY TO_CHAR(HIRE_DATE, 'YYYY');





DECLARE
    YEAR_SALARY EMP_SAL.EMP_YEARS%TYPE;
    SUM_SALARY NUMBER;
    CURSOR C IS SELECT A, SUM(SALARY) AS B FROM 
    (SELECT TO_CHAR(HIRE_DATE, 'YYYY') as A, SALARY FROM EMPLOYEES)
    GROUP BY A;
BEGIN

    --FOR I IN CSR -- FOR ~ IN 구문을 쓰면, CURSOR OPEN,CLOSE, FETCH 문장으로 자동처리 가능
    OPEN C;
    LOOP 
        FETCH C INTO YEAR_SALARY, SUM_SALARY;
        EXIT WHEN C%NOTFOUND;
        
        INSERT INTO EMP_SAL VALUES (YEAR_SALARY, SUM_SALARY);
    END LOOP;
    
    CLOSE C;

END;

SELECT * FROM  EMP_SAL;












