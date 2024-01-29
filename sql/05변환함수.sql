--����ȯ�Լ�

--�ڵ�����ȯ

SELECT * FROM EMPLOYEES;

SELECT * FROM EMPLOYEES WHERE SALARY >= '10000'; -- ���� -> ���� �ڵ�����ȯ
SELECT * FROM EMPLOYEES WHERE HIRE_DATE >= '05/01/01'; -- ���� -> ��¥ �ڵ�����ȯ
-- ����, ��¥ -> ���ڷε� �����ϴ�.

SELECT TO_NUMBER(TO_CHAR(HIRE_DATE, 'YYYYMMDDHHMISS')) FROM EMPLOYEES;

--���� ����ȯ
--TO-CHAR -> ��¥,  ���ڷ� ���� ����ȯ, ��¥ ���������� ���Դϴ�
SELECT TO_CHAR(SYSDATE) FROM DUAL;
SELECT TO_CHAR(SYSDATE, 'YYYY-MM-DD HH:MI:SS') AS TIME FROM DUAL;
SELECT TO_CHAR(SYSDATE, 'YY-HH-DD') AS TIME FROM DUAL;
SELECT TO_CHAR(SYSDATE, 'YY-MM-DD AM PM') AS TIME FROM DUAL;
SELECT TO_CHAR(SYSDATE, 'YYYY"��" MM"��" DD"��"') FROM DUAL;
SELECT TO_CHAR(HIRE_DATE, 'YYYY-MM-DD') FROM EMPLOYEES;

--TO_CHAR -> ����, ���ڷ� ���� ����ȯ, ���� ���������� ���Դϴ�. (9 0 , . $ L)

SELECT TO_CHAR(20000, '999999') FROM DUAL; -- ���� 6�ڸ��� ����
SELECT TO_CHAR(20000, '099999999999') FROM DUAL; -- �����ڸ��� 0���� ä��
SELECT TO_CHAR(20000, '9999') FROM DUAL; -- �ڸ����� �����ϸ� #�� ó�� �˴ϴ�.
SELECT TO_CHAR(20000.123, '99999.999') FROM DUAL; --�Ҽ��� ��� ��°�ڸ����� �ڸ����� ����.
SELECT TO_CHAR(20000, '99,999') FROM DUAL; -- ,�� ��� ������ ��������.
SELECT TO_CHAR(20000, '$999999') AS �޷� FROM DUAL; -- $�׳� ���̸��
SELECT TO_CHAR(20000, 'L999999') AS ��ȭ FROM DUAL; -- L����ȭ���ȣ

-- ������ ȯ���� 1302.69�� �Դϴ�
-- SALARY�÷��� �ѱ������� �����ؼ� �Ҽ��� 2�ڸ������� ���.

SELECT  SALARY, TO_CHAR(SALARY * 1302.69 , 'L99,999,999,999.99') FROM EMPLOYEES; 

SELECT '2000' + 2000 FROM DUAL; -- �ڵ�����ȯ
SELECT TO_NUMBER('2000') + 2000 FROM DUAL; -- ���������ȯ

--���ڷ� ��ȯ�� ������ ������ ���, ���������� �̿��ؼ� �ڸ��� ���߸� �˴ϴ�.
SELECT TO_NUMBER('$5,000', '$9,999') FROM DUAL;

--TO_DATE -> ���� -> ��¥�� ���� ����ȯ
SELECT TO_DATE('2023-12-04') FROM DUAL; --��¥�� ����ȯ
SELECT SYSDATE - TO_DATE('2023-12-03') FROM DUAL; --��¥�� ��ȯ�ؾ� ���ڰ� ���ɴϴ�.
SELECT TO_DATE('2023/12/04', 'YYYY/MM/DD') FROM DUAL;
SELECT TO_DATE('2023��12��04��', 'YYYY"��"MM"��"DD"��"') FROM DUAL; -- ��¥���˹��ڰ� �ƴ� ���ڴ� ""�� �����ݴϴ�.

SELECT TO_DATE('2024-12-04 02:30:23', 'YYYY-MM-DD HH:MI:SS') FROM DUAL; --�ڸ��� ���缭 �������ݴϴ�.

SELECT TO_CHAR(TO_DATE('20050102'), 'YYYY"��"MM"��"DD"��"') FROM DUAL; --  ����-> ��¥ -> ����

--------------------------------------------------------------------------------------------------------------

--NULLó���Լ���

--NVL(��, NULL�ϰ�쿡 ��ü�� ��) ***
SELECT NVL(NULL, 0) FROM DUAL; -- NULL�� ��� 0���� ��ȯ��

SELECT NVL(300, 0) FROM DUAL; -- NULL�� �ƴҰ�� �״�� ��µ�

SELECT NULL * 3000 + 1000 FROM DUAL; -- NULL�� ������ �� ���� NULL�� ���ɴϴ�.

SELECT FIRST_NAME, SALARY, COMMISSION_PCT, SALARY + SALARY * COMMISSION_PCT FROM EMPLOYEES;-- NULL�� ������ �� ���� NULL�� ���ɴϴ�.

SELECT FIRST_NAME, SALARY, COMMISSION_PCT, SALARY + SALARY * NVL(COMMISSION_PCT, 0) FROM EMPLOYEES;

