CREATE TABLE IF NOT EXISTS user (
	userId int8 NOT NULL,
	name varchar(255) NULL,
	password varchar(255) NULL,
	belongs varchar(255) NULL,
	recent_login timestamp(0) NULL
);

INSERT INTO user
(id, name, password, belongs, recent_login)
VALUES(1, 'test', 'pass', 'sample', NULL);