/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50611
Source Host           : localhost:3306
Source Database       : myproject

Target Server Type    : MYSQL
Target Server Version : 50611
File Encoding         : 65001

Date: 2018-11-14 17:54:38
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `sys_menu_ico`
-- ----------------------------
DROP TABLE IF EXISTS `sys_menu_ico`;
CREATE TABLE `sys_menu_ico` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=676 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_menu_ico
-- ----------------------------
INSERT INTO `sys_menu_ico` VALUES ('1', 'fa fa-glass');
INSERT INTO `sys_menu_ico` VALUES ('2', 'fa fa-music');
INSERT INTO `sys_menu_ico` VALUES ('3', 'fa fa-search');
INSERT INTO `sys_menu_ico` VALUES ('4', 'fa fa-envelope-o');
INSERT INTO `sys_menu_ico` VALUES ('5', 'fa fa-heart');
INSERT INTO `sys_menu_ico` VALUES ('6', 'fa fa-star');
INSERT INTO `sys_menu_ico` VALUES ('7', 'fa fa-star-o');
INSERT INTO `sys_menu_ico` VALUES ('8', 'fa fa-user');
INSERT INTO `sys_menu_ico` VALUES ('9', 'fa fa-film');
INSERT INTO `sys_menu_ico` VALUES ('10', 'fa fa-th-large');
INSERT INTO `sys_menu_ico` VALUES ('11', 'fa fa-th');
INSERT INTO `sys_menu_ico` VALUES ('12', 'fa fa-th-list');
INSERT INTO `sys_menu_ico` VALUES ('13', 'fa fa-check');
INSERT INTO `sys_menu_ico` VALUES ('14', 'fa fa-times');
INSERT INTO `sys_menu_ico` VALUES ('15', 'fa fa-search-plus');
INSERT INTO `sys_menu_ico` VALUES ('16', 'fa fa-search-minus');
INSERT INTO `sys_menu_ico` VALUES ('17', 'fa fa-power-off');
INSERT INTO `sys_menu_ico` VALUES ('18', 'fa fa-signal');
INSERT INTO `sys_menu_ico` VALUES ('19', 'fa fa-cog');
INSERT INTO `sys_menu_ico` VALUES ('20', 'fa fa-trash-o');
INSERT INTO `sys_menu_ico` VALUES ('21', 'fa fa-home');
INSERT INTO `sys_menu_ico` VALUES ('22', 'fa fa-file-o');
INSERT INTO `sys_menu_ico` VALUES ('23', 'fa fa-clock-o');
INSERT INTO `sys_menu_ico` VALUES ('24', 'fa fa-road');
INSERT INTO `sys_menu_ico` VALUES ('25', 'fa fa-download');
INSERT INTO `sys_menu_ico` VALUES ('26', 'fa fa-arrow-circle-o-down');
INSERT INTO `sys_menu_ico` VALUES ('27', 'fa fa-arrow-circle-o-up');
INSERT INTO `sys_menu_ico` VALUES ('28', 'fa fa-inbox');
INSERT INTO `sys_menu_ico` VALUES ('29', 'fa fa-play-circle-o');
INSERT INTO `sys_menu_ico` VALUES ('30', 'fa fa-repeat');
INSERT INTO `sys_menu_ico` VALUES ('31', 'fa fa-refresh');
INSERT INTO `sys_menu_ico` VALUES ('32', 'fa fa-list-alt');
INSERT INTO `sys_menu_ico` VALUES ('33', 'fa fa-lock');
INSERT INTO `sys_menu_ico` VALUES ('34', 'fa fa-flag');
INSERT INTO `sys_menu_ico` VALUES ('35', 'fa fa-headphones');
INSERT INTO `sys_menu_ico` VALUES ('36', 'fa fa-volume-off');
INSERT INTO `sys_menu_ico` VALUES ('37', 'fa fa-volume-down');
INSERT INTO `sys_menu_ico` VALUES ('38', 'fa fa-volume-up');
INSERT INTO `sys_menu_ico` VALUES ('39', 'fa fa-qrcode');
INSERT INTO `sys_menu_ico` VALUES ('40', 'fa fa-barcode');
INSERT INTO `sys_menu_ico` VALUES ('41', 'fa fa-tag');
INSERT INTO `sys_menu_ico` VALUES ('42', 'fa fa-tags');
INSERT INTO `sys_menu_ico` VALUES ('43', 'fa fa-book');
INSERT INTO `sys_menu_ico` VALUES ('44', 'fa fa-bookmark');
INSERT INTO `sys_menu_ico` VALUES ('45', 'fa fa-print');
INSERT INTO `sys_menu_ico` VALUES ('46', 'fa fa-camera');
INSERT INTO `sys_menu_ico` VALUES ('47', 'fa fa-font');
INSERT INTO `sys_menu_ico` VALUES ('48', 'fa fa-bold');
INSERT INTO `sys_menu_ico` VALUES ('49', 'fa fa-italic');
INSERT INTO `sys_menu_ico` VALUES ('50', 'fa fa-text-height');
INSERT INTO `sys_menu_ico` VALUES ('51', 'fa fa-text-width');
INSERT INTO `sys_menu_ico` VALUES ('52', 'fa fa-align-left');
INSERT INTO `sys_menu_ico` VALUES ('53', 'fa fa-align-center');
INSERT INTO `sys_menu_ico` VALUES ('54', 'fa fa-align-right');
INSERT INTO `sys_menu_ico` VALUES ('55', 'fa fa-align-justify');
INSERT INTO `sys_menu_ico` VALUES ('56', 'fa fa-list');
INSERT INTO `sys_menu_ico` VALUES ('57', 'fa fa-outdent');
INSERT INTO `sys_menu_ico` VALUES ('58', 'fa fa-indent');
INSERT INTO `sys_menu_ico` VALUES ('59', 'fa fa-video-camera');
INSERT INTO `sys_menu_ico` VALUES ('60', 'fa fa-picture-o');
INSERT INTO `sys_menu_ico` VALUES ('61', 'fa fa-pencil');
INSERT INTO `sys_menu_ico` VALUES ('62', 'fa fa-map-marker');
INSERT INTO `sys_menu_ico` VALUES ('63', 'fa fa-adjust');
INSERT INTO `sys_menu_ico` VALUES ('64', 'fa fa-tint');
INSERT INTO `sys_menu_ico` VALUES ('65', 'fa fa-pencil-square-o');
INSERT INTO `sys_menu_ico` VALUES ('66', 'fa fa-share-square-o');
INSERT INTO `sys_menu_ico` VALUES ('67', 'fa fa-check-square-o');
INSERT INTO `sys_menu_ico` VALUES ('68', 'fa fa-arrows');
INSERT INTO `sys_menu_ico` VALUES ('69', 'fa fa-step-backward');
INSERT INTO `sys_menu_ico` VALUES ('70', 'fa fa-fast-backward');
INSERT INTO `sys_menu_ico` VALUES ('71', 'fa fa-backward');
INSERT INTO `sys_menu_ico` VALUES ('72', 'fa fa-play');
INSERT INTO `sys_menu_ico` VALUES ('73', 'fa fa-pause');
INSERT INTO `sys_menu_ico` VALUES ('74', 'fa fa-stop');
INSERT INTO `sys_menu_ico` VALUES ('75', 'fa fa-forward');
INSERT INTO `sys_menu_ico` VALUES ('76', 'fa fa-fast-forward');
INSERT INTO `sys_menu_ico` VALUES ('77', 'fa fa-step-forward');
INSERT INTO `sys_menu_ico` VALUES ('78', 'fa fa-eject');
INSERT INTO `sys_menu_ico` VALUES ('79', 'fa fa-chevron-left');
INSERT INTO `sys_menu_ico` VALUES ('80', 'fa fa-chevron-right');
INSERT INTO `sys_menu_ico` VALUES ('81', 'fa fa-plus-circle');
INSERT INTO `sys_menu_ico` VALUES ('82', 'fa fa-minus-circle');
INSERT INTO `sys_menu_ico` VALUES ('83', 'fa fa-times-circle');
INSERT INTO `sys_menu_ico` VALUES ('84', 'fa fa-check-circle');
INSERT INTO `sys_menu_ico` VALUES ('85', 'fa fa-question-circle');
INSERT INTO `sys_menu_ico` VALUES ('86', 'fa fa-info-circle');
INSERT INTO `sys_menu_ico` VALUES ('87', 'fa fa-crosshairs');
INSERT INTO `sys_menu_ico` VALUES ('88', 'fa fa-times-circle-o');
INSERT INTO `sys_menu_ico` VALUES ('89', 'fa fa-check-circle-o');
INSERT INTO `sys_menu_ico` VALUES ('90', 'fa fa-ban');
INSERT INTO `sys_menu_ico` VALUES ('91', 'fa fa-arrow-left');
INSERT INTO `sys_menu_ico` VALUES ('92', 'fa fa-arrow-right');
INSERT INTO `sys_menu_ico` VALUES ('93', 'fa fa-arrow-up');
INSERT INTO `sys_menu_ico` VALUES ('94', 'fa fa-arrow-down');
INSERT INTO `sys_menu_ico` VALUES ('95', 'fa fa-share');
INSERT INTO `sys_menu_ico` VALUES ('96', 'fa fa-expand');
INSERT INTO `sys_menu_ico` VALUES ('97', 'fa fa-compress');
INSERT INTO `sys_menu_ico` VALUES ('98', 'fa fa-plus');
INSERT INTO `sys_menu_ico` VALUES ('99', 'fa fa-minus');
INSERT INTO `sys_menu_ico` VALUES ('100', 'fa fa-asterisk');
INSERT INTO `sys_menu_ico` VALUES ('101', 'fa fa-exclamation-circle');
INSERT INTO `sys_menu_ico` VALUES ('102', 'fa fa-gift');
INSERT INTO `sys_menu_ico` VALUES ('103', 'fa fa-leaf');
INSERT INTO `sys_menu_ico` VALUES ('104', 'fa fa-fire');
INSERT INTO `sys_menu_ico` VALUES ('105', 'fa fa-eye');
INSERT INTO `sys_menu_ico` VALUES ('106', 'fa fa-eye-slash');
INSERT INTO `sys_menu_ico` VALUES ('107', 'fa fa-exclamation-triangle');
INSERT INTO `sys_menu_ico` VALUES ('108', 'fa fa-plane');
INSERT INTO `sys_menu_ico` VALUES ('109', 'fa fa-calendar');
INSERT INTO `sys_menu_ico` VALUES ('110', 'fa fa-random');
INSERT INTO `sys_menu_ico` VALUES ('111', 'fa fa-comment');
INSERT INTO `sys_menu_ico` VALUES ('112', 'fa fa-magnet');
INSERT INTO `sys_menu_ico` VALUES ('113', 'fa fa-chevron-up');
INSERT INTO `sys_menu_ico` VALUES ('114', 'fa fa-chevron-down');
INSERT INTO `sys_menu_ico` VALUES ('115', 'fa fa-retweet');
INSERT INTO `sys_menu_ico` VALUES ('116', 'fa fa-shopping-cart');
INSERT INTO `sys_menu_ico` VALUES ('117', 'fa fa-folder');
INSERT INTO `sys_menu_ico` VALUES ('118', 'fa fa-folder-open');
INSERT INTO `sys_menu_ico` VALUES ('119', 'fa fa-arrows-v');
INSERT INTO `sys_menu_ico` VALUES ('120', 'fa fa-arrows-h');
INSERT INTO `sys_menu_ico` VALUES ('121', 'fa fa-bar-chart');
INSERT INTO `sys_menu_ico` VALUES ('122', 'fa fa-twitter-square');
INSERT INTO `sys_menu_ico` VALUES ('123', 'fa fa-facebook-square');
INSERT INTO `sys_menu_ico` VALUES ('124', 'fa fa-camera-retro');
INSERT INTO `sys_menu_ico` VALUES ('125', 'fa fa-key');
INSERT INTO `sys_menu_ico` VALUES ('126', 'fa fa-cogs');
INSERT INTO `sys_menu_ico` VALUES ('127', 'fa fa-comments');
INSERT INTO `sys_menu_ico` VALUES ('128', 'fa fa-thumbs-o-up');
INSERT INTO `sys_menu_ico` VALUES ('129', 'fa fa-thumbs-o-down');
INSERT INTO `sys_menu_ico` VALUES ('130', 'fa fa-star-half');
INSERT INTO `sys_menu_ico` VALUES ('131', 'fa fa-heart-o');
INSERT INTO `sys_menu_ico` VALUES ('132', 'fa fa-sign-out');
INSERT INTO `sys_menu_ico` VALUES ('133', 'fa fa-linkedin-square');
INSERT INTO `sys_menu_ico` VALUES ('134', 'fa fa-thumb-tack');
INSERT INTO `sys_menu_ico` VALUES ('135', 'fa fa-external-link');
INSERT INTO `sys_menu_ico` VALUES ('136', 'fa fa-sign-in');
INSERT INTO `sys_menu_ico` VALUES ('137', 'fa fa-trophy');
INSERT INTO `sys_menu_ico` VALUES ('138', 'fa fa-github-square');
INSERT INTO `sys_menu_ico` VALUES ('139', 'fa fa-upload');
INSERT INTO `sys_menu_ico` VALUES ('140', 'fa fa-lemon-o');
INSERT INTO `sys_menu_ico` VALUES ('141', 'fa fa-phone');
INSERT INTO `sys_menu_ico` VALUES ('142', 'fa fa-square-o');
INSERT INTO `sys_menu_ico` VALUES ('143', 'fa fa-bookmark-o');
INSERT INTO `sys_menu_ico` VALUES ('144', 'fa fa-phone-square');
INSERT INTO `sys_menu_ico` VALUES ('145', 'fa fa-twitter');
INSERT INTO `sys_menu_ico` VALUES ('146', 'fa fa-facebook');
INSERT INTO `sys_menu_ico` VALUES ('147', 'fa fa-github');
INSERT INTO `sys_menu_ico` VALUES ('148', 'fa fa-unlock');
INSERT INTO `sys_menu_ico` VALUES ('149', 'fa fa-credit-card');
INSERT INTO `sys_menu_ico` VALUES ('150', 'fa fa-rss');
INSERT INTO `sys_menu_ico` VALUES ('151', 'fa fa-hdd-o');
INSERT INTO `sys_menu_ico` VALUES ('152', 'fa fa-bullhorn');
INSERT INTO `sys_menu_ico` VALUES ('153', 'fa fa-bell');
INSERT INTO `sys_menu_ico` VALUES ('154', 'fa fa-certificate');
INSERT INTO `sys_menu_ico` VALUES ('155', 'fa fa-hand-o-right');
INSERT INTO `sys_menu_ico` VALUES ('156', 'fa fa-hand-o-left');
INSERT INTO `sys_menu_ico` VALUES ('157', 'fa fa-hand-o-up');
INSERT INTO `sys_menu_ico` VALUES ('158', 'fa fa-hand-o-down');
INSERT INTO `sys_menu_ico` VALUES ('159', 'fa fa-arrow-circle-left');
INSERT INTO `sys_menu_ico` VALUES ('160', 'fa fa-arrow-circle-right');
INSERT INTO `sys_menu_ico` VALUES ('161', 'fa fa-arrow-circle-up');
INSERT INTO `sys_menu_ico` VALUES ('162', 'fa fa-arrow-circle-down');
INSERT INTO `sys_menu_ico` VALUES ('163', 'fa fa-globe');
INSERT INTO `sys_menu_ico` VALUES ('164', 'fa fa-wrench');
INSERT INTO `sys_menu_ico` VALUES ('165', 'fa fa-tasks');
INSERT INTO `sys_menu_ico` VALUES ('166', 'fa fa-filter');
INSERT INTO `sys_menu_ico` VALUES ('167', 'fa fa-briefcase');
INSERT INTO `sys_menu_ico` VALUES ('168', 'fa fa-arrows-alt');
INSERT INTO `sys_menu_ico` VALUES ('169', 'fa fa-users');
INSERT INTO `sys_menu_ico` VALUES ('170', 'fa fa-link');
INSERT INTO `sys_menu_ico` VALUES ('171', 'fa fa-cloud');
INSERT INTO `sys_menu_ico` VALUES ('172', 'fa fa-flask');
INSERT INTO `sys_menu_ico` VALUES ('173', 'fa fa-scissors');
INSERT INTO `sys_menu_ico` VALUES ('174', 'fa fa-files-o');
INSERT INTO `sys_menu_ico` VALUES ('175', 'fa fa-paperclip');
INSERT INTO `sys_menu_ico` VALUES ('176', 'fa fa-floppy-o');
INSERT INTO `sys_menu_ico` VALUES ('177', 'fa fa-square');
INSERT INTO `sys_menu_ico` VALUES ('178', 'fa fa-bars');
INSERT INTO `sys_menu_ico` VALUES ('179', 'fa fa-list-ul');
INSERT INTO `sys_menu_ico` VALUES ('180', 'fa fa-list-ol');
INSERT INTO `sys_menu_ico` VALUES ('181', 'fa fa-strikethrough');
INSERT INTO `sys_menu_ico` VALUES ('182', 'fa fa-underline');
INSERT INTO `sys_menu_ico` VALUES ('183', 'fa fa-table');
INSERT INTO `sys_menu_ico` VALUES ('184', 'fa fa-magic');
INSERT INTO `sys_menu_ico` VALUES ('185', 'fa fa-truck');
INSERT INTO `sys_menu_ico` VALUES ('186', 'fa fa-pinterest');
INSERT INTO `sys_menu_ico` VALUES ('187', 'fa fa-pinterest-square');
INSERT INTO `sys_menu_ico` VALUES ('188', 'fa fa-google-plus-square');
INSERT INTO `sys_menu_ico` VALUES ('189', 'fa fa-google-plus');
INSERT INTO `sys_menu_ico` VALUES ('190', 'fa fa-money');
INSERT INTO `sys_menu_ico` VALUES ('191', 'fa fa-caret-down');
INSERT INTO `sys_menu_ico` VALUES ('192', 'fa fa-caret-up');
INSERT INTO `sys_menu_ico` VALUES ('193', 'fa fa-caret-left');
INSERT INTO `sys_menu_ico` VALUES ('194', 'fa fa-caret-right');
INSERT INTO `sys_menu_ico` VALUES ('195', 'fa fa-columns');
INSERT INTO `sys_menu_ico` VALUES ('196', 'fa fa-sort');
INSERT INTO `sys_menu_ico` VALUES ('197', 'fa fa-sort-desc');
INSERT INTO `sys_menu_ico` VALUES ('198', 'fa fa-sort-asc');
INSERT INTO `sys_menu_ico` VALUES ('199', 'fa fa-envelope');
INSERT INTO `sys_menu_ico` VALUES ('200', 'fa fa-linkedin');
INSERT INTO `sys_menu_ico` VALUES ('201', 'fa fa-undo');
INSERT INTO `sys_menu_ico` VALUES ('202', 'fa fa-gavel');
INSERT INTO `sys_menu_ico` VALUES ('203', 'fa fa-tachometer');
INSERT INTO `sys_menu_ico` VALUES ('204', 'fa fa-comment-o');
INSERT INTO `sys_menu_ico` VALUES ('205', 'fa fa-comments-o');
INSERT INTO `sys_menu_ico` VALUES ('206', 'fa fa-bolt');
INSERT INTO `sys_menu_ico` VALUES ('207', 'fa fa-sitemap');
INSERT INTO `sys_menu_ico` VALUES ('208', 'fa fa-umbrella');
INSERT INTO `sys_menu_ico` VALUES ('209', 'fa fa-clipboard');
INSERT INTO `sys_menu_ico` VALUES ('210', 'fa fa-lightbulb-o');
INSERT INTO `sys_menu_ico` VALUES ('211', 'fa fa-exchange');
INSERT INTO `sys_menu_ico` VALUES ('212', 'fa fa-cloud-download');
INSERT INTO `sys_menu_ico` VALUES ('213', 'fa fa-cloud-upload');
INSERT INTO `sys_menu_ico` VALUES ('214', 'fa fa-user-md');
INSERT INTO `sys_menu_ico` VALUES ('215', 'fa fa-stethoscope');
INSERT INTO `sys_menu_ico` VALUES ('216', 'fa fa-suitcase');
INSERT INTO `sys_menu_ico` VALUES ('217', 'fa fa-bell-o');
INSERT INTO `sys_menu_ico` VALUES ('218', 'fa fa-coffee');
INSERT INTO `sys_menu_ico` VALUES ('219', 'fa fa-cutlery');
INSERT INTO `sys_menu_ico` VALUES ('220', 'fa fa-file-text-o');
INSERT INTO `sys_menu_ico` VALUES ('221', 'fa fa-building-o');
INSERT INTO `sys_menu_ico` VALUES ('222', 'fa fa-hospital-o');
INSERT INTO `sys_menu_ico` VALUES ('223', 'fa fa-ambulance');
INSERT INTO `sys_menu_ico` VALUES ('224', 'fa fa-medkit');
INSERT INTO `sys_menu_ico` VALUES ('225', 'fa fa-fighter-jet');
INSERT INTO `sys_menu_ico` VALUES ('226', 'fa fa-beer');
INSERT INTO `sys_menu_ico` VALUES ('227', 'fa fa-h-square');
INSERT INTO `sys_menu_ico` VALUES ('228', 'fa fa-plus-square');
INSERT INTO `sys_menu_ico` VALUES ('229', 'fa fa-angle-double-left');
INSERT INTO `sys_menu_ico` VALUES ('230', 'fa fa-angle-double-right');
INSERT INTO `sys_menu_ico` VALUES ('231', 'fa fa-angle-double-up');
INSERT INTO `sys_menu_ico` VALUES ('232', 'fa fa-angle-double-down');
INSERT INTO `sys_menu_ico` VALUES ('233', 'fa fa-angle-left');
INSERT INTO `sys_menu_ico` VALUES ('234', 'fa fa-angle-right');
INSERT INTO `sys_menu_ico` VALUES ('235', 'fa fa-angle-up');
INSERT INTO `sys_menu_ico` VALUES ('236', 'fa fa-angle-down');
INSERT INTO `sys_menu_ico` VALUES ('237', 'fa fa-desktop');
INSERT INTO `sys_menu_ico` VALUES ('238', 'fa fa-laptop');
INSERT INTO `sys_menu_ico` VALUES ('239', 'fa fa-tablet');
INSERT INTO `sys_menu_ico` VALUES ('240', 'fa fa-mobile');
INSERT INTO `sys_menu_ico` VALUES ('241', 'fa fa-circle-o');
INSERT INTO `sys_menu_ico` VALUES ('242', 'fa fa-quote-left');
INSERT INTO `sys_menu_ico` VALUES ('243', 'fa fa-quote-right');
INSERT INTO `sys_menu_ico` VALUES ('244', 'fa fa-spinner');
INSERT INTO `sys_menu_ico` VALUES ('245', 'fa fa-circle');
INSERT INTO `sys_menu_ico` VALUES ('246', 'fa fa-reply');
INSERT INTO `sys_menu_ico` VALUES ('247', 'fa fa-github-alt');
INSERT INTO `sys_menu_ico` VALUES ('248', 'fa fa-folder-o');
INSERT INTO `sys_menu_ico` VALUES ('249', 'fa fa-folder-open-o');
INSERT INTO `sys_menu_ico` VALUES ('250', 'fa fa-smile-o');
INSERT INTO `sys_menu_ico` VALUES ('251', 'fa fa-frown-o');
INSERT INTO `sys_menu_ico` VALUES ('252', 'fa fa-meh-o');
INSERT INTO `sys_menu_ico` VALUES ('253', 'fa fa-gamepad');
INSERT INTO `sys_menu_ico` VALUES ('254', 'fa fa-keyboard-o');
INSERT INTO `sys_menu_ico` VALUES ('255', 'fa fa-flag-o');
INSERT INTO `sys_menu_ico` VALUES ('256', 'fa fa-flag-checkered');
INSERT INTO `sys_menu_ico` VALUES ('257', 'fa fa-terminal');
INSERT INTO `sys_menu_ico` VALUES ('258', 'fa fa-code');
INSERT INTO `sys_menu_ico` VALUES ('259', 'fa fa-reply-all');
INSERT INTO `sys_menu_ico` VALUES ('260', 'fa fa-star-half-o');
INSERT INTO `sys_menu_ico` VALUES ('261', 'fa fa-location-arrow');
INSERT INTO `sys_menu_ico` VALUES ('262', 'fa fa-crop');
INSERT INTO `sys_menu_ico` VALUES ('263', 'fa fa-code-fork');
INSERT INTO `sys_menu_ico` VALUES ('264', 'fa fa-chain-broken');
INSERT INTO `sys_menu_ico` VALUES ('265', 'fa fa-question');
INSERT INTO `sys_menu_ico` VALUES ('266', 'fa fa-info');
INSERT INTO `sys_menu_ico` VALUES ('267', 'fa fa-exclamation');
INSERT INTO `sys_menu_ico` VALUES ('268', 'fa fa-superscript');
INSERT INTO `sys_menu_ico` VALUES ('269', 'fa fa-subscript');
INSERT INTO `sys_menu_ico` VALUES ('270', 'fa fa-eraser');
INSERT INTO `sys_menu_ico` VALUES ('271', 'fa fa-puzzle-piece');
INSERT INTO `sys_menu_ico` VALUES ('272', 'fa fa-microphone');
INSERT INTO `sys_menu_ico` VALUES ('273', 'fa fa-microphone-slash');
INSERT INTO `sys_menu_ico` VALUES ('274', 'fa fa-shield');
INSERT INTO `sys_menu_ico` VALUES ('275', 'fa fa-calendar-o');
INSERT INTO `sys_menu_ico` VALUES ('276', 'fa fa-fire-extinguisher');
INSERT INTO `sys_menu_ico` VALUES ('277', 'fa fa-rocket');
INSERT INTO `sys_menu_ico` VALUES ('278', 'fa fa-maxcdn');
INSERT INTO `sys_menu_ico` VALUES ('279', 'fa fa-chevron-circle-left');
INSERT INTO `sys_menu_ico` VALUES ('280', 'fa fa-chevron-circle-right');
INSERT INTO `sys_menu_ico` VALUES ('281', 'fa fa-chevron-circle-up');
INSERT INTO `sys_menu_ico` VALUES ('282', 'fa fa-chevron-circle-down');
INSERT INTO `sys_menu_ico` VALUES ('283', 'fa fa-html5');
INSERT INTO `sys_menu_ico` VALUES ('284', 'fa fa-css3');
INSERT INTO `sys_menu_ico` VALUES ('285', 'fa fa-anchor');
INSERT INTO `sys_menu_ico` VALUES ('286', 'fa fa-unlock-alt');
INSERT INTO `sys_menu_ico` VALUES ('287', 'fa fa-bullseye');
INSERT INTO `sys_menu_ico` VALUES ('288', 'fa fa-ellipsis-h');
INSERT INTO `sys_menu_ico` VALUES ('289', 'fa fa-ellipsis-v');
INSERT INTO `sys_menu_ico` VALUES ('290', 'fa fa-rss-square');
INSERT INTO `sys_menu_ico` VALUES ('291', 'fa fa-play-circle');
INSERT INTO `sys_menu_ico` VALUES ('292', 'fa fa-ticket');
INSERT INTO `sys_menu_ico` VALUES ('293', 'fa fa-minus-square');
INSERT INTO `sys_menu_ico` VALUES ('294', 'fa fa-minus-square-o');
INSERT INTO `sys_menu_ico` VALUES ('295', 'fa fa-level-up');
INSERT INTO `sys_menu_ico` VALUES ('296', 'fa fa-level-down');
INSERT INTO `sys_menu_ico` VALUES ('297', 'fa fa-check-square');
INSERT INTO `sys_menu_ico` VALUES ('298', 'fa fa-pencil-square');
INSERT INTO `sys_menu_ico` VALUES ('299', 'fa fa-external-link-square');
INSERT INTO `sys_menu_ico` VALUES ('300', 'fa fa-share-square');
INSERT INTO `sys_menu_ico` VALUES ('301', 'fa fa-compass');
INSERT INTO `sys_menu_ico` VALUES ('302', 'fa fa-caret-square-o-down');
INSERT INTO `sys_menu_ico` VALUES ('303', 'fa fa-caret-square-o-up');
INSERT INTO `sys_menu_ico` VALUES ('304', 'fa fa-caret-square-o-right');
INSERT INTO `sys_menu_ico` VALUES ('305', 'fa fa-eur');
INSERT INTO `sys_menu_ico` VALUES ('306', 'fa fa-gbp');
INSERT INTO `sys_menu_ico` VALUES ('307', 'fa fa-usd');
INSERT INTO `sys_menu_ico` VALUES ('308', 'fa fa-inr');
INSERT INTO `sys_menu_ico` VALUES ('309', 'fa fa-jpy');
INSERT INTO `sys_menu_ico` VALUES ('310', 'fa fa-rub');
INSERT INTO `sys_menu_ico` VALUES ('311', 'fa fa-krw');
INSERT INTO `sys_menu_ico` VALUES ('312', 'fa fa-btc');
INSERT INTO `sys_menu_ico` VALUES ('313', 'fa fa-file');
INSERT INTO `sys_menu_ico` VALUES ('314', 'fa fa-file-text');
INSERT INTO `sys_menu_ico` VALUES ('315', 'fa fa-sort-alpha-asc');
INSERT INTO `sys_menu_ico` VALUES ('316', 'fa fa-sort-alpha-desc');
INSERT INTO `sys_menu_ico` VALUES ('317', 'fa fa-sort-amount-asc');
INSERT INTO `sys_menu_ico` VALUES ('318', 'fa fa-sort-amount-desc');
INSERT INTO `sys_menu_ico` VALUES ('319', 'fa fa-sort-numeric-asc');
INSERT INTO `sys_menu_ico` VALUES ('320', 'fa fa-sort-numeric-desc');
INSERT INTO `sys_menu_ico` VALUES ('321', 'fa fa-thumbs-up');
INSERT INTO `sys_menu_ico` VALUES ('322', 'fa fa-thumbs-down');
INSERT INTO `sys_menu_ico` VALUES ('323', 'fa fa-youtube-square');
INSERT INTO `sys_menu_ico` VALUES ('324', 'fa fa-youtube');
INSERT INTO `sys_menu_ico` VALUES ('325', 'fa fa-xing');
INSERT INTO `sys_menu_ico` VALUES ('326', 'fa fa-xing-square');
INSERT INTO `sys_menu_ico` VALUES ('327', 'fa fa-youtube-play');
INSERT INTO `sys_menu_ico` VALUES ('328', 'fa fa-dropbox');
INSERT INTO `sys_menu_ico` VALUES ('329', 'fa fa-stack-overflow');
INSERT INTO `sys_menu_ico` VALUES ('330', 'fa fa-instagram');
INSERT INTO `sys_menu_ico` VALUES ('331', 'fa fa-flickr');
INSERT INTO `sys_menu_ico` VALUES ('332', 'fa fa-adn');
INSERT INTO `sys_menu_ico` VALUES ('333', 'fa fa-bitbucket');
INSERT INTO `sys_menu_ico` VALUES ('334', 'fa fa-bitbucket-square');
INSERT INTO `sys_menu_ico` VALUES ('335', 'fa fa-tumblr');
INSERT INTO `sys_menu_ico` VALUES ('336', 'fa fa-tumblr-square');
INSERT INTO `sys_menu_ico` VALUES ('337', 'fa fa-long-arrow-down');
INSERT INTO `sys_menu_ico` VALUES ('338', 'fa fa-long-arrow-up');
INSERT INTO `sys_menu_ico` VALUES ('339', 'fa fa-long-arrow-left');
INSERT INTO `sys_menu_ico` VALUES ('340', 'fa fa-long-arrow-right');
INSERT INTO `sys_menu_ico` VALUES ('341', 'fa fa-apple');
INSERT INTO `sys_menu_ico` VALUES ('342', 'fa fa-windows');
INSERT INTO `sys_menu_ico` VALUES ('343', 'fa fa-android');
INSERT INTO `sys_menu_ico` VALUES ('344', 'fa fa-linux');
INSERT INTO `sys_menu_ico` VALUES ('345', 'fa fa-dribbble');
INSERT INTO `sys_menu_ico` VALUES ('346', 'fa fa-skype');
INSERT INTO `sys_menu_ico` VALUES ('347', 'fa fa-foursquare');
INSERT INTO `sys_menu_ico` VALUES ('348', 'fa fa-trello');
INSERT INTO `sys_menu_ico` VALUES ('349', 'fa fa-female');
INSERT INTO `sys_menu_ico` VALUES ('350', 'fa fa-male');
INSERT INTO `sys_menu_ico` VALUES ('351', 'fa fa-gratipay');
INSERT INTO `sys_menu_ico` VALUES ('352', 'fa fa-sun-o');
INSERT INTO `sys_menu_ico` VALUES ('353', 'fa fa-moon-o');
INSERT INTO `sys_menu_ico` VALUES ('354', 'fa fa-archive');
INSERT INTO `sys_menu_ico` VALUES ('355', 'fa fa-bug');
INSERT INTO `sys_menu_ico` VALUES ('356', 'fa fa-vk');
INSERT INTO `sys_menu_ico` VALUES ('357', 'fa fa-weibo');
INSERT INTO `sys_menu_ico` VALUES ('358', 'fa fa-renren');
INSERT INTO `sys_menu_ico` VALUES ('359', 'fa fa-pagelines');
INSERT INTO `sys_menu_ico` VALUES ('360', 'fa fa-stack-exchange');
INSERT INTO `sys_menu_ico` VALUES ('361', 'fa fa-arrow-circle-o-right');
INSERT INTO `sys_menu_ico` VALUES ('362', 'fa fa-arrow-circle-o-left');
INSERT INTO `sys_menu_ico` VALUES ('363', 'fa fa-caret-square-o-left');
INSERT INTO `sys_menu_ico` VALUES ('364', 'fa fa-dot-circle-o');
INSERT INTO `sys_menu_ico` VALUES ('365', 'fa fa-wheelchair');
INSERT INTO `sys_menu_ico` VALUES ('366', 'fa fa-vimeo-square');
INSERT INTO `sys_menu_ico` VALUES ('367', 'fa fa-try');
INSERT INTO `sys_menu_ico` VALUES ('368', 'fa fa-plus-square-o');
INSERT INTO `sys_menu_ico` VALUES ('369', 'fa fa-space-shuttle');
INSERT INTO `sys_menu_ico` VALUES ('370', 'fa fa-slack');
INSERT INTO `sys_menu_ico` VALUES ('371', 'fa fa-envelope-square');
INSERT INTO `sys_menu_ico` VALUES ('372', 'fa fa-wordpress');
INSERT INTO `sys_menu_ico` VALUES ('373', 'fa fa-openid');
INSERT INTO `sys_menu_ico` VALUES ('374', 'fa fa-university');
INSERT INTO `sys_menu_ico` VALUES ('375', 'fa fa-graduation-cap');
INSERT INTO `sys_menu_ico` VALUES ('376', 'fa fa-yahoo');
INSERT INTO `sys_menu_ico` VALUES ('377', 'fa fa-google');
INSERT INTO `sys_menu_ico` VALUES ('378', 'fa fa-reddit');
INSERT INTO `sys_menu_ico` VALUES ('379', 'fa fa-reddit-square');
INSERT INTO `sys_menu_ico` VALUES ('380', 'fa fa-stumbleupon-circle');
INSERT INTO `sys_menu_ico` VALUES ('381', 'fa fa-stumbleupon');
INSERT INTO `sys_menu_ico` VALUES ('382', 'fa fa-delicious');
INSERT INTO `sys_menu_ico` VALUES ('383', 'fa fa-digg');
INSERT INTO `sys_menu_ico` VALUES ('384', 'fa fa-pied-piper-pp');
INSERT INTO `sys_menu_ico` VALUES ('385', 'fa fa-pied-piper-alt');
INSERT INTO `sys_menu_ico` VALUES ('386', 'fa fa-drupal');
INSERT INTO `sys_menu_ico` VALUES ('387', 'fa fa-joomla');
INSERT INTO `sys_menu_ico` VALUES ('388', 'fa fa-language');
INSERT INTO `sys_menu_ico` VALUES ('389', 'fa fa-fax');
INSERT INTO `sys_menu_ico` VALUES ('390', 'fa fa-building');
INSERT INTO `sys_menu_ico` VALUES ('391', 'fa fa-child');
INSERT INTO `sys_menu_ico` VALUES ('392', 'fa fa-paw');
INSERT INTO `sys_menu_ico` VALUES ('393', 'fa fa-spoon');
INSERT INTO `sys_menu_ico` VALUES ('394', 'fa fa-cube');
INSERT INTO `sys_menu_ico` VALUES ('395', 'fa fa-cubes');
INSERT INTO `sys_menu_ico` VALUES ('396', 'fa fa-behance');
INSERT INTO `sys_menu_ico` VALUES ('397', 'fa fa-behance-square');
INSERT INTO `sys_menu_ico` VALUES ('398', 'fa fa-steam');
INSERT INTO `sys_menu_ico` VALUES ('399', 'fa fa-steam-square');
INSERT INTO `sys_menu_ico` VALUES ('400', 'fa fa-recycle');
INSERT INTO `sys_menu_ico` VALUES ('401', 'fa fa-car');
INSERT INTO `sys_menu_ico` VALUES ('402', 'fa fa-taxi');
INSERT INTO `sys_menu_ico` VALUES ('403', 'fa fa-tree');
INSERT INTO `sys_menu_ico` VALUES ('404', 'fa fa-spotify');
INSERT INTO `sys_menu_ico` VALUES ('405', 'fa fa-deviantart');
INSERT INTO `sys_menu_ico` VALUES ('406', 'fa fa-soundcloud');
INSERT INTO `sys_menu_ico` VALUES ('407', 'fa fa-database');
INSERT INTO `sys_menu_ico` VALUES ('408', 'fa fa-file-pdf-o');
INSERT INTO `sys_menu_ico` VALUES ('409', 'fa fa-file-word-o');
INSERT INTO `sys_menu_ico` VALUES ('410', 'fa fa-file-excel-o');
INSERT INTO `sys_menu_ico` VALUES ('411', 'fa fa-file-powerpoint-o');
INSERT INTO `sys_menu_ico` VALUES ('412', 'fa fa-file-image-o');
INSERT INTO `sys_menu_ico` VALUES ('413', 'fa fa-file-archive-o');
INSERT INTO `sys_menu_ico` VALUES ('414', 'fa fa-file-audio-o');
INSERT INTO `sys_menu_ico` VALUES ('415', 'fa fa-file-video-o');
INSERT INTO `sys_menu_ico` VALUES ('416', 'fa fa-file-code-o');
INSERT INTO `sys_menu_ico` VALUES ('417', 'fa fa-vine');
INSERT INTO `sys_menu_ico` VALUES ('418', 'fa fa-codepen');
INSERT INTO `sys_menu_ico` VALUES ('419', 'fa fa-jsfiddle');
INSERT INTO `sys_menu_ico` VALUES ('420', 'fa fa-life-ring');
INSERT INTO `sys_menu_ico` VALUES ('421', 'fa fa-circle-o-notch');
INSERT INTO `sys_menu_ico` VALUES ('422', 'fa fa-rebel');
INSERT INTO `sys_menu_ico` VALUES ('423', 'fa fa-empire');
INSERT INTO `sys_menu_ico` VALUES ('424', 'fa fa-git-square');
INSERT INTO `sys_menu_ico` VALUES ('425', 'fa fa-git');
INSERT INTO `sys_menu_ico` VALUES ('426', 'fa fa-hacker-news');
INSERT INTO `sys_menu_ico` VALUES ('427', 'fa fa-tencent-weibo');
INSERT INTO `sys_menu_ico` VALUES ('428', 'fa fa-qq');
INSERT INTO `sys_menu_ico` VALUES ('429', 'fa fa-weixin');
INSERT INTO `sys_menu_ico` VALUES ('430', 'fa fa-paper-plane');
INSERT INTO `sys_menu_ico` VALUES ('431', 'fa fa-paper-plane-o');
INSERT INTO `sys_menu_ico` VALUES ('432', 'fa fa-history');
INSERT INTO `sys_menu_ico` VALUES ('433', 'fa fa-circle-thin');
INSERT INTO `sys_menu_ico` VALUES ('434', 'fa fa-header');
INSERT INTO `sys_menu_ico` VALUES ('435', 'fa fa-paragraph');
INSERT INTO `sys_menu_ico` VALUES ('436', 'fa fa-sliders');
INSERT INTO `sys_menu_ico` VALUES ('437', 'fa fa-share-alt');
INSERT INTO `sys_menu_ico` VALUES ('438', 'fa fa-share-alt-square');
INSERT INTO `sys_menu_ico` VALUES ('439', 'fa fa-bomb');
INSERT INTO `sys_menu_ico` VALUES ('440', 'fa fa-futbol-o');
INSERT INTO `sys_menu_ico` VALUES ('441', 'fa fa-tty');
INSERT INTO `sys_menu_ico` VALUES ('442', 'fa fa-binoculars');
INSERT INTO `sys_menu_ico` VALUES ('443', 'fa fa-plug');
INSERT INTO `sys_menu_ico` VALUES ('444', 'fa fa-slideshare');
INSERT INTO `sys_menu_ico` VALUES ('445', 'fa fa-twitch');
INSERT INTO `sys_menu_ico` VALUES ('446', 'fa fa-yelp');
INSERT INTO `sys_menu_ico` VALUES ('447', 'fa fa-newspaper-o');
INSERT INTO `sys_menu_ico` VALUES ('448', 'fa fa-wifi');
INSERT INTO `sys_menu_ico` VALUES ('449', 'fa fa-calculator');
INSERT INTO `sys_menu_ico` VALUES ('450', 'fa fa-paypal');
INSERT INTO `sys_menu_ico` VALUES ('451', 'fa fa-google-wallet');
INSERT INTO `sys_menu_ico` VALUES ('452', 'fa fa-cc-visa');
INSERT INTO `sys_menu_ico` VALUES ('453', 'fa fa-cc-mastercard');
INSERT INTO `sys_menu_ico` VALUES ('454', 'fa fa-cc-discover');
INSERT INTO `sys_menu_ico` VALUES ('455', 'fa fa-cc-amex');
INSERT INTO `sys_menu_ico` VALUES ('456', 'fa fa-cc-paypal');
INSERT INTO `sys_menu_ico` VALUES ('457', 'fa fa-cc-stripe');
INSERT INTO `sys_menu_ico` VALUES ('458', 'fa fa-bell-slash');
INSERT INTO `sys_menu_ico` VALUES ('459', 'fa fa-bell-slash-o');
INSERT INTO `sys_menu_ico` VALUES ('460', 'fa fa-trash');
INSERT INTO `sys_menu_ico` VALUES ('461', 'fa fa-copyright');
INSERT INTO `sys_menu_ico` VALUES ('462', 'fa fa-at');
INSERT INTO `sys_menu_ico` VALUES ('463', 'fa fa-eyedropper');
INSERT INTO `sys_menu_ico` VALUES ('464', 'fa fa-paint-brush');
INSERT INTO `sys_menu_ico` VALUES ('465', 'fa fa-birthday-cake');
INSERT INTO `sys_menu_ico` VALUES ('466', 'fa fa-area-chart');
INSERT INTO `sys_menu_ico` VALUES ('467', 'fa fa-pie-chart');
INSERT INTO `sys_menu_ico` VALUES ('468', 'fa fa-line-chart');
INSERT INTO `sys_menu_ico` VALUES ('469', 'fa fa-lastfm');
INSERT INTO `sys_menu_ico` VALUES ('470', 'fa fa-lastfm-square');
INSERT INTO `sys_menu_ico` VALUES ('471', 'fa fa-toggle-off');
INSERT INTO `sys_menu_ico` VALUES ('472', 'fa fa-toggle-on');
INSERT INTO `sys_menu_ico` VALUES ('473', 'fa fa-bicycle');
INSERT INTO `sys_menu_ico` VALUES ('474', 'fa fa-bus');
INSERT INTO `sys_menu_ico` VALUES ('475', 'fa fa-ioxhost');
INSERT INTO `sys_menu_ico` VALUES ('476', 'fa fa-angellist');
INSERT INTO `sys_menu_ico` VALUES ('477', 'fa fa-cc');
INSERT INTO `sys_menu_ico` VALUES ('478', 'fa fa-ils');
INSERT INTO `sys_menu_ico` VALUES ('479', 'fa fa-meanpath');
INSERT INTO `sys_menu_ico` VALUES ('480', 'fa fa-buysellads');
INSERT INTO `sys_menu_ico` VALUES ('481', 'fa fa-connectdevelop');
INSERT INTO `sys_menu_ico` VALUES ('482', 'fa fa-dashcube');
INSERT INTO `sys_menu_ico` VALUES ('483', 'fa fa-forumbee');
INSERT INTO `sys_menu_ico` VALUES ('484', 'fa fa-leanpub');
INSERT INTO `sys_menu_ico` VALUES ('485', 'fa fa-sellsy');
INSERT INTO `sys_menu_ico` VALUES ('486', 'fa fa-shirtsinbulk');
INSERT INTO `sys_menu_ico` VALUES ('487', 'fa fa-simplybuilt');
INSERT INTO `sys_menu_ico` VALUES ('488', 'fa fa-skyatlas');
INSERT INTO `sys_menu_ico` VALUES ('489', 'fa fa-cart-plus');
INSERT INTO `sys_menu_ico` VALUES ('490', 'fa fa-cart-arrow-down');
INSERT INTO `sys_menu_ico` VALUES ('491', 'fa fa-diamond');
INSERT INTO `sys_menu_ico` VALUES ('492', 'fa fa-ship');
INSERT INTO `sys_menu_ico` VALUES ('493', 'fa fa-user-secret');
INSERT INTO `sys_menu_ico` VALUES ('494', 'fa fa-motorcycle');
INSERT INTO `sys_menu_ico` VALUES ('495', 'fa fa-street-view');
INSERT INTO `sys_menu_ico` VALUES ('496', 'fa fa-heartbeat');
INSERT INTO `sys_menu_ico` VALUES ('497', 'fa fa-venus');
INSERT INTO `sys_menu_ico` VALUES ('498', 'fa fa-mars');
INSERT INTO `sys_menu_ico` VALUES ('499', 'fa fa-mercury');
INSERT INTO `sys_menu_ico` VALUES ('500', 'fa fa-transgender');
INSERT INTO `sys_menu_ico` VALUES ('501', 'fa fa-transgender-alt');
INSERT INTO `sys_menu_ico` VALUES ('502', 'fa fa-venus-double');
INSERT INTO `sys_menu_ico` VALUES ('503', 'fa fa-mars-double');
INSERT INTO `sys_menu_ico` VALUES ('504', 'fa fa-venus-mars');
INSERT INTO `sys_menu_ico` VALUES ('505', 'fa fa-mars-stroke');
INSERT INTO `sys_menu_ico` VALUES ('506', 'fa fa-mars-stroke-v');
INSERT INTO `sys_menu_ico` VALUES ('507', 'fa fa-mars-stroke-h');
INSERT INTO `sys_menu_ico` VALUES ('508', 'fa fa-neuter');
INSERT INTO `sys_menu_ico` VALUES ('509', 'fa fa-genderless');
INSERT INTO `sys_menu_ico` VALUES ('510', 'fa fa-facebook-official');
INSERT INTO `sys_menu_ico` VALUES ('511', 'fa fa-pinterest-p');
INSERT INTO `sys_menu_ico` VALUES ('512', 'fa fa-whatsapp');
INSERT INTO `sys_menu_ico` VALUES ('513', 'fa fa-server');
INSERT INTO `sys_menu_ico` VALUES ('514', 'fa fa-user-plus');
INSERT INTO `sys_menu_ico` VALUES ('515', 'fa fa-user-times');
INSERT INTO `sys_menu_ico` VALUES ('516', 'fa fa-bed');
INSERT INTO `sys_menu_ico` VALUES ('517', 'fa fa-viacoin');
INSERT INTO `sys_menu_ico` VALUES ('518', 'fa fa-train');
INSERT INTO `sys_menu_ico` VALUES ('519', 'fa fa-subway');
INSERT INTO `sys_menu_ico` VALUES ('520', 'fa fa-medium');
INSERT INTO `sys_menu_ico` VALUES ('521', 'fa fa-y-combinator');
INSERT INTO `sys_menu_ico` VALUES ('522', 'fa fa-optin-monster');
INSERT INTO `sys_menu_ico` VALUES ('523', 'fa fa-opencart');
INSERT INTO `sys_menu_ico` VALUES ('524', 'fa fa-expeditedssl');
INSERT INTO `sys_menu_ico` VALUES ('525', 'fa fa-battery-full');
INSERT INTO `sys_menu_ico` VALUES ('526', 'fa fa-battery-three-quarters');
INSERT INTO `sys_menu_ico` VALUES ('527', 'fa fa-battery-half');
INSERT INTO `sys_menu_ico` VALUES ('528', 'fa fa-battery-quarter');
INSERT INTO `sys_menu_ico` VALUES ('529', 'fa fa-battery-empty');
INSERT INTO `sys_menu_ico` VALUES ('530', 'fa fa-mouse-pointer');
INSERT INTO `sys_menu_ico` VALUES ('531', 'fa fa-i-cursor');
INSERT INTO `sys_menu_ico` VALUES ('532', 'fa fa-object-group');
INSERT INTO `sys_menu_ico` VALUES ('533', 'fa fa-object-ungroup');
INSERT INTO `sys_menu_ico` VALUES ('534', 'fa fa-sticky-note');
INSERT INTO `sys_menu_ico` VALUES ('535', 'fa fa-sticky-note-o');
INSERT INTO `sys_menu_ico` VALUES ('536', 'fa fa-cc-jcb');
INSERT INTO `sys_menu_ico` VALUES ('537', 'fa fa-cc-diners-club');
INSERT INTO `sys_menu_ico` VALUES ('538', 'fa fa-clone');
INSERT INTO `sys_menu_ico` VALUES ('539', 'fa fa-balance-scale');
INSERT INTO `sys_menu_ico` VALUES ('540', 'fa fa-hourglass-o');
INSERT INTO `sys_menu_ico` VALUES ('541', 'fa fa-hourglass-start');
INSERT INTO `sys_menu_ico` VALUES ('542', 'fa fa-hourglass-half');
INSERT INTO `sys_menu_ico` VALUES ('543', 'fa fa-hourglass-end');
INSERT INTO `sys_menu_ico` VALUES ('544', 'fa fa-hourglass');
INSERT INTO `sys_menu_ico` VALUES ('545', 'fa fa-hand-rock-o');
INSERT INTO `sys_menu_ico` VALUES ('546', 'fa fa-hand-paper-o');
INSERT INTO `sys_menu_ico` VALUES ('547', 'fa fa-hand-scissors-o');
INSERT INTO `sys_menu_ico` VALUES ('548', 'fa fa-hand-lizard-o');
INSERT INTO `sys_menu_ico` VALUES ('549', 'fa fa-hand-spock-o');
INSERT INTO `sys_menu_ico` VALUES ('550', 'fa fa-hand-pointer-o');
INSERT INTO `sys_menu_ico` VALUES ('551', 'fa fa-hand-peace-o');
INSERT INTO `sys_menu_ico` VALUES ('552', 'fa fa-trademark');
INSERT INTO `sys_menu_ico` VALUES ('553', 'fa fa-registered');
INSERT INTO `sys_menu_ico` VALUES ('554', 'fa fa-creative-commons');
INSERT INTO `sys_menu_ico` VALUES ('555', 'fa fa-gg');
INSERT INTO `sys_menu_ico` VALUES ('556', 'fa fa-gg-circle');
INSERT INTO `sys_menu_ico` VALUES ('557', 'fa fa-tripadvisor');
INSERT INTO `sys_menu_ico` VALUES ('558', 'fa fa-odnoklassniki');
INSERT INTO `sys_menu_ico` VALUES ('559', 'fa fa-odnoklassniki-square');
INSERT INTO `sys_menu_ico` VALUES ('560', 'fa fa-get-pocket');
INSERT INTO `sys_menu_ico` VALUES ('561', 'fa fa-wikipedia-w');
INSERT INTO `sys_menu_ico` VALUES ('562', 'fa fa-safari');
INSERT INTO `sys_menu_ico` VALUES ('563', 'fa fa-chrome');
INSERT INTO `sys_menu_ico` VALUES ('564', 'fa fa-firefox');
INSERT INTO `sys_menu_ico` VALUES ('565', 'fa fa-opera');
INSERT INTO `sys_menu_ico` VALUES ('566', 'fa fa-internet-explorer');
INSERT INTO `sys_menu_ico` VALUES ('567', 'fa fa-television');
INSERT INTO `sys_menu_ico` VALUES ('568', 'fa fa-contao');
INSERT INTO `sys_menu_ico` VALUES ('569', 'fa fa-500px');
INSERT INTO `sys_menu_ico` VALUES ('570', 'fa fa-amazon');
INSERT INTO `sys_menu_ico` VALUES ('571', 'fa fa-calendar-plus-o');
INSERT INTO `sys_menu_ico` VALUES ('572', 'fa fa-calendar-minus-o');
INSERT INTO `sys_menu_ico` VALUES ('573', 'fa fa-calendar-times-o');
INSERT INTO `sys_menu_ico` VALUES ('574', 'fa fa-calendar-check-o');
INSERT INTO `sys_menu_ico` VALUES ('575', 'fa fa-industry');
INSERT INTO `sys_menu_ico` VALUES ('576', 'fa fa-map-pin');
INSERT INTO `sys_menu_ico` VALUES ('577', 'fa fa-map-signs');
INSERT INTO `sys_menu_ico` VALUES ('578', 'fa fa-map-o');
INSERT INTO `sys_menu_ico` VALUES ('579', 'fa fa-map');
INSERT INTO `sys_menu_ico` VALUES ('580', 'fa fa-commenting');
INSERT INTO `sys_menu_ico` VALUES ('581', 'fa fa-commenting-o');
INSERT INTO `sys_menu_ico` VALUES ('582', 'fa fa-houzz');
INSERT INTO `sys_menu_ico` VALUES ('583', 'fa fa-vimeo');
INSERT INTO `sys_menu_ico` VALUES ('584', 'fa fa-black-tie');
INSERT INTO `sys_menu_ico` VALUES ('585', 'fa fa-fonticons');
INSERT INTO `sys_menu_ico` VALUES ('586', 'fa fa-reddit-alien');
INSERT INTO `sys_menu_ico` VALUES ('587', 'fa fa-edge');
INSERT INTO `sys_menu_ico` VALUES ('588', 'fa fa-credit-card-alt');
INSERT INTO `sys_menu_ico` VALUES ('589', 'fa fa-codiepie');
INSERT INTO `sys_menu_ico` VALUES ('590', 'fa fa-modx');
INSERT INTO `sys_menu_ico` VALUES ('591', 'fa fa-fort-awesome');
INSERT INTO `sys_menu_ico` VALUES ('592', 'fa fa-usb');
INSERT INTO `sys_menu_ico` VALUES ('593', 'fa fa-product-hunt');
INSERT INTO `sys_menu_ico` VALUES ('594', 'fa fa-mixcloud');
INSERT INTO `sys_menu_ico` VALUES ('595', 'fa fa-scribd');
INSERT INTO `sys_menu_ico` VALUES ('596', 'fa fa-pause-circle');
INSERT INTO `sys_menu_ico` VALUES ('597', 'fa fa-pause-circle-o');
INSERT INTO `sys_menu_ico` VALUES ('598', 'fa fa-stop-circle');
INSERT INTO `sys_menu_ico` VALUES ('599', 'fa fa-stop-circle-o');
INSERT INTO `sys_menu_ico` VALUES ('600', 'fa fa-shopping-bag');
INSERT INTO `sys_menu_ico` VALUES ('601', 'fa fa-shopping-basket');
INSERT INTO `sys_menu_ico` VALUES ('602', 'fa fa-hashtag');
INSERT INTO `sys_menu_ico` VALUES ('603', 'fa fa-bluetooth');
INSERT INTO `sys_menu_ico` VALUES ('604', 'fa fa-bluetooth-b');
INSERT INTO `sys_menu_ico` VALUES ('605', 'fa fa-percent');
INSERT INTO `sys_menu_ico` VALUES ('606', 'fa fa-gitlab');
INSERT INTO `sys_menu_ico` VALUES ('607', 'fa fa-wpbeginner');
INSERT INTO `sys_menu_ico` VALUES ('608', 'fa fa-wpforms');
INSERT INTO `sys_menu_ico` VALUES ('609', 'fa fa-envira');
INSERT INTO `sys_menu_ico` VALUES ('610', 'fa fa-universal-access');
INSERT INTO `sys_menu_ico` VALUES ('611', 'fa fa-wheelchair-alt');
INSERT INTO `sys_menu_ico` VALUES ('612', 'fa fa-question-circle-o');
INSERT INTO `sys_menu_ico` VALUES ('613', 'fa fa-blind');
INSERT INTO `sys_menu_ico` VALUES ('614', 'fa fa-audio-description');
INSERT INTO `sys_menu_ico` VALUES ('615', 'fa fa-volume-control-phone');
INSERT INTO `sys_menu_ico` VALUES ('616', 'fa fa-braille');
INSERT INTO `sys_menu_ico` VALUES ('617', 'fa fa-assistive-listening-systems');
INSERT INTO `sys_menu_ico` VALUES ('618', 'fa fa-american-sign-language-interpreting');
INSERT INTO `sys_menu_ico` VALUES ('619', 'fa fa-deaf');
INSERT INTO `sys_menu_ico` VALUES ('620', 'fa fa-glide');
INSERT INTO `sys_menu_ico` VALUES ('621', 'fa fa-glide-g');
INSERT INTO `sys_menu_ico` VALUES ('622', 'fa fa-sign-language');
INSERT INTO `sys_menu_ico` VALUES ('623', 'fa fa-low-vision');
INSERT INTO `sys_menu_ico` VALUES ('624', 'fa fa-viadeo');
INSERT INTO `sys_menu_ico` VALUES ('625', 'fa fa-viadeo-square');
INSERT INTO `sys_menu_ico` VALUES ('626', 'fa fa-snapchat');
INSERT INTO `sys_menu_ico` VALUES ('627', 'fa fa-snapchat-ghost');
INSERT INTO `sys_menu_ico` VALUES ('628', 'fa fa-snapchat-square');
INSERT INTO `sys_menu_ico` VALUES ('629', 'fa fa-pied-piper');
INSERT INTO `sys_menu_ico` VALUES ('630', 'fa fa-first-order');
INSERT INTO `sys_menu_ico` VALUES ('631', 'fa fa-yoast');
INSERT INTO `sys_menu_ico` VALUES ('632', 'fa fa-themeisle');
INSERT INTO `sys_menu_ico` VALUES ('633', 'fa fa-google-plus-official');
INSERT INTO `sys_menu_ico` VALUES ('634', 'fa fa-font-awesome');
INSERT INTO `sys_menu_ico` VALUES ('635', 'fa fa-handshake-o');
INSERT INTO `sys_menu_ico` VALUES ('636', 'fa fa-envelope-open');
INSERT INTO `sys_menu_ico` VALUES ('637', 'fa fa-envelope-open-o');
INSERT INTO `sys_menu_ico` VALUES ('638', 'fa fa-linode');
INSERT INTO `sys_menu_ico` VALUES ('639', 'fa fa-address-book');
INSERT INTO `sys_menu_ico` VALUES ('640', 'fa fa-address-book-o');
INSERT INTO `sys_menu_ico` VALUES ('641', 'fa fa-address-card');
INSERT INTO `sys_menu_ico` VALUES ('642', 'fa fa-address-card-o');
INSERT INTO `sys_menu_ico` VALUES ('643', 'fa fa-user-circle');
INSERT INTO `sys_menu_ico` VALUES ('644', 'fa fa-user-circle-o');
INSERT INTO `sys_menu_ico` VALUES ('645', 'fa fa-user-o');
INSERT INTO `sys_menu_ico` VALUES ('646', 'fa fa-id-badge');
INSERT INTO `sys_menu_ico` VALUES ('647', 'fa fa-id-card');
INSERT INTO `sys_menu_ico` VALUES ('648', 'fa fa-id-card-o');
INSERT INTO `sys_menu_ico` VALUES ('649', 'fa fa-quora');
INSERT INTO `sys_menu_ico` VALUES ('650', 'fa fa-free-code-camp');
INSERT INTO `sys_menu_ico` VALUES ('651', 'fa fa-telegram');
INSERT INTO `sys_menu_ico` VALUES ('652', 'fa fa-thermometer-full');
INSERT INTO `sys_menu_ico` VALUES ('653', 'fa fa-thermometer-three-quarters');
INSERT INTO `sys_menu_ico` VALUES ('654', 'fa fa-thermometer-half');
INSERT INTO `sys_menu_ico` VALUES ('655', 'fa fa-thermometer-quarter');
INSERT INTO `sys_menu_ico` VALUES ('656', 'fa fa-thermometer-empty');
INSERT INTO `sys_menu_ico` VALUES ('657', 'fa fa-shower');
INSERT INTO `sys_menu_ico` VALUES ('658', 'fa fa-bath');
INSERT INTO `sys_menu_ico` VALUES ('659', 'fa fa-podcast');
INSERT INTO `sys_menu_ico` VALUES ('660', 'fa fa-window-maximize');
INSERT INTO `sys_menu_ico` VALUES ('661', 'fa fa-window-minimize');
INSERT INTO `sys_menu_ico` VALUES ('662', 'fa fa-window-restore');
INSERT INTO `sys_menu_ico` VALUES ('663', 'fa fa-window-close');
INSERT INTO `sys_menu_ico` VALUES ('664', 'fa fa-window-close-o');
INSERT INTO `sys_menu_ico` VALUES ('665', 'fa fa-bandcamp');
INSERT INTO `sys_menu_ico` VALUES ('666', 'fa fa-grav');
INSERT INTO `sys_menu_ico` VALUES ('667', 'fa fa-etsy');
INSERT INTO `sys_menu_ico` VALUES ('668', 'fa fa-imdb');
INSERT INTO `sys_menu_ico` VALUES ('669', 'fa fa-ravelry');
INSERT INTO `sys_menu_ico` VALUES ('670', 'fa fa-eercast');
INSERT INTO `sys_menu_ico` VALUES ('671', 'fa fa-microchip');
INSERT INTO `sys_menu_ico` VALUES ('672', 'fa fa-snowflake-o');
INSERT INTO `sys_menu_ico` VALUES ('673', 'fa fa-superpowers');
INSERT INTO `sys_menu_ico` VALUES ('674', 'fa fa-wpexplorer');
INSERT INTO `sys_menu_ico` VALUES ('675', 'fa fa-meetup');

