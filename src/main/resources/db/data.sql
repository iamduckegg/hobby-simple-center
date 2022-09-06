INSERT INTO `cc_user`(`user_name`, `mobile`) VALUES ('zhoufangfang', '15201501006');

INSERT INTO `cc_dict`(`sort`, `type`, `name`, `code`, `label`) VALUES (1, 'has_chinese', '有无中文', '1', '有');
INSERT INTO `cc_dict`(`sort`, `type`, `name`, `code`, `label`) VALUES (2, 'has_chinese', '有无中文', '0', '无');

INSERT INTO `cc_dict`(`sort`, `type`, `name`, `code`, `label`) VALUES (1, 'is_cooperate', '是否可以合作', '1', '可以');
INSERT INTO `cc_dict`(`sort`, `type`, `name`, `code`, `label`) VALUES (2, 'is_cooperate', '是否可以合作', '0', '不可以');

INSERT INTO `cc_dict`(`sort`, `type`, `name`, `code`, `label`) VALUES (1, 'is_fight', '是否可以对战', '1', '可以');
INSERT INTO `cc_dict`(`sort`, `type`, `name`, `code`, `label`) VALUES (2, 'is_fight', '是否可以对战', '0', '不可以');

INSERT INTO `cc_dict`(`sort`, `type`, `name`, `code`, `label`) VALUES (1, 'multiple_mode', '多人支持模式', '1', '本地');
INSERT INTO `cc_dict`(`sort`, `type`, `name`, `code`, `label`) VALUES (2, 'multiple_mode', '多人支持模式', '2', '线上');
INSERT INTO `cc_dict`(`sort`, `type`, `name`, `code`, `label`) VALUES (3, 'multiple_mode', '多人支持模式', '3', '本地与线上');
