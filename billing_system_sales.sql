CREATE DATABASE  IF NOT EXISTS `billing_system` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `billing_system`;
-- MySQL dump 10.13  Distrib 8.0.28, for Win64 (x86_64)
--
-- Host: localhost    Database: billing_system
-- ------------------------------------------------------
-- Server version	8.0.28

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
-- Table structure for table `sales`
--

DROP TABLE IF EXISTS `sales`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `sales` (
  `pid` int NOT NULL,
  `pname` varchar(45) DEFAULT NULL,
  `date` varchar(45) DEFAULT NULL,
  `quantity` float DEFAULT NULL,
  `price` float DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sales`
--

LOCK TABLES `sales` WRITE;
/*!40000 ALTER TABLE `sales` DISABLE KEYS */;
INSERT INTO `sales` VALUES (1,'mango','2022-4-7',4,40),(3,'potato','2022-3-25',3,90),(1,'mango','2022-4-7',4,40),(1,'mango','2022-4-7',4,40),(6,'lemons','2022-4-7',4,23.6),(1,'mango','2022-4-7',4,40),(1,'mango','2022-4-7',4,40),(1,'mango','2022-4-7',4,40),(1,'mango','2022-4-7',4,40),(1,'mango','2022-4-7',4,40),(1,'mango','2022-4-7',4,40),(1,'mango','2022-4-7',4,40),(1,'mango','2022-4-7',4,40),(1,'mango','2022-4-7',4,40),(1,'mango','2022-4-7',10,100),(1,'mango','2022-4-7',5,50),(1,'mango','2022-4-7',5,50),(1,'mango','2022-4-7',5,50),(1,'mango','2022-4-7',5,50),(1,'mango','2022-4-7',5,50),(2,'apples','2022-4-7',5,315),(5,'berries','2022-4-7',5,525),(1,'mango','2022-4-8',5,50),(2,'apples','2022-4-8',8,504),(3,'potato','2022-4-8',2,60),(1,'mango','2022-4-8',3,30),(5,'berries','2022-4-27',4,420),(1,'mango','2022-4-27',3,94.5),(2,'apples','2022-4-27',3,204.75),(6,'lemons','2022-4-27',3,17.7);
/*!40000 ALTER TABLE `sales` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-04-27 22:19:10
