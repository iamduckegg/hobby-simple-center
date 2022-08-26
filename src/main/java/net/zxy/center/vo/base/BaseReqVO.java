package net.zxy.center.vo.base;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 入参基类VO
 * @Author zx
 * @Date 2022/8/25
 **/
@Data
@ApiModel(value = "BaseReqVO", description = "入参基类VO")
public class BaseReqVO {

	@ApiModelProperty(value = "页数")
	private int pageNum;

	@ApiModelProperty(value = "条数")
	private int pageSize;
}
