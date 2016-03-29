-- VALUE IN
CREATE DOMAIN position VARCHAR2(10)
DEFAULT 'sawon'
CONSTRAINT VALID-position 
CHECK(VALUE IN('sawon','daeri','gwajang','boojang','isa','sajang'));
-- TRIGGER
CREATE TRIGGER wage_trg AFTER UPDATE ON wage
	REFERENCING OLD TABLE AS old_tbl 
	NEW TABLE AS new_tbl
	FOR EACH ROW
	WHEN old_tbl.position=new_tbl.position
	BEGIN
		UPDATE sawon SET wage=new_tbl, gibon_pay+new_tbl.sunggwa_pay
	END;