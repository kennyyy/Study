SELECT * FROM COURSE;
SELECT * FROM MEMBER;


-- INNER JOIN
SELECT * FROM COURSE INNER JOIN MEMBER ON COURSE.ID = MEMBER.ID; -- ����� �����Ͱ� ������ ������ ����

SELECT NUM, SUBJECT, COURSE.ID, NAME -- ID �÷��� ������ �� �ֱ� ������, ���������� ���̺��.�÷������� ��Ī�ؾ� �մϴ�.
-- �׷��� ������ column "ambiguously = �ָ��ϴ�" defined �� ������ �ִ� ID �� �߿��� ������ ��� ���� �𸣰ڴ� �ָ��ϴ�! �̽�!
FROM COURSE 
INNER JOIN MEMBER 
ON COURSE.ID = MEMBER.ID;

-- ���̺� ALIAS
SELECT * FROM COURSE C
INNER JOIN MEMBER M
ON C.ID = M.ID;

--USING�� - ���� ���̺� ������ Ű �̸����� ���� �� ��
SELECT * FROM COURSE C
JOIN MEMBER M
USING (ID);

--------------------------------------------------------------------------------
--OUTER JOIN
SELECT * FROM COURSE C LEFT OUTER JOIN MEMBER M ON C.ID = M.ID; -- ���� ���̺��� ���� �� ����, ���ᰪ�� ������ NULL�� ���ɴϴ�.

SELECT * FROM COURSE C RIGHT OUTER JOIN MEMBER M ON C.ID = M.ID; -- ������ ���̺��� ���� �� ����, ���ᰪ�� ������ NULL�� ���ɴϴ�.

SELECT * FROM COURSE C FULL OUTER JOIN MEMBER M ON C.ID = M.ID; -- ���� ���̺��� ���� �� ����.

-- ���� CROSS JOIN - �߸��� ������ ���·� ����(��¥) �����͸� ���� ��
SELECT * FROM COURSE C CROSS JOIN MEMBER M;

---------------------------------------------------------------------------------------
--SELF JOIN - �ڽ��� ���̺��� �ڽ��� ���̺��� ����. (�������� - �� ������ ��Ÿ���� Ű�� �־�� �մϴ�.
--  ����) ��� ����, �޴�, ��޵�, �ñ��� ���� ���������� ������ ���̺�� ����� �� �� �ֽ��ϴ�.
SELECT * FROM EMPLOYEES E1 
LEFT JOIN EMPLOYEES E2 ON E1.MANAGER_ID = E2.EMPLOYEE_ID;



--------------------------------------------------------------------------------------
SELECT * FROM EMPLOYEES;
SELECT * FROM DEPARTMENTS;


SELECT * FROM EMPLOYEES E LEFT JOIN DEPARTMENTS D ON E.DEPARTMENT_ID = D.DEPARTMENT_ID;
SELECT * FROM EMPLOYEES E JOIN DEPARTMENTS D ON E.DEPARTMENT_ID = D.DEPARTMENT_ID;

SELECT E.EMPLOYEE_ID, E.FIRST_NAME, D.DEPARTMENT_ID, D.DEPARTMENT_NAME 
FROM EMPLOYEES E 
LEFT JOIN DEPARTMENTS D ON E.DEPARTMENT_ID = D.DEPARTMENT_ID;

SELECT *  FROM EMPLOYEES E JOIN DEPARTMENTS D ON E.DEPARTMENT_ID = D.DEPARTMENT_ID;

---------------------------------------------------------------------------------------
-- ���� 3�� �̻� �ɱ��?
SELECT * FROM LOCATIONS;
SELECT * FROM DEPARTMENTS;

SELECT * FROM EMPLOYEES E 
LEFT JOIN DEPARTMENTS D ON E.DEPARTMENT_ID = D.DEPARTMENT_ID
LEFT JOIN LOCATIONS L ON D.LOCATION_ID = L.LOCATION_ID
WHERE EMPLOYEE_ID >= 200;


--------------------------------------------------------------------------------------
-- ����Ŭ ���� - ������ ���̺��� from ���� ���ϴ�. ������ ������ where�� ���ϴ�

SELECT * FROM COURSE C, MEMBER M; -- CROSS���� ������ (���� ������ ������)

SELECT * FROM COURSE C, MEMBER M -- INNER����
WHERE C.ID = M.ID;

SELECT * FROM COURSE C, MEMBER M -- LEFT����
WHERE C.ID = M.ID(+);

SELECT * FROM COURSE C, MEMBER M -- RIGHT����
WHERE C.ID(+) = M.ID;

-- FULL OUTER JOIN�� ����Ŭ �������δ� �����ϴ�.




