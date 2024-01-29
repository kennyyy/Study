--트랜잭션 (작업의 논리적인 단위)
--오직 DML문에 대해서만 트랜잭션을 수행할 수 있습니다.

--오토커밋 상태 확인
SHOW AUTOCOMMIT;
--오토커밋 온
SET AUTOCOMMIT ON;
--오토커밋 OFF
SET AUTOCOMMIT OFF;

--------------------------------------------------------------------------------
--SAVE POINT (실제로 많이 쓰지 않음)
SELECT * FROM DEPTS;
DELETE FROM DEPTS WHERE DEPARTMENT_ID = 10;

SAVEPOINT DEL10; -- DEL10 세이브포인트

DELETE FROM DEPTS WHERE DEPARTMENT_ID = 20;

SAVEPOINT DEL20; -- DEL20 세이브포인트

DELETE FROM DEPTS WHERE DEPARTMENT_ID = 30;

ROLLBACK TO DEL20; -- 20번지점으로 롤백
SELECT * FROM DEPTS;
ROLLBACK TO DEL10; -- 10번지점으로 롤백
SELECT * FROM DEPTS;

ROLLBACK; -- 마지막 커밋시점으로 롤백

--커밋 (실제 반영)
INSERT INTO DEPTS VALUES(280, 'AAA', NULL, 1800);
COMMIT;
SELECT * FROM DEPTS;


----------------------------------------------------

--DDL문장 ( 트랜잭션이 없습니다)
--CREATE, ALTER, DROP문이 있습니다

DROP TABLE DEPTS; -- DEFTS삭제
CREATE TABLE DEPTS(
    DEPT_NO NUMBER(2), --숫자 2자리
    DEPT_NAME VARCHAR(30), -- 30BYTE (한글은 15글자, 숫자 OR 영어는 30글자)
    DEPT_YN CHAR(1), -- 고정문자 1BYTE(VARCHAR2로 대체가능)
    DEPT_DATE DATE, --날짜
    DEPT_BONUS NUMBER(10, 2), --숫자 10자리, 소수점은 2자리까지 저장.
    DEPT_CONTENT LONG -- 2기가 가변문자열 (VARCHAR보다 더 큰 문자열)
);
DESC DEPTS;
INSERT INTO DEPTS VALUES(99, 'HELLO', 'Y', SYSDATE, 3.14, 'HELLO WORLD, HI~~');
INSERT INTO DEPTS VALUES(100, 'HELLO', 'N', SYSDATE, 3.14, 'BYE~'); -- DEPT_NO 초과
INSERT INTO DEPTS VALUES(1, 'HELLO', '가', SYSDATE, 3.14, 'BYE~'); -- 한글은2byte

SELECT * FROM DEPTS;
-------------------------------------------------------------------------------------
--테이블 구조 변경 ALTER

--컬럼추가
ALTER TABLE DEPTS ADD (DEPT_COUNT NUMBER(3));
SELECT * FROM DEPTS;

--컬럼 명칭 변경
ALTER TABLE DEPTS RENAME COLUMN DEPT_COUNT TO EMP_COUNT; -->DEPT_COUNT -> EMP_COUNT로 변경

--컬럼 수정(크기)
ALTER TABLE DEPTS MODIFY (EMP_COUNT NUMBER(10)); -- EMP_COUNT컬럼의 타입을 변경
ALTER TABLE DEPTS MODIFY (EMP_COUNT NUMBER(2)); -- EMP_COUNT컬럼의 타입을 변경
ALTER TABLE DEPTS MODIFY (DEPT_NAME VARCHAR2(1)); -- 기존데이터가 변경할 크기를 넘어가는 경우, 변경불가
DESC DEPTS;
 
--컬럼 삭제(DROP COLUMN)
ALTER TABLE DEPTS DROP COLUMN EMP_COUNT;

-----------------------------------------------
DROP TABLE DEPTS;

CREATE TABLE DEPT2 (
    DEPT_NO NUMBER (3),
    DEPT_NAME VARCHAR2(15),
    LOCA_NUMBER NUMBER (4),
    DEPT_GENDER CHAR(1),
    REG_DATE DATE,
    DEPT_BONUS NUMBER(10, 2)
);
DESC DEPT2;
DROP TABLE DEPT2;
INSERT INTO DEPT2 VALUES (2, 'KIM', 1222, 'M', SYSDATE, 9.99);
SELECT * FROM DEPT2;

ALTER TABLE DEPT2 MODIFY DEPT_BONUS NUMBER(3, 2);
    
    
    
    
    
    