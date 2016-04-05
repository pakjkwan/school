SELECT * FROM Grade;
--시퀀스 생성
CREATE SEQUENCE score_seq
START WITH 1
INCREMENT BY 1;

DROP TABLE Grade CASCADE CONSTRAINT;
DROP SEQUENCE score_seq;


SELECT * FROM Grade;

CREATE TABLE Grade(
	score_seq NUMBER PRIMARY KEY,
	id  VARCHAR2(30)NOT NULL,
	java NUMBER NOT NULL,
	jsp NUMBER NOT NULL,
	sql NUMBER NOT NULL,
	spring NUMBER NOT NULL
	
);


INSERT INTO Grade(score_seq,id,java,jsp,sql,spring)
VALUES (score_seq.NEXTVAL,'hong','80','80','80','80');
INSERT INTO Grade(score_seq,id,java,jsp,sql,spring)
VALUES (score_seq.NEXTVAL,'kim','90','70','50','80');
INSERT INTO Grade(score_seq,id,java,jsp,sql,spring)
VALUES (score_seq.NEXTVAL,'lee','100','100','100','90');
INSERT INTO Grade(score_seq,id,java,jsp,sql,spring)
VALUES (score_seq.NEXTVAL,'yoon','60','70','50','50');
INSERT INTO Grade(score_seq,id,java,jsp,sql,spring)
VALUES (score_seq.NEXTVAL,'kim2','50','20','40','30');
INSERT INTO Grade(score_seq,id,java,jsp,sql,spring)
VALUES (score_seq.NEXTVAL,'song','50','40','40','30');
INSERT INTO Grade(score_seq,id,java,jsp,sql,spring)
VALUES (score_seq.NEXTVAL,'hong','80','80','80','80');
INSERT INTO Grade(score_seq,id,java,jsp,sql,spring)
VALUES (score_seq.NEXTVAL,'hong','20','20','20','20');










SELECT * FROM Grade;

SELECT * FROM Grade
WHERE id = 'song';