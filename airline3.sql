/*
Navicat MySQL Data Transfer

Source Server         : JAVA
Source Server Version : 50540
Source Host           : localhost:3306
Source Database       : airline3

Target Server Type    : MYSQL
Target Server Version : 50540
File Encoding         : 65001

Date: 2016-12-25 14:19:13
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for booking_info
-- ----------------------------
DROP TABLE IF EXISTS `booking_info`;
CREATE TABLE `booking_info` (
  `Flight_Id` varchar(255) DEFAULT NULL,
  `Departure_Time` varchar(255) DEFAULT NULL,
  `Arrival_Time` varchar(255) DEFAULT NULL,
  `Origin` varchar(255) DEFAULT NULL,
  `Destination` varchar(255) DEFAULT NULL,
  `Customer_Id` varchar(255) DEFAULT NULL,
  `Customer_Fname` varchar(255) DEFAULT NULL,
  `Customer_Sname` varchar(255) DEFAULT NULL,
  `Customer_Photo` varchar(255) DEFAULT NULL,
  `Customer_ContactNo` varchar(255) DEFAULT NULL,
  `Booking_Type` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of booking_info
-- ----------------------------

-- ----------------------------
-- Table structure for user_info
-- ----------------------------
DROP TABLE IF EXISTS `user_info`;
CREATE TABLE `user_info` (
  `username` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user_info
-- ----------------------------
