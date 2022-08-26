package net.zxy.center.vo.req.core;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import net.zxy.center.vo.base.PlusReqVO;

/**
 * 字典管理入参VO
 *
 * @Author zx
 * @Date 2022/8/25
 **/
@Data
@ApiModel(description = "字典管理入参VO")
public class DictReqVO extends PlusReqVO {

	@ApiModelProperty(dataType ="Integer", value = "排序")
	private Integer sort;

	@ApiModelProperty(dataType ="String", value = "分类", required = true)
	private String type;

	@ApiModelProperty(dataType ="String", value = "类名", required = true)
	private String name;

	@ApiModelProperty(dataType ="String", value = "编码", required = true)
	private String code;

	@ApiModelProperty(dataType ="String", value = "标签")
	private String label;

	@ApiModelProperty(dataType ="String", value = "备注")
	private String remark;
}
