-- MySQL dump 10.13  Distrib 5.7.27, for Win64 (x86_64)
--
-- Host: localhost    Database: erp_db
-- ------------------------------------------------------
-- Server version	5.7.27

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
-- Table structure for table `erp_department`
--

DROP TABLE IF EXISTS `erp_department`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `erp_department` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `create_date` datetime(6) DEFAULT NULL,
  `dept_id` varchar(255) DEFAULT NULL,
  `dept_name` varchar(255) DEFAULT NULL,
  `dept_Tel` varchar(255) DEFAULT NULL,
  `gmt_Create` datetime(6) DEFAULT NULL,
  `gmt_modified` datetime(6) DEFAULT NULL,
  `manager_id` varchar(255) DEFAULT NULL,
  `parent_id` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `erp_department`
--

LOCK TABLES `erp_department` WRITE;
/*!40000 ALTER TABLE `erp_department` DISABLE KEYS */;
/*!40000 ALTER TABLE `erp_department` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `erp_emp_role_relation`
--

DROP TABLE IF EXISTS `erp_emp_role_relation`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `erp_emp_role_relation` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `emp_id` varchar(255) DEFAULT NULL,
  `gmt_create` datetime(6) DEFAULT NULL,
  `gmt_modified` datetime(6) DEFAULT NULL,
  `role_id` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `erp_emp_role_relation`
--

LOCK TABLES `erp_emp_role_relation` WRITE;
/*!40000 ALTER TABLE `erp_emp_role_relation` DISABLE KEYS */;
/*!40000 ALTER TABLE `erp_emp_role_relation` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `erp_employee`
--

DROP TABLE IF EXISTS `erp_employee`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `erp_employee` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `address` varchar(255) DEFAULT NULL,
  `age` tinyint(4) DEFAULT NULL,
  `birth` datetime(6) DEFAULT NULL,
  `dept_id` varchar(255) DEFAULT NULL,
  `education` bit(1) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `emp_id` varchar(255) DEFAULT NULL,
  `emp_name` varchar(255) DEFAULT NULL,
  `gender` varchar(255) DEFAULT NULL,
  `gmt_create` datetime(6) DEFAULT NULL,
  `gmt_modified` datetime(6) DEFAULT NULL,
  `graduation_date` smallint(6) DEFAULT NULL,
  `id_number` varchar(255) DEFAULT NULL,
  `institution` varchar(255) DEFAULT NULL,
  `leader_id` varchar(255) DEFAULT NULL,
  `linkman` varchar(255) DEFAULT NULL,
  `linkman_phone` varchar(255) DEFAULT NULL,
  `linkman_relation` bit(1) DEFAULT NULL,
  `major` varchar(255) DEFAULT NULL,
  `maried` varchar(255) DEFAULT NULL,
  `nationality` varchar(255) DEFAULT NULL,
  `native_place` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `phone` varchar(255) DEFAULT NULL,
  `political` tinyint(4) DEFAULT NULL,
  `user_name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `erp_employee`
--

LOCK TABLES `erp_employee` WRITE;
/*!40000 ALTER TABLE `erp_employee` DISABLE KEYS */;
/*!40000 ALTER TABLE `erp_employee` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `erp_menu`
--

DROP TABLE IF EXISTS `erp_menu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `erp_menu` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `gmt_creter` datetime(6) DEFAULT NULL,
  `gmt_modified` datetime(6) DEFAULT NULL,
  `menu_id` varchar(255) DEFAULT NULL,
  `menu_name` varchar(255) DEFAULT NULL,
  `parent_id` varchar(255) DEFAULT NULL,
  `url` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `erp_menu`
--

LOCK TABLES `erp_menu` WRITE;
/*!40000 ALTER TABLE `erp_menu` DISABLE KEYS */;
INSERT INTO `erp_menu` VALUES (2,NULL,NULL,NULL,NULL,NULL,NULL);
/*!40000 ALTER TABLE `erp_menu` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `erp_role`
--

DROP TABLE IF EXISTS `erp_role`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `erp_role` (
  `id` tinyint(4) NOT NULL AUTO_INCREMENT,
  `gmt_create` datetime(6) DEFAULT NULL,
  `gmt_modified` datetime(6) DEFAULT NULL,
  `role_id` varchar(255) DEFAULT NULL,
  `role_name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `erp_role`
--

LOCK TABLES `erp_role` WRITE;
/*!40000 ALTER TABLE `erp_role` DISABLE KEYS */;
INSERT INTO `erp_role` VALUES (2,NULL,NULL,NULL,NULL);
/*!40000 ALTER TABLE `erp_role` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `erp_role_menu_relation`
--

DROP TABLE IF EXISTS `erp_role_menu_relation`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `erp_role_menu_relation` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `gmt_create` datetime(6) DEFAULT NULL,
  `gmt_modified` datetime(6) DEFAULT NULL,
  `menu_id` varchar(255) DEFAULT NULL,
  `role_id` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `erp_role_menu_relation`
--

LOCK TABLES `erp_role_menu_relation` WRITE;
/*!40000 ALTER TABLE `erp_role_menu_relation` DISABLE KEYS */;
INSERT INTO `erp_role_menu_relation` VALUES (1,'2019-11-29 20:44:06.000000','2019-11-29 20:44:13.000000','1','1');
/*!40000 ALTER TABLE `erp_role_menu_relation` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-11-29 20:48:06
