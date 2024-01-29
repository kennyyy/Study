-- ���� ���ν��� (�Ϸ��� SQLó�� ������ ����ó�� ��� ����ϴ� ������)

SET SERVEROUTPUT ON;
CREATE OR REPLACE PROCEDURE NEW_JOB_PROC -- ���ν�����
IS -- ���������� ����

BEGIN -- ���౸��

    DBMS_OUTPUT.PUT_LINE('HELLO WORLD');

END;

--���๮
EXEC NEW_JOB_PROC;

----------------------------------------------------
--���ν����� �Ű����� IN
CREATE OR REPLACE PROCEDURE NEW_JOB_PROC -- ������ �̸����� ����� �����˴ϴ�.
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
--����Ʈ �Ű�����
CREATE OR REPLACE PROCEDURE NEW_JOB_PROC -- ������ �̸����� ����� �����˴ϴ�.
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
EXEC NEW_JOB_PROC('TEST1', 'TEXT1', 1000); -- ���������� �⺻�Ű������� ����
EXEC NEW_JOB_PROC('TEST2', 'TEXT2'); -- ������ 2���ǰ��� ����Ʈ �Ű������� ����
EXEC NEW_JOB_PROC('TEST3'); -- �Ű������� ���� �ʱ� ������ ERR
SELECT * FROM JOBS_IT;

----------------------------------------------------------------------------------
--���ν��������� PL/SQL���� ����� ��� ������ ���� ��밡���մϴ�.
--JOB_ID�� �������� ������ UPDATE, �����ϸ� INSERT
CREATE OR REPLACE PROCEDURE NEW_JOB_PROC 
(P_JOB_ID IN JOBS.JOB_ID%TYPE,
 P_JOB_TITLE IN JOBS.JOB_TITLE%TYPE,
 P_MIN_SALARY IN JOBS.MIN_SALARY%TYPE := 0,
 P_MAX_SALARY IN JOBS.MAX_SALARY%TYPE := 1000
)
IS
    CNT NUMBER := 0; -- ��������
BEGIN
    SELECT COUNT(*) INTO CNT
    FROM JOBS_IT WHERE JOB_ID = P_JOB_ID; --�Ű������� ���� ��
    
    IF CNT = 0 THEN
        INSERT INTO JOBS_IT VALUES ( P_JOB_ID, P_JOB_TITLE, P_MIN_SALARY, P_MAX_SALARy); -- �Ű����� INSERT
       
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

--OUT�Ű����� - �ܺη� ���� �����ֱ����� �Ű�����
--OUT�Ű������� ����ҷ��� �͸��Ͽ��� ȣ���ؾ� �մϴ�.
CREATE OR REPLACE PROCEDURE NEW_JOB_PROC 
(P_JOB_ID IN JOBS.JOB_ID%TYPE,
 P_JOB_TITLE IN JOBS.JOB_TITLE%TYPE,
 P_MIN_SALARY IN JOBS.MIN_SALARY%TYPE := 0,
 P_MAX_SALARY IN JOBS.MAX_SALARY%TYPE := 1000,
 P_RESULT OUT NUMBER
)
IS
    CNT NUMBER := 0; -- ��������
BEGIN
    SELECT COUNT(*) INTO CNT
    FROM JOBS_IT WHERE JOB_ID = P_JOB_ID; --�Ű������� ���� ��
    
    IF CNT = 0 THEN
        INSERT INTO JOBS_IT VALUES ( P_JOB_ID, P_JOB_TITLE, P_MIN_SALARY, P_MAX_SALARy); -- �Ű����� INSERT
        
        --�ƿ� ������ ���� ����
        P_RESULT := 0;
    ELSE
        UPDATE JOBS_IT SET 
        JOB_TITLE = P_JOB_TITLE,
        MIN_SALARY = P_MIN_SALARY,
        MAX_SALARY = P_MAX_SALARY
        WHERE JOB_ID = P_JOB_ID;
        
         --�ƿ� ������ ���� ����
        P_RESULT := CNT;
        
    END IF;  
END;

DECLARE
    P_RESULT NUMBER;
BEGIN
    NEW_JOB_PROC('ADMIN2', 'ADMINISTRATION', 1000, 20000, P_RESULT); -- �Ű������� 5�� (�ƿ��Ű����� �ڸ��� �ܺ� ��������)
    DBMS_OUTPUT.PUT_LINE('�ƿ��Ű����� ��� : '||P_RESULT);
END;

SELECT * FROM JOBS_IT WHERE JOB_ID = 'ADMIN2';

-----------------------------------------------------------------------------------------
CREATE OR REPLACE PROCEDURE TEST_PROC (
    VAR1 IN VARCHAR2,
    VAR2 OUT VARCHAR2,
    VAR3 IN OUT VARCHAR2 
    --VAR4 VARCHAR2 -- IN OUT �����ϸ� IN ���� �ڵ������
)
IS
BEGIN
    DBMS_OUTPUT.PUT_LINE(VAR1);
    DBMS_OUTPUT.PUT_LINE(VAR2); --OUT(�Ű����� ������X)
    DBMS_OUTPUT.PUT_LINE(VAR3);
    --VAR1 := '����1'; -- IN�Ű������� �Ҵ�Ұ�
    VAR2 := '����2';
    VAR3 := '����3';
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
--RETURN����� EXCETION WHEN OTHERS THEN ����ó��
CREATE OR REPLACE PROCEDURE NEW_JOB_PROC (
    P_JOB_ID IN JOBS_IT.JOB_ID%TYPE
)
IS
    S_RESULT NUMBER := 0; -- �ִ�޿��� ������ ����
    CNT NUMBER := 0; -- ī��Ʈ
BEGIN
    SELECT COUNT(*) INTO CNT
    FROM JOBS_IT
    WHERE JOB_ID LIKE '%' || P_JOB_ID || '%';
    
    IF CNT = 0 THEN DBMS_OUTPUT.PUT_LINE(P_JOB_ID || '���� �����ϴ�');
        RETURN; -- ���ν����� ����
    ELSE
        SELECT SUM(MAX_SALARY) INTO S_RESULT
        FROM JOBS_IT WHERE JOB_ID  LIKE '%' || P_JOB_ID || '%';
        
        DBMS_OUTPUT.PUT_LINE('�ִ� �޿��� ��:' || S_RESULT);
    END IF;
    EXCEPTION WHEN OTHERS THEN 
        DBMS_OUTPUT.PUT_LINE('���ܰ� �߻��߽��ϴ�');

    DBMS_OUTPUT.PUT_LINE('���ν��� ��������');
END;


EXEC NEW_JOB_PROC('TETS');
EXEC NEW_JOB_PROC('MAN');








