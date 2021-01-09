-- DROP DATABASE escuela;
-- mysql -u root -p

-- Crear base de datos
CREATE DATABASE escuela;
USE escuela;

-- Crear tablas
CREATE TABLE alumnos (
    id_numCuenta INT(4) NOT NULL AUTO_INCREMENT,
    id_grupo1 INT(4) NOT NULL,
    id_alumnoMaterias1 INT(4),
    nombre VARCHAR(60) NOT NULL,
    apellido VARCHAR(60) NOT NULL,
    sexo VARCHAR(1) NOT NULL,
    edad INT(3) NOT NULL,
    direccion VARCHAR(150),
    cp INT(4),
    telefono INT(15),
    correo VARCHAR(60),
    promedio FLOAT(3) NOT NULL,
    estatus VARCHAR(15) NOT NULL,
    generacion INT(4) NOT NULL,
    PRIMARY KEY (id_numcuenta)
);

CREATE TABLE alumnoMaterias (
    id_alumnoMaterias INT(4) NOT NULL AUTO_INCREMENT,
    id_numCuenta1 INT(4) NOT NULL,
    id_materiasHorarios1 INT(4) NOT NULL,
    calificacion FLOAT(2) NOT NULL,
    PRIMARY KEY (id_alumnoMaterias)
);

CREATE TABLE asistencias (
    id_asistencia INT(4) NOT NULL AUTO_INCREMENT,
    id_numCuenta2 INT(4) NOT NULL,
    id_materiasHorarios2 INT(4) NOT NULL,
    fecha DATETIME NOT NULL,
    PRIMARY KEY (id_asistencia)
);

CREATE TABLE grupos (
    id_grupo INT(4) NOT NULL AUTO_INCREMENT,
    id_gruposSalon1 INT(4) NOT NULL,
    id_materiasGrupo1 INT(4) NOT NULL,
    grado INT(1) NOT NULL,
    PRIMARY KEY (id_grupo)
);

CREATE TABLE gruposSalon (
    id_gruposSalon INT(4) NOT NULL AUTO_INCREMENT,
    id_grupo2 INT(4) NOT NULL,
    id_salon1 INT(4) NOT NULL,
    PRIMARY KEY (id_gruposSalon)
);

CREATE TABLE salones (
    id_salon INT(4) NOT NULL AUTO_INCREMENT,
    edificio VARCHAR(1),
    cupo INT(3) NOT NULL,
    laboratorio VARCHAR(2) NOT NULL,
    PRIMARY KEY (id_salon)
);

CREATE TABLE materiasGrupo (
    id_materiasGrupo INT(4) NOT NULL AUTO_INCREMENT,
    id_grupo3 INT(4) NOT NULL,
    id_materiasHorarios3 INT(3) NOT NULL,
    PRIMARY KEY (id_materiasGrupo)
);

CREATE TABLE materias (
    id_materia INT(4) NOT NULL AUTO_INCREMENT,
    nombreMateria VARCHAR(15) NOT NULL,
    descripcion VARCHAR(150) NOT NULL,
    laboratorio VARCHAR(2) NOT NULL,
    PRIMARY KEY (id_materia)
);

CREATE TABLE materiasHorarios (
    id_materiasHorarios INT(4) NOT NULL AUTO_INCREMENT,
    id_materia1 INT(4) NOT NULL,
    horario VARCHAR(15) NOT NULL,
    dias VARCHAR(15) NOT NULL,
    PRIMARY KEY (id_materiasHorarios)
);

CREATE TABLE profesoresMaterias (
    id_profesoresMaterias INT(4) NOT NULL AUTO_INCREMENT,
    id_numCuentaProf1 INT(4) NOT NULL,
    id_materiasHorarios4 INT(4) NOT NULL,
    PRIMARY KEY (id_profesoresMaterias)
);

CREATE TABLE profesores (
    id_numCuentaProf INT(4) NOT NULL AUTO_INCREMENT,
    id_nivel1 INT(2) NOT NULL,
    nombreProf VARCHAR(60) NOT NULL,
    apellidoProf VARCHAR(60) NOT NULL,
    sexoProf VARCHAR(1) NOT NULL,
    edadProf INT(3) NOT NULL,
    direccionProf VARCHAR(150),
    cpProf INT(4),
    telefonoProf INT(10),
    correoProf VARCHAR(60),
    PRIMARY KEY (id_numCuentaProf)
);

