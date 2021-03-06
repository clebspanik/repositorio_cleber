-- MySQL Script generated by MySQL Workbench
-- Thu Jul 21 10:33:32 2022
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema db_agregacao
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `db_agregacao` ;

-- -----------------------------------------------------
-- Schema db_agregacao
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `db_agregacao` DEFAULT CHARACTER SET utf8 ;
USE `db_agregacao` ;

-- -----------------------------------------------------
-- Table `db_agregacao`.`classe`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `db_agregacao`.`classe` ;

CREATE TABLE IF NOT EXISTS `db_agregacao`.`classe` (
  `cod_clas` INT NOT NULL,
  `nome_clas` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`cod_clas`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `db_agregacao`.`produto`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `db_agregacao`.`produto` ;

CREATE TABLE IF NOT EXISTS `db_agregacao`.`produto` (
  `cod_prod` INT NOT NULL,
  `tip_prod` VARCHAR(45) NOT NULL,
  `nome_prod` VARCHAR(45) NOT NULL,
  `qtn_prod` VARCHAR(45) NOT NULL,
  `val_prod` VARCHAR(45) NOT NULL,
  `classe_cod_clas` INT NOT NULL,
  PRIMARY KEY (`cod_prod`),
  INDEX `fk_produto_classe_idx` (`classe_cod_clas` ASC) VISIBLE,
  CONSTRAINT `fk_produto_classe`
    FOREIGN KEY (`classe_cod_clas`)
    REFERENCES `db_agregacao`.`classe` (`cod_clas`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;

USE db_agregacao


