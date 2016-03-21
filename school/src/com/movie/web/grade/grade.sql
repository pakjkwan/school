SELECT * FROM Grade;
--시퀀스 생성
CREATE SEQUENCE hak
START WITH 20160001
INCREMENT BY 1;

DROP TABLE Grade CASCADE CONSTRAINT;
DROP SEQUENCE hak;


SELECT * FROM Grade;

CREATE TABLE Grade(
	hak NUMBER PRIMARY KEY,
	id  VARCHAR2(30)NOT NULL,
	java NUMBER NOT NULL,
	jsp NUMBER NOT NULL,
	sql NUMBER NOT NULL,
	spring NUMBER NOT NULL
	
);

INSERT INTO Grade(hak,id,java,jsp,sql,spring)
VALUES (hak.NEXTVAL,'hong','80','80','80','80');
INSERT INTO Grade(hak,id,java,jsp,sql,spring)
VALUES (hak.NEXTVAL,'kim','90','70','50','80');
INSERT INTO Grade(hak,id,java,jsp,sql,spring)
VALUES (hak.NEXTVAL,'lee','100','100','100','90');
INSERT INTO Grade(hak,id,java,jsp,sql,spring)
VALUES (hak.NEXTVAL,'yoon','60','70','50','50');
INSERT INTO Grade(hak,id,java,jsp,sql,spring)
VALUES (hak.NEXTVAL,'kim2','50','20','40','30');
INSERT INTO Grade(hak,id,java,jsp,sql,spring)
VALUES (hak.NEXTVAL,'song','50','40','40','30');

INSERT INTO Grade(hak,id,java,jsp,sql,spring)
VALUES (20160001,'hong','80','80','80','80');











SELECT * FROM Grade;

SELECT * FROM Grade
WHERE id = 'song';