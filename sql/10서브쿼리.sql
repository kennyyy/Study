--��������

--������ �������� - SELECT�� ����� 1���� ��������
--���������� ������ ()�� �ݵ�� ���´�, �����ں��� �����ʿ� ��ġ��

--������ �޿����� ���� �޿��� �޴� ���

SELECT SALARY FROM EMPLOYEES 
WHERE FIRST_NAME = 'Nancy';

--SELECT * FROM EMPLOYEES 
--WHERE SALARY >= 12000;
SELECT * FROM EMPLOYEES 
WHERE SALARY > = (SELECT SALARY FROM EMPLOYEES 
WHERE FIRST_NAME = 'Nancy');

--EMPLOYEE_ID�� 103���� ����� ������ ������ ���
SELECT * FROM EMPLOYEES WHERE EMPLOYEE_ID = 103;

SELECT * FROM EMPLOYEES WHERE JOB_ID = (SELECT JOB_ID FROM EMPLOYEES WHERE EMPLOYEE_ID = 103);

--������ �� - ���� �÷��� ��Ȯ�� 1������ �մϴ�.
SELECT * FROM EMPLOYEES
WHERE JOB_ID = (SELECT * FROM EMPLOYEES WHERE EMPLOYEE_ID = 103);

--������ �� -- ���� �÷��� �������� ������ �����̶��, ������ �������� �������� �ۼ��� ���� �մϴ�. (ó���� ����� ����)
SELECT * FROM EMPLOYEES
WHERE JOB_ID = (SELECT JOB_ID FROM EMPLOYEES
WHERE FIRST_NAME = 'Steven');

-----------------------------------------------------------------------------------------------
--������ �������� - �������� ���ϵǴ� ���� ����
--IN, ANY(SOME), ALL
--ANY(SOME)�� ���̾���
SELECT * FROM EMPLOYEES 
WHERE FIRST_NAME = 'David';

--4800, 6800, 9500�� 4800���� ū �����ʹ� �� ����
--�������� ����߿�, ���� ���� ������ ū���鸸 ��ȸ��
SELECT * FROM EMPLOYEES
WHERE SALARY > ANY(SELECT SALARY FROM EMPLOYEES WHERE FIRST_NAME = 'David');

--9500���� ���� �����ʹ� �ٳ���(�ִ밪 ���� ���� ������)
--�������� ����߿�, ���� ū������ �������鸸 ��ȸ��
SELECT * FROM EMPLOYEES
WHERE SALARY < ANY(SELECT SALARY FROM EMPLOYEES WHERE FIRST_NAME = 'David');

--9500���� ū �����ʹ� �ٳ���( �ִ찪 ���� ū ������)
--�������� ����߿�, ���� ū�� ���� ū���鸸 ��ȸ��
SELECT * FROM EMPLOYEES
WHERE SALARY > ALL(SELECT SALARY FROM EMPLOYEES WHERE FIRST_NAME = 'David');

--4800���� ���� �����ʹ� �ٳ���( �ּҰ� ���� ���� ������)
--�������� ����߿�, ���� ������ ���� �������鸸 ��ȸ��  
SELECT * FROM EMPLOYEES
WHERE SALARY < ALL(SELECT SALARY FROM EMPLOYEES WHERE FIRST_NAME = 'David');

-- IN�� ������ ��������, ��ġ�ϴ� ������ ���ΰ� ���ɴϴ�.
SELECT * FROM EMPLOYEES
WHERE SALARY IN (SELECT SALARY FROM EMPLOYEES WHERE FIRST_NAME = 'David');

-- ����. STEVEN�� ������ �μ���ȣ�� ������ ����� ��ȸ
SELECT * FROM EMPLOYEES
WHERE DEPARTMENT_ID IN (SELECT DEPARTMENT_ID FROM EMPLOYEES WHERE FIRST_NAME = 'Steven');

-- STEVEN�� DAVID�� ������ JOB�� ������ ����� UNION ALL

SELECT * FROM EMPLOYEES
WHERE JOB_ID IN (SELECT JOB_ID FROM EMPLOYEES WHERE FIRST_NAME = 'Steven' UNION ALL SELECT JOB_ID FROM EMPLOYEES WHERE FIRST_NAME = 'David');


-----------------------------------------------------------------------------------------------
--��Į�� ���� - SELECT���� ���������� ���� ����

--JOIN DEPARTMENT_NAME
SELECT E.FIRST_NAME, D.DEPARTMENT_NAME  
FROM EMPLOYEES E 
LEFT JOIN DEPARTMENTS D ON E.DEPARTMENT_ID = D.DEPARTMENT_ID
ORDER BY FIRST_NAME;


