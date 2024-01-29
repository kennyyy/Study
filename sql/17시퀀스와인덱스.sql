--������(���������� �����ϴ� ��) *

SELECT * FROM USER_SEQUENCES;

--����
CREATE SEQUENCE DEPTS_SEQ; -- �⺻������ �����Ǹ鼭 �������� �����˴ϴ�.

DROP SEQUENCE DEPTS_SEQ; -- ����

CREATE SEQUENCE DEPTS_SEQ
    INCREMENT BY 1
    START WITH 1
    MAXVALUE 10
    NOCACHE -- ĳ�ÿ� �������� ���� �ʰ���
    NOCYCLE; -- �������� MAX�� �������� �� ���� X

SELECT * FROM USER_SEQUENCES;

-- �������� �Ϲ������� PK�� �ڵ������ϴ� ������ ������ �˴ϴ�.
DROP TABLE DEPTS;
CREATE TABLE DEPTS(
DEPT_NO NUMBER(3) CONSTRAINT DEPTS_NO_PK1 PRIMARY KEY,
DEPT_NAME VARCHAR(30),
DEPT_DATE DATE
);

--�������� ����� 2�� *
SELECT DEPTS_SEQ.NEXTVAL FROM DUAL; -- �ѹ� NEXTVAL�� �Ͼ��, ������ �Ұ���
SELECT DEPTS_SEQ.CURRVAL FROM DUAL; -- NEXTVAL�� �ѹ� ������ �ǰ��� Ȯ���� �����մϴ�.

INSERT INTO DEPTS VALUES(depts_seq.nextval, 'TEST' , SYSDATE); --MAXVALUE�� 10�� �Ǹ�, �� �̻� ����� �Ұ����մϴ�.

SELECT * FROM DEPTS;

--������ ����(CREATE�� ALTER�θ� �ٲ�ϴ�.)
ALTER SEQUENCE DEPTS_SEQ MAXVALUE 1000;
ALTER SEQUENCE DEPTS_SEQ MAXVALUE 10000;
ALTER SEQUENCE DEPTS_SEQ INCREMENT BY 10 MINVALUE 1;

SELECT * FROM USER_SEQUENCES;

--�������� �̹� ���ǰ� �ִٸ�, DROP�ϸ� �ȵ˴ϴ�.
--�ֱ������� �������� �ʱ�ȭ �Ѵٸ�?
--������ �ʱ�ȭ ���
--1. ������ �������� -���簪 ������ �ٲٰ�
--2. �ѹ� ������ ��Ű��
--3.�ٽ� ��������� �ٲ۴�.

ALTER SEQUENCE DEPTS_SEQ INCREMENT BY -31 MINVALUE 0;
SELECT DEPTS_SEQ.NEXTVAL FROM DUAL;
SELECT DEPTS_SEQ.CURRVAL FROM DUAL;
ALTER SEQUENCE DEPTS_SEQ INCREMENT BY 1;
SELECT DEPTS_SEQ.NEXTVAL FROM DUAL;

-----------------------------------------------------
--������ ����
--pk�� ������ ���ڿ��� ���� 2023-12-��������
CREATE TABLE DEPTS2( 
    DEPT_NO VARCHAR2(30) CONSTRAINT DEPTS2_PK PRIMARY KEY,
    DEPTS_NAME VARCHAR2(30) 
);
CREATE SEQUENCE DEPTS2_SEQ NOCACHE;

SELECT TO_CHAR(SYSDATE, 'YYYY-MM-') || LPAD(DEPTS2_SEQ.NEXTVAL, 5, '0') FROM DUAL;

INSERT INTO DEPTS2 VALUES (TO_CHAR(SYSDATE, 'YYYY-MM-') || LPAD(DEPTS2_SEQ.NEXTVAL, 5, '0') , 'TEST');
SELECT * FROM DEPTS2;

--������ ����
DROP SEQUENCE DEPTS2_SEQ;
--29000 % 10 = 0
--29000 / 10 = 2900

--------------------------------------------------------------------------------------------------------
--�ε���
--INDEX�� PRIMARY KEY, UNIQUE ���࿡ �ڵ����� �����ǰ�, ��ȸ�� ������ �ϴ� HINT ������ �մϴ�.
--INDEX�� �����δ� �����ε���, ������ε����� �ֽ��ϴ�.
--UNIQUE�� �÷����� UNIQUE�ε���(�����ε���)�� �� �� �ֽ��ϴ�.
--�Ϲ��÷����� ����� �ε����� ������ �� �ֽ��ϴ�.
--INDEX�� ��ȸ�� ������ ������, �������ϰ� ���� ���Ǵ� ���� ������ �������ϸ� �θ� �� �ֽ��ϴ�.
--�ַ� ���Ǵ� �÷��߿��� SELECT���� �ӵ����ϰ� �ִٸ�, ���� ����غ� ������ �ϳ��� INDEX�Դϴ�.

CREATE TABLE EMPS_IT AS (SELECT * FROM EMPLOYEES);
SELECT * FROM EMPS_IT;

SELECT * FROM EMPS_IT WHERE FIRST_NAME  = 'Nancy';

--�� ���� �ε����� ����
CREATE INDEX EMPS_IT_IDX ON EMPS_IT(FIRST_NAME);
--�ε��� ������ �ӵ�
SELECT * FROM EMPS_IT WHERE FIRST_NAME = 'Nancy';

--�ε��� ����(���̺� ��ü�� ������ ��ġ�� �ʽ��ϴ�.)
DROP INDEX EMPS_IT_IDX;

--�ε����� ���� �÷��� ���(�����ε���) ������ ���� �ֽ��ϴ�.
CREATE INDEX EMPS_IT_IDX ON EMPS_IT(FIRST_NAME, LAST_NAME);
--
SELECT * FROM EMPS_IT WHERE FIRST_NAME = 'Nancy'; --��Ʈ�� ����
SELECT * FROM EMPS_IT WHERE FIRST_NAME = 'Nancy' AND LAST_NAME = 'Greenberg'; --��Ʈ�� ����
SELECT * FROM EMPS_IT WHERE LAST_NAME = 'Greenberg'; --��Ʈ�� ������

--����Ŭ�� ��Ʈ��(�ε����� �̿��ؼ� ��ȸ ������ ��Ʈ�� ��)

SELECT ROWNUM AS RN,
D.*
FROM DEPTS D
ORDER BY DEPT_NO DESC;

--��������
SELECT ROWNUM AS RN, D.* FROM (SELECT * FROM DEPTS ORDER BY DEPT_NO DESC) D;

SELECT /*+ INDEX_DESC(D DEPTS_NO_PK1) */ ROWNUM AS RN, D.*
FROM DEPTS D
ORDER BY DEPT_NO DESC;






