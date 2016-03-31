-- CREATE, PRIMARY KEY
CREATE Doctor(
	doc_id CHAR(5) PRIMARY KEY,
	doc_name CHAR(10),
	doc_department CHAR(20),
	doc_gender CHAR(1),
	CONSTRAINT doc_gender_ck CHECK(doc_gender="1" or doc_gender="m");
);

CREATE Patient(
	pat_id CHAR(5) PRIMARY KEY,
	pat_name CHAR(10),
	pat_birth DATE,
	pat_gender CHAR(1),
	pat_phone CHAR(20),
	pat_address CHAR(50),
	doc_id CHAR(5),
	CONSTRAINT pat_gender_ck CHECK(pat_gender="1" or pat_gender="m"),
	CONSTRAINT pat_doc_id_fk FOREIGN KEY(doc_id) REFERENCES Doctor(doc_id);
);




