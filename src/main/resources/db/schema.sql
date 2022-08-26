CREATE TABLE `cc_user` (
    `user_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '用户id',
    `user_name` varchar(20) NOT NULL COMMENT '用户名',
    `mobile` varchar(11) DEFAULT NULL COMMENT '手机号',
    `status` tinyint(3) NOT NULL DEFAULT '1' COMMENT '状态：0-无效，1-有效',
    `created_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `updated_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    PRIMARY KEY (`user_id`),
    UNIQUE KEY `uk_user_name` (`user_name`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT='用户管理';

CREATE TABLE `cc_dict` (
   `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
   `sort` int(4) NOT NULL DEFAULT '0' COMMENT '排序',
   `type` varchar(32) NOT NULL COMMENT '分类',
   `name` varchar(32) NOT NULL COMMENT '类名',
   `code` varchar(32) NOT NULL COMMENT '编码',
   `label` varchar(32) NOT NULL COMMENT '标签',
   `remark` varchar(500) DEFAULT NULL COMMENT '备注',
   `created_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
   `updated_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
   PRIMARY KEY (`id`),
   UNIQUE KEY `uk_type_code` (`type`,`code`)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8mb4 COMMENT='字典管理';