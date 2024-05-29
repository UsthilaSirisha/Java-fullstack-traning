CREATE DATABASE library;
use library;

CREATE TABLE `author` (
  `author_id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(100) NOT NULL,
  `biography` text,
  PRIMARY KEY (`author_id`),
  UNIQUE KEY `name` (`name`)
);

CREATE TABLE `book` (
  `book_id` int NOT NULL AUTO_INCREMENT,
  `title` varchar(100) NOT NULL,
  `publication_date` date NOT NULL,
  `publisher_id` int DEFAULT NULL,
  `author_id` int DEFAULT NULL,
  `num_copies` int NOT NULL,
  PRIMARY KEY (`book_id`),
  UNIQUE KEY `title_2` (`title`),
  UNIQUE KEY `title` (`title`,`author_id`),
  KEY `publisher_id` (`publisher_id`),
  KEY `author_id` (`author_id`),
  CONSTRAINT `book_ibfk_1` FOREIGN KEY (`publisher_id`) REFERENCES `publisher` (`publisher_id`),
  CONSTRAINT `book_ibfk_2` FOREIGN KEY (`author_id`) REFERENCES `author` (`author_id`),
  CONSTRAINT `book_chk_1` CHECK ((`num_copies` >= 0))
);

CREATE TABLE `borrower` (
  `borrower_id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(100) NOT NULL,
  `address` varchar(255) NOT NULL,
  `phone` varchar(15) NOT NULL,
  PRIMARY KEY (`borrower_id`),
  UNIQUE KEY `name` (`name`)
);

CREATE TABLE `library_branch` (
  `branch_id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(100) NOT NULL,
  `address` varchar(255) NOT NULL,
  PRIMARY KEY (`branch_id`),
  UNIQUE KEY `name` (`name`)
);

CREATE TABLE `publisher` (
  `publisher_id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(100) NOT NULL,
  `address` varchar(255) NOT NULL,
  `phone` varchar(15) NOT NULL,
  PRIMARY KEY (`publisher_id`),
  UNIQUE KEY `name` (`name`)
);

ALTER TABLE book ADD COLUMN available_copies INT NOT NULL DEFAULT 1;

DROP TABLE IF EXISTS redundant_table;