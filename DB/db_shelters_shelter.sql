-- MySQL dump 10.13  Distrib 8.0.17, for Win64 (x86_64)
--
-- Host: localhost    Database: db_shelters
-- ------------------------------------------------------
-- Server version	8.0.17

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
-- Table structure for table `shelter`
--

DROP TABLE IF EXISTS `shelter`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `shelter` (
  `ID` int(10) NOT NULL AUTO_INCREMENT,
  `Address` varchar(255) DEFAULT NULL,
  `Name` varchar(255) DEFAULT NULL,
  `img` varchar(400) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `shelter`
--

LOCK TABLES `shelter` WRITE;
/*!40000 ALTER TABLE `shelter` DISABLE KEYS */;
INSERT INTO `shelter` VALUES (1,'Parque los Pedgregales, Estepona, Málaga','ADANA Dog Shelter','http://localhost:8081/img/adana.jpg'),(3,'Calle Chimbesque, s/n, 38628 Tenerife, Santa Cruz de Tenerife','K9 Animal Sanctuary, Kennels','http://localhost:8081/img/k9.jpg'),(4,'Av. los Nenúfares, s/n, 03184 Torrevieja, Alicante','Albergue Municipal de Animales','http://localhost:8081/img/albergueMunicipal.jpg'),(5,' Lugar Ringo Rango, 21, 11370 Los Barrios, Cádiz','Perrera Los Barrios','http://localhost:8081/img/barrios.jpg'),(6,'Partido del Marguizo s/n, Rambla de los Hornicos, A-370, 04280 Los Gallardos, Almería','PAWS-PATAS Animal Shelter','http://localhost:8081/img/paws.jpg'),(7,'38627 Arona, Santa Cruz de Tenerife','Live Arico Centro de Rescate Animal','http://localhost:8081/img/arico.jpg'),(8,'Camino del Zarzoso, 47400 Medina del Campo, Valladolid','Scooby Protectora de Animales',' http://localhost:8081/img/scooby.jpg'),(9,' A-355, 5, 29610 Marbella, Málaga','Triple A Marbella Animal Shelter',' http://localhost:8081/img/tripleA.jpg');
/*!40000 ALTER TABLE `shelter` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-12-13 21:13:27