-- ----------------------------
-- Table structure for `sys_permission`
-- ----------------------------
DROP TABLE IF EXISTS `sys_permission`;
CREATE TABLE `sys_permission` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(30) NOT NULL COMMENT '权限的中文说明',
  `remark` varchar(50) DEFAULT NULL,
  `parent_id` varchar(255) DEFAULT NULL COMMENT '父权限',
  `parent_ids` varchar(255) DEFAULT NULL COMMENT '父权限的集合',
  `permission` varchar(255) DEFAULT NULL COMMENT 'shiro权限',
  `resiurce_type` varchar(255) DEFAULT NULL COMMENT '资源类型',
  `url` varchar(255) DEFAULT NULL,
  `css` varchar(50) DEFAULT NULL,
  `sort` int(11) DEFAULT NULL,
  `is_del` tinyint(4) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_permission
-- ----------------------------
INSERT INTO `sys_permission` VALUES ('1', '权限管理', '权限管理', '0', null, null, 'menu', null, null, '1', '0');
INSERT INTO `sys_permission` VALUES ('2', '用户列表', '用户列表', '1', null, 'userInfo:view', 'menu', 'html/permission/userList.html', null, null, '0');
INSERT INTO `sys_permission` VALUES ('3', '用户添加', '用户读取', '1', null, 'userInfo:add', 'btn', 'userInfo/userAdd', null, null, '0');
INSERT INTO `sys_permission` VALUES ('4', '用户删除', '用户删除', '1', null, 'userInfo:del', 'btn', 'userInfo/userDel', null, null, '0');
INSERT INTO `sys_permission` VALUES ('5', '菜单列表', '菜单列表', '1', null, 'menuInfo:view', 'menu', 'html/permission/menuList.html', null, null, '0');
INSERT INTO `sys_permission` VALUES ('6', '菜单添加', '菜单添加', '1', null, 'menuInfo:add', 'btn', 'menuInfo/menuAdd', null, null, '0');
INSERT INTO `sys_permission` VALUES ('7', '测试目录', '测试目录', '0', null, null, 'menu', null, null, '2', '0');
INSERT INTO `sys_permission` VALUES ('8', '测试目录001', '测试目录001', '7', null, null, 'menu', 'html/test/test.html', null, null, '0');
INSERT INTO `sys_permission` VALUES ('9', '获取用户菜单', '获取用户菜单', '', null, 'manage:menuList', null, 'manage/menuList', null, null, '0');
INSERT INTO `sys_permission` VALUES ('10', '获取用户列表', null, null, null, 'manage:userList', null, null, null, null, '0');

