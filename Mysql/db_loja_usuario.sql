CREATE DATABASE  IF NOT EXISTS `db_loja` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `db_loja`;
-- MySQL dump 10.13  Distrib 8.0.29, for Win64 (x86_64)
--
-- Host: localhost    Database: db_loja
-- ------------------------------------------------------
-- Server version	8.0.29

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
-- Table structure for table `usuario`
--

DROP TABLE IF EXISTS `usuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `usuario` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nome` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `celular` varchar(45) DEFAULT NULL,
  `setor` varchar(45) DEFAULT NULL,
  `filial` varchar(45) DEFAULT NULL,
  `login` varchar(45) DEFAULT NULL,
  `senha` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=526 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuario`
--

LOCK TABLES `usuario` WRITE;
/*!40000 ALTER TABLE `usuario` DISABLE KEYS */;
INSERT INTO `usuario` VALUES (332,NULL,NULL,'33222221',NULL,NULL,NULL,NULL),(434,'CursoTI',NULL,NULL,NULL,NULL,NULL,NULL),(435,'BAZAR','pitchula@gmail.com',NULL,NULL,NULL,NULL,NULL),(436,'CONGELADOS','pitchula@gmail.com',NULL,NULL,NULL,NULL,NULL),(437,'FLV','pitchula@gmail.com',NULL,NULL,NULL,NULL,NULL),(438,'ROUPAS_','pitchula@gmail.com',NULL,NULL,NULL,NULL,NULL),(439,'BAZAR','pitchula@gmail.com',NULL,NULL,NULL,NULL,NULL),(440,'BAZAR','pitchula@gmail.com',NULL,NULL,NULL,NULL,NULL),(441,'BAZAR','pitchula@gmail.com',NULL,NULL,NULL,NULL,NULL),(442,'BAZAR','pitchula@gmail.com',NULL,NULL,NULL,NULL,NULL),(443,'BAZAR','pitchula@gmail.com',NULL,NULL,NULL,NULL,NULL),(444,'BAZAR','pitchula@gmail.com',NULL,NULL,NULL,NULL,NULL),(445,'BAZAR','pitchula@gmail.com',NULL,NULL,NULL,NULL,NULL),(446,'FLV','pitchula@gmail.com',NULL,NULL,NULL,NULL,NULL),(447,'CONGELADOS','pitchula@gmail.com',NULL,NULL,NULL,NULL,NULL),(448,'FLV','pitchula@gmail.com',NULL,NULL,NULL,NULL,NULL),(449,'ROUPAS_','pitchula@gmail.com',NULL,NULL,NULL,NULL,NULL),(450,'BAZAR','pitchula@gmail.com',NULL,NULL,NULL,NULL,NULL),(451,'BAZAR','pitchula@gmail.com',NULL,NULL,NULL,NULL,NULL),(452,'BAZAR','pitchula@gmail.com',NULL,NULL,NULL,NULL,NULL),(453,'BAZAR','pitchula@gmail.com',NULL,NULL,NULL,NULL,NULL),(454,'BAZAR','pitchula@gmail.com',NULL,NULL,NULL,NULL,NULL),(455,'BAZAR','pitchula@gmail.com',NULL,NULL,NULL,NULL,NULL),(456,'BAZAR','pitchula@gmail.com',NULL,NULL,NULL,NULL,NULL),(457,'CONGELADOS','pitchula@gmail.com',NULL,NULL,NULL,NULL,NULL),(458,'FLV','pitchula@gmail.com',NULL,NULL,NULL,NULL,NULL),(459,'ROUPAS_','pitchula@gmail.com',NULL,NULL,NULL,NULL,NULL),(460,'BAZAR','pitchula@gmail.com',NULL,NULL,NULL,NULL,NULL),(461,'BAZAR','pitchula@gmail.com',NULL,NULL,NULL,NULL,NULL),(462,'BAZAR','pitchula@gmail.com',NULL,NULL,NULL,NULL,NULL),(463,'BAZAR','pitchula@gmail.com',NULL,NULL,NULL,NULL,NULL),(464,'BAZAR','pitchula@gmail.com',NULL,NULL,NULL,NULL,NULL),(465,'BAZAR','pitchula@gmail.com',NULL,NULL,NULL,NULL,NULL),(466,'BAZAR','pitchula@gmail.com',NULL,NULL,NULL,NULL,NULL),(467,'CONGELADOS','congelados@gmail.com',NULL,NULL,NULL,NULL,NULL),(468,'FLV','eitapreula@gmail.com',NULL,NULL,NULL,NULL,NULL),(469,'ROUPAS_','roupa@gmail.com',NULL,NULL,NULL,NULL,NULL),(470,'BAZAR','bazar@gmail.com',NULL,NULL,NULL,NULL,NULL),(471,'AÇOUGUE','carnes@gmail.com',NULL,NULL,NULL,NULL,NULL),(472,'HORTIFRUTI','salada@gmail.com',NULL,NULL,NULL,NULL,NULL),(473,'JARDIM','flores@gmail.com',NULL,NULL,NULL,NULL,NULL),(474,'MOVEIS','movel@gmail.com',NULL,NULL,NULL,NULL,NULL),(475,'CASA','casa@gmail.com',NULL,NULL,NULL,NULL,NULL),(476,'MECANICO','mecanca@gmail.com',NULL,NULL,NULL,NULL,NULL),(477,'CONGELADOS','congelados@gmail.com',NULL,NULL,NULL,NULL,NULL),(478,'FLV','eitapreula@gmail.com',NULL,NULL,NULL,NULL,NULL),(479,'ROUPAS_','roupa@gmail.com',NULL,NULL,NULL,NULL,NULL),(480,'BAZAR','bazar@gmail.com',NULL,NULL,NULL,NULL,NULL),(481,'AÇOUGUE','carnes@gmail.com',NULL,NULL,NULL,NULL,NULL),(482,'HORTIFRUTI','salada@gmail.com',NULL,NULL,NULL,NULL,NULL),(483,'JARDIM','flores@gmail.com',NULL,NULL,NULL,NULL,NULL),(484,'MOVEIS','movel@gmail.com',NULL,NULL,NULL,NULL,NULL),(485,'CASA','casa@gmail.com',NULL,NULL,NULL,NULL,NULL),(486,'MECANICO','mecanca@gmail.com',NULL,NULL,NULL,NULL,NULL),(487,'Solange','congelados@gmail.com',NULL,NULL,NULL,NULL,NULL),(488,'Baltazar','eitapreula@gmail.com',NULL,NULL,NULL,NULL,NULL),(489,'Etiópio','roupa@gmail.com',NULL,NULL,NULL,NULL,NULL),(490,'Macetilde','bazar@gmail.com',NULL,NULL,NULL,NULL,NULL),(491,'Dromias','carnes@gmail.com',NULL,NULL,NULL,NULL,NULL),(492,'Caderuncia','salada@gmail.com',NULL,NULL,NULL,NULL,NULL),(493,'Hermogenes','flores@gmail.com',NULL,NULL,NULL,NULL,NULL),(494,'Flavionilde','movel@gmail.com',NULL,NULL,NULL,NULL,NULL),(495,'Sumara','casa@gmail.com',NULL,NULL,NULL,NULL,NULL),(496,'Quetchup da Silva','mecanca@gmail.com',NULL,NULL,NULL,NULL,NULL),(497,'Solange','congelados@gmail.com',NULL,NULL,NULL,NULL,NULL),(498,'Baltazar','eitapreula@gmail.com',NULL,NULL,NULL,NULL,NULL),(499,'Etiópio','roupa@gmail.com',NULL,NULL,NULL,NULL,NULL),(500,'Macetilde','bazar@gmail.com',NULL,NULL,NULL,NULL,NULL),(501,'Dromias','carnes@gmail.com',NULL,NULL,NULL,NULL,NULL),(502,'Caderuncia','salada@gmail.com',NULL,NULL,NULL,NULL,NULL),(503,'Hermogenes','flores@gmail.com',NULL,NULL,NULL,NULL,NULL),(504,'Flavionilde','movel@gmail.com',NULL,NULL,NULL,NULL,NULL),(505,'Sumara','casa@gmail.com',NULL,NULL,NULL,NULL,NULL),(506,'Quetchup da Silva','mecanca@gmail.com',NULL,NULL,NULL,NULL,NULL),(507,'Solange','congelados@gmail.com',NULL,NULL,NULL,NULL,NULL),(508,'Baltazar','eitapreula@gmail.com',NULL,NULL,NULL,NULL,NULL),(509,'Etiópio','roupa@gmail.com',NULL,NULL,NULL,NULL,NULL),(510,'Macetilde','bazar@gmail.com',NULL,NULL,NULL,NULL,NULL),(511,'Dromias','carnes@gmail.com',NULL,NULL,NULL,NULL,NULL),(512,'Caderuncia','salada@gmail.com',NULL,NULL,NULL,NULL,NULL),(513,'Hermogenes','flores@gmail.com',NULL,NULL,NULL,NULL,NULL),(514,'Flavionilde','movel@gmail.com',NULL,NULL,NULL,NULL,NULL),(515,'Sumara','casa@gmail.com',NULL,NULL,NULL,NULL,NULL),(516,'Quetchup da Silva','mecanca@gmail.com',NULL,NULL,NULL,NULL,NULL),(517,'Solange','congelados@gmail.com','33222251','Congelados','Loja da Mairilze','22','1235'),(518,'Baltazar','eitapreula@gmail.com','33223451','FLV','Loja da Mairilze','21','14435'),(519,'Etiópio','roupa@gmail.com','332234451','Roupas','Balaio do Pedrão','31','142215'),(520,'Macetilde','bazar@gmail.com','3323344451','Bazar','Bazar do Biruleibe','661','56756'),(521,'Dromias','carnes@gmail.com','33223451','Carnes','Açougue Sanguera','34','546547'),(522,'Caderuncia','salada@gmail.com','3322355551','Hortifruti','Salada do Mião','3434','2352335'),(523,'João Pedroncio','mecanica@gmail','332535255','Mecânica','Borracharia Pedroncio','2234','233344'),(524,'Jrandir','limpeza@gmail.com','333535255','Limpeza','Orbenki Limpeza','6535','344455'),(525,'Pedro','pedraolixeiro@gmail.com','99223323','Reciclaveis','Ferragens Prega Fogo','32332','1144');
/*!40000 ALTER TABLE `usuario` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-07-13 11:17:03