CREATE TABLE nivel (
    id_nivel INT(2) NOT NULL AUTO_INCREMENT,
    nombreNivel VARCHAR(15) NOT NULL,
    gradoAcademico VARCHAR(15) NOT NULL,
    PRIMARY KEY (id_nivel)
);

-- Llaves foraneas
ALTER TABLE alumnos ADD FOREIGN KEY(id_grupo1) REFERENCES grupos(id_grupo);
ALTER TABLE alumnos ADD FOREIGN KEY(id_alumnoMaterias1) REFERENCES alumnoMaterias(id_alumnoMaterias);
ALTER TABLE alumnoMaterias ADD FOREIGN KEY(id_numCuenta1) REFERENCES alumnos(id_numcuenta);
ALTER TABLE alumnoMaterias ADD FOREIGN KEY(id_materiasHorarios1) REFERENCES materiasHorarios(id_materiasHorarios);
ALTER TABLE asistencias ADD FOREIGN KEY(id_numCuenta2) REFERENCES alumnos(id_numCuenta);
ALTER TABLE asistencias ADD FOREIGN KEY(id_materiasHorarios2) REFERENCES materiasHorarios(id_materiasHorarios);
ALTER TABLE grupos ADD FOREIGN KEY(id_gruposSalon1) REFERENCES gruposSalon(id_gruposSalon);
ALTER TABLE grupos ADD FOREIGN KEY(id_materiasGrupo1) REFERENCES materiasGrupo(id_materiasGrupo);
ALTER TABLE gruposSalon ADD FOREIGN KEY(id_grupo2) REFERENCES grupos(id_grupo);
ALTER TABLE gruposSalon ADD FOREIGN KEY(id_salon1) REFERENCES salones(id_salon);
ALTER TABLE materiasGrupo ADD FOREIGN KEY(id_grupo3) REFERENCES grupos(id_grupo);
ALTER TABLE materiasGrupo ADD FOREIGN KEY(id_materiasHorarios3) REFERENCES materiasHorarios(id_materiasHorarios);
ALTER TABLE profesoresMaterias ADD FOREIGN KEY(id_numCuentaProf1) REFERENCES profesores(id_numCuentaProf);
ALTER TABLE profesoresMaterias ADD FOREIGN KEY(id_materiasHorarios4) REFERENCES materiasHorarios(id_materiasHorarios);
ALTER TABLE profesores ADD FOREIGN KEY(id_nivel1) REFERENCES nivel(id_nivel);
ALTER TABLE materiasHorarios ADD FOREIGN KEY(id_materia1) REFERENCES materias(id_materia);

-- Importar valores csv
LOAD DATA INFILE 'D:/Documentos/MCIC/Materias/Programacion_Avanzada/Proyecto/salones.csv' 
INTO TABLE salones 
FIELDS TERMINATED BY ',' 
ENCLOSED BY '"'
LINES TERMINATED BY '\n'
IGNORE 1 ROWS;

LOAD DATA INFILE 'D:/Documentos/MCIC/Materias/Programacion_Avanzada/Proyecto/nivel.csv' 
INTO TABLE salones 
FIELDS TERMINATED BY ',' 
ENCLOSED BY '"'
LINES TERMINATED BY '\n'
IGNORE 1 ROWS;

LOAD DATA INFILE 'D:/Documentos/MCIC/Materias/Programacion_Avanzada/Proyecto/profesores.csv' 
INTO TABLE salones 
FIELDS TERMINATED BY ',' 
ENCLOSED BY '"'
LINES TERMINATED BY '\n'
IGNORE 1 ROWS;

LOAD DATA INFILE 'D:/Documentos/MCIC/Materias/Programacion_Avanzada/Proyecto/materias.csv' 
INTO TABLE salones 
FIELDS TERMINATED BY ',' 
ENCLOSED BY '"'
LINES TERMINATED BY '\n'
IGNORE 1 ROWS;

LOAD DATA INFILE 'D:/Documentos/MCIC/Materias/Programacion_Avanzada/Proyecto/materiasHorarios.csv' 
INTO TABLE salones 
FIELDS TERMINATED BY ',' 
ENCLOSED BY '"'
LINES TERMINATED BY '\n'
IGNORE 1 ROWS;

