--Ʈ����� (�۾��� ������ ����)
--���� DML���� ���ؼ��� Ʈ������� ������ �� �ֽ��ϴ�.

--����Ŀ�� ���� Ȯ��
SHOW AUTOCOMMIT;
--����Ŀ�� ��
SET AUTOCOMMIT ON;
--����Ŀ�� OFF
SET AUTOCOMMIT OFF;

--------------------------------------------------------------------------------
--SAVE POINT (������ ���� ���� ����)
SELECT * FROM DEPTS;
DELETE FROM DEPTS WHERE DEPARTMENT_ID = 10;

SAVEPOINT DEL10; -- DEL10 ���̺�����Ʈ

DELETE FROM DEPTS WHERE DEPARTMENT_ID = 20;

SAVEPOINT DEL20; -- DEL20 ���̺�����Ʈ

DELETE FROM DEPTS WHERE DEPARTMENT_ID = 30;

ROLLBACK TO DEL20; -- 20���������� �ѹ�
SELECT * FROM DEPTS;
ROLLBACK TO DEL10; -- 10���������� �ѹ�
SELECT * FROM DEPTS;

ROLLBACK; -- ������ Ŀ�Խ������� �ѹ�

--Ŀ�� (���� �ݿ�)
INSERT INTO DEPTS VALUES(280, 'AAA', NULL, 1800);
COMMIT;
SELECT * FROM DEPTS;


----------------------------------------------------

--DDL���� ( Ʈ������� �����ϴ�)
--CREATE, ALTER, DROP���� �ֽ��ϴ�

DROP TABLE DEPTS; -- DEFTS����
CREATE TABLE DEPTS(
    DEPT_NO NUMBER(2), --���� 2�ڸ�
    DEPT_NAME VARCHAR(30), -- 30BYTE (�ѱ��� 15����, ���� OR ����� 30����)
    DEPT_YN CHAR(1), -- �������� 1BYTE(VARCHAR2�� ��ü����)
    DEPT_DATE DATE, --��¥
    DEPT_BONUS NUMBER(10, 2), --���� 10�ڸ�, �Ҽ����� 2�ڸ����� ����.
    DEPT_CONTENT LONG -- 2�Ⱑ �������ڿ� (VARCHAR���� �� ū ���ڿ�)
);
DESC DEPTS;
INSERT INTO DEPTS VALUES(99, 'HELLO', 'Y', SYSDATE, 3.14, 'HELLO WORLD, HI~~');
INSERT INTO DEPTS VALUES(100, 'HELLO', 'N', SYSDATE, 3.14, 'BYE~'); -- DEPT_NO �ʰ�
INSERT INTO DEPTS VALUES(1, 'HELLO', '��', SYSDATE, 3.14, 'BYE~'); -- �ѱ���2byte

SELECT * FROM DEPTS;
-------------------------------------------------------------------------------------
--���̺� ���� ���� ALTER

--�÷��߰�
ALTER TABLE DEPTS ADD (DEPT_COUNT NUMBER(3));
SELECT * FROM DEPTS;

--�÷� ��Ī ����
ALTER TABLE DEPTS RENAME COLUMN DEPT_COUNT TO EMP_COUNT; -->DEPT_COUNT -> EMP_COUNT�� ����

--�÷� ����(ũ��)
ALTER TABLE DEPTS MODIFY (EMP_COUNT NUMBER(10)); -- EMP_COUNT�÷��� Ÿ���� ����
ALTER TABLE DEPTS MODIFY (EMP_COUNT NUMBER(2)); -- EMP_COUNT�÷��� Ÿ���� ����
ALTER TABLE DEPTS MODIFY (DEPT_NAME VARCHAR2(1)); -- ���������Ͱ� ������ ũ�⸦ �Ѿ�� ���, ����Ұ�
DESC DEPTS;
 
--�÷� ����(DROP COLUMN)
ALTER TABLE DEPTS DROP COLUMN EMP_COUNT;

-----------------------------------------------
DROP TABLE DEPTS;

CREATE TABLE DEPT2 (
    DEPT_NO NUMBER (3),
    DEPT_NAME VARCHAR2(15),
    LOCA_NUMBER NUMBER (4),
    DEPT_GENDER CHAR(1),
    REG_DATE DATE,
    DEPT_BONUS NUMBER(10, 2)
);
DESC DEPT2;
DROP TABLE DEPT2;
INSERT INTO DEPT2 VALUES (2, 'KIM', 1222, 'M', SYSDATE, 9.99);
SELECT * FROM DEPT2;

ALTER TABLE DEPT2 MODIFY DEPT_BONUS NUMBER(3, 2);
    
    
    
    
    
    