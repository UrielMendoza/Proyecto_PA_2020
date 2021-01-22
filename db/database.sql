-- mysql -u root -p
-- DROP DATABASE escuela;

-- Crear base de datos
CREATE DATABASE escuela;
USE escuela;

-- Crear tablas
CREATE TABLE alumnos (
    id_numCuenta INT(4) NOT NULL AUTO_INCREMENT,
    id_grupo1 INT(4) NOT NULL,
    password VARCHAR(20),
    nombre VARCHAR(60) ,
    apellido VARCHAR(60) ,
    sexo VARCHAR(1) ,
    fechaNacAlum VARCHAR(20) ,
    direccion VARCHAR(150),
    cp VARCHAR(4),
    telefono VARCHAR(25),
    correo VARCHAR(60),
    promedio FLOAT(3) ,
    estatus VARCHAR(15) ,
    generacion VARCHAR(4) ,
    PRIMARY KEY (id_numcuenta)
);

CREATE TABLE alumnoMaterias (
    id_alumnoMaterias INT(4) NOT NULL AUTO_INCREMENT,
    id_numCuenta1 INT(4)  NOT NULL ,
    id_materiasHorarios1 INT(4)  NOT NULL ,
    calificacion FLOAT(2) ,
    PRIMARY KEY (id_alumnoMaterias)
);

CREATE TABLE grupos (
    id_grupo INT(4) NOT NULL AUTO_INCREMENT,
    grado VARCHAR(1) ,
    PRIMARY KEY (id_grupo)
);

CREATE TABLE salones (
    id_salon INT(4) NOT NULL AUTO_INCREMENT,
    edificio VARCHAR(1),
    cupo INT(3) ,
    laboratorio TINYINT(1) ,
    PRIMARY KEY (id_salon)
);

CREATE TABLE materias (
    id_materia INT(4) NOT NULL AUTO_INCREMENT,
    nombreMateria VARCHAR(15) ,
    descripcion VARCHAR(150) ,
    laboratorio TINYINT(1) ,
    PRIMARY KEY (id_materia)
);

CREATE TABLE materiasHorarios (
    id_materiasHorarios INT(4) NOT NULL AUTO_INCREMENT,
    id_materia1 INT(4) NOT NULL,
    id_numCuentaProf1 INT(4) NOT NULL ,
    id_grupo2 INT(4) NOT NULL,
    id_salon1 INT(4) NOT NULL,
    horario VARCHAR(15) ,
    dias VARCHAR(15) ,
    PRIMARY KEY (id_materiasHorarios)
);

CREATE TABLE profesores (
    id_numCuentaProf INT(4) NOT NULL AUTO_INCREMENT,
    passwordProf VARCHAR(20),
    nombreProf VARCHAR(60) ,
    apellidoProf VARCHAR(60) ,
    sexoProf VARCHAR(1) ,
    fechaNacProf VARCHAR(20) ,
    direccionProf VARCHAR(150),
    cpProf VARCHAR(4),
    telefonoProf VARCHAR(25),
    correoProf VARCHAR(60),
    PRIMARY KEY (id_numCuentaProf)
);


-- Llaves foraneas
ALTER TABLE alumnos ADD FOREIGN KEY(id_grupo1) REFERENCES grupos(id_grupo);
ALTER TABLE alumnoMaterias ADD FOREIGN KEY(id_numCuenta1) REFERENCES alumnos(id_numcuenta);
ALTER TABLE alumnoMaterias ADD FOREIGN KEY(id_materiasHorarios1) REFERENCES materiasHorarios(id_materiasHorarios);
ALTER TABLE materiasHorarios ADD FOREIGN KEY(id_materia1) REFERENCES materias(id_materia);
ALTER TABLE materiasHorarios ADD FOREIGN KEY(id_numCuentaProf1) REFERENCES profesores(id_numCuentaProf);
ALTER TABLE materiasHorarios ADD FOREIGN KEY(id_grupo2) REFERENCES grupos(id_grupo);
ALTER TABLE materiasHorarios ADD FOREIGN KEY(id_salon1) REFERENCES salones(id_salon);


-- Importar valores csv
LOAD DATA INFILE 'C://Users//uriel//Documents//GitHub//Proyecto_PA_2020//db//salones.csv' 
INTO TABLE salones 
FIELDS TERMINATED BY ',' 
ENCLOSED BY '"'
LINES TERMINATED BY '\n'
IGNORE 1 ROWS;

LOAD DATA INFILE 'C://Users//uriel//Documents//GitHub//Proyecto_PA_2020//db//materias.csv' 
INTO TABLE materias 
FIELDS TERMINATED BY ',' 
ENCLOSED BY '"'
LINES TERMINATED BY '\n'
IGNORE 1 ROWS;

LOAD DATA INFILE 'C://Users//uriel//Documents//GitHub//Proyecto_PA_2020//db//grupos.csv' 
INTO TABLE grupos 
FIELDS TERMINATED BY ',' 
ENCLOSED BY '"'
LINES TERMINATED BY '\n'
IGNORE 1 ROWS;

LOAD DATA INFILE 'C://Users//uriel//Documents//GitHub//Proyecto_PA_2020//db//profesores.csv' 
INTO TABLE profesores 
FIELDS TERMINATED BY ',' 
ENCLOSED BY '"'
LINES TERMINATED BY '\n'
IGNORE 1 ROWS;

LOAD DATA INFILE 'C://Users//uriel//Documents//GitHub//Proyecto_PA_2020//db//alumnos.csv' 
INTO TABLE alumnos 
FIELDS TERMINATED BY ',' 
ENCLOSED BY '"'
LINES TERMINATED BY '\n'
IGNORE 1 ROWS;

LOAD DATA INFILE 'C://Users//uriel//Documents//GitHub//Proyecto_PA_2020//db//materiasHorarios.csv' 
INTO TABLE materiasHorarios 
FIELDS TERMINATED BY ',' 
ENCLOSED BY '"'
LINES TERMINATED BY '\n'
IGNORE 1 ROWS;

LOAD DATA INFILE 'C://Users//uriel//Documents//GitHub//Proyecto_PA_2020//db//alumnosMaterias.csv' 
INTO TABLE alumnoMaterias 
FIELDS TERMINATED BY ',' 
ENCLOSED BY '"'
LINES TERMINATED BY '\n'
IGNORE 1 ROWS;











