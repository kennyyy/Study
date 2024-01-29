--���� ���� OR �پ��� ������ �ο��Ϸ��� DBA�������� �����մϴ�.

SELECT * FROM HR.EMPLOYEES;

--����� ���� Ȯ��
SELECT * FROM ALL_USERS;

--���� ������ ���� Ȯ��
SELECT * FROM USER_SYS_PRIVS;

--����� ���� ����
CREATE USER USER01 IDENTIFIED BY USER01; --���̵� , �����ȣ
--����ڿ��� ���� �ο�
GRANT CREATE SESSION, CREATE TABLE, CREATE SEQUENCE, CREATE VIEW, CREATE PROCEDURE TO USER01;
--���̺����̽�(������ ������) ����
ALTER USER USER01 
DEFAULT TABLESPACE USERS -- USERS�� ����Ʈ ���̺� �����̽��� USERS ���̺� �����̽��� ����
QUOTA UNLIMITED ON USERS; -- USERS�� ���̺� �����̽��� ������ �Ҵ� ����

--������ ȸ��
REVOKE CREATE SESSION FROM USER01;

--��������(���� ������ ���̺��� ��� ������, ���̺��� �����ؼ� ������ �Ͼ�� �մϴ�.)
DROP USER USER01 /*CASCADE(����Ǿ��ִ� ���ѵ��� �����ϰ� ���δ� ����)*/;

-----------------------------------------
--���� �̿��� ���� �ο�
CREATE USER USER01 IDENTIFIED BY USER01;
--ROLE
GRANT RESOURCE, CONNECT TO USER01; --������ ����� ���Ѱ� ������ ROLE
--���̺� �����̽�
ALTER USER USER01 
DEFAULT TABLESPACE USERS
QUOTA UNLIMITED ON USERS;

DROP USER USER01;  -- ���������� ����

----------------------------------------
--�� ������ ���콺��
-- �ٸ� ����� -> �������� -> �� �ο� -> ���̺����̽� ���� -> ����

-- ������ -> DBAŬ�� 
--���̺����̽��� ��������� ���

--��й�ȣ ����
ALTER USER USER01 IDENTIFIED BY E1234;





