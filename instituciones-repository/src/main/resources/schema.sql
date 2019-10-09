DROP TABLE IF EXISTS COURSES;

CREATE TABLE COURSES (
  ID            	BIGINT(11)      NOT NULL AUTO_INCREMENT,
  TITLE   		VARCHAR(250)  	NOT NULL,
  LEVEL			VARCHAR(80)  	NOT NULL,
  HOURS		   	INT(3)  		NULL,
  TEACHER		VARCHAR(250)  	NOT NULL,
  STATE		 	INT(1)  		NOT NULL,
  PRIMARY KEY (ID),
  UNIQUE KEY (TITLE)
);

INSERT INTO COURSES (TITLE, LEVEL, HOURS, TEACHER, STATE) VALUES('Aumenta el rendimiento de tus tests de integración con BBDD usando un pool de conexiones dbcp2 con BasicDataSource de Apache', 'Intermedio', 25, 'Alberto Barranco Ramó', 1);
INSERT INTO COURSES (TITLE, LEVEL, HOURS, TEACHER, STATE) VALUES('Aplicando TDD en concursos', 'Básico', 10, 'Alejandro Acebes Cabrera', 1);
INSERT INTO COURSES (TITLE, LEVEL, HOURS, TEACHER, STATE) VALUES('Ejecutando test de SoapUI Open Source en JUnit en un proyecto Maven', 'Básico', 20, 'Alberto Moratilla Ocaña', 1);


DROP TABLE IF EXISTS STUDENTS;

CREATE TABLE STUDENTS (
	ID 	BIGINT(11)	NOT NULL AUTO_INCREMENT,
	NAME	VARCHAR(250) 	NOT NULL,
	AGE	VARCHAR(250) 	NOT NULL,
	EMAIL	VARCHAR(250) 	NOT NULL,
	PRIMARY KEY (ID)
);

INSERT INTO STUDENTS (NAME, AGE, EMAIL) VALUES('Daniel', 22, 'email@mail.com');
INSERT INTO STUDENTS (NAME, AGE, EMAIL) VALUES('Jose', 30, 'email2@mail.com');
INSERT INTO STUDENTS (NAME, AGE, EMAIL) VALUES('Pedro', 50, 'email3@mail.com');




