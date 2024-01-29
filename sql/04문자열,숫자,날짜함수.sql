--문자열 다루기 함수 LOWER, UPPER, INITCAP

--LOWER-소문자, UPPER-대문자, INITCAP-첫글자만 대문자  
SELECT LOWER('abcDEF'), UPPER('abcDEF'), INITCAP('abcDEF') FROM DUAL; -- DUAL 간단한 확인용 가상 테이블
SELECT FIRST_NAME, LOWER(FIRST_NAME), UPPER(FIRST_NAME), INITCAP(FIRST_NAME) FROM EMPLOYEES;

-- LENGTH-길이, INSTR-문자열찾기(index) 
SELECT FIRST_NAME, LENGTH(FIRST_NAME), INSTR(FIRST_NAME, 'a') FROM EMPLOYEES;

-- SUBSTR(컬럼, 시작인덱스(시작은 1부터), 자를문자개수) - 문자열자르기 , CONCAT-문자열붙이기 || (문자합치기)랑 같은 의미
SELECT FIRST_NAME, SUBSTR(FIRST_NAME, 3, 2), SUBSTR(FIRST_NAME, 4), CONCAT(FIRST_NAME, ' '||LAST_NAME) FROM EMPLOYEES;

-- LPAD - 왼쪽에 남은부분을 특정 값으로 채움, RPAD = "
SELECT LPAD('ABC', 10, '*') FROM DUAL;
SELECT RPAD(FIRST_NAME, 10, '-'), LPAD(FIRST_NAME, 10, '-') FROM EMPLOYEES;

-- TRIM - 공백제거 , LTRIM, RTRIM (기본값 공백제거 ,특정값 제거도 가능 LTRIM, RTRIM만 사용가능)
SELECT TRIM(' HELLO WORLD '), LTRIM(' HELLO WORLD '), RTRIM(' HELLO WOLRD ') FROM DUAL;
SELECT LTRIM('HELLO WORLD', 'HE' ) FROM DUAL;

--REPLACE - 특정 문자를 변경
SELECT REPLACE('피카츄 라이츄 파이리 꼬북이', '파이리', '리자드') FROM DUAL;

-- my dream is hello world

-- hello를 '헬로' 로 변경하고, 모든공백은 제거한다.
SELECT REPLACE(REPLACE('my dream is hello world', 'hello', '헬로') , ' ', '') FROM DUAL; --중첩(nested)될 수 있습니다

-------------------------------------------------------------------------------------------------------------------
-------------------------------------------------------------------------------------------------------------------

-- 숫자 함수

--ROUND - 반올림

SELECT ROUND(45.923, 2) , ROUND(45.923, 0), ROUND(45.923) , ROUND(45.923, -1) FROM DUAL;

--TRUNC - 절삭

SELECT TRUNC(45.923, 2) , TRUNC(45.923, 0), TRUNC(45.923) , TRUNC(45.923, -1) FROM DUAL;

-- ABS - 절대값

-- FLOOR - 내림, CEIL - 올림

SELECT FLOOR(3.14), CEIL(3.14) FROM DUAL;

-- MOD - 나머지

SELECT MOD(10, 3) AS 나머지 FROM DUAL;

--날짜 함수
SELECT SYSDATE FROM DUAL;

SELECT SYSTIMESTAMP  FROM DUAL;

--날짜도 연산이 가능합니다. (일수를 기준으로 처리된다.)
SELECT HIRE_DATE, HIRE_DATE + 1 FROM EMPLOYEES; -- 일수 + 1
SELECT HIRE_DATE, HIRE_DATE - 1 FROM EMPLOYEES; -- 일수 - 1

SELECT FIRST_NAME, SYSDATE - HIRE_DATE FROM EMPLOYEES; -- 일수 (몇일이 지났는가)
SELECT FIRST_NAME, (SYSDATE - HIRE_DATE) / 7 FROM EMPLOYEES; -- 주
SELECT FIRST_NAME, (SYSDATE - HIRE_DATE) / 365 FROM EMPLOYEES; -- 년

--날짜 반올림 ROUND, 절삭 TRUNC

SELECT ROUND(SYSDATE) FROM DUAL; -- 일자 기준으로 반올림
SELECT ROUND(SYSDATE, 'MONTH') FROM DUAL; -- 월 기준으로 반올림
SELECT ROUND(SYSDATE, 'YEAR') FROM DUAL; -- 년 기준으로 반올림

SELECT TRUNC(SYSDATE) FROM DUAL; -- 일자 기준으로 절삭
SELECT TRUNC(SYSDATE, 'MONTH') FROM DUAL; -- 월 기준으로 절삭
SELECT TRUNC(SYSDATE, 'YEAR') FROM DUAL; -- 년 기준으로 반올림



















