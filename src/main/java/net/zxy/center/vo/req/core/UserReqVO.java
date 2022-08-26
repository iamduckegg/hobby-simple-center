package net.zxy.center.vo.req.core;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;
import net.zxy.center.group.Add;
import net.zxy.center.group.Update;
import net.zxy.center.vo.base.BaseReqVO;

/**
 * 用户管理入参VO
 * @Author zx
 * @Date 2022/8/25
 **/
@Data
@ApiModel(description = "用户管理入参VO")
public class UserReqVO extends BaseReqVO {

	/**
	 * 用户名
	 */
	@ApiModelProperty(dataType ="String", value = "用户名", required = true)
	@NotBlank(message = "用户名不能为空", groups = {Add.class, Update.class})
	private String userName;

	/**
	 * 手机号
	 */
	@ApiModelProperty(dataType ="int", value = "手机号")
	@Size(max=11,min=11,message = "手机号格式错误", groups = {Add.class, Update.class})
	private String mobile;
}
