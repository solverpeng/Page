/*
SQLyog Ultimate v11.25 (64 bit)
MySQL - 5.6.14-log : Database - base_page
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`base_page` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `base_page`;

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `id` varchar(32) NOT NULL,
  `user_name` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `user` */

insert  into `user`(`id`,`user_name`) values ('335261aeb0944593914c192aa697989b','tom'),('356c5042ce904862a09766503c309761','lily'),('3defe1d1d0e5492c8d369a126ee1a5c8','jams'),('8bd8b2ac69d442bab9144620f7494164','tom'),('c6a873b211be43eb9a59d9aa1af2f436','lucy'),('ce8b588d4d6f427893e8a85582cfc1bb','kobe'),('d72a48cc6bbd417e8baf367fc92bb0b7','jim'),('fa7805b701e54abebc3a3003a800de07','jack');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
