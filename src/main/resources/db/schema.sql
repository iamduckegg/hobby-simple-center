CREATE TABLE `cc_user` (
    `user_id` int(11) unsigned NOT NULL AUTO_INCREMENT COMMENT '用户id',
    `user_name` varchar(20) NOT NULL COMMENT '用户名',
    `mobile` varchar(11) DEFAULT NULL COMMENT '手机号',
    `status` tinyint(3) NOT NULL DEFAULT '1' COMMENT '状态：0-无效，1-有效',
    `created_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `updated_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    PRIMARY KEY (`user_id`),
    UNIQUE KEY `uk_user_name` (`user_name`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8mb4 COMMENT='用户管理';

CREATE TABLE `cc_dict` (
   `dict_id` int(11) unsigned NOT NULL AUTO_INCREMENT COMMENT '字典ID',
   `sort` tinyint(4) NOT NULL DEFAULT '0' COMMENT '排序',
   `type` varchar(32) NOT NULL COMMENT '分类',
   `name` varchar(32) NOT NULL COMMENT '类名',
   `code` varchar(32) NOT NULL COMMENT '编码',
   `label` varchar(32) NOT NULL COMMENT '标签',
   `remark` varchar(500) DEFAULT NULL COMMENT '备注',
   `created_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
   `updated_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
   PRIMARY KEY (`dict_id`),
   UNIQUE KEY `uk_type_code` (`type`,`code`)
) ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8mb4 COMMENT='字典管理';

CREATE TABLE `hb_game_info` (
   `game_id` int(11) unsigned NOT NULL AUTO_INCREMENT COMMENT '游戏ID',
   `game_name` varchar(32) NOT NULL COMMENT '游戏名称',
   `english_name` varchar(32) DEFAULT NULL COMMENT '英文名称',
   `main_type` varchar(20) NOT NULL COMMENT '主类型',
   `tag` varchar(150) DEFAULT NULL COMMENT '标签',
   `remark` varchar(500) DEFAULT NULL COMMENT '备注',
   `created_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
   `updated_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
   PRIMARY KEY (`game_id`)
) ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8mb4 COMMENT='游戏信息';

CREATE TABLE `hb_game_deatil` (
    `game_deatil_id` int(11) unsigned NOT NULL AUTO_INCREMENT COMMENT '游戏详情ID',
    `game_id` int(11) unsigned NOT NULL COMMENT '游戏ID',
    `game_name` varchar(32) NOT NULL COMMENT '游戏名称',
    `game_machines` varchar(20) NOT NULL COMMENT '所属平台',
    `has_chinese` tinyint(1) NOT NULL COMMENT '有无中文 1.有,0.无',
    `is_cooperate` tinyint(1) DEFAULT NULL COMMENT '是否可以合作 1.可以,0.不可以',
    `cooperate_count` tinyint(1) DEFAULT NULL COMMENT '合作支持人数',
    `is_fight` tinyint(1) DEFAULT NULL COMMENT '是否可以对战 1.可以,0.不可以',
    `fight_count` tinyint(1) DEFAULT NULL COMMENT '对战支持人数',
    `multiple_mode` tinyint(1) DEFAULT NULL COMMENT '多人支持模式 1.本地,2.线上,3.本地与线上',
    `created_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `updated_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    PRIMARY KEY (`game_deatil_id`)
) ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8mb4 COMMENT='游戏详情';

CREATE TABLE `hb_game_tag` (
    `game_tag_id` int(11) unsigned NOT NULL AUTO_INCREMENT COMMENT '标签ID',
    `tag_name` varchar(20) NOT NULL COMMENT '标签名称',
    `created_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `updated_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    PRIMARY KEY (`game_tag_id`)
) ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8mb4 COMMENT='游戏标签';

CREATE TABLE `hb_game_type` (
    `game_type_id` int(11) unsigned NOT NULL AUTO_INCREMENT COMMENT '类型ID',
    `type_name` varchar(20) NOT NULL COMMENT '类型名称',
    `parentId` int(11) unsigned NOT NULL COMMENT '父级类型ID',
    `level` tinyint(1) NOT NULL COMMENT '层级',
    `describe` varchar(32) NOT NULL COMMENT '描述',
    `created_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `updated_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    PRIMARY KEY (`game_type_id`)
) ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8mb4 COMMENT='游戏类型';