-- ----------------------------
-- Table structure for `sys_role`
-- ----------------------------
DROP TABLE IF EXISTS `sys_role`;
CREATE TABLE `sys_role` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(10) NOT NULL COMMENT '角色名称',
  `remark` varchar(20) DEFAULT NULL,
  `create_time` bigint(20) NOT NULL,
  `update_time` bigint(20) NOT NULL,
  `is_del` tinyint(4) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_role
-- ----------------------------
INSERT INTO `sys_role` VALUES ('1', 'admin', '系统管理员', '1', '1', '0');
INSERT INTO `sys_role` VALUES ('2', 'test', '测试人员', '1', '1', '0');
INSERT INTO `sys_role` VALUES ('3', 'dev', '开发人员', '1', '1', '0');

-- ----------------------------
-- Table structure for `sys_role_permission`
-- ----------------------------
DROP TABLE IF EXISTS `sys_role_permission`;
CREATE TABLE `sys_role_permission` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `role_id` int(11) DEFAULT NULL,
  `permission_id` int(11) DEFAULT NULL,
  `create_time` bigint(20) DEFAULT NULL,
  `update_time` bigint(20) DEFAULT NULL,
  `is_del` tinyint(4) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_role_permission
-- ----------------------------
INSERT INTO `sys_role_permission` VALUES ('1', '1', '1', '1', '1', '0');
INSERT INTO `sys_role_permission` VALUES ('2', '1', '2', '1', '1', '0');
INSERT INTO `sys_role_permission` VALUES ('3', '1', '3', '1', '1', '0');
INSERT INTO `sys_role_permission` VALUES ('4', '1', '4', '1', '1', '0');
INSERT INTO `sys_role_permission` VALUES ('5', '1', '5', '1', '1', '0');
INSERT INTO `sys_role_permission` VALUES ('6', '1', '6', '1', '1', '0');
INSERT INTO `sys_role_permission` VALUES ('7', '1', '7', '1', '1', '0');
INSERT INTO `sys_role_permission` VALUES ('8', '1', '8', '1', '1', '0');
INSERT INTO `sys_role_permission` VALUES ('9', '1', '9', '1', '1', '0');
INSERT INTO `sys_role_permission` VALUES ('10', '1', '10', '1', '1', '0');