--NVL2(��, NULL�� �ƴҰ�� ��ü�Ұ�, NULL�� ��� ��ü�Ұ�) ***
SELECT NVL2(NULL, 'NULL�� �ƴմϴ�', 'NULL�Դϴ�') FROM DUAL;
SELECT NVL2(300, 'NULL�� �ƴմϴ�', 'NULL�Դϴ�') FROM DUAL;

SELECT FIRST_NAME, NVL2(COMMISSION_PCT, 'TRUE', 'FALSE') FROM EMPLOYEES;
SELECT FIRST_NAME, NVL2(COMMISSION_PCT, SALARY + SALARY * COMMISSION_PCT, SALARY) FROM EMPLOYEES;

--DECODE(��, �񱳰�, �����, ����..., ELSE��) ***
SELECT DECODE('A', 'B', 'A�Դϴ�', 'A�� �ƴմϴ�') FROM DUAL;
SELECT DECODE('B',  'A', 'A�Դϴ�', 
                    'B', 'B�Դϴ�', 
                    'C', 'C�Դϴ�.', 
                    '���ξƴմϴ�') FROM DUAL;

SELECT FIRST_NAME, JOB_ID, DECODE(JOB_ID,
'AD_VP', SALARY * 1.1,
'IT_PROG', SALARY * 1.2,
'FI_MGR', SALARY * 1.3,
SALARY ) AS �޿� FROM EMPLOYEES;

--CASE ~WHEN ~TEHN ~ELSE ~ END ���� (SWITCH����� �����) ***
--ù��° ���
SELECT FIRST_NAME, JOB_ID, SALARY, CASE JOB_ID
WHEN 'AD_VP' THEN SALARY * 1.1 
WHEN 'IT_PROG' THEN SALARY * 1.2
WHEN 'FI_MGR' THEN SALARY * 1.3
ELSE SALARY END AS "�޿�" FROM EMPLOYEES;

--�ι�° ���
SELECT FIRST_NAME, JOB_ID, SALARY, CASE WHEN JOB_ID = 'AD_VP' THEN SALARY * 1.1
                                        WHEN JOB_ID = 'IT_PROG' THEN SALARY * 1.2
                                        WHEN JOB_ID = 'FI_MGR' THEN SALARY * 1.3
                                        ELSE SALARY END AS �޿� FROM EMPLOYEES;

SELECT CASE WHEN SALARY >= 10000 THEN '��'
            WHEN SALARY >= 5000 THEN '��'
            ELSE '��'
            END AS �޿� FROM EMPLOYEES;
            
-- COALESCE(��, ��, ...) �ھ󷹽� - NULL�� �ƴ� ù��° ���ڰ��� ��ȯ��
SELECT COALESCE (NULL, 'A', 'B') FROM DUAL; -- A
SELECT COALESCE (NULL, NULL, 'B') FROM DUAL; -- B
SELECT COALESCE (NULL, 'B', 'C', NULL) FROM DUAL; -- B
SELECT COALESCE (NULL, NULL, NULL, NULL) FROM DUAL; -- NULL
SELECT * FROM EMPLOYEES;

SELECT COMMISSION_PCT, COALESCE (COMMISSION_PCT, 0) FROM EMPLOYEES;

-------------------------------------------------------------------------
--���� 1.
--�������ڸ� �������� EMPLOYEE���̺��� �Ի�����(hire_date)�� �����ؼ� �ټӳ���� 10�� �̻���
--����� ������ ���� ������ ����� ����ϵ��� ������ �ۼ��� ������. 
--���� 1) �ټӳ���� ���� ��� ������� ����� �������� �մϴ�
--���� 2.
--EMPLOYEE ���̺��� manager_id�÷��� Ȯ���Ͽ� first_name, manager_id, ������ ����մϴ�.
--100�̶�� �������, 
--120�̶�� �����ӡ�
--121�̶�� ���븮��
--122��� �����塯
--�������� ���ӿ��� ���� ����մϴ�.
--���� 1) manager_id�� 50�� ������� ������θ� ��ȸ�մϴ�
SELECT * FROM EMPLOYEES;

SELECT EMPLOYEE_ID AS "�����ȣ", CONCAT(FIRST_NAME, LAST_NAME) AS "�����", HIRE_DATE AS "�Ի�����", TRUNC ((SYSDATE-HIRE_DATE)/365.25) AS "�ټӳ��" FROM EMPLOYEES
WHERE TRUNC((SYSDATE-HIRE_DATE)/365.25) >= 10
ORDER BY �ټӳ�� DESC;

SELECT first_name, manager_id, DECODE(manager_id, 
'100', '���',
'120', '����',
'121', '�븮',
'122', '����',
'�ӿ�') AS "����" FROM EMPLOYEES 
WHERE DEPARTMENT_ID = 50;

SELECT first_name, manager_id, CASE 
WHEN manager_id = '100' THEN '���' 
WHEN manager_id = '120' THEN '����' 
WHEN manager_id = '121' THEN '�븮' 
WHEN manager_id = '122' THEN '����' 
ELSE '�ӿ�' END AS "����" FROM EMPLOYEES
WHERE DEPARTMENT_ID = 50;




