--���ڿ� �ٷ�� �Լ� LOWER, UPPER, INITCAP

--LOWER-�ҹ���, UPPER-�빮��, INITCAP-ù���ڸ� �빮��  
SELECT LOWER('abcDEF'), UPPER('abcDEF'), INITCAP('abcDEF') FROM DUAL; -- DUAL ������ Ȯ�ο� ���� ���̺�
SELECT FIRST_NAME, LOWER(FIRST_NAME), UPPER(FIRST_NAME), INITCAP(FIRST_NAME) FROM EMPLOYEES;

-- LENGTH-����, INSTR-���ڿ�ã��(index) 
SELECT FIRST_NAME, LENGTH(FIRST_NAME), INSTR(FIRST_NAME, 'a') FROM EMPLOYEES;

-- SUBSTR(�÷�, �����ε���(������ 1����), �ڸ����ڰ���) - ���ڿ��ڸ��� , CONCAT-���ڿ����̱� || (������ġ��)�� ���� �ǹ�
SELECT FIRST_NAME, SUBSTR(FIRST_NAME, 3, 2), SUBSTR(FIRST_NAME, 4), CONCAT(FIRST_NAME, ' '||LAST_NAME) FROM EMPLOYEES;

-- LPAD - ���ʿ� �����κ��� Ư�� ������ ä��, RPAD = "
SELECT LPAD('ABC', 10, '*') FROM DUAL;
SELECT RPAD(FIRST_NAME, 10, '-'), LPAD(FIRST_NAME, 10, '-') FROM EMPLOYEES;

-- TRIM - �������� , LTRIM, RTRIM (�⺻�� �������� ,Ư���� ���ŵ� ���� LTRIM, RTRIM�� ��밡��)
SELECT TRIM(' HELLO WORLD '), LTRIM(' HELLO WORLD '), RTRIM(' HELLO WOLRD ') FROM DUAL;
SELECT LTRIM('HELLO WORLD', 'HE' ) FROM DUAL;

--REPLACE - Ư�� ���ڸ� ����
SELECT REPLACE('��ī�� ������ ���̸� ������', '���̸�', '���ڵ�') FROM DUAL;

-- my dream is hello world

-- hello�� '���' �� �����ϰ�, �������� �����Ѵ�.
SELECT REPLACE(REPLACE('my dream is hello world', 'hello', '���') , ' ', '') FROM DUAL; --��ø(nested)�� �� �ֽ��ϴ�

-------------------------------------------------------------------------------------------------------------------
-------------------------------------------------------------------------------------------------------------------

-- ���� �Լ�

--ROUND - �ݿø�

SELECT ROUND(45.923, 2) , ROUND(45.923, 0), ROUND(45.923) , ROUND(45.923, -1) FROM DUAL;

--TRUNC - ����

SELECT TRUNC(45.923, 2) , TRUNC(45.923, 0), TRUNC(45.923) , TRUNC(45.923, -1) FROM DUAL;

-- ABS - ���밪

-- FLOOR - ����, CEIL - �ø�

SELECT FLOOR(3.14), CEIL(3.14) FROM DUAL;

-- MOD - ������

SELECT MOD(10, 3) AS ������ FROM DUAL;

--��¥ �Լ�
SELECT SYSDATE FROM DUAL;

SELECT SYSTIMESTAMP  FROM DUAL;

--��¥�� ������ �����մϴ�. (�ϼ��� �������� ó���ȴ�.)
SELECT HIRE_DATE, HIRE_DATE + 1 FROM EMPLOYEES; -- �ϼ� + 1
SELECT HIRE_DATE, HIRE_DATE - 1 FROM EMPLOYEES; -- �ϼ� - 1

SELECT FIRST_NAME, SYSDATE - HIRE_DATE FROM EMPLOYEES; -- �ϼ� (������ �����°�)
SELECT FIRST_NAME, (SYSDATE - HIRE_DATE) / 7 FROM EMPLOYEES; -- ��
SELECT FIRST_NAME, (SYSDATE - HIRE_DATE) / 365 FROM EMPLOYEES; -- ��

--��¥ �ݿø� ROUND, ���� TRUNC

SELECT ROUND(SYSDATE) FROM DUAL; -- ���� �������� �ݿø�
SELECT ROUND(SYSDATE, 'MONTH') FROM DUAL; -- �� �������� �ݿø�
SELECT ROUND(SYSDATE, 'YEAR') FROM DUAL; -- �� �������� �ݿø�

SELECT TRUNC(SYSDATE) FROM DUAL; -- ���� �������� ����
SELECT TRUNC(SYSDATE, 'MONTH') FROM DUAL; -- �� �������� ����
SELECT TRUNC(SYSDATE, 'YEAR') FROM DUAL; -- �� �������� �ݿø�



















