-- MySQL dump 10.13  Distrib 8.0.22, for Win64 (x86_64)
--
-- Host: localhost    Database: escuela2
-- ------------------------------------------------------
-- Server version	8.0.22

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `alumnomaterias`
--

DROP TABLE IF EXISTS `alumnomaterias`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `alumnomaterias` (
  `id_alumnoMaterias` int NOT NULL AUTO_INCREMENT,
  `id_numCuenta1` int NOT NULL,
  `id_materiasHorarios1` int NOT NULL,
  `calificacion` float NOT NULL,
  PRIMARY KEY (`id_alumnoMaterias`),
  KEY `id_numCuenta1` (`id_numCuenta1`),
  KEY `id_materiasHorarios1` (`id_materiasHorarios1`),
  CONSTRAINT `alumnomaterias_ibfk_1` FOREIGN KEY (`id_numCuenta1`) REFERENCES `alumnos` (`id_numCuenta`),
  CONSTRAINT `alumnomaterias_ibfk_2` FOREIGN KEY (`id_materiasHorarios1`) REFERENCES `materiashorarios` (`id_materiasHorarios`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `alumnomaterias`
--

LOCK TABLES `alumnomaterias` WRITE;
/*!40000 ALTER TABLE `alumnomaterias` DISABLE KEYS */;
INSERT INTO `alumnomaterias` VALUES (1,6,1,9.1),(2,7,3,8.3);
/*!40000 ALTER TABLE `alumnomaterias` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `alumnos`
--

DROP TABLE IF EXISTS `alumnos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `alumnos` (
  `id_numCuenta` int NOT NULL AUTO_INCREMENT,
  `id_grupo1` int NOT NULL,
  `nombre` varchar(60) NOT NULL,
  `apellido` varchar(60) NOT NULL,
  `sexo` varchar(1) NOT NULL,
  `edad` int NOT NULL,
  `promedio` float NOT NULL,
  `estatus` varchar(15) NOT NULL,
  `generacion` int NOT NULL,
  `id_contacto` int NOT NULL,
  PRIMARY KEY (`id_numCuenta`),
  KEY `id_grupo1` (`id_grupo1`),
  KEY `fk_contacto_idx` (`id_contacto`),
  CONSTRAINT `alumnos_ibfk_1` FOREIGN KEY (`id_grupo1`) REFERENCES `grupos` (`id_grupo`),
  CONSTRAINT `fk_contacto` FOREIGN KEY (`id_contacto`) REFERENCES `contacto` (`id_contacto`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `alumnos`
--

LOCK TABLES `alumnos` WRITE;
/*!40000 ALTER TABLE `alumnos` DISABLE KEYS */;
INSERT INTO `alumnos` VALUES (6,1,'Juan','Perez','H',24,9.1,'Inscripto',2021,1),(7,2,'Selena ','Martinez','M',20,9.2,'Inscripto',2020,2);
/*!40000 ALTER TABLE `alumnos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `asistencias`
--

DROP TABLE IF EXISTS `asistencias`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `asistencias` (
  `id_asistencia` int NOT NULL AUTO_INCREMENT,
  `id_numCuenta2` int NOT NULL,
  `id_materiasHorarios2` int NOT NULL,
  `fecha` datetime NOT NULL,
  PRIMARY KEY (`id_asistencia`),
  KEY `id_numCuenta2` (`id_numCuenta2`),
  KEY `id_materiasHorarios2` (`id_materiasHorarios2`),
  CONSTRAINT `asistencias_ibfk_1` FOREIGN KEY (`id_numCuenta2`) REFERENCES `alumnos` (`id_numCuenta`),
  CONSTRAINT `asistencias_ibfk_2` FOREIGN KEY (`id_materiasHorarios2`) REFERENCES `materiashorarios` (`id_materiasHorarios`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `asistencias`
--

LOCK TABLES `asistencias` WRITE;
/*!40000 ALTER TABLE `asistencias` DISABLE KEYS */;
INSERT INTO `asistencias` VALUES (7,6,1,'2020-12-04 19:00:36'),(8,7,2,'2020-12-04 19:00:56');
/*!40000 ALTER TABLE `asistencias` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `contacto`
--

DROP TABLE IF EXISTS `contacto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `contacto` (
  `id_contacto` int NOT NULL AUTO_INCREMENT,
  `calle` varchar(45) DEFAULT NULL,
  `no_calle` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `telefono` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id_contacto`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `contacto`
--

LOCK TABLES `contacto` WRITE;
/*!40000 ALTER TABLE `contacto` DISABLE KEYS */;
INSERT INTO `contacto` VALUES (1,'Paris','32','jperez@gmail','55623295'),(2,'Puebla','99','smartinez@yahoo.com','55213013'),(3,'Coyoacan','41','plopez@hotmail.com','57231456'),(4,'Polanco','2','cguerrero@outlook.com','56213548');
/*!40000 ALTER TABLE `contacto` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `grupos`
--

DROP TABLE IF EXISTS `grupos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `grupos` (
  `id_grupo` int NOT NULL AUTO_INCREMENT,
  `id_gruposSalon1` int NOT NULL,
  `id_materiasGrupo1` int NOT NULL,
  `grado` int NOT NULL,
  PRIMARY KEY (`id_grupo`),
  KEY `id_gruposSalon1` (`id_gruposSalon1`),
  KEY `id_materiasGrupo1` (`id_materiasGrupo1`),
  CONSTRAINT `grupos_ibfk_1` FOREIGN KEY (`id_gruposSalon1`) REFERENCES `grupossalon` (`id_gruposSalon`),
  CONSTRAINT `grupos_ibfk_2` FOREIGN KEY (`id_materiasGrupo1`) REFERENCES `materiasgrupo` (`id_materiasGrupo`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `grupos`
--

LOCK TABLES `grupos` WRITE;
/*!40000 ALTER TABLE `grupos` DISABLE KEYS */;
INSERT INTO `grupos` VALUES (1,5,2,3),(2,4,3,3);
/*!40000 ALTER TABLE `grupos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `grupossalon`
--

DROP TABLE IF EXISTS `grupossalon`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `grupossalon` (
  `id_gruposSalon` int NOT NULL AUTO_INCREMENT,
  `id_salon1` int NOT NULL,
  PRIMARY KEY (`id_gruposSalon`),
  KEY `id_salon1` (`id_salon1`),
  CONSTRAINT `grupossalon_ibfk_2` FOREIGN KEY (`id_salon1`) REFERENCES `salones` (`id_salon`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `grupossalon`
--

LOCK TABLES `grupossalon` WRITE;
/*!40000 ALTER TABLE `grupossalon` DISABLE KEYS */;
INSERT INTO `grupossalon` VALUES (5,1),(4,2);
/*!40000 ALTER TABLE `grupossalon` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `materias`
--

DROP TABLE IF EXISTS `materias`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `materias` (
  `id_materia` int NOT NULL AUTO_INCREMENT,
  `nombreMateria` varchar(15) NOT NULL,
  `descripcion` varchar(150) NOT NULL,
  `laboratorio` varchar(2) NOT NULL,
  PRIMARY KEY (`id_materia`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `materias`
--

LOCK TABLES `materias` WRITE;
/*!40000 ALTER TABLE `materias` DISABLE KEYS */;
INSERT INTO `materias` VALUES (1,'Matematicas','mates','No'),(2,'Biologia','bios','Si'),(3,'Quimica','quimi','Si');
/*!40000 ALTER TABLE `materias` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `materiasgrupo`
--

DROP TABLE IF EXISTS `materiasgrupo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `materiasgrupo` (
  `id_materiasGrupo` int NOT NULL AUTO_INCREMENT,
  `id_materiasHorarios3` int NOT NULL,
  PRIMARY KEY (`id_materiasGrupo`),
  KEY `id_materiasHorarios3` (`id_materiasHorarios3`),
  CONSTRAINT `materiasgrupo_ibfk_2` FOREIGN KEY (`id_materiasHorarios3`) REFERENCES `materiashorarios` (`id_materiasHorarios`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `materiasgrupo`
--

LOCK TABLES `materiasgrupo` WRITE;
/*!40000 ALTER TABLE `materiasgrupo` DISABLE KEYS */;
INSERT INTO `materiasgrupo` VALUES (3,1),(2,2),(1,3);
/*!40000 ALTER TABLE `materiasgrupo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `materiashorarios`
--

DROP TABLE IF EXISTS `materiashorarios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `materiashorarios` (
  `id_materiasHorarios` int NOT NULL AUTO_INCREMENT,
  `id_materia1` int NOT NULL,
  `horario` varchar(15) NOT NULL,
  `dias` varchar(15) NOT NULL,
  PRIMARY KEY (`id_materiasHorarios`),
  KEY `id_materia1` (`id_materia1`),
  CONSTRAINT `materiashorarios_ibfk_1` FOREIGN KEY (`id_materia1`) REFERENCES `materias` (`id_materia`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `materiashorarios`
--

LOCK TABLES `materiashorarios` WRITE;
/*!40000 ALTER TABLE `materiashorarios` DISABLE KEYS */;
INSERT INTO `materiashorarios` VALUES (1,1,'9:00-10:00','L-M-V'),(2,2,'10:00-11:00','L-M-V'),(3,3,'9:00-10-00','M-J');
/*!40000 ALTER TABLE `materiashorarios` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `nivel`
--

DROP TABLE IF EXISTS `nivel`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `nivel` (
  `id_nivel` int NOT NULL AUTO_INCREMENT,
  `nombreNivel` varchar(15) NOT NULL,
  `gradoAcademico` varchar(15) NOT NULL,
  PRIMARY KEY (`id_nivel`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `nivel`
--

LOCK TABLES `nivel` WRITE;
/*!40000 ALTER TABLE `nivel` DISABLE KEYS */;
INSERT INTO `nivel` VALUES (1,'Licenciatura','Ingeniero'),(2,'Posgrado','Maestria'),(3,'Posgrado','Doctorado');
/*!40000 ALTER TABLE `nivel` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `persona`
--

DROP TABLE IF EXISTS `persona`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `persona` (
  `id_persona` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) DEFAULT NULL,
  `apellido` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id_persona`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `persona`
--

LOCK TABLES `persona` WRITE;
/*!40000 ALTER TABLE `persona` DISABLE KEYS */;
INSERT INTO `persona` VALUES (1,'Jorge','Valdivia'),(2,'Pedro','Villada');
/*!40000 ALTER TABLE `persona` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `profesores`
--

DROP TABLE IF EXISTS `profesores`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `profesores` (
  `id_numCuentaProf` int NOT NULL AUTO_INCREMENT,
  `id_nivel1` int NOT NULL,
  `nombreProf` varchar(60) NOT NULL,
  `apellidoProf` varchar(60) NOT NULL,
  `sexoProf` varchar(1) NOT NULL,
  `edadProf` int NOT NULL,
  `id_contacto` int DEFAULT NULL,
  PRIMARY KEY (`id_numCuentaProf`),
  KEY `id_nivel1` (`id_nivel1`),
  KEY `fk_contact_idx` (`id_contacto`),
  CONSTRAINT `fk_contact` FOREIGN KEY (`id_contacto`) REFERENCES `contacto` (`id_contacto`),
  CONSTRAINT `profesores_ibfk_1` FOREIGN KEY (`id_nivel1`) REFERENCES `nivel` (`id_nivel`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `profesores`
--

LOCK TABLES `profesores` WRITE;
/*!40000 ALTER TABLE `profesores` DISABLE KEYS */;
INSERT INTO `profesores` VALUES (1,3,'Pablo ','Perez','H',54,3),(2,2,'Carmen','Guerrero','M',31,4);
/*!40000 ALTER TABLE `profesores` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `profesoresmaterias`
--

DROP TABLE IF EXISTS `profesoresmaterias`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `profesoresmaterias` (
  `id_profesoresMaterias` int NOT NULL AUTO_INCREMENT,
  `id_numCuentaProf1` int NOT NULL,
  `id_materiasHorarios4` int NOT NULL,
  PRIMARY KEY (`id_profesoresMaterias`),
  KEY `id_numCuentaProf1` (`id_numCuentaProf1`),
  KEY `id_materiasHorarios4` (`id_materiasHorarios4`),
  CONSTRAINT `profesoresmaterias_ibfk_1` FOREIGN KEY (`id_numCuentaProf1`) REFERENCES `profesores` (`id_numCuentaProf`),
  CONSTRAINT `profesoresmaterias_ibfk_2` FOREIGN KEY (`id_materiasHorarios4`) REFERENCES `materiashorarios` (`id_materiasHorarios`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `profesoresmaterias`
--

LOCK TABLES `profesoresmaterias` WRITE;
/*!40000 ALTER TABLE `profesoresmaterias` DISABLE KEYS */;
INSERT INTO `profesoresmaterias` VALUES (1,2,2),(2,1,3);
/*!40000 ALTER TABLE `profesoresmaterias` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `salones`
--

DROP TABLE IF EXISTS `salones`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `salones` (
  `id_salon` int NOT NULL AUTO_INCREMENT,
  `edificio` varchar(1) DEFAULT NULL,
  `cupo` int NOT NULL,
  `laboratorio` varchar(2) NOT NULL,
  PRIMARY KEY (`id_salon`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `salones`
--

LOCK TABLES `salones` WRITE;
/*!40000 ALTER TABLE `salones` DISABLE KEYS */;
INSERT INTO `salones` VALUES (1,'S',60,'Si'),(2,'D',20,'No');
/*!40000 ALTER TABLE `salones` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-01-09 16:04:01
