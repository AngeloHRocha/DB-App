-- MySQL Script generated by MySQL Workbench
-- Tue Nov 19 09:53:28 2024
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema db_socmed
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema db_socmed
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `db_socmed` DEFAULT CHARACTER SET utf8 ;
USE `db_socmed` ;

-- -----------------------------------------------------
-- Table `db_socmed`.`engagement_types`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_socmed`.`engagement_types` (
  `engagement_type_id` INT NOT NULL,
  `type_name` VARCHAR(45) NOT NULL,
  `contains_text` TINYINT NOT NULL,
  PRIMARY KEY (`engagement_type_id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `db_socmed`.`platforms`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_socmed`.`platforms` (
  `platform_id` DECIMAL(4,0) NOT NULL,
  `platform_name` VARCHAR(45) NOT NULL,
  `platform_version` VARCHAR(20) NOT NULL,
  `country_of_origin` VARCHAR(45) NULL,
  `releasedate` DATE NULL,
  PRIMARY KEY (`platform_id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `db_socmed`.`users`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_socmed`.`users` (
  `user_id` DECIMAL(6,0) NOT NULL,
  `platform_id` DECIMAL(4,0) NOT NULL,
  `username` VARCHAR(45) NOT NULL,
  `first_name` VARCHAR(45) NOT NULL,
  `last_name` VARCHAR(45) NOT NULL,
  `email` VARCHAR(45) NOT NULL,
  `join_date` DATE NULL,
  `is_private` TINYINT NOT NULL,
  PRIMARY KEY (`user_id`, `platform_id`),
  INDEX `platform_id_idx` (`platform_id` ASC) VISIBLE,
  CONSTRAINT `platform_id`
    FOREIGN KEY (`platform_id`)
    REFERENCES `db_socmed`.`platforms` (`platform_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `db_socmed`.`posts`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_socmed`.`posts` (
  `post_id` DECIMAL(9,0) NOT NULL,
  `user_id` DECIMAL(6,0) NOT NULL,
  `platform_id` DECIMAL(4,0) NOT NULL,
  `like_count` INT NOT NULL,
  `comment_count` INT NOT NULL,
  `share_count` INT NOT NULL,
  `post_date` DATETIME NOT NULL,
  `visibility` VARCHAR(20) NOT NULL,
  PRIMARY KEY (`post_id`),
  INDEX `user_id_idx` (`user_id` ASC) VISIBLE,
  INDEX `platform_id_idx` (`platform_id` ASC) VISIBLE,
  CONSTRAINT `user_id`
    FOREIGN KEY (`user_id`)
    REFERENCES `db_socmed`.`users` (`user_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `platform_id`
    FOREIGN KEY (`platform_id`)
    REFERENCES `db_socmed`.`users` (`platform_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `db_socmed`.`engagements`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_socmed`.`engagements` (
  `engagement_id` INT(10) NOT NULL,
  `post_id` DECIMAL(9,0) NOT NULL,
  `user_id` DECIMAL(6,0) NOT NULL,
  `platform_id` DECIMAL(4,0) NOT NULL,
  `engagement_type_id` INT(10) NOT NULL,
  `engagement_content` VARCHAR(50) NULL,
  `engagement_date` DATETIME NOT NULL,
  PRIMARY KEY (`engagement_id`),
  INDEX `post_id_idx` (`post_id` ASC) VISIBLE,
  INDEX `user_id_idx` (`user_id` ASC) VISIBLE,
  INDEX `engagement_type_id_idx` (`engagement_type_id` ASC) VISIBLE,
  INDEX `platform_id_idx` (`platform_id` ASC) VISIBLE,
  CONSTRAINT `post_id`
    FOREIGN KEY (`post_id`)
    REFERENCES `db_socmed`.`posts` (`post_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `user_id`
    FOREIGN KEY (`user_id`)
    REFERENCES `db_socmed`.`users` (`user_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `engagement_type_id`
    FOREIGN KEY (`engagement_type_id`)
    REFERENCES `db_socmed`.`engagement_types` (`engagement_type_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `platform_id`
    FOREIGN KEY (`platform_id`)
    REFERENCES `db_socmed`.`users` (`platform_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `db_socmed`.`content_types`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_socmed`.`content_types` (
  `type_id` DECIMAL(4,0) NOT NULL,
  `content_type` VARCHAR(200) NOT NULL,
  `max_filesize_gb` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`type_id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `db_socmed`.`post_contents`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_socmed`.`post_contents` (
  `content_id` DECIMAL(8,0) NOT NULL,
  `post_id` DECIMAL(9,0) NOT NULL,
  `type_id` DECIMAL(2,0) NOT NULL,
  `title` VARCHAR(100) NULL,
  `content` VARCHAR(200) NOT NULL,
  `file_size` DECIMAL(2,2) NOT NULL,
  PRIMARY KEY (`content_id`),
  INDEX `type_id_idx` (`type_id` ASC) VISIBLE,
  INDEX `post_id_idx` (`post_id` ASC) VISIBLE,
  CONSTRAINT `post_id`
    FOREIGN KEY (`post_id`)
    REFERENCES `db_socmed`.`posts` (`post_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `type_id`
    FOREIGN KEY (`type_id`)
    REFERENCES `db_socmed`.`content_types` (`type_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