-- ----------------------------
-- Table structure for `sys_user`
-- ----------------------------
DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `login_name` varchar(20) DEFAULT NULL COMMENT '登陆名',
  `name` varchar(20) DEFAULT NULL COMMENT '用户姓名',
  `mobile` varchar(15) DEFAULT NULL COMMENT '用户手机',
  `password` varchar(40) NOT NULL COMMENT '密码',
  `remark` varchar(20) DEFAULT NULL,
  `create_time` bigint(20) NOT NULL COMMENT '创建时间',
  `update_time` bigint(20) NOT NULL COMMENT '更新时间',
  `login_time` bigint(20) NOT NULL COMMENT '最后一次的登陆时间',
  `is_del` tinyint(4) NOT NULL COMMENT '是否删除。0，默认状态；-1删除状态',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_user
-- ----------------------------
INSERT INTO `sys_user` VALUES ('1', '121', '211', '21', '1111111', '21', '21', '21', '21', '0');
INSERT INTO `sys_user` VALUES ('2', 'hhsad', 'name is lizy', '1886243255', 'hdasjdas', '备注001', '1', '1', '1', '0');
INSERT INTO `sys_user` VALUES ('5', 'hhsad', 'name is lizy', '1886243255', 'hdasjdas', '备注001', '1', '1', '1', '0');
INSERT INTO `sys_user` VALUES ('8', 'hhsad', 'name is lizy', '1886243255', 'hdasjdas', '备注001', '1', '1', '1', '0');
INSERT INTO `sys_user` VALUES ('9', 'hhsad', 'name is lizy', '1886243255', 'hdasjdas', '备注001', '1', '1', '1', '0');
INSERT INTO `sys_user` VALUES ('10', 'hhsad', 'name is lizy', '1886243255', 'hdasjdas', '备注001', '1', '1', '1', '0');
INSERT INTO `sys_user` VALUES ('11', 'hhsad', 'name is lizy', '1886243255', 'hdasjdas', '备注001', '1', '1', '1', '0');
INSERT INTO `sys_user` VALUES ('12', 'a', 'a', '哈哈', '1', null, '21', '21', '21', '0');
INSERT INTO `sys_user` VALUES ('13', 'b', 'c', '2321', '213', null, '1', '2', '2', '0');
INSERT INTO `sys_user` VALUES ('14', 'd', '23', '32', '21321', null, '1', '1', '1', '0');
INSERT INTO `sys_user` VALUES ('15', 'werwe', 'sdfgfd', 's', 'gs', null, '23', '32', '32', '0');
INSERT INTO `sys_user` VALUES ('16', 'hjfgh', 'hfghs', 'sdfasfa', 'sasdfasdf', null, '12', '2322', '32', '0');
INSERT INTO `sys_user` VALUES ('17', 'dasd', 'dasd', 'sadas', 'ytuyt', null, '1', '1', '1', '0');
INSERT INTO `sys_user` VALUES ('18', 'hjkj', 'jk', 'h', 'h', null, '1', '1', '1', '0');
INSERT INTO `sys_user` VALUES ('19', '测试用户', 'das', 'as', 'dsa', null, '1', '1', '1', '0');
INSERT INTO `sys_user` VALUES ('20', '海洋', '534', '534', '543', null, '1', '1', '1', '0');
INSERT INTO `sys_user` VALUES ('21', '蓝天', '123', '213', '23', null, '1', '1', '1', '0');

-- ----------------------------
-- Table structure for `sys_user_role`
-- ----------------------------
DROP TABLE IF EXISTS `sys_user_role`;
CREATE TABLE `sys_user_role` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL,
  `role_id` int(11) DEFAULT NULL,
  `create_time` bigint(20) DEFAULT NULL,
  `update_time` bigint(20) DEFAULT NULL,
  `is_del` tinyint(4) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_user_role
-- ----------------------------
INSERT INTO `sys_user_role` VALUES ('1', '1', '1', '1', '1', '0');
INSERT INTO `sys_user_role` VALUES ('2', '2', '2', '1', '1', '0');
INSERT INTO `sys_user_role` VALUES ('3', '1', '2', '1', '1', '0');
