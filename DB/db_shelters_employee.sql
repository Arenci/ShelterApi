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
-- Table structure for table `employee`
--

DROP TABLE IF EXISTS `employee`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `employee` (
  `ID` int(10) NOT NULL AUTO_INCREMENT,
  `ShelterID` int(10) NOT NULL,
  `Name` varchar(255) DEFAULT NULL,
  `LastName1` varchar(255) DEFAULT NULL,
  `LastName2` varchar(255) DEFAULT NULL,
  `Telephone` int(10) NOT NULL,
  `Email` varchar(255) DEFAULT NULL,
  `Dni` varchar(255) NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `FKEmployee122075` (`ShelterID`),
  CONSTRAINT `FKEmployee122075` FOREIGN KEY (`ShelterID`) REFERENCES `shelter` (`ID`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=41 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employee`
--

LOCK TABLES `employee` WRITE;
/*!40000 ALTER TABLE `employee` DISABLE KEYS */;
INSERT INTO `employee` VALUES (1,1,'Carlos ','Ruiz','Bardaji',623830226,'1@gmail.com','38583551S'),(3,1,'Cesar ','Francisco 1','Cerezuela',729078099,'3@gmail.com','15248273T'),(7,3,'Petronilo ','Giralt',' ',626536751,'7@gmail.comn','37069978A'),(8,3,'Yael ','Piña',' ',689004924,'8@gmail.com','65106643E'),(9,3,'Hector ','Jesus ','Lahoz',574505390,'9@gmail.com','14102434Q'),(10,4,'Pelegrin ','De La Serna',' ',817514294,'10@gmail.com','36102580Q'),(11,4,'Joaquim ','Maria ','Abadia',940844256,'11@gmail.com','93071813T'),(12,4,'Victor ','Daniel ','Del Barco',698565183,'12@gmail.com','35784339Y'),(13,5,'Maximo','Carbonell',' ',298692096,'13@gmail.com','27966201I'),(14,5,'Eduardo','Angel ','Roche',440220184,'14@gmail.com','6293918P'),(15,5,'Jaime ','Maria ','Sanchez',674157366,'15@gmail.com','51559923A'),(16,6,'Juan ','Ignacio ','Asenjo',608132717,'16@gmail.com','64551034M'),(17,6,'Rafael ','Jorge ','Cortada',75046254,'17@gmail.com','42935530C'),(18,6,'Felix ','Rafael ','Espinosa',296356531,'18@gmail.com','60198537X'),(19,7,'Hector','Daniel ','Braña',450737616,'19@gmail.com','77901389V'),(20,7,'Andre ','Celaya',' ',888793093,'20@gmail.com','17482096B'),(21,7,'Serviliano ','Llamazares',' ',490758768,'21@gmail.com','21638273N'),(22,8,'Giorgio ','Giro',' ',958717157,'22@gmail.com','49972598A'),(23,8,'Rafael ','Santiago ','Menchon',887543609,'23@gmail.com','33187057G'),(24,8,'Enrique ','Joaquin ','Senra',843906975,'24@gmail.com','68456000J'),(25,9,'Paciano','Garay',' ',220633509,'25@gmail.com','78111615I'),(26,9,'Salvador ','Enrique ','Grimaldi',571130210,'26@gmail.com','57326007R'),(27,9,'Sandro ','Trejo',' ',845520788,'27@gmail.com','12799126W'),(36,1,'David','Cardoso','Peña',1234,'algo@algo.com','453634291F');
/*!40000 ALTER TABLE `employee` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-12-13 21:13:26
