-- MariaDB dump 10.17  Distrib 10.4.14-MariaDB, for Win64 (AMD64)
--
-- Host: 127.0.0.1    Database: escuela
-- ------------------------------------------------------
-- Server version	10.4.14-MariaDB

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
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
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `alumnomaterias` (
  `id_alumnoMaterias` int(4) NOT NULL AUTO_INCREMENT,
  `id_numCuenta1` int(4) NOT NULL,
  `id_materiasHorarios1` int(4) NOT NULL,
  `calificacion` float DEFAULT NULL,
  PRIMARY KEY (`id_alumnoMaterias`),
  KEY `id_numCuenta1` (`id_numCuenta1`),
  KEY `id_materiasHorarios1` (`id_materiasHorarios1`),
  CONSTRAINT `alumnomaterias_ibfk_1` FOREIGN KEY (`id_numCuenta1`) REFERENCES `alumnos` (`id_numCuenta`),
  CONSTRAINT `alumnomaterias_ibfk_2` FOREIGN KEY (`id_materiasHorarios1`) REFERENCES `materiashorarios` (`id_materiasHorarios`)
) ENGINE=InnoDB AUTO_INCREMENT=81 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `alumnomaterias`
--

LOCK TABLES `alumnomaterias` WRITE;
/*!40000 ALTER TABLE `alumnomaterias` DISABLE KEYS */;
INSERT INTO `alumnomaterias` VALUES (1,1000,1,8),(2,1000,2,9),(3,1000,3,7),(4,1000,4,10),(5,1001,1,8),(6,1001,2,9),(7,1001,3,7),(8,1001,4,10),(9,1002,1,8),(10,1002,2,9),(11,1002,3,7),(12,1002,4,10),(13,1003,1,8),(14,1003,2,9),(15,1003,3,7),(16,1003,4,10),(17,1004,1,8),(18,1004,2,9),(19,1004,3,7),(20,1004,4,10),(21,1005,1,8),(22,1005,2,9),(23,1005,3,7),(24,1005,4,10),(25,1006,5,8),(26,1006,6,9),(27,1006,7,7),(28,1006,8,10),(29,1007,5,8),(30,1007,6,9),(31,1007,7,7),(32,1007,8,10),(33,1008,5,8),(34,1008,6,9),(35,1008,7,7),(36,1008,8,10),(37,1009,5,8),(38,1009,6,9),(39,1009,7,7),(40,1009,8,10),(41,1010,5,8),(42,1010,6,9),(43,1010,7,7),(44,1010,8,10),(45,1011,9,8),(46,1011,10,9),(47,1011,11,7),(48,1011,12,10),(49,1012,9,8),(50,1012,10,9),(51,1012,11,7),(52,1012,12,10),(53,1013,9,8),(54,1013,10,9),(55,1013,11,7),(56,1013,12,10),(57,1014,9,8),(58,1014,10,9),(59,1014,11,7),(60,1014,12,10),(61,1015,9,8),(62,1015,10,9),(63,1015,11,7),(64,1015,12,10),(65,1016,13,8),(66,1016,14,9),(67,1016,15,7),(68,1016,16,10),(69,1017,13,8),(70,1017,14,9),(71,1017,15,7),(72,1017,16,10),(73,1018,13,10),(74,1018,14,8),(75,1018,15,9),(76,1018,16,7),(77,1019,13,10),(78,1019,14,10),(79,1019,15,8),(80,1019,16,9);
/*!40000 ALTER TABLE `alumnomaterias` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `alumnos`
--

DROP TABLE IF EXISTS `alumnos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `alumnos` (
  `id_numCuenta` int(4) NOT NULL AUTO_INCREMENT,
  `id_grupo1` int(4) NOT NULL,
  `password` varchar(20) DEFAULT NULL,
  `nombre` varchar(60) DEFAULT NULL,
  `apellido` varchar(60) DEFAULT NULL,
  `sexo` varchar(1) DEFAULT NULL,
  `fechaNacAlum` varchar(20) DEFAULT NULL,
  `direccion` varchar(150) DEFAULT NULL,
  `cp` varchar(4) DEFAULT NULL,
  `telefono` varchar(25) DEFAULT NULL,
  `correo` varchar(60) DEFAULT NULL,
  `promedio` float DEFAULT NULL,
  `estatus` varchar(15) DEFAULT NULL,
  `generacion` varchar(4) DEFAULT NULL,
  PRIMARY KEY (`id_numCuenta`),
  KEY `id_grupo1` (`id_grupo1`),
  CONSTRAINT `alumnos_ibfk_1` FOREIGN KEY (`id_grupo1`) REFERENCES `grupos` (`id_grupo`)
) ENGINE=InnoDB AUTO_INCREMENT=1020 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `alumnos`
--

LOCK TABLES `alumnos` WRITE;
/*!40000 ALTER TABLE `alumnos` DISABLE KEYS */;
INSERT INTO `alumnos` VALUES (1000,1,'password_0','Juan','Garzon','M','14/05/2008','Tolsa 36\nColonia Centro, Centro\nCuauht?moc\n06000 Ciudad de M?xico, CDMX','8684','5524568989','jgsgz@gmail.com',0,'alumno','2008'),(1001,1,'password_1','Pedro','Marco','M','13/06/2008','Dr Jimenez 354\nDoctores\nCuauht?moc\n06720 Ciudad de M?xico, CDMX','5556','5524868982','psdmar@gmail.com',0,'alumno','2008'),(1002,1,'password_2','Antonio ','Serra','M','13/07/2008','San Lorenzo la Cebada\n16035 Ciudad de M?xico, CDMX','5895','5525168975','annsier@gmail.com',0,'alumno','2008'),(1003,1,'password_3','Samira','Salgado','F','12/08/2008','\nPlan de Ayala\nSan Lorenzo la Cebada\nXochimilco\n16035 Ciudad de M?xico, CDMX','5757','5525468968','samsal@gmail.com',0,'alumno','2008'),(1004,1,'password_4','Antia','Gordo','F','11/09/2008','Constitucion de 1917\nSan Lorenzo la Cebada\nXochimilco\n16035 Ciudad de M?xico, CDMX','5475','5525768961','angro@gmail.com',0,'alumno','2008'),(1005,2,'password_5','Placido','Acedo','M','14/05/2007','Unnamed Road, Valle Escondido, Ciudad de M?xico, CDMX','4557','5526068954','placve@gmail.com',9.4,'alumno','2007'),(1006,2,'password_6','Lina','Tovar','F','13/06/2007','Huexotitla 8\nSan Andr?s Totoltepec\nTlalpan\n14400 Ciudad de M?xico, CDMX','5785','5526368947','linntov@gmail.com',8.6,'alumno','2007'),(1007,2,'password_7','Regina','Nieto','F','13/07/2007','Calle Diligencias 153\nSan Pedro M?rtir\nTlalpan\n14650 Ciudad de M?xico, CDMX','4545','5526668940','regnu@gmail.com',7.8,'exalumno','2007'),(1008,2,'password_8','Gael','Mendoza','M','12/08/2007','Zempoaltecas 69-15\nTlalcoligia\nTlalpan\n14430 Ciudad de M?xico, CDMX','4950','5526968933','gaelme@gmail.com',7,'alumno','2007'),(1009,2,'password_9','Salome','Ubeda','F','11/09/2007','Sta ?rsula Xitla\nTlalpan\n14420 Ciudad de M?xico, CDMX','4944','5527268926','salum@gmail.com',6.2,'alumno','2007'),(1010,3,'password_10','Jacqueline','Gutierrez','F','14/05/2006','San Jos? Buenavista 27\nSta ?rsula Xitla\nTlalpan\n14420 Ciudad de M?xico, CDMX','4938','5527568919','jaqugu@gmail.com',9.4,'alumno','2006'),(1011,3,'password_11','Latifa','Pedrosa','F','13/06/2006','Cedral\nSan Pedro M?rtir\nTlalpan\n14650 Ciudad de M?xico, CDMX','4932','5527868912','lap@gmail.com',8.6,'alumno','2006'),(1012,3,'password_12','Alvaro','Ferrando','M','13/07/2006','Monte de Piedad\n04310 Ciudad de M?xico, CDMX','4926','5528168905','alfer@gmail.com',7.8,'alumno','2006'),(1013,3,'password_13','Matilde','Martinez','F','12/08/2006','Av Melchor Ocampo 260\nSanta Catarina\nCoyoac?n\n04010 Ciudad de M?xico, CDMX','5757','5528468898','matmar@gmail.com',7,'alumno','2006'),(1014,3,'password_14','Candela','Gutierrez','F','11/09/2006','Cjon. Belisario Dom?nguez 170-158\nDel Carmen\nCoyoac?n\n04100 Ciudad de M?xico, CDMX','4275','5528768891','cndegu@gmail.com',6.2,'alumno','2006'),(1015,4,'password_15','Violeta','Quintana','F','14/05/2005','Francisco Javier Mina 61\nDel Carmen\nCoyoac?n\n04100 Ciudad de M?xico, CDMX','7775','5529068884','violqui@gmail.com',9.4,'alumno','2005'),(1016,4,'password_16','Fidel','Santos','M','13/06/2005','Ignacio Aldama #74, Berl?n Esquina, Del Carmen, Coyoac?n, 04100 Ciudad de M?xico, CDMX','7575','5529368877','fidelsa@gmail.com',8.6,'alumno','2005'),(1017,4,'password_17','Giovanni','Olivera','M','13/07/2005','Abasolo 178-172, Del Carmen, Coyoac?n, 04100 Ciudad de M?xico, CDMX','4575','5529668870','giovannOli@gmail.com',7.8,'alumno','2005'),(1018,4,'password_18','Nestor','Martinez','M','12/08/2005','Segunda Cda. Parque 6-4\nGral Anaya\nBenito Ju?rez\n03340 Ciudad de M?xico, CDMX','5757','5529968863','nesmart@gmail.com',7,'alumno','2005'),(1019,4,'password_19','Olalla','Garcia','M','11/09/2005','\nSan Pedro 157\nDel Carmen\nCoyoac?n\n04100 Ciudad de M?xico, CDMX','5757','5530268856','olaGra@gmail.com',6.2,'alumno','2005');
/*!40000 ALTER TABLE `alumnos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `grupos`
--

DROP TABLE IF EXISTS `grupos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `grupos` (
  `id_grupo` int(4) NOT NULL AUTO_INCREMENT,
  `grado` varchar(1) DEFAULT NULL,
  PRIMARY KEY (`id_grupo`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `grupos`
--

LOCK TABLES `grupos` WRITE;
/*!40000 ALTER TABLE `grupos` DISABLE KEYS */;
INSERT INTO `grupos` VALUES (1,'1'),(2,'1'),(3,'3'),(4,'4');
/*!40000 ALTER TABLE `grupos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `materias`
--

DROP TABLE IF EXISTS `materias`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `materias` (
  `id_materia` int(4) NOT NULL AUTO_INCREMENT,
  `nombreMateria` varchar(15) DEFAULT NULL,
  `descripcion` varchar(150) DEFAULT NULL,
  `laboratorio` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`id_materia`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `materias`
--

LOCK TABLES `materias` WRITE;
/*!40000 ALTER TABLE `materias` DISABLE KEYS */;
INSERT INTO `materias` VALUES (1,'biologia','Ciencia que estudia la estructura de los seres vivos y de sus procesos vitales.',1),(2,'quimica','Ciencia que estudia la composici?n y las propiedades de la materia y de las transformaciones que esta experimenta sin que se alteren los elementos que',1),(3,'fisica','Ciencia que estudia las propiedades de la materia y de la energ?a y establece las leyes que explican los fen?menos naturales, excluyendo los que modif',1),(4,'matematicas','Ciencia que estudia las propiedades de los n?meros y las relaciones que se establecen entre ellos.',0),(5,'geografia','Ciencia que estudia y describe la superficie de la Tierra en su aspecto f?sico, actual y natural, o como lugar habitado por la humanidad.',0),(6,'redaccion','La redacci?n es una forma de edici?n en la que se combinan (redactan) m?ltiples fuentes de textos y se modifican ligeramente para crear un solo docume',0),(7,'historia','La historia es la ciencia que tiene como objetivo el estudio de sucesos del pasado, tradicionalmente de la humanidad?, y como m?todo, el propio de las',0),(8,'edu. fisica','La ense?anza de la educaci?n f?sica consiste en un conjunto de estrategias did?cticas que promueven el acondicionamiento f?sico con actividades que ej',0),(9,'civismo','El civismo (del lat?n civis, ciudadano y civitas, civitatis, ciudad) o urbanidad se refiere a las pautas m?nimas de comportamiento social que nos perm',0),(10,'computacion','La computaci?n es la ciencia encargada de estudiar los sistemas, m?s precisamente computadoras, que autom?ticamente gestionan informaci?n. ',1),(11,'ingles','El ingl?s es un idioma que tiene casi el doble de hablantes como segunda lengua, lo cual nos puede dar una idea de su gran importancia.',0),(12,'literatura','Teor?a de la composici?n de las obras escritas en prosa o verso.',0),(13,'filosofia','Conjunto de reflexiones sobre la esencia, las propiedades, las causas y los efectos de las cosas naturales, especialmente sobre el hombre y el univers',0);
/*!40000 ALTER TABLE `materias` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `materiashorarios`
--

DROP TABLE IF EXISTS `materiashorarios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `materiashorarios` (
  `id_materiasHorarios` int(4) NOT NULL AUTO_INCREMENT,
  `id_materia1` int(4) NOT NULL,
  `id_numCuentaProf1` int(4) NOT NULL,
  `id_grupo2` int(4) NOT NULL,
  `id_salon1` int(4) NOT NULL,
  `horario` varchar(15) DEFAULT NULL,
  `dias` varchar(15) DEFAULT NULL,
  PRIMARY KEY (`id_materiasHorarios`),
  KEY `id_materia1` (`id_materia1`),
  KEY `id_numCuentaProf1` (`id_numCuentaProf1`),
  KEY `id_grupo2` (`id_grupo2`),
  KEY `id_salon1` (`id_salon1`),
  CONSTRAINT `materiashorarios_ibfk_1` FOREIGN KEY (`id_materia1`) REFERENCES `materias` (`id_materia`),
  CONSTRAINT `materiashorarios_ibfk_2` FOREIGN KEY (`id_numCuentaProf1`) REFERENCES `profesores` (`id_numCuentaProf`),
  CONSTRAINT `materiashorarios_ibfk_3` FOREIGN KEY (`id_grupo2`) REFERENCES `grupos` (`id_grupo`),
  CONSTRAINT `materiashorarios_ibfk_4` FOREIGN KEY (`id_salon1`) REFERENCES `salones` (`id_salon`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `materiashorarios`
--

LOCK TABLES `materiashorarios` WRITE;
/*!40000 ALTER TABLE `materiashorarios` DISABLE KEYS */;
INSERT INTO `materiashorarios` VALUES (1,1,100,1,1,'7:00-8:30 AM','L-M-V\r'),(2,2,101,1,1,'8:30-10:00 AM','M-J\r'),(3,3,102,1,2,'10:00-11:30 AM','L-M-V\r'),(4,4,103,1,2,'11:30-13:00 AM','M-J\r'),(5,5,104,2,3,'7:00-8:30 AM','L-M-V\r'),(6,6,105,2,3,'8:30-10:00 AM','M-J\r'),(7,7,106,2,4,'10:00-11:30 AM','L-M-V\r'),(8,8,107,2,4,'11:30-13:00 AM','M-J\r'),(9,9,108,3,5,'7:00-8:30 AM','L-M-V\r'),(10,10,109,3,6,'8:30-10:00 AM','M-J\r'),(11,11,110,3,7,'10:00-11:30 AM','L-M-V\r'),(12,12,111,3,8,'11:30-13:00 AM','M-J\r'),(13,13,109,4,9,'7:00-8:30 AM','L-M-V\r'),(14,11,110,4,10,'8:30-10:00 AM','M-J\r'),(15,12,111,4,11,'10:00-11:30 AM','L-M-V\r'),(16,13,100,4,9,'11:30-13:00 AM','M-J\r');
/*!40000 ALTER TABLE `materiashorarios` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `profesores`
--

DROP TABLE IF EXISTS `profesores`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `profesores` (
  `id_numCuentaProf` int(4) NOT NULL AUTO_INCREMENT,
  `passwordProf` varchar(20) DEFAULT NULL,
  `nombreProf` varchar(60) DEFAULT NULL,
  `apellidoProf` varchar(60) DEFAULT NULL,
  `sexoProf` varchar(1) DEFAULT NULL,
  `fechaNacProf` varchar(20) DEFAULT NULL,
  `direccionProf` varchar(150) DEFAULT NULL,
  `cpProf` varchar(4) DEFAULT NULL,
  `telefonoProf` varchar(25) DEFAULT NULL,
  `correoProf` varchar(60) DEFAULT NULL,
  PRIMARY KEY (`id_numCuentaProf`)
) ENGINE=InnoDB AUTO_INCREMENT=112 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `profesores`
--

LOCK TABLES `profesores` WRITE;
/*!40000 ALTER TABLE `profesores` DISABLE KEYS */;
INSERT INTO `profesores` VALUES (100,'password_0','Fabiola','Hernandez','F','14/05/1989','Moctezuma 2da Secc, Ciudad de M?xico, CDMX','5634','5525659589','hdez@gmail.com\r'),(101,'password_1','Erika','Guzman','F','01/05/1990','C. U. Benito Ju?rez, 06760 Ciudad de M?xico, CDMX','5789','5583854514','gzmna@gmail.com\r'),(102,'password_2','Juan','Ramirez','M','26/04/1970','Portales Nte, Ciudad de M?xico, CDMX','5944','5642049439','rmasd@gmail.com\r'),(103,'password_3','Hector','Preciado','M','17/11/1985','Bramadero Ramos Mill?n, Ciudad de M?xico, CDMX','6099','5700244364','htpre@gmail.com\r'),(104,'password_4','Pedro','Hernandez','M','08/10/1988','San Lucas, 09000 Ciudad de M?xico, CDMX','6254','5758439289','pehredf@gmail.com\r'),(105,'password_5','Maria','Osorio','F','29/11/1980','Pedregal de Sta ?rsula, Ciudad de M?xico, CDMX','6409','5816634214','mariori@gmail.com\r'),(106,'password_6','Susana','Hurtado','F','10/06/1968','Los Reyes, 04330 Ciudad de M?xico, CDMX','6564','5874829139','hurma@gmail.com\r'),(107,'password_7','Mercedes','Naranjo','F','21/03/1993','Granjas San Antonio, 09070 Ciudad de M?xico, CDMX','6719','5933024064','mercnara@gmail.com\r'),(108,'password_8','Julio','Rios','M','07/02/1975','Colonia Centro, Centro, Ciudad de M?xico, CDMX','6874','5991218989','riosjul@gmail.com\r'),(109,'password_9','Alejandro','Valle','M','13/08/1959','Lomas de los ?ngeles Tetelpan, 01790 Ciudad de M?xico, CDMX','7029','6049413914','aljvalles@gmail.com\r'),(110,'password_10','Alberto','Cruz','M','04/05/1986','Camino a Santa Ursula, Sta ?rsula Xitla, Tlalpan, 14420 Ciudad de M?xico, CDMX','7184','6107608839','albrxrcza@gmail.com\r'),(111,'password_11','Sonia','Maya','F','15/01/1992','Cda. Nahoas, Tlalcoligia, Tlalpan, 14430 Ciudad de M?xico, CDMX','7339','6165803764','simomaya@gmail.com\r');
/*!40000 ALTER TABLE `profesores` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `salones`
--

DROP TABLE IF EXISTS `salones`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `salones` (
  `id_salon` int(4) NOT NULL AUTO_INCREMENT,
  `edificio` varchar(1) DEFAULT NULL,
  `cupo` int(3) DEFAULT NULL,
  `laboratorio` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`id_salon`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `salones`
--

LOCK TABLES `salones` WRITE;
/*!40000 ALTER TABLE `salones` DISABLE KEYS */;
INSERT INTO `salones` VALUES (1,'A',25,0),(2,'A',25,0),(3,'B',50,0),(4,'B',50,0),(5,'C',25,0),(6,'C',25,0),(7,'D',25,0),(8,'D',25,0),(9,'E',25,1),(10,'E',25,1),(11,'E',25,1);
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

-- Dump completed on 2021-01-22 12:57:01
