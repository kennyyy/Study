--형변환함수

--자동형변환

SELECT * FROM EMPLOYEES;

SELECT * FROM EMPLOYEES WHERE SALARY >= '10000'; -- 문자 -> 숫자 자동형변환
SELECT * FROM EMPLOYEES WHERE HIRE_DATE >= '05/01/01'; -- 문자 -> 날짜 자동형변환
-- 숫자, 날짜 -> 문자로도 가능하다.

SELECT TO_NUMBER(TO_CHAR(HIRE_DATE, 'YYYYMMDDHHMISS')) FROM EMPLOYEES;

--강제 형변환
--TO-CHAR -> 날짜,  문자로 강제 형변환, 날짜 포맷형식이 쓰입니다
SELECT TO_CHAR(SYSDATE) FROM DUAL;
SELECT TO_CHAR(SYSDATE, 'YYYY-MM-DD HH:MI:SS') AS TIME FROM DUAL;
SELECT TO_CHAR(SYSDATE, 'YY-HH-DD') AS TIME FROM DUAL;
SELECT TO_CHAR(SYSDATE, 'YY-MM-DD AM PM') AS TIME FROM DUAL;
SELECT TO_CHAR(SYSDATE, 'YYYY"년" MM"월" DD"일"') FROM DUAL;
SELECT TO_CHAR(HIRE_DATE, 'YYYY-MM-DD') FROM EMPLOYEES;

--TO_CHAR -> 숫자, 문자로 강제 형변환, 숫자 포맷형식이 쓰입니다. (9 0 , . $ L)

SELECT TO_CHAR(20000, '999999') FROM DUAL; -- 문자 6자리로 변경
SELECT TO_CHAR(20000, '099999999999') FROM DUAL; -- 남는자리를 0으로 채움
SELECT TO_CHAR(20000, '9999') FROM DUAL; -- 자리수가 부족하면 #로 처리 됩니다.
SELECT TO_CHAR(20000.123, '99999.999') FROM DUAL; --소수점 출력 몇째자리까지 자를지도 가능.
SELECT TO_CHAR(20000, '99,999') FROM DUAL; -- ,도 어디 붙일지 지정가능.
SELECT TO_CHAR(20000, '$999999') AS 달러 FROM DUAL; -- $그냥 붙이면됨
SELECT TO_CHAR(20000, 'L999999') AS 원화 FROM DUAL; -- L지역화폐기호

-- 오늘의 환율이 1302.69원 입니다
-- SALARY컬럼을 한국돈으로 변경해서 소수점 2자리수까지 출력.

SELECT  SALARY, TO_CHAR(SALARY * 1302.69 , 'L99,999,999,999.99') FROM EMPLOYEES; 

SELECT '2000' + 2000 FROM DUAL; -- 자동형변환
SELECT TO_NUMBER('2000') + 2000 FROM DUAL; -- 명시적형변환

--숫자로 변환이 가능한 문자일 경우, 숫자포맷을 이용해서 자리를 맞추면 됩니다.
SELECT TO_NUMBER('$5,000', '$9,999') FROM DUAL;

--TO_DATE -> 문자 -> 날짜로 강제 형변환
SELECT TO_DATE('2023-12-04') FROM DUAL; --날짜로 형변환
SELECT SYSDATE - TO_DATE('2023-12-03') FROM DUAL; --날짜로 변환해야 일자가 나옵니다.
SELECT TO_DATE('2023/12/04', 'YYYY/MM/DD') FROM DUAL;
SELECT TO_DATE('2023년12월04일', 'YYYY"년"MM"월"DD"일"') FROM DUAL; -- 날짜포맷문자가 아닌 문자는 ""로 감싸줍니다.

SELECT TO_DATE('2024-12-04 02:30:23', 'YYYY-MM-DD HH:MI:SS') FROM DUAL; --자리에 맞춰서 포맷해줍니다.

SELECT TO_CHAR(TO_DATE('20050102'), 'YYYY"년"MM"월"DD"일"') FROM DUAL; --  문자-> 날짜 -> 문자

--------------------------------------------------------------------------------------------------------------

--NULL처리함수들

--NVL(값, NULL일경우에 대체할 값) ***
SELECT NVL(NULL, 0) FROM DUAL; -- NULL일 경우 0으로 변환됨

SELECT NVL(300, 0) FROM DUAL; -- NULL이 아닐경우 그대로 출력됨

SELECT NULL * 3000 + 1000 FROM DUAL; -- NULL에 연산이 들어갈 경우는 NULL이 나옵니다.

SELECT FIRST_NAME, SALARY, COMMISSION_PCT, SALARY + SALARY * COMMISSION_PCT FROM EMPLOYEES;-- NULL에 연산이 들어갈 경우는 NULL이 나옵니다.

SELECT FIRST_NAME, SALARY, COMMISSION_PCT, SALARY + SALARY * NVL(COMMISSION_PCT, 0) FROM EMPLOYEES;

