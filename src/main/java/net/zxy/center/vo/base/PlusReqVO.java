package net.zxy.center.vo.base;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * mybatisplus入参VO
 * @Author zx
 * @Date 2022/8/25
 **/
@Data
@ApiModel(description = "mybatisplus入参VO")
public class PlusReqVO {

	@ApiModelProperty(value = "页数")
	private int current;

	@ApiModelProperty(value = "条数")
	private int size;

}
