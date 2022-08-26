package net.zxy.center.vo.resp.core;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 用户管理出参VO
 * @Author zx
 * @Date 2022/8/25
 **/
@Data
@ApiModel(description = "用户管理出参VO")
public class UserRespVO {
	/**
	 * 用户id
	 */
	@ApiModelProperty(value = "用户id")
	private Integer userId;

	/**
	 * 用户名
	 */
	@ApiModelProperty(value = "用户名" )
	private String userName;

	/**
	 * 手机号
	 */
	@ApiModelProperty(value = "手机号")
	private String mobile;

}
