CREATE DATABASE  IF NOT EXISTS `mydb` /*!40100 DEFAULT CHARACTER SET utf8mb3 */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `mydb`;
-- MySQL dump 10.13  Distrib 8.0.29, for Win64 (x86_64)
--
-- Host: localhost    Database: mydb
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
-- Table structure for table `aluno`
--

DROP TABLE IF EXISTS `aluno`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `aluno` (
  `id` int NOT NULL,
  `nome` varchar(45) DEFAULT NULL,
  `celular` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `github_usuario` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `aluno`
--

LOCK TABLES `aluno` WRITE;
/*!40000 ALTER TABLE `aluno` DISABLE KEYS */;
INSERT INTO `aluno` VALUES (1,'Cleber','48913323','Cleberpanik@gmail.com','Clebspanik'),(2,'Matheus M.','49984228799','Matheusmoreiradossantos45@gmail.com','MatheusMoreiraSantos');
/*!40000 ALTER TABLE `aluno` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `aluno_prova`
--

DROP TABLE IF EXISTS `aluno_prova`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `aluno_prova` (
  `aluno_id` int NOT NULL,
  `prova_id` int NOT NULL,
  PRIMARY KEY (`aluno_id`,`prova_id`),
  KEY `fk_aluno_prova_prova1_idx` (`prova_id`) /*!80000 INVISIBLE */,
  CONSTRAINT `fk_aluno` FOREIGN KEY (`aluno_id`) REFERENCES `aluno` (`id`),
  CONSTRAINT `fk_prova` FOREIGN KEY (`prova_id`) REFERENCES `prova` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `aluno_prova`
--

LOCK TABLES `aluno_prova` WRITE;
/*!40000 ALTER TABLE `aluno_prova` DISABLE KEYS */;
INSERT INTO `aluno_prova` VALUES (1,784),(2,784);
/*!40000 ALTER TABLE `aluno_prova` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pergunta`
--

DROP TABLE IF EXISTS `pergunta`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `pergunta` (
  `id` int NOT NULL,
  `pergunta` varchar(85) DEFAULT NULL,
  `prova_id` int NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_pergunta_prova1_idx` (`prova_id`),
  CONSTRAINT `fk_pergunta_prova1` FOREIGN KEY (`prova_id`) REFERENCES `prova` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pergunta`
--

LOCK TABLES `pergunta` WRITE;
/*!40000 ALTER TABLE `pergunta` DISABLE KEYS */;
INSERT INTO `pergunta` VALUES (2,'O que é um banco de dados?',784),(3,'Explique o que é um SGBD e cite exemplos',784),(4,'O que são DML, DCL, DDL e DQL?',784),(5,'O que é uma Entidade?',784),(6,'Descreva o que é uma chave primária',784),(7,'Descreva o que é chave estrangeira',784),(8,'Cite a diferença entre chave primaria e chave estrangeira',784),(9,'Um campo do tipo char armazena quais valores? E do tipo int, varchar, date, datetime?',784),(10,'Explique a(s) diferenças entre os tipos Time, Year, DateTime e Date?',784),(11,'Explique p/ que serve a instrução DELETE',784);
/*!40000 ALTER TABLE `pergunta` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `prova`
--

DROP TABLE IF EXISTS `prova`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `prova` (
  `id` int NOT NULL,
  `disciplina` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `prova`
--

LOCK TABLES `prova` WRITE;
/*!40000 ALTER TABLE `prova` DISABLE KEYS */;
INSERT INTO `prova` VALUES (784,'Banco de Dados Relacionais e SQL');
/*!40000 ALTER TABLE `prova` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `resposta`
--

DROP TABLE IF EXISTS `resposta`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `resposta` (
  `id` int NOT NULL,
  `resposta` varchar(1500) DEFAULT NULL,
  `pergunta_id` int NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_resposta_pergunta1_idx` (`pergunta_id`),
  CONSTRAINT `fk_resposta_pergunta1` FOREIGN KEY (`pergunta_id`) REFERENCES `pergunta` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `resposta`
--

LOCK TABLES `resposta` WRITE;
/*!40000 ALTER TABLE `resposta` DISABLE KEYS */;
INSERT INTO `resposta` VALUES (101,'É um conjunto de informações (dados), orgamizadas, estruturadas e sistematizadas, as quais são armazenadas eletronigamente em um sistema computacional',2),(102,'O sistema gernciador de bancos de dados (SGBD), corresponde a um programa/software que atua como uma interface entre o BD e os usuários ou programas que utilizam suas informações. \nEle possibilita o gerenciamento e a manutenção das informações e estruturas contidas no BD (criação de bancos e tabelas, definição, alteração e exclusão de campos, registros e tabelas, dentre outras operações) bem como a administração e a avaliação do desempenhio do mesmo.\nComo exemplos temos o MySQL, Oracle Database, Microsoft Acess, dBASE, dentre outros.',3),(103,'O sistema gernciador de bancos de dados (SGBD), corresponde a um programa/software que atua como uma interface entre o BD e os usuários ou programas que utilizam suas informações. \nEle possibilita o gerenciamento e a manutenção das informações e estruturas contidas no BD (criação de bancos e tabelas, definição, alteração e exclusão de campos, registros e tabelas, dentre outras operações) bem como a administração e a avaliação do desempenhio do mesmo.\nComo exemplos temos o MySQL, Oracle Database, Microsoft Acess, dBASE, dentre outros.',3),(104,'As entidades correspondem à representação de objetos \"do mundo real\", da realidade a ser modelada e com a qual estamos trabalhando, sobre os quais deseja-se conhecer as informações e relacionamentos existentes. \nTambém podem ser entendidas como as tabelas que compõem o Banco de Dados.',5),(105,'A chave primária corresponde a coluna da tabela que é responsável por identificar os registros. Ela pode ser composta por um único campo (chave simples) ou pela combinação de dois ou mais campos (chave composta).',6),(106,'É o campo utilizado para relacionar os registros entre tabelas. Identifica em uma tabela uma coluna que possa armazenar somente valores de chave primária de uma outra tabela. Juntamente com a chave primária, a chave estrangeira estabelece relacionamentos entre tabelas.',7),(107,'A chave primária corresponde a um ou mais campos utilizados para identificar os registros de uma tabela, enquanto a chave estrangeira é utilizada para referenciar a chave primária de outra tabela e, assim, estabelecer uma relação entre duas ou mais tabelas.',8),(108,'O tipo char armazena valores/dados textuais de tamanho fixo, de 0 a 255 caracteres; O tipo int valores/dados numéricos, de 21474836448 a 2147483647; O tipo VARCHAR valores/dados textuais de tamanho variável, de 0 a 65535 caracteres; date informações referentes a data, no formato YYYY-MM-DD e o tipo datetime a combinação de data e hora no mesmo campo.',9),(109,'O tipo Time armazena valores/dados referentes a hora; O tipo Year ao ano; Datetime hora e data e o tipo Date apenas a data;',10),(110,'A instrução DELETE pode apagar todos os registros de uma tabela ou as informações contidas em campos específicos, por meio do uso da cláusula WHERE;',11);
/*!40000 ALTER TABLE `resposta` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'mydb'
--

--
-- Dumping routines for database 'mydb'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-07-19 11:27:36
