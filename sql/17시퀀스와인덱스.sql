--시퀸스(순차적으로 증가하는 값) *

SELECT * FROM USER_SEQUENCES;

--생성
CREATE SEQUENCE DEPTS_SEQ; -- 기본값으로 지정되면서 시퀀스가 생성됩니다.

DROP SEQUENCE DEPTS_SEQ; -- 삭제

CREATE SEQUENCE DEPTS_SEQ
    INCREMENT BY 1
    START WITH 1
    MAXVALUE 10
    NOCACHE -- 캐시에 시퀸스를 두지 않겠음
    NOCYCLE; -- 시퀀스가 MAX에 도달했을 때 재사용 X

SELECT * FROM USER_SEQUENCES;

-- 시퀀스는 일반적으로 PK에 자동증가하는 값으로 적용이 됩니다.
DROP TABLE DEPTS;
CREATE TABLE DEPTS(
DEPT_NO NUMBER(3) CONSTRAINT DEPTS_NO_PK1 PRIMARY KEY,
DEPT_NAME VARCHAR(30),
DEPT_DATE DATE
);

--스퀀스의 사용방법 2개 *
SELECT DEPTS_SEQ.NEXTVAL FROM DUAL; -- 한번 NEXTVAL가 일어나면, 후진은 불가능
SELECT DEPTS_SEQ.CURRVAL FROM DUAL; -- NEXTVAL가 한번 실행이 되고나서 확인이 가능합니다.

INSERT INTO DEPTS VALUES(depts_seq.nextval, 'TEST' , SYSDATE); --MAXVALUE가 10이 되면, 더 이상 사용이 불가능합니다.

SELECT * FROM DEPTS;

--시퀀스 수정(CREATE가 ALTER로만 바뀝니다.)
ALTER SEQUENCE DEPTS_SEQ MAXVALUE 1000;
ALTER SEQUENCE DEPTS_SEQ MAXVALUE 10000;
ALTER SEQUENCE DEPTS_SEQ INCREMENT BY 10 MINVALUE 1;

SELECT * FROM USER_SEQUENCES;

--시퀀스가 이미 사용되고 있다면, DROP하면 안됩니다.
--주기적으로 시퀀스를 초기화 한다면?
--시퀀스 초기화 방법
--1. 시퀀스 증가값을 -현재값 음수로 바꾸고
--2. 한번 전진을 시키고
--3.다시 양수값으로 바꾼다.

ALTER SEQUENCE DEPTS_SEQ INCREMENT BY -31 MINVALUE 0;
SELECT DEPTS_SEQ.NEXTVAL FROM DUAL;
SELECT DEPTS_SEQ.CURRVAL FROM DUAL;
ALTER SEQUENCE DEPTS_SEQ INCREMENT BY 1;
SELECT DEPTS_SEQ.NEXTVAL FROM DUAL;

-----------------------------------------------------
--시퀀스 응용
--pk의 저장을 문자열로 지정 2023-12-시퀀스값
CREATE TABLE DEPTS2( 
    DEPT_NO VARCHAR2(30) CONSTRAINT DEPTS2_PK PRIMARY KEY,
    DEPTS_NAME VARCHAR2(30) 
);
CREATE SEQUENCE DEPTS2_SEQ NOCACHE;

SELECT TO_CHAR(SYSDATE, 'YYYY-MM-') || LPAD(DEPTS2_SEQ.NEXTVAL, 5, '0') FROM DUAL;

INSERT INTO DEPTS2 VALUES (TO_CHAR(SYSDATE, 'YYYY-MM-') || LPAD(DEPTS2_SEQ.NEXTVAL, 5, '0') , 'TEST');
SELECT * FROM DEPTS2;

--시퀀스 삭제
DROP SEQUENCE DEPTS2_SEQ;
--29000 % 10 = 0
--29000 / 10 = 2900

--------------------------------------------------------------------------------------------------------
--인덱스
--INDEX는 PRIMARY KEY, UNIQUE 제약에 자동으로 생성되고, 조회를 빠르게 하는 HINT 역할을 합니다.
--INDEX의 종류로는 고유인덱스, 비고유인덱스가 있습니다.
--UNIQUE한 컬럼에는 UNIQUE인덱스(고유인덱스)가 들어갈 수 있습니다.
--일반컬럼에는 비고유 인덱스를 지정할 수 있습니다.
--INDEX는 조회를 빠르게 하지만, 무작위하게 많이 사용되는 것은 오히려 성능저하를 부를 수 있습니다.
--주로 사용되는 컬럼중에서 SELECT절의 속도저하가 있다면, 먼저 고려해볼 내용중 하나가 INDEX입니다.

CREATE TABLE EMPS_IT AS (SELECT * FROM EMPLOYEES);
SELECT * FROM EMPS_IT;

SELECT * FROM EMPS_IT WHERE FIRST_NAME  = 'Nancy';

--비 고유 인덱스를 생성
CREATE INDEX EMPS_IT_IDX ON EMPS_IT(FIRST_NAME);
--인덱스 생성후 속도
SELECT * FROM EMPS_IT WHERE FIRST_NAME = 'Nancy';

--인덱스 삭제(테이블 자체에 영향을 미치지 않습니다.)
DROP INDEX EMPS_IT_IDX;

--인덱스는 여러 컬럼을 묶어서(결합인덱스) 생성할 수도 있습니다.
CREATE INDEX EMPS_IT_IDX ON EMPS_IT(FIRST_NAME, LAST_NAME);
--
SELECT * FROM EMPS_IT WHERE FIRST_NAME = 'Nancy'; --힌트를 받음
SELECT * FROM EMPS_IT WHERE FIRST_NAME = 'Nancy' AND LAST_NAME = 'Greenberg'; --힌트를 받음
SELECT * FROM EMPS_IT WHERE LAST_NAME = 'Greenberg'; --힌트를 못받음

--오라클의 힌트절(인덱스를 이용해서 조회 순서에 힌트를 줌)

SELECT ROWNUM AS RN,
D.*
FROM DEPTS D
ORDER BY DEPT_NO DESC;

--원래구문
SELECT ROWNUM AS RN, D.* FROM (SELECT * FROM DEPTS ORDER BY DEPT_NO DESC) D;

SELECT /*+ INDEX_DESC(D DEPTS_NO_PK1) */ ROWNUM AS RN, D.*
FROM DEPTS D
ORDER BY DEPT_NO DESC;






