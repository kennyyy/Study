--Ʈ���� : Ʈ���Ŵ� ���̺� ������ ���·� AFTER, BEFORE Ʈ���Ű� �ֽ��ϴ�.

--AFTER - DML������ Ÿ�����̺��� ����� ���Ŀ� �����ϴ� Ʈ����
--BEFORE - DML������ Ÿ�����̺� ����Ǳ� ������ �����ϴ� Ʈ����
SET SERVEROUTPUT ON;
CREATE TABLE TBL_TEST(
    ID VARCHAR2(30),
    TEXT VARCHAR2(30)
);

CREATE OR REPLACE TRIGGER TBL_TEST_TRG
    AFTER INSERT OR UPDATE OR DELETE -- Ʈ���� ����
    ON TBL_TEST -- ������ ���̺�
    FOR EACH ROW -- ���࿡ ������
DECLARE
BEGIN
    DBMS_OUTPUT.put_line('Ʈ���Ű� ���۵�');
END;

SELECT * FROM TBL_TEST;

INSERT INTO TBL_TEST VALUES('1', 'ȫ�浿');
INSERT INTO TBL_TEST VALUES('2', '�浿');
UPDATE TBL_TEST SET TEXT = 'TEST' WHERE ID = '1';
DELETE FROM TBL_TEST WHERE ID = '1';

--:OLD = ���� �� ���� �� (INSERT : �Է� �� �ڷ�, UPDATE : ���� �� �ڷ�, DELETE : ������ �ڷ�)
--:NEW = ���� �� ���� �� (INSERT : �Է� �� �ڷ�, UPDATE : ���� �� �ڷ�)

CREATE TABLE TBL_USER(
    ID VARCHAR2(30) PRIMARY KEY,
    NAME VARCHAR2(30),
    ADDRESS VARCHAR2(30)
);

CREATE TABLE TBL_USER_BACKUP(
    ID VARCHAR2(20),
    NAME VARCHAR2(20),
    ADDRESS VARCHAR2(30),
    UPDATEDATE DATE DEFAULT SYSDATE,--���� �����Ǿ���
    M_TYPE CHAR(10), -- � ������ ����Ÿ��
    M_USER VARCHAR2(20) --���� �������� �����
);

--������Ʈ OR ������ �Ͼ�� ���� �����͸� BACKUP�� �����Ѵ�.
CREATE OR REPLACE TRIGGER TRG_USER_BACKUP
    AFTER UPDATE OR DELETE
    ON TBL_USER
    FOR EACH ROW
DECLARE
    V_TYPE VARCHAR2(10);
BEGIN
    IF UPDATING THEN -- UPDATE�� �Ͼ�� TRUE�� ��ȯ�ϴ� TRIGGER���� ����� ����
        V_TYPE := 'UPDATE';
    ELSIF DELETING THEN
        V_TYPE := 'DELETE';
    END IF;
    
    INSERT INTO TBL_USER_BACKUP VALUES( :OLD.ID, :OLD.NAME, :OLD.ADDRESS, SYSDATE, V_TYPE, USER());
    
END;


INSERT INTO TBL_USER VALUES('TEST01', 'ADMIN', '����'); --Ʈ���� ���� ���� X INSERT ���������༭ �׷�
INSERT INTO TBL_USER VALUES('TEST02', 'ADMIN', '���');
INSERT INTO TBL_USER VALUES('TEST03', 'ADMIN', '�λ�');

UPDATE TBL_USER SET ADDRESS = '�λ�' WHERE ID = 'TEST01'; --Ʈ���ŵ���
UPDATE TBL_USER SET ADDRESS = 'YYY' WHERE ID = 'TEST01'; --Ʈ���ŵ���
DELETE FROM TBL_USER WHERE ID = 'TEST02'; --Ʈ���ŵ���

SELECT * FROM TBL_USER_BACKUP;

-----------------------------------------------------------------
SELECT * FROM TBL_USER;

CREATE OR REPLACE TRIGGER TRG_USER_MASKING_TRG
    BEFORE INSERT -- INSERT������ ����
    ON TBL_USER
    FOR EACH ROW
DECLARE
   
BEGIN
    :NEW.NAME := SUBSTR( :NEW.NAME, 1, 1) || '****';
END;
INSERT INTO TBL_USER VALUES('TEST05', 'ADMIN', '��õ');


---------------------------------------------------------------

--1. �ֹ��� ���ͼ� �ֹ����̺� �����Ͱ� INSERT�Ǹ� �ڵ����� ��ǰ���̺��� ������ ���ҵǴ� Ʈ���Ÿ� �����غ�����.

--�ֹ�(�ֹ��� �ѹ��� �� ��ǰ�ۿ� ���Ѵٰ� ����)
CREATE TABLE ORDER_HISTORY (
    HISTORY_NO NUMBER(5) PRIMARY KEY,
    PRODUCT_NO NUMBER(5), --FK
    TOTAL NUMBER(10), --����
    PRICE NUMBER(10) --�ݾ�
);
--��ǰ
CREATE TABLE PRODUCT (
    PRODUCT_NO NUMBER(5) PRIMARY KEY,
    PRODUCT_NAME VARCHAR(20),
    TOTAL NUMBER(5),
    PRICE NUMBER(5)
);

CREATE OR REPLACE TRIGGER COUNT_DOWN_TRG
    AFTER INSERT
    ON ORDER_HISTORY
    FOR EACH ROW
DECLARE
    P_TOTAL NUMBER := :NEW.TOTAL;
    P_NO NUMBER := :NEW.PRODUCT_NO;
BEGIN
    UPDATE PRODUCT SET TOTAL = TOTAL - P_TOTAL 
    WHERE PRODUCT_NO = P_NO;
END;

DROP TRIGGER COUNT_DOWN_TRG;

INSERT INTO PRODUCT VALUES(1, '����', 100, 10000); 
INSERT INTO PRODUCT VALUES(2, 'ġŲ', 100, 15000); 
INSERT INTO PRODUCT VALUES(3, '�ܹ���', 100, 5000);

INSERT INTO ORDER_HISTORY VALUES(3, 3, 10, 5000 * 10);

SELECT * FROM PRODUCT;

SELECT * FROM ORDER_HISTORY;

