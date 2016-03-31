-- id, name, CASCADE
CREATE TABLE Student(
	id CHAR(8) NOT NULL,
	name CHAR(13) ,
	ssn CHAR(10),
	major CHAR(15),
	UNIQUE(ssn),
	PRIMARY KEY(id),
	FOREIGN KEY(major) REFERENCES Department(name)
	ON DELETE SET NULL ON UPDATE CASCADE
);
CREATE TABLE Department(
	id CHAR(5) NOT NULL,
	name CHAR(15) NOT NULL,
	PRIMARY KEY(name)
);
-- id, CASCADE
CREATE TABLE Course(
	id CHAR(8) NOT NULL,
	name CHAR(20) NOT NULL,
	instructor CHAR(5),
	PRIMARY KEY(id),
	FOREIGN KEY(instructor)REFERENCES Department(name)
		ON DELETE SET NULL ON UPDATE CASCADE
);
-- name, CASCADE
CREATE TABLE Instructor(
	id CHAR(5) NOT NULL,
	name CHAR(15) NOT NULL,
	dept CHAR(15),
	PRIMARY KEY(id),
	FOREIGN KEY(dept)REFERENCES Department(name)
		ON DELETE SET NULL ON UPDATE CASCADE
);
-- VIEW
CREATE VIEW V_Course (cc_id, cc_name, instname) AS
SELECT c.id, c.name, i.name
FROM Cource c, Instructor i
WHERE i.id = c.instructor;
-- INDEX
CREATE UNIQUE INDEX stu_idx ON Student(ssn) CLUSTER;

