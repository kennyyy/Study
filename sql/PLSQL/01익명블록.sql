SET SERVEROUTPUT ON; -- ��¹� ���
DECLARE
    V_NUM NUMBER; -- ������ ����(�����̸� Ÿ��)
    V_NUM2 NUMBER := 2 ** 3 * 3;
BEGIN
    V_NUM := 30; -- ���� :=
    DBMS_OUTPUT.PUT_LINE('������ ��: '||V_NUM);
    DBMS_OUTPUT.PUT_LINE('������ ��: '||V_NUM2);
END;

---------------------------------------------------
--DML����� �Բ� ����� �� �� �ֽ��ϴ�.
--SELECT -> INSERT, UPDATE �������� DML������ ���� �� �� �ֵ��� ���ݴϴ�.

DECLARE
    EMP_NAME VARCHAR2(30);
    EMP_SALARY NUMBER;
    EMP_LAST_NAME EMPLOYEES.LAST_NAME%TYPE; --�ش� �÷��� ������ ���� Ÿ��(���� ũ�⵵)�� �����
BEGIN
    SELECT FIRST_NAME, SALARY, LAST_NAME 
    INTO EMP_NAME, EMP_SALARY, EMP_LAST_NAME --��ȸ�� ���� ������ ����
    FROM EMPLOYEES
    WHERE EMPLOYEE_ID = 100;
    
    DBMS_OUTPUT.PUT_LINE('������ ��: '||EMP_NAME);
    DBMS_OUTPUT.PUT_LINE('������ ��: '||EMP_SALARY);
    DBMS_OUTPUT.PUT_LINE('������ ��: '||EMP_LAST_NAME);
END;

----------------------------------------------------------
--�⵵�� ����� �޿����� ���ؼ� ���ο� ���̺� INSERT
CREATE TABLE EMP_SAL(
    EMP_YEARS VARCHAR2(50),
    EMP_SALARY NUMBER(10)
);

DECLARE
    EMP_SUM EMP_SAL.EMP_SALARY%TYPE;
    EMP_YEARS EMP_SAL.EMP_YEARS%TYPE := 2008;
BEGIN
    SELECT SUM(SALARY)
    INTO EMP_SUM
    FROM EMPLOYEES WHERE TO_CHAR(HIRE_DATE, 'YYYY') = EMP_YEARS;
    
    INSERT INTO EMP_SAL VALUES (EMP_YEARS, EMP_SUM);
    COMMIT;

    DBMS_OUTPUT.PUT_LINE('2008�޿��� : '||EMP_SUM);
END;

--1. ������ �� 3���� ����ϴ� �͸� ����� �����ô�.(�ܼ��� ���)
--
DECLARE
    DAN NUMBER := 3;
BEGIN
    DBMS_OUTPUT.PUT_LINE('3 x 1 = '||DAN * 1);
    DBMS_OUTPUT.PUT_LINE('3 x 2 = '||DAN * 2);
    DBMS_OUTPUT.PUT_LINE('3 x 3 = '||DAN * 3);
    DBMS_OUTPUT.PUT_LINE('3 x 4 = '||DAN * 4);
    DBMS_OUTPUT.PUT_LINE('3 x 5 = '||DAN * 5);
    DBMS_OUTPUT.PUT_LINE('3 x 6 = '||DAN * 6);
    DBMS_OUTPUT.PUT_LINE('3 x 7 = '||DAN * 7);
    DBMS_OUTPUT.PUT_LINE('3 x 8 = '||DAN * 8);
    DBMS_OUTPUT.PUT_LINE('3 x 9 = '||DAN * 9);
END;

--2. ��� ���̺��� 201�� ����� �̸��� �̸����ּҸ� ����ϴ� �͸� ����� ����� ����.
--
SELECT * FROM EMPLOYEES;
DECLARE
    EMP_NAME VARCHAR(30);
    EMP_EMAIL EMPLOYEES.EMAIL%TYPE;
BEGIN
    SELECT FIRST_NAME||' '||LAST_NAME, EMAIL 
    INTO EMP_NAME, EMP_EMAIL
    FROM EMPLOYEES
    WHERE EMPLOYEE_ID = 201;
    
    DBMS_OUTPUT.PUT_LINE('201����� �̸� :' || EMP_NAME);
    DBMS_OUTPUT.PUT_LINE('201����� EMAIL :' || EMP_EMAIL);
    
END;
--3. ��� ���̺��� �����ȣ�� ���� ū ����� ã�Ƴ� ��, 
--	 �� ��ȣ +1������ �Ʒ��� ����� emps�� employee_id, last_name, email, hire_date, job_id��  �ű� �Է��ϴ� �͸� ����� ����� ����.
--<�����>   : steven
--<�̸���>   : stevenjobs
--<�Ի�����> : ���ó�¥
--<JOB_ID> : CEO

DECLARE
    EMPLOYEE_ID_MAX EMPLOYEES.EMPLOYEE_ID%TYPE;
    
BEGIN
    SELECT MAX(EMPLOYEE_ID) + 1
    INTO EMPLOYEE_ID_MAX
    FROM EMPLOYEES;

    INSERT INTO EMPS (employee_id, last_name, email, hire_date, job_id)
    VALUES (EMPLOYEE_ID_MAX, 'steven', 'stevenjobs', SYSDATE, 'CEO'); 
END;

SELECT * FROM EMPS;
DESC EMPS;


SELECT MAX(EMPLOYEE_ID) FROM EMPLOYEES;





