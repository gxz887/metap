/*
Navicat MySQL Data Transfer

Source Server         : medicine
Source Server Version : 50613
Source Host           : localhost:3306
Source Database       : metap

Target Server Type    : MYSQL
Target Server Version : 50613
File Encoding         : 65001

Date: 2014-09-14 20:40:44
*/

SET FOREIGN_KEY_CHECKS=0;
-- ----------------------------
-- Table structure for `category`
-- ----------------------------
DROP TABLE IF EXISTS `category`;
CREATE TABLE `category` (
  `ID` int(10) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,
  `name_en` varchar(50) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of category
-- ----------------------------

-- ----------------------------
-- Table structure for `menu`
-- ----------------------------
DROP TABLE IF EXISTS `menu`;
CREATE TABLE `menu` (
  `ID` int(10) NOT NULL AUTO_INCREMENT,
  `name` varchar(800) NOT NULL,
  `name_en` varchar(800) NOT NULL,
  `url` varchar(200) NOT NULL,
  `pid` varchar(200) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of menu
-- ----------------------------

-- ----------------------------
-- Table structure for `news`
-- ----------------------------
DROP TABLE IF EXISTS `news`;
CREATE TABLE `news` (
  `ID` int(10) NOT NULL AUTO_INCREMENT,
  `title_en` varchar(800) DEFAULT NULL,
  `title` varchar(800) NOT NULL,
  `postdate` varchar(50) DEFAULT NULL,
  `smallImg` varchar(200) DEFAULT NULL,
  `bigImg` varchar(200) DEFAULT NULL,
  `content_en` varchar(200) DEFAULT NULL,
  `content` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of news
-- ----------------------------
INSERT INTO `news` VALUES ('1', null, 'dd', '2014-09-20', '', '', null, 'aa');
INSERT INTO `news` VALUES ('2', 'title', 'aaaa', '', '', '', 'aaaa', null);
INSERT INTO `news` VALUES ('11', 'aa', 'test', '', '/resource/uploadimg//test.jpg', '/resource/uploadimg//', 'dfsd', null);
INSERT INTO `news` VALUES ('13', '', '', '', '/resource/uploadimg//aa.jpg', '/resource/uploadimg//', '', null);

-- ----------------------------
-- Table structure for `press`
-- ----------------------------
DROP TABLE IF EXISTS `press`;
CREATE TABLE `press` (
  `ID` int(10) NOT NULL AUTO_INCREMENT,
  `bookname` varchar(800) NOT NULL,
  `title` varchar(200) NOT NULL,
  `author` varchar(200) NOT NULL,
  `press` varchar(200) NOT NULL,
  `presstime` varchar(200) NOT NULL,
  `title_en` varchar(200) NOT NULL,
  `author_en` varchar(200) NOT NULL,
  `press_en` varchar(200) NOT NULL,
  `fileurl` varchar(800) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of press
-- ----------------------------

-- ----------------------------
-- Table structure for `project`
-- ----------------------------
DROP TABLE IF EXISTS `project`;
CREATE TABLE `project` (
  `ID` int(10) NOT NULL AUTO_INCREMENT,
  `title` varchar(800) DEFAULT NULL,
  `title_en` varchar(800) DEFAULT NULL,
  `location` varchar(300) DEFAULT NULL,
  `pdate` varchar(300) DEFAULT NULL,
  `client` varchar(300) DEFAULT NULL,
  `program` varchar(300) DEFAULT NULL,
  `area` varchar(300) DEFAULT NULL,
  `budget` varchar(300) DEFAULT NULL,
  `status` varchar(300) DEFAULT NULL,
  `projectteam` varchar(300) DEFAULT NULL,
  `collaborator` varchar(300) DEFAULT NULL,
  `location_en` varchar(300) DEFAULT NULL,
  `client_en` varchar(300) DEFAULT NULL,
  `program_en` varchar(300) DEFAULT NULL,
  `area_en` varchar(300) DEFAULT NULL,
  `budget_en` varchar(300) DEFAULT NULL,
  `status_en` varchar(300) DEFAULT NULL,
  `projectteam_en` varchar(300) DEFAULT NULL,
  `collaborator_en` varchar(300) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of project
-- ----------------------------

-- ----------------------------
-- Table structure for `projectimg`
-- ----------------------------
DROP TABLE IF EXISTS `projectimg`;
CREATE TABLE `projectimg` (
  `ID` int(10) NOT NULL AUTO_INCREMENT,
  `password` varchar(800) NOT NULL,
  `projectid` varchar(800) NOT NULL,
  `newsid` varchar(800) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of projectimg
-- ----------------------------

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `ID` int(10) NOT NULL AUTO_INCREMENT,
  `name` varchar(800) NOT NULL,
  `password` varchar(200) NOT NULL,
  `role` varchar(200) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'aa', 'dd', 'aaa');
INSERT INTO `user` VALUES ('3', 'll', '', '');
