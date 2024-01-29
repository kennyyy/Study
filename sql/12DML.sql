--INSERT�� 2���� ����
-- ���̺� ������ ������ Ȯ���ϴ� ���

DESC DEPARTMENTS;

SELECT * FROM DEPARTMENTS;
--1ST (�÷��� ��Ȯ�ϰ� ��ġ��Ű�� ���� �÷��� ������ ����)
INSERT INTO DEPARTMENTS VALUES (280, '������', NULL, 1700);

--DML���� Ʈ������� �׻� ����˴ϴ�.
ROLLBACK;

--2DN (�÷��� ��Ī�ؼ� �ִ� ���)
INSERT INTO DEPARTMENTS(DEPARTMENT_ID, DEPARTMENT_NAME, LOCATION_ID) VALUES(280, '������', 1700);

INSERT INTO DEPARTMENTS VALUES (290, '�����̳�', NULL, 1700);
INSERT INTO DEPARTMENTS VALUES (300, 'DB������', NULL, 1800);
INSERT INTO DEPARTMENTS VALUES (310, '�����ͺм���', NULL, 1800);
INSERT INTO DEPARTMENTS VALUES (320, '�ۺ���', 200, 1800);
INSERT INTO DEPARTMENTS VALUES (330, '����������', 200, 1800);

--INSERT���� ���������� ���˴ϴ�.
--�ǽ��� ���� ��¥���̺� ����
CREATE TABLE EMPS AS (SELECT * FROM EMPLOYEES WHERE 1 = 2); --������ �����ϴ� ���̺����
SELECT * FROM EMPS;
DESC EMPS;

--1ST
--��� �÷��� �������� ���� ������
INSERT INTO EMPS(SELECT * FROM EMPLOYEES WHERE JOB_ID LIKE '%MAN');

ROLLBACK;
--Ư�� �÷��� �������� ���� ������
INSERT INTO EMPS(LAST_NAME, EMAIL, HIRE_DATE, JOB_ID)(SELECT LAST_NAME, EMAIL, HIRE_DATE, JOB_ID FROM EMPLOYEES WHERE JOB_ID LIKE '%MAN');
--2ND
--���ϰ��̸� ���������� ���� �ֱ� ����
INSERT INTO EMPS(LAST_NAME, EMAIL, HIRE_DATE, JOB_ID) VALUES ((SELECT LAST_NAME FROM EMPLOYEES WHERE MANAGER_ID IS NULL), 'TEST01', SYSDATE,'TEST02');
SELECT * FROM EMPS;
ROLLBACK;

--------------------------------------------------------------------------------

COMMIT; --�����͸� ������ �ݿ���

--UPDATE��
SELECT * FROM EMPS;

UPDATE EMPS SET SALARY = SALARY * 1.1 WHERE EMPLOYEE_ID = 114;

-- ***** WHERE�� ���� ������ �����Ű��, ��ü ���̺� ����Ǳ� ������ �׻� WHERE���� �پ�� �մϴ�.
-- �׷��� �׻�, SELECT������ ������Ʈ�� ���� Ȯ���ϰ�, �����ϴ� ������ �淯��

-- ������ ������Ʈ
SELECT * FROM EMPS;

UPDATE EMPS SET SALARY = SALARY * 1.1
    ,COMMISSION_PCT = 0.5
    ,MANAGER_ID = 110 WHERE EMPLOYEE_ID = 114;

-- UPDATE���� ����������
--1ST
--�����÷��� �ѹ��� ������Ʈ �ϴ� ����
SELECT * FROM EMPS;


UPDATE EMPS SET (MANAGER_ID, JOB_ID, DEPARTMENT_ID) = (SELECT MANAGER_ID, JOB_ID, DEPARTMENT_ID FROM EMPLOYEES WHERE EMPLOYEE_ID = 201)
WHERE EMPLOYEE_ID = 114;
--�� �÷��� ���������� ������Ʈ �ϴ� ����
UPDATE EMPS SET MANAGER_ID = (SELECT MANAGER_ID FROM EMPLOYEES WHERE EMPLOYEE_ID = 201),
                JOB_ID = (SELECT JOB_ID FROM EMPLOYEES WHERE EMPLOYEE_ID = 201)
