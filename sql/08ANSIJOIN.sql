SELECT * FROM COURSE;
SELECT * FROM MEMBER;


-- INNER JOIN
SELECT * FROM COURSE INNER JOIN MEMBER ON COURSE.ID = MEMBER.ID; -- 연결될 데이터가 없으면 나오지 않음

SELECT NUM, SUBJECT, COURSE.ID, NAME -- ID 컬럼은 양측에 다 있기 때문에, 선택적으로 테이블명.컬럼명으로 지칭해야 합니다.
-- 그렇지 않으면 column "ambiguously = 애매하다" defined 즉 양측에 있는 ID 열 중에서 무엇을 써야 할지 모르겠다 애매하다! 이슈!
FROM COURSE 
INNER JOIN MEMBER 
ON COURSE.ID = MEMBER.ID;

-- 테이블 ALIAS
SELECT * FROM COURSE C
INNER JOIN MEMBER M
ON C.ID = M.ID;

--USING절 - 양측 테이블에 동일한 키 이름으로 연결 할 때
SELECT * FROM COURSE C
JOIN MEMBER M
USING (ID);

--------------------------------------------------------------------------------
--OUTER JOIN
SELECT * FROM COURSE C LEFT OUTER JOIN MEMBER M ON C.ID = M.ID; -- 왼쪽 테이블은 전부 다 나옴, 연결값이 없으면 NULL로 나옵니다.

SELECT * FROM COURSE C RIGHT OUTER JOIN MEMBER M ON C.ID = M.ID; -- 오른쪽 테이블은 전부 다 나옴, 연결값이 없으면 NULL로 나옵니다.

SELECT * FROM COURSE C FULL OUTER JOIN MEMBER M ON C.ID = M.ID; -- 양측 테이블이 전부 다 나옴.

-- 번외 CROSS JOIN - 잘못된 조인의 형태로 더미(가짜) 데이터를 만들 때
SELECT * FROM COURSE C CROSS JOIN MEMBER M;

---------------------------------------------------------------------------------------
--SELF JOIN - 자신의 테이블의 자신의 테이블을 조인. (전제조건 - 상 하위를 나타내는 키가 있어야 합니다.
--  예시) 댓글 대댓글, 메뉴, 계급도, 시군구 등이 셀프조인이 가능한 테이블로 만들어 질 수 있습니다.
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
-- 조인 3개 이상도 될까요?
SELECT * FROM LOCATIONS;
SELECT * FROM DEPARTMENTS;

SELECT * FROM EMPLOYEES E 
LEFT JOIN DEPARTMENTS D ON E.DEPARTMENT_ID = D.DEPARTMENT_ID
LEFT JOIN LOCATIONS L ON D.LOCATION_ID = L.LOCATION_ID
WHERE EMPLOYEE_ID >= 200;


--------------------------------------------------------------------------------------
-- 오라클 조인 - 조인할 테이블을 from 절에 씁니다. 조인의 조건을 where에 씁니다

SELECT * FROM COURSE C, MEMBER M; -- CROSS조입 조인의 (조인 조건이 없을때)

SELECT * FROM COURSE C, MEMBER M -- INNER조인
WHERE C.ID = M.ID;

SELECT * FROM COURSE C, MEMBER M -- LEFT조인
WHERE C.ID = M.ID(+);

SELECT * FROM COURSE C, MEMBER M -- RIGHT조인
WHERE C.ID(+) = M.ID;

-- FULL OUTER JOIN은 오라클 구문으로는 없습니다.




