SET SERVEROUTPUT ON;
--���

-- IF ~ THEN
-- ELSIF ~ THEN
-- ELSE ~ 
-- END IF

DECLARE
    NUM NUMBER := TRUNC(DBMS_RANDOM.VALUE(1, 11)); -- 1~11�̸� ������ ����
    NUM2 NUMBER := 5;
BEGIN
    IF NUM >= NUM2 THEN
        DBMS_OUTPUT.PUT_LINE(NUM || '  NUM�� ū�� �Դϴ�.');
    ELSE
        DBMS_OUTPUT.PUT_LINE(NUM2 || '  NUM2�� ū�� �Դϴ�.');
    END IF;  
END;

--ELSIF
DECLARE
    RAN_NUM NUMBER := TRUNC(DBMS_RANDOM.VALUE(1, 101)); -- 1~101�̸� ������ ����
BEGIN
--    IF RAN_NUM >= 90 THEN
--        DBMS_OUTPUT.PUT_LINE('A���� �Դϴ�.');
--    ELSIF RAN_NUM >= 80 THEN
--        DBMS_OUTPUT.PUT_LINE('B���� �Դϴ�.');
--    ELSIF RAN_NUM >= 70 THEN
--        DBMS_OUTPUT.PUT_LINE('C���� �Դϴ�.');
--    ELSE 
--        DBMS_OUTPUT.PUT_LINE('D���� �Դϴ�.');
--    END IF;
    CASE 
    WHEN RAN_NUM >= 90 THEN DBMS_OUTPUT.PUT_LINE('A���� �Դϴ�.');
    WHEN RAN_NUM >= 80 THEN DBMS_OUTPUT.PUT_LINE('B���� �Դϴ�.');
    WHEN RAN_NUM >= 70 THEN DBMS_OUTPUT.PUT_LINE('C���� �Դϴ�.');
    ELSE DBMS_OUTPUT.PUT_LINE('D���� �Դϴ�.');
    END CASE;
END;

---------------------------------------------------------
--�ݺ��� WHILE

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
--�ݺ��� FOR

DECLARE
   DAN NUMBER := 3;
BEGIN
   
   FOR i IN 1..9 -- ..�� �ΰ���
   LOOP
      DBMS_OUTPUT.PUT_LINE (DAN || ' X ' || i || ' = ' || DAN * i);
   END LOOP;
END;

---------------------------------------
--Ż�⹮ EXIT WHEN ����, CONTINUE WHEN ����

DECLARE
BEGIN
    FOR I IN 1..10
    LOOP
        CONTINUE WHEN I = 5; -- NUM�� 5�� ��������
        DBMS_OUTPUT.PUT_LINE(I);
        -- EXIT WHEN I = 5; -- NUM�� 5�� Ż��
    
    END LOOP;
END;

-------------------------------------------------
--Ŀ�� : ���� �������� �������� �� ���྿ ó���ϴ� ���
-- ��ȯ�Ǵ� ���� ������ �̱⋚����, ó���� �Ұ��� (Ŀ���� �̿��ؼ� ó��)
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
    CURSOR X IS SELECT FIRST_NAME, SALARY FROM EMPLOYEES WHERE JOB_ID = 'IT_PROG'; -- 1.Ŀ�� ����
BEGIN
    OPEN X; --2. Ŀ������
    LOOP
        FETCH X INTO NM, SALARY; --3. Ŀ���� �����͸� �о ������ ����
        EXIT WHEN X%NOTFOUND; --4.Ŀ������ �����͸� ã���� ������ TRUE ��ȯ �ݺ��� ��������.
        DBMS_OUTPUT.PUT_LINE(NM);
        DBMS_OUTPUT.PUT_LINE(SALARY);
    END LOOP;
    DBMS_OUTPUT.PUT_LINE('��� ���ڵ�� : ' || X%ROWCOUNT);
    CLOSE X; --5. Ŀ�� �ݱ�
END;




--1. ��� �������� ����ϴ� �͸����� ���弼��
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
--2. ù��° ���� ROWNUM�� �̿��ϸ� �˴ϴ�.
--����) 10~120������ 10���� ������ ��ȣ�� �̿��ؼ� ����DEPARTMENT_ID �� ù��° �ุ SELECT�մϴ�.
--����) ���� ����� SALARY�� 9000�̻��̸� ����, 5000�̻��̸� �߰�, �������� �������� ���.
--
DECLARE 
    RAN_SALARY EMPLOYEES.SALARY%TYPE;
    RAN NUMBER := TRUNC(DBMS_RANDOM.VALUE(1, 13)) * 10;
    
BEGIN
    SELECT SALARY
    INTO  RAN_SALARY
    FROM EMPLOYEES 
    WHERE DEPARTMENT_ID = RAN AND ROWNUM = 1;

  
    IF RAN_SALARY >= 9000 THEN DBMS_OUTPUT.PUT_LINE('����');
    ELSIF RAN_SALARY >= 5000 THEN DBMS_OUTPUT.PUT_LINE('�߰�');
    ELSE DBMS_OUTPUT.PUT_LINE('����');
    END IF;
    
    DBMS_OUTPUT.PUT_LINE('������ : '||RAN);
END;

--3. COURSE ���̺� insert�� 100�� �����ϴ� �͸����� ó���ϼ���.
--����) NUM�� COURSE_SEQ�� �̿��ϼ���.
--
--NUM     NOT NULL NUMBER(10)   --�������� �̿��մϴ�.
--SUBJECT          VARCHAR2(20) 
--CONTENT          VARCHAR2(20) 
--ID               NUMBER(10)   --�ݺ����� INDEX ������ �־��ּ���.
--
CREATE TABLE COURSE(
    NUM     NUMBER(10) NOT NULL,   --�������� �̿��մϴ�.
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
--4. �μ��� �޿����� ����ϴ� Ŀ�������� �ۼ��غ��ô�.
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


--5. ������̺��� ������ �޿����� ���Ͽ� EMP_SAL�� ���������� INSERT�ϴ� Ŀ�������� �ۼ��غ��ô�.

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

    --FOR I IN CSR -- FOR ~ IN ������ ����, CURSOR OPEN,CLOSE, FETCH �������� �ڵ�ó�� ����
    OPEN C;
    LOOP 
        FETCH C INTO YEAR_SALARY, SUM_SALARY;
        EXIT WHEN C%NOTFOUND;
        
        INSERT INTO EMP_SAL VALUES (YEAR_SALARY, SUM_SALARY);
    END LOOP;
    
    CLOSE C;

END;

SELECT * FROM  EMP_SAL;