WHERE EMPLOYEE_ID = 114;

-- WHERE������ ������ �˴ϴ�.
UPDATE EMPS
SET SALARY = 0 WHERE EMPLOYEE_ID IN (SELECT EMPLOYEE_ID FROM EMPLOYEES WHERE JOB_ID = 'MK_MAN');

SELECT EMPLOYEE_ID FROM EMPLOYEES WHERE JOB_ID = 'MK_MAN';

---------------------------------------------------------------------------
--DELETE��
--�����ϱ� ���� ��, SELECT������ ����Ű���带 Ȯ���ϴ� ������ ������ (�� PK������ �����ϼ���)
SELECT * FROM EMPS;

DELETE FROM EMPS WHERE EMPLOYEE_ID = 114;
 
DELETE FROM EMPS WHERE JOB_ID LIKE '%MAN'; 

--DELETE����������

DELETE FROM EMPS WHERE DEPARTMENT_ID = (SELECT DEPARTMENT_ID FROM EMPS WHERE EMPLOYEE_ID = 145); -- 80�� �μ�
DROP TABLE EMPS;
ROLLBACK;
-----------------------------------------------
--DELETE���� �ݵ�� ���� �������� ���� �ƴմϴ�.
--���̺��� �������踦 ������ ������, �������Ἲ���࿡ ����Ǵ� ���, �������� �ʽ��ϴ�.
SELECT * FROM DEPARTMENTS;
SELECT * FROM EMPLOYEES WHERE DEPARTMENT_ID = 20;

DELETE FROM DEPARTMENTS WHERE DEPARTMENT_ID = 20; -- 20�� �μ��� EMPLOYEE�� ���ʵǰ� �ֱ� �빮�� �������� �ʽ��ϴ�.


-----------------------------------------------
--MERGE���� : �����Ͱ� ������ UPDATE, ������ INSERT ������ �����ϴ�, ���ձ���
--1ST
SELECT * FROM EMPS;
UPDATE EMPS SET SALARY = 0;
DELETE FROM EMPS WHERE JOB_ID = 'SA_MAN';
MERGE INTO EMPS E1 --Ÿ�� ���̺�
USING (SELECT * FROM EMPLOYEES WHERE JOB_ID LIKE '%MAN') E2 --������ ��������
ON (E1.EMPLOYEE_ID = E2.EMPLOYEE_ID) --���� ����
WHEN MATCHED THEN 
UPDATE SET
    E1.SALARY = E2.SALARY,
    E1.COMMISSION_PCT = E2.COMMISSION_PCT
WHEN NOT MATCHED THEN 
INSERT (EMPLOYEE_ID, LAST_NAME, EMAIL, HIRE_DATE, JOB_ID) 
VALUES (E2.EMPLOYEE_ID, E2.LAST_NAME, E2.EMAIL, E2.HIRE_DATE, E2.JOB_ID);

--2ND - �������� ���� �ٸ� ���̺��� �������� ���� �ƴ϶�, ���� ���� �ְ��� �� �� ����� �� �ֽ��ϴ�.
MERGE INTO EMPS E1 -- Ÿ�� ���̺�
USING DUAL
ON (E1.EMPLOYEE_ID = 200) -- �̷���쿡 ON���� ������ Ű�� ���������� �Ǿ�� �մϴ�.
WHEN MATCHED THEN
UPDATE SET 
E1.SALARY = 10000,
E1.HIRE_DATE = SYSDATE,
E1.COMMISSION_PCT = 0.1
WHEN NOT MATCHED THEN
INSERT (EMPLOYEE_ID, LAST_NAME, EMAIL, HIRE_DATE, JOB_ID) 
VALUES (200, 'TEST', 'TEST', SYSDATE, 'TEST');

-----------------------------------------------------------
--CTAS (CREATE TABLE AS SELECT) - ���̺� ����(���� ������ X)
CREATE TABLE EMPS2 AS (SELECT * FROM EMPS); -- EMPS�����͸� ���� �����ؼ� EMPS2�� ����
SELECT * FROM EMPS2;
DROP TABLE EMPS2; --���̺� ����
CREATE TABLE EMPS2 AS (SELECT * FROM EMPS WHERE 1 = 2); --EMPS���̺� ������ �����ؼ� ����


