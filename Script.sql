--<ScriptOptions statementTerminator=";"/>

CREATE TABLE patient (
		patient_id INT4 NOT NULL,
		patient_address VARCHAR(255),
		patient_age INT4 NOT NULL,
		patient_contact_number VARCHAR(255),
		patient_email VARCHAR(255),
		patient_name VARCHAR(255)
	);

CREATE UNIQUE INDEX patient_pkey ON patient (patient_id ASC);

ALTER TABLE patient ADD CONSTRAINT patient_pkey PRIMARY KEY (patient_id);

