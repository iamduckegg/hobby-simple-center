package net.zxy.center.vo.resp.core;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 字典管理出参VO
 * @Author zx
 * @Date 2022/8/25
 **/
@Data
@ApiModel(description = "字典管理出参VO")
public class DictRespVO {

	@ApiModelProperty(value = "排序")
	private Integer sort;

	@ApiModelProperty(value = "分类")
	private String type;

	@ApiModelProperty(value = "类名")
	private String name;

	@ApiModelProperty(value = "编码")
	private String code;

	@ApiModelProperty(value = "标签")
	private String label;

	@ApiModelProperty(value = "备注")
	private String remark;
}
