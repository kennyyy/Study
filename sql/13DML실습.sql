--���� 1.
--DEPTS���̺��� ������ �߰��ϼ���
DROP TABLE DEPTS;
SELECT * FROM DEPTS;
CREATE TABLE DEPTS AS (SELECT * FROM DEPARTMENTS);
INSERT INTO DEPTS VALUES (280, '����', NULL, 1800);
INSERT INTO DEPTS VALUES (290, 'ȸ���', NULL, 1800);
INSERT INTO DEPTS VALUES (300, '����', 301, 1800);
INSERT INTO DEPTS VALUES (310, '�λ�', 302, 1800);
INSERT INTO DEPTS VALUES (320, '����', 303, 1700);

--���� 2.
--DEPTS���̺��� �����͸� �����մϴ�
--1. department_name �� IT Support �� �������� department_name�� IT bank�� ����
--2. department_id�� 290�� �������� manager_id�� 301�� ����
--3. department_name�� IT Helpdesk�� �������� �μ����� IT Help�� , �Ŵ������̵� 303����, �������̵�
--1800���� �����ϼ���
--4. �̻�, ����, ����, �븮 �� �Ŵ������̵� 301�� �ѹ��� �����ϼ���.
SELECT * FROM DEPTS;

UPDATE DEPTS SET DEPARTMENT_NAME = 'IT bank' WHERE DEPARTMENT_NAME = 'IT Support';
UPDATE DEPTS SET DEPARTMENT_ID = 301 WHERE DEPARTMENT_ID = 290;
UPDATE DEPTS SET DEPARTMENT_NAME = 'IT Help', MANAGER_ID = 303, LOCATION_ID = 1800 WHERE DEPARTMENT_NAME = 'IT Helpdesk';
UPDATE DEPTS SET MANAGER_ID = 301 WHERE DEPARTMENT_ID IN (290,300,310,320);

rollback;
--���� 3.
--������ ������ �׻� primary key�� �մϴ�, ���⼭ primary key�� department_id��� �����մϴ�.
--1. �μ��� �����θ� ���� �ϼ���
--2. �μ��� NOC�� �����ϼ���

SELECT * FROM DEPTS;
DELETE FROM DEPTS WHERE DEPARTMENT_ID = (SELECT DEPARTMENT_ID FROM DEPTS WHERE DEPARTMENT_ID = '����');
DELETE FROM DEPTS WHERE DEPARTMENT_ID = (SELECT DEPARTMENT_ID FROM DEPTS WHERE DEPARTMENT_NAME = 'NOC');

--����4
--1. Depts �纻���̺��� department_id �� 200���� ū �����͸� �����ϼ���.
--2. Depts �纻���̺��� manager_id�� null�� �ƴ� �������� manager_id�� ���� 100���� �����ϼ���.
--3. Depts ���̺��� Ÿ�� ���̺� �Դϴ�.
--4. Departments���̺��� �Ź� ������ �Ͼ�� ���̺��̶�� �����ϰ� Depts�� ���Ͽ�
--��ġ�ϴ� ��� Depts�� �μ���, �Ŵ���ID, ����ID�� ������Ʈ �ϰ�
--�������Ե� �����ʹ� �״�� �߰����ִ� merge���� �ۼ��ϼ���.
SELECT * FROM DEPTS;
DELETE FROM DEPTS WHERE DEPARTMENT_ID  > 200;
UPDATE DEPTS SET MANAGER_ID = 100 WHERE MANAGER_ID IS NOT NULL;

MERGE INTO DEPTS D1 
USING (SELECT * FROM DEPARTMENTS) D2 
ON (D1.DEPARTMENT_ID = D2.DEPARTMENT_ID)
WHEN MATCHED THEN 
UPDATE SET
D1.DEPARTMENT_NAME = D2.DEPARTMENT_NAME,
D1.MANAGER_ID = D2.MANAGER_ID,
D1.LOCATION_ID = D2.LOCATION_ID
WHEN NOT MATCHED THEN
INSERT (D2.DEPARTMENT_ID, D2.DEPARTMENT_NAME, D2.MANAGER_ID, D2.LOCATION_ID) VALUES 
(D2.DEPARTMENT_ID, D2.DEPARTMENT_NAME, D2.MANAGER_ID, D2.LOCATION_ID);


--���� 5
--1. jobs_it �纻 ���̺��� �����ϼ��� (������ min_salary�� 6000���� ū �����͸� �����մϴ�)
--2. jobs_it ���̺� ���� �����͸� �߰��ϼ���
--3. jobs_it�� Ÿ�� ���̺� �Դϴ�
--4. jobs���̺��� �Ź� ������ �Ͼ�� ���̺��̶�� �����ϰ� jobs_it�� ���Ͽ�
--min_salary�÷��� 0���� ū ��� ������ �����ʹ� min_salary, max_salary�� ������Ʈ �ϰ� ���� ���Ե�
--�����ʹ� �״�� �߰����ִ� merge���� �ۼ��ϼ���
SELECT * FROM JOBS;
SELECT * FROM JOBS_IT;

CREATE TABLE JOBS_IT AS (SELECT * FROM JOBS WHERE MIN_SALARY > 6000);
INSERT INTO JOBS_IT VALUES ('IT_DEV', '����Ƽ������', 6000, 20000);
INSERT INTO JOBS_IT VALUES ('NET_DEV', '��Ʈ��ũ������', 5000, 20000);
INSERT INTO JOBS_IT VALUES ('SEC_DEV', '���Ȱ�����', 6000, 19000);

MERGE INTO JOBS_IT J1 USING (SELECT * FROM JOBS WHERE MIN_SALARY > 0) J2 ON (J1.JOB_ID = J2.JOB_ID)
WHEN MATCHED THEN
UPDATE SET
J1.MIN_SALARY = J2.MIN_SALARY,
J1.MAX_SALARY = J2.MAX_SALARY
WHEN NOT MATCHED THEN
INSERT VALUES
(J2.JOB_ID, J2.JOB_TITLE, J2.MIN_SALARY, J2.MAX_SALARY);

