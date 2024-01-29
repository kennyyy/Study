
-- ���? 
--��� �������� �ڷḦ �������ؼ� �̸� ����� ���� �������̺� �Դϴ�.
--���� ���Ǵ� �÷��� ������ �θ�, ������ ���������ϴ�.
--��� ���������� �����Ͱ� ����� ���´� �ƴϰ�, �������̺��� ������� �� �������̺�(����) �̶�� �����ϸ� �˴ϴ�.

SELECT * FROM USER_SYS_PRIVS; -- �並 �����Ϸ��� ������ �ʿ��մϴ�.
SELECT * FROM EMP_DETAILS_VIEW; --�̸� ������� �ִ� ��

-- �� ����
-- �ܼ��� - �ϳ��� ���̺�� ������ ��
CREATE OR REPLACE VIEW VIEW_EMP AS (
SELECT  EMPLOYEE_ID AS EMP_ID, 
        FIRST_NAME || ' ' || LAST_NAME AS NAME,
        JOB_ID,
        SALARY
        FROM EMPLOYEES
        WHERE DEPARTMENT_ID = 60
);

SELECT * FROM VIEW_EMP;

-- ���� �� - �ΰ� �̻��� ���̺��� ������ ���ؼ� ������� ��

--���� ����(���� ������ �Ȱ����ϴ�)
CREATE OR REPLACE VIEW VIEW_EMP_JOB AS (
SELECT E.EMPLOYEE_ID, FIRST_NAME || ' ' || LAST_NAME AS NAME,
J.JOB_TITLE,
J.MAX_SALARY,
D.DEPARTMENT_NAME,
L.STREET_ADDRESS
FROM EMPLOYEES E 
JOIN DEPARTMENTS D
ON E.DEPARTMENT_ID = D.DEPARTMENT_ID
LEFT JOIN LOCATIONS L
ON D.LOCATION_ID = L.LOCATION_ID
LEFT JOIN JOBS J
ON E.JOB_ID = J.JOB_ID
WHERE D.DEPARTMENT_ID = 60
)ORDER BY MAX_SALARY DESC;

SELECT * FROM VIEW_EMP_JOB;

--�並 �����ϸ�, �����͸� �ս��� ��ȸ�� �����մϴ�.
SELECT JOB_TITLE, COUNT(*) AS CNT 
FROM VIEW_EMP_JOB
GROUP BY JOB_TITLE
ORDER BY CNT;

--���� ����
DROP VIEW VIEW_EMP_JOB;

--VIEW�� �̿��� DML������ ������ ������, ���� ��������� �����ϴ�.
SELECT * FROM VIEW_EMP;
SELECT * FROM VIEW_EMP_JOB;

--NAME�� �����̱⶧���� INSERT�� �Ұ����ϴ�.
INSERT INTO VIEW_EMP(EMP_ID, NAME, JOB_ID, SALARY) VALUES(250, 'HONG', 'IT_PROG', 5000);

--�������̺��� NULL�� ������� �ʴ� �÷��� �־, �Ұ����մϴ�.
INSERT INTO VIEW_EMP(JOB_ID, SALARY) VALUES('IT_PROG', 5000);

--���պ�� �翬�� �ȵ˴ϴ�.(���� ���̺��� �ٸ��� ��� DML�� ���� �� �ְڴ°�?)
INSERT INTO VIEW_EMP_JOB(EMPLOYEE_ID, JOB_TITLE) VALUES( 200, 'TEST');


--���� �ɼ�
--���� �������忡 �������� �ֽ��ϴ�.
--WITH CHECK OPTION - WHERE���� �� �÷��� ������ �����մϴ�.
--WITH READ ONLY - �б������(SELECT)�� �����ϰ� �մϴ�.
CREATE OR REPLACE VIEW VIEW_EMP AS (
    SELECT EMPLOYEE_ID,
    FIRST_NAME,
    EMAIL,
    JOB_ID,
    DEPARTMENT_ID
    FROM EMPLOYEES
    WHERE DEPARTMENT_ID IN (60,70,80)
) WITH CHECK OPTION;

SELECT * FROM VIEW_EMP;

UPDATE VIEW_EMP SET DEPARTMENT_ID = 100 WHERE EMPLOYEE_ID = 103;

--�б����� ��(�б������(SELECT)�� �����ϰ� �մϴ�)
CREATE OR REPLACE VIEW VIEW_EMP AS (
    SELECT EMPLOYEE_ID,
    FIRST_NAME,
    EMAIL,
    JOB_ID,
    DEPARTMENT_ID
    FROM EMPLOYEES
    WHERE DEPARTMENT_ID IN (60,70,80)
) WITH READ ONLY;