--��Į��
SELECT FIRST_NAME, (SELECT DEPARTMENT_NAME FROM DEPARTMENTS D WHERE D.DEPARTMENT_ID = E.DEPARTMENT_ID) AS DEPARTMENT_NAME
FROM EMPLOYEES E
ORDER BY FIRST_NAME;


-- ��Į�������� �ѹ��� �ϳ��� �÷��� ������ �ɴϴ�. ���� ���� ������ �ö��� �������� ������ �� �ֽ��ϴ�.
SELECT FIRST_NAME, (SELECT DEPARTMENT_NAME FROM DEPARTMENTS D WHERE D.DEPARTMENT_ID = E.DEPARTMENT_ID),
                    (SELECT MANAGER_ID FROM DEPARTMENTS D WHERE D.DEPARTMENT_ID = E.DEPARTMENT_ID)
FROM EMPLOYEES E;

--��Į�������� �ٸ����̺��� 1���� �÷��� ������ �� ��, JOIN���� �����մϴ�.
--�μ����� ������ ����, �������� ����մϴ�.

SELECT E.*,(SELECT DEPARTMENT_NAME FROM DEPARTMENTS D WHERE D.DEPARTMENT_ID = E.DEPARTMENT_ID),
                    (SELECT JOB_TITLE FROM JOBS J WHERE J.JOB_ID = E.JOB_ID)
FROM EMPLOYEES E;

--��Į������ (������ ��ü����)
--��Į�������� ���κ��� �������
-- 1) �����Ͱ� ������
-- 2) �÷�(�ε���) �� ���� �� �� �ִٸ�, ��Į�� ����, �ε��� ������ �ȵǴ� ��� ������ ������

------------------------------------------------------------------------------------------------
--�ζ��� �� - FROM ������ ������������ ���ϴ�.
--�ζ��� �信�� ���� ���� �÷��� ���ؼ� ��ȸ�� �س��� �� ����մϴ�.
SELECT * FROM(SELECT * FROM (SELECT * FROM (SELECT * FROM (SELECT * FROM EMPLOYEES)))); 

-- ROWNUM�� ��ȸ�� ������ ���� ��ȣ�� �ٱ� ������, ORDER�� ��Ű�� ������ �ڹٲ�ϴ�.
SELECT ROWNUM , FIRST_NAME, SALARY FROM EMPLOYEES
ORDER BY SALARY DESC; 

--�ζ��� ��� �ذ�
SELECT ROWNUM , FIRST_NAME, SALARY FROM (SELECT FIRST_NAME, SALARY FROM EMPLOYEES
ORDER BY SALARY DESC)
WHERE ROWNUM <= 10 AND ROWNUM <= 20; -- WHERE ROWNUM <= 10;

-- �ζ��� ��� �ذ�(ROWNUM�� �÷�ȭ ��Ű�� �ٽ� �ζ��κ並 ����մϴ�)
SELECT * FROM (SELECT ROWNUM AS RN , FIRST_NAME, SALARY FROM (SELECT FIRST_NAME, SALARY FROM EMPLOYEES ORDER BY SALARY DESC))
WHERE RN > 10 AND RN <= 20;

--����
SELECT A.* FROM 
(SELECT FIRST_NAME || ' ' || LAST_NAME AS NAME,
TO_CHAR(SALARY+ SALARY * NVL(COMMISSION_PCT, 0) , 'L999,999,999') AS SALARY,
NVL(COMMISSION_PCT, 0) AS COMMISSTION_PCT,
TO_CHAR(HIRE_DATE, 'YYYY"��"MM"��"DD"��"') as HIRE_DATE,
TRUNC((SYSDATE- HIRE_DATE)/365) AS �ټӳ�� FROM EMPLOYEES ORDER BY FIRST_NAME) 
A
WHERE MOD(�ټӳ��, 5) = 0;

--------------------------------------------------------------------------------------------
-- ���ΰ� ��������
-- �ζ��κ��

-- DEPARTMENTS ���̺� MANAGER_ID�� NULL�� �ƴ� �����͵��� ���ؼ�, EMPLOYEES���̺� ����
-- 10~20��° �� �����͸� ���Ѵ�.

SELECT * 
FROM DEPARTMENTS D
WHERE MANAGER_ID IS NOT NULL;

SELECT *  FROM (SELECT ROWNUM AS RN, A.*
FROM(SELECT * FROM EMPLOYEES E
LEFT JOIN (SELECT * FROM DEPARTMENTS
WHERE MANAGER_ID IS NOT NULL) D
ON E.DEPARTMENT_ID = D.DEPARTMENT_ID
) A
)
WHERE RN > 10 AND RN <= 20;

SELECT * FROM (SELECT * FROM DEPARTMENTS
WHERE MANAGER_ID IS NOT NULL) D
RIGHT JOIN EMPLOYEES E
ON E.DEPARTMENT_ID = D.DEPARTMENT_ID;














