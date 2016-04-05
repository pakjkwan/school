SELECT * FROM Member;

DROP TABLE Member CASCADE CONSTRAINT;

CREATE TABLE Member(
	id VARCHAR2(30) PRIMARY KEY,
	name VARCHAR2(30) NOT NULL,
	password VARCHAR2(30) NOT NULL,
	addr VARCHAR2(100),
	birth NUMBER
);
INSERT INTO Member(id,name,password,addr,birth)
VALUES ('hong','홍길동','1','서울',800101);
INSERT INTO Member(id,name,password,addr,birth)
VALUES ('kim','김유신','1','경기',900203);
INSERT INTO Member(id,name,password,addr,birth)
VALUES ('lee','이순신','1','부산',000909);
INSERT INTO Member(id,name,password,addr,birth)
VALUES ('song','송준기','1','대전',041001);
INSERT INTO Member
VALUES ('yoon','윤손하','1','인천',060201);
INSERT INTO Member(id,name,password,addr,birth)
VALUES ('kim2','김유신','1','LA',850501);
INSERT INTO Member(id,name,password,addr,birth)
VALUES ('you','유아인','1','강릉',920505);

UPDATE Member SET subject = 'java/jsp/sql/spring', major = 'computer' WHERE id = 'hong';
UPDATE Member SET subject = 'java/jsp/sql/spring', major = 'computer' WHERE id = 'kim';
UPDATE Member SET subject = 'java/jsp/sql/spring', major = 'computer' WHERE id = 'lee';
UPDATE Member SET subject = 'java/jsp/sql/spring', major = 'info' WHERE id = 'song';
UPDATE Member SET subject = 'java/jsp/sql/spring', major = 'info' WHERE id = 'yoon';
UPDATE Member SET subject = 'java/jsp/sql/spring', major = 'info' WHERE id = 'kim2';
UPDATE Member SET subject = 'java/jsp/sql/spring', major = 'security' WHERE id = 'jang2';
UPDATE Member SET subject = 'java/jsp/sql/spring', major = 'security' WHERE id = 'jun';
UPDATE Member SET subject = 'java/jsp/sql/spring', major = 'security' WHERE id = 'jang';


DELETE FROM Member WHERE id = 'choi';

SELECT * FROM Member;

SELECT * FROM Member
WHERE id = 'choi';

SELECT * FROM Member
WHERE id = 'kim' and password = '1';

-- DDL 테이블 수정

-- 1. 컬럼 추가
ALTER TABLE Member ADD subject varchar2(100); -- java/sql/spring
ALTER TABLE Member ADD major varchar2(20); -- java/sql/spring

-- 2. 컬럼 수정(이름)
ALTER TABLE Member RENAME COLUMN password TO pass; 
-- 3. 컬럼 수정(타입)
ALTER TABLE Menber MODIFY birth DATE;















