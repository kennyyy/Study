--1. ��� ����� �����ȣ, �̸�, �Ի���, �޿��� ����ϼ���.
--2. ��� ����� �̸��� ���� �ٿ� ����ϼ���. �� ��Ī�� name���� �ϼ���.
--3. 50�� �μ� ����� ��� ������ ����ϼ���.
--4. 50�� �μ� ����� �̸�, �μ���ȣ, �������̵� ����ϼ���.
--5. ��� ����� �̸�, �޿� �׸��� 300�޷� �λ�� �޿��� ����ϼ���.
--6. �޿��� 10000���� ū ����� �̸��� �޿��� ����ϼ���.
--7. ���ʽ��� �޴� ����� �̸��� ����, ���ʽ����� ����ϼ���.
--8. 2003�⵵ �Ի��� ����� �̸��� �Ի��� �׸��� �޿��� ����ϼ���.(BETWEEN ������ ���)
--9. 2003�⵵ �Ի��� ����� �̸��� �Ի��� �׸��� �޿��� ����ϼ���.(LIKE ������ ���)
--10. ��� ����� �̸��� �޿��� �޿��� ���� ������� ���� ��������� ����ϼ���.
--11. �� ���Ǹ� 60�� �μ��� ����� ���ؼ��� �����ϼ���. (�÷�: department_id)
--12. �������̵� IT_PROG �̰ų�, SA_MAN�� ����� �̸��� �������̵� ����ϼ���.
--13. Steven King ����� ������ ��Steven King ����� �޿��� 24000�޷� �Դϴ١� �������� ����ϼ���.
--14. �Ŵ���(MAN) ������ �ش��ϴ� ����� �̸��� �������̵� ����ϼ���. (�÷�:job_id)
--15. �Ŵ���(MAN) ������ �ش��ϴ� ����� �̸��� �������̵� �������̵� ������� ����ϼ���.

SELECT * FROM EMPLOYEES;

SELECT EMPLOYEE_ID, FIRST_NAME, HIRE_DATE, SALARY FROM EMPLOYEES; -- 1
SELECT FIRST_NAME ||' '|| LAST_NAME AS name FROM EMPLOYEES; -- 2
SELECT * FROM EMPLOYEES WHERE DEPARTMENT_ID = 50; -- 3
SELECT FIRST_NAME, DEPARTMENT_ID, JOB_ID FROM EMPLOYEES WHERE DEPARTMENT_ID = 50; -- 4
SELECT FIRST_NAME, SALARY, SALARY + 300 FROM EMPLOYEES; -- 5
SELECT FIRST_NAME, SALARY FROM EMPLOYEES WHERE SALARY > 10000; -- 6
SELECT FIRST_NAME, JOB_ID , COMMISSION_PCT FROM EMPLOYEES WHERE COMMISSION_PCT IS NOT NULL; -- 7
SELECT FIRST_NAME, HIRE_DATE, SALARY FROM EMPLOYEES WHERE HIRE_DATE BETWEEN '03/01/01' AND '03/12/31'; -- 8
SELECT FIRST_NAME, HIRE_DATE, SALARY FROM EMPLOYEES WHERE HIRE_DATE LIKE '03%'; -- 9
SELECT FIRST_NAME, SALARY FROM EMPLOYEES ORDER BY SALARY DESC; -- 10
SELECT FIRST_NAME, SALARY FROM EMPLOYEES WHERE DEPARTMENT_ID = 60 ORDER BY SALARY DESC; -- 11
SELECT FIRST_NAME, JOB_ID FROM EMPLOYEES WHERE JOB_ID IN('IT_PROG', 'SA_MAN'); -- 12
SELECT FIRST_NAME || ' ' ||LAST_NAME|| ' ����� �޿���' ||SALARY||'�޷� �Դϴ�' AS "Steven King ��� ����" FROM EMPLOYEES 
WHERE FIRST_NAME = 'Steven' AND LAST_NAME = 'King'; -- 13
SELECT FIRST_NAME, JOB_ID FROM EMPLOYEES WHERE JOB_ID LIKE '%MAN'; -- 14
SELECT FIRST_NAME, JOB_ID FROM EMPLOYEES WHERE JOB_ID LIKE '%MAN' ORDER BY JOB_ID; -- 15

SELECT first_name || ' ,.,.,.' AS full_name
FROM employees