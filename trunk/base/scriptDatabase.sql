CREATE DATABASE  IF NOT EXISTS `business` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `business`;
-- MySQL dump 10.13  Distrib 5.5.28, for debian-linux-gnu (i686)
--
-- Host: localhost    Database: business
-- ------------------------------------------------------
-- Server version	5.5.28-0ubuntu0.12.04.3

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
-- Table structure for table `custommers`
--

DROP TABLE IF EXISTS `custommers`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `custommers` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `fullName` varchar(45) DEFAULT NULL,
  `address` varchar(45) DEFAULT NULL,
  `telephone` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `active` bit(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `custommers`
--

LOCK TABLES `custommers` WRITE;
/*!40000 ALTER TABLE `custommers` DISABLE KEYS */;
INSERT INTO `custommers` VALUES (1,'Cửa Hàng số 2 Q4','20 Trần Phú Q2','86547893','demo1@gmail.com',''),(2,'Công Ty Cổ Phần Đầu tư','22 Ngô Quyền Q5','86123564','demo2@gmail.com',''),(3,'Cửa Hàng Bách Hóa Q1','155 Trần Hưng Đạo','85456123','demo3@gmail.com',''),(4,'Công Ty XNK Hoa Hồng','123 Trần Phú','8356423','demo4@gmail.com',''),(5,'Công Ty VHP Tân Bình','10 Lý thường Kiệt','8554545','demo5@gmail.com','');
/*!40000 ALTER TABLE `custommers` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `employees`
--

DROP TABLE IF EXISTS `employees`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `employees` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `lastName` varchar(50) DEFAULT NULL,
  `firstName` varchar(50) DEFAULT NULL COMMENT '		',
  `gender` bit(1) DEFAULT NULL,
  `birthday` date DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  `telephone` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employees`
--

LOCK TABLES `employees` WRITE;
/*!40000 ALTER TABLE `employees` DISABLE KEYS */;
INSERT INTO `employees` VALUES (1,'Lê văn','Tám','','1965-10-12','45 Trần Phú','86452345'),(2,'Trần thị','Lan','\0','1970-10-20','15 Nguyễn Trãi Q5',''),(3,'Tạ thành','Tâm','','1965-12-10','20 Võ thị Sáu','85656666'),(4,'Ngô Thanh','Sơn','','1950-12-20','122 Trần Phú',''),(5,'Lê thị','Thủy','\0','1970-10-10','25 Ngô Quyền','97654123');
/*!40000 ALTER TABLE `employees` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `invoiceDetails`
--

DROP TABLE IF EXISTS `invoiceDetails`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `invoiceDetails` (
  `product_id` int(11) NOT NULL,
  `invoices_id` int(11) NOT NULL,
  `quantity` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`product_id`,`invoices_id`),
  KEY `fk_invoiceDetails_product1_idx` (`product_id`),
  KEY `fk_invoiceDetails_invoices1_idx` (`invoices_id`),
  CONSTRAINT `fk_invoiceDetails_invoices1` FOREIGN KEY (`invoices_id`) REFERENCES `invoices` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_invoiceDetails_product1` FOREIGN KEY (`product_id`) REFERENCES `product` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `invoiceDetails`
--

LOCK TABLES `invoiceDetails` WRITE;
/*!40000 ALTER TABLE `invoiceDetails` DISABLE KEYS */;
INSERT INTO `invoiceDetails` VALUES (1,2,'1'),(2,3,'1');
/*!40000 ALTER TABLE `invoiceDetails` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `invoices`
--

DROP TABLE IF EXISTS `invoices`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `invoices` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `created` datetime DEFAULT NULL,
  `delivery` datetime DEFAULT NULL,
  `employees_id` int(11) NOT NULL,
  `custommers_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_invoices_employees_idx` (`employees_id`),
  KEY `fk_invoices_custommers1_idx` (`custommers_id`),
  CONSTRAINT `fk_invoices_custommers1` FOREIGN KEY (`custommers_id`) REFERENCES `custommers` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_invoices_employees` FOREIGN KEY (`employees_id`) REFERENCES `employees` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `invoices`
--

LOCK TABLES `invoices` WRITE;
/*!40000 ALTER TABLE `invoices` DISABLE KEYS */;
INSERT INTO `invoices` VALUES (1,'2005-05-05 00:00:00','2005-05-10 00:00:00',1,1),(2,'2005-05-05 00:00:00','2005-05-10 00:00:00',2,2),(3,'2005-05-05 00:00:00','2005-05-10 00:00:00',3,3),(4,'2005-05-05 00:00:00','2005-05-10 00:00:00',4,4),(5,'2005-05-05 00:00:00','2005-05-10 00:00:00',5,5);
/*!40000 ALTER TABLE `invoices` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `product`
--

DROP TABLE IF EXISTS `product`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `product` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '	',
  `productName` varchar(45) DEFAULT NULL,
  `unit` varchar(45) DEFAULT NULL,
  `price` decimal(10,0) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `product`
--

LOCK TABLES `product` WRITE;
/*!40000 ALTER TABLE `product` DISABLE KEYS */;
INSERT INTO `product` VALUES (1,'Bia 33','Lon',4000),(2,'Bia 33','Lon',4000),(3,'Bia Tiger','Lon',5000),(4,'Bia Heneken','Lon',6000),(5,'Bia Heneken','Lon',6000);
/*!40000 ALTER TABLE `product` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2013-06-05 16:07:49
