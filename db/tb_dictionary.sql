/*
Navicat MySQL Data Transfer

Source Server         : pk
Source Server Version : 50173
Source Host           : 127.0.0.1:3306
Source Database       : pk

Target Server Type    : MYSQL
Target Server Version : 50173
File Encoding         : 65001

Date: 2015-05-29 12:31:28
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `tb_dictionary`
-- ----------------------------
DROP TABLE IF EXISTS `tb_dictionary`;
CREATE TABLE `tb_dictionary` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `english` varchar(255) DEFAULT NULL,
  `chinese` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_dictionary
-- ----------------------------
INSERT INTO `tb_dictionary` VALUES ('1', 'asdasfasdfs', 'asdasfa');
INSERT INTO `tb_dictionary` VALUES ('2', 'dsa', 'asd');
INSERT INTO `tb_dictionary` VALUES ('3', 'qwe', 'qwe');
INSERT INTO `tb_dictionary` VALUES ('4', 'www', 'qqq');
INSERT INTO `tb_dictionary` VALUES ('5', '??', 'apple');
