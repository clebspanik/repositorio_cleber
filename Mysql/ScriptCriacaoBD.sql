-- MySQL Script generated by MySQL Workbench
-- Tue Jul 19 10:30:44 2022
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `mydb` ;

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `mydb` DEFAULT CHARACTER SET utf8 ;
USE `mydb` ;

-- -----------------------------------------------------
-- Table `mydb`.`aluno`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`aluno` ;

CREATE TABLE IF NOT EXISTS `mydb`.`aluno` (
  `id` INT NULL,
  `nome` VARCHAR(45) NULL,
  `celular` VARCHAR(45) NULL,
  `email` VARCHAR(45) NULL,
  `github_usuario` VARCHAR(45) NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`prova`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`prova` ;

CREATE TABLE IF NOT EXISTS `mydb`.`prova` (
  `id` INT NOT NULL,
  `disciplina` VARCHAR(45) NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`pergunta`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`pergunta` ;

CREATE TABLE IF NOT EXISTS `mydb`.`pergunta` (
  `id` INT NOT NULL,
  `pergunta` VARCHAR(45) NULL,
  `prova_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_pergunta_prova1_idx` (`prova_id` ASC) VISIBLE,
  CONSTRAINT `fk_pergunta_prova1`
    FOREIGN KEY (`prova_id`)
    REFERENCES `mydb`.`prova` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`resposta`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`resposta` ;

CREATE TABLE IF NOT EXISTS `mydb`.`resposta` (
  `id` INT NOT NULL,
  `resposta` VARCHAR(45) NULL,
  `pergunta_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_resposta_pergunta1_idx` (`pergunta_id` ASC) VISIBLE,
  CONSTRAINT `fk_resposta_pergunta1`
    FOREIGN KEY (`pergunta_id`)
    REFERENCES `mydb`.`pergunta` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`aluno_prova`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`aluno_prova` ;

CREATE TABLE IF NOT EXISTS `mydb`.`aluno_prova` (
  `aluno_id` INT NOT NULL,
  `prova_id` INT NOT NULL,
  PRIMARY KEY (`aluno_id`, `prova_id`),
  INDEX `fk_aluno_prova_prova1_idx` (`prova_id` ASC) INVISIBLE,
  INDEX `fk_aluno_prova_prova1` () VISIBLE,
  CONSTRAINT `fk_aluno_prova_aluno`
    FOREIGN KEY (`aluno_id` , `prova_id`)
    REFERENCES `mydb`.`aluno` (`id` , `id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_aluno_prova_prova1`
    FOREIGN KEY (`prova_id`)
    REFERENCES `mydb`.`prova` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
