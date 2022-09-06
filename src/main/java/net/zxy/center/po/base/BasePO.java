package net.zxy.center.po.base;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 基类
 *
 * @Author zx
 * @Date 2022/8/22
 **/
@Data
public class BasePO implements Serializable {

	private static final long serialVersionUID = 1L;


	/**
	 * 创建时间
	 */
	private LocalDateTime createdTime;

	/**
	 * 更新时间
	 */
	private LocalDateTime updatedTime;
}