--NVL2(값, NULL이 아닐경우 대체할값, NULL일 경우 대체할값) ***
SELECT NVL2(NULL, 'NULL이 아닙니다', 'NULL입니다') FROM DUAL;
SELECT NVL2(300, 'NULL이 아닙니다', 'NULL입니다') FROM DUAL;

SELECT FIRST_NAME, NVL2(COMMISSION_PCT, 'TRUE', 'FALSE') FROM EMPLOYEES;
SELECT FIRST_NAME, NVL2(COMMISSION_PCT, SALARY + SALARY * COMMISSION_PCT, SALARY) FROM EMPLOYEES;

--DECODE(값, 비교값, 결과값, 나열..., ELSE문) ***
SELECT DECODE('A', 'B', 'A입니다', 'A가 아닙니다') FROM DUAL;
SELECT DECODE('B',  'A', 'A입니다', 
                    'B', 'B입니다', 
                    'C', 'C입니다.', 
                    '전부아닙니다') FROM DUAL;

SELECT FIRST_NAME, JOB_ID, DECODE(JOB_ID,
'AD_VP', SALARY * 1.1,
'IT_PROG', SALARY * 1.2,
'FI_MGR', SALARY * 1.3,
SALARY ) AS 급여 FROM EMPLOYEES;

--CASE ~WHEN ~TEHN ~ELSE ~ END 구문 (SWITCH문장과 비슷함) ***
--첫번째 방법
SELECT FIRST_NAME, JOB_ID, SALARY, CASE JOB_ID
WHEN 'AD_VP' THEN SALARY * 1.1 
WHEN 'IT_PROG' THEN SALARY * 1.2
WHEN 'FI_MGR' THEN SALARY * 1.3
ELSE SALARY END AS "급여" FROM EMPLOYEES;

--두번째 방법
SELECT FIRST_NAME, JOB_ID, SALARY, CASE WHEN JOB_ID = 'AD_VP' THEN SALARY * 1.1
                                        WHEN JOB_ID = 'IT_PROG' THEN SALARY * 1.2
                                        WHEN JOB_ID = 'FI_MGR' THEN SALARY * 1.3
                                        ELSE SALARY END AS 급여 FROM EMPLOYEES;

SELECT CASE WHEN SALARY >= 10000 THEN '상'
            WHEN SALARY >= 5000 THEN '중'
            ELSE '하'
            END AS 급여 FROM EMPLOYEES;
            
-- COALESCE(값, 값, ...) 코얼레스 - NULL이 아닌 첫번째 인자값을 반환함
SELECT COALESCE (NULL, 'A', 'B') FROM DUAL; -- A
SELECT COALESCE (NULL, NULL, 'B') FROM DUAL; -- B
SELECT COALESCE (NULL, 'B', 'C', NULL) FROM DUAL; -- B
SELECT COALESCE (NULL, NULL, NULL, NULL) FROM DUAL; -- NULL
SELECT * FROM EMPLOYEES;

SELECT COMMISSION_PCT, COALESCE (COMMISSION_PCT, 0) FROM EMPLOYEES;

-------------------------------------------------------------------------
--문제 1.
--현재일자를 기준으로 EMPLOYEE테이블의 입사일자(hire_date)를 참조해서 근속년수가 10년 이상인
--사원을 다음과 같은 형태의 결과를 출력하도록 쿼리를 작성해 보세요. 
--조건 1) 근속년수가 높은 사원 순서대로 결과가 나오도록 합니다
--문제 2.
--EMPLOYEE 테이블의 manager_id컬럼을 확인하여 first_name, manager_id, 직급을 출력합니다.
--100이라면 ‘사원’, 
--120이라면 ‘주임’
--121이라면 ‘대리’
--122라면 ‘과장’
--나머지는 ‘임원’ 으로 출력합니다.
--조건 1) manager_id가 50인 사람들을 대상으로만 조회합니다
SELECT * FROM EMPLOYEES;

SELECT EMPLOYEE_ID AS "사원번호", CONCAT(FIRST_NAME, LAST_NAME) AS "사원명", HIRE_DATE AS "입사일자", TRUNC ((SYSDATE-HIRE_DATE)/365.25) AS "근속년수" FROM EMPLOYEES
WHERE TRUNC((SYSDATE-HIRE_DATE)/365.25) >= 10
ORDER BY 근속년수 DESC;

SELECT first_name, manager_id, DECODE(manager_id, 
'100', '사원',
'120', '주임',
'121', '대리',
'122', '과장',
'임원') AS "직급" FROM EMPLOYEES 
WHERE DEPARTMENT_ID = 50;

SELECT first_name, manager_id, CASE 
WHEN manager_id = '100' THEN '사원' 
WHEN manager_id = '120' THEN '주임' 
WHEN manager_id = '121' THEN '대리' 
WHEN manager_id = '122' THEN '과장' 
ELSE '임원' END AS "직급" FROM EMPLOYEES
WHERE DEPARTMENT_ID = 50;




