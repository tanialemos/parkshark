CREATE TABLE divisions
(
    id VARCHAR2(150) NOT NULL,
    name VARCHAR2(50CHAR) NOT NULL,
    name_orig VARCHAR2(50CHAR) NOT NULL,
    director VARCHAR2(100CHAR) NOT NULL,
    fk_parent_div_id NUMBER(6,0) NOT NULL,
        CONSTRAINT divisions_pk PRIMARY KEY (id),
        CONSTRAINT divisions_parent_fk FOREIGN KEY (fk_parent_div_id) REFERENCES parkshark.divisions(id)
);
    