package net.zxy.center.vo.base;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 响应VO
 * @Author zx
 * @Date 2022/8/24
 **/
@Data
@Builder
@Accessors(chain = true)
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value = "ResultVO",description = "响应VO", discriminator = "discriminator" , reference = "reference")
public class ResultVO<T> implements Serializable {

	//响应给前端的状态码
	@ApiModelProperty(value = "状态码",dataType = "int")
	private int code;
	//响应给前端的信息
	@ApiModelProperty(value = "消息",dataType = "String")
	private String msg;
	//响应给前端的数据
	@ApiModelProperty(value = "数据",dataType = "Object")
	private T data;

	public static<T> ResultVO<T> success (){
		return new ResultVO().setCode(200).setMsg("成功");
	}

	public static<T> ResultVO<T> success (Object data){
		return new ResultVO().setCode(200).setMsg("成功").setData(data);
	}

	public static<T> ResultVO<T> success (String msg){
		return new ResultVO().setCode(200).setMsg(msg);
	}

	public static<T> ResultVO<T> success (Integer code, String msg){
		return new ResultVO().setCode(code).setMsg(msg);
	}

	public static<T> ResultVO<T> success (String msg, Object data){
		return new ResultVO().setMsg(msg).setData(data);
	}

	public static<T> ResultVO<T> success (Integer code, String msg, Object data){
		return new ResultVO().setCode(code).setMsg(msg).setData(data);
	}

	public static<T> ResultVO<T> failure (){
		return new ResultVO().setCode(201).setMsg("失败");
	}

	public static<T> ResultVO<T> failure (String msg){
		return new ResultVO().setCode(201).setMsg(msg);
	}

	public static<T> ResultVO<T> failure (Integer code, String msg){
		return new ResultVO().setCode(code).setMsg(msg);
	}

	public static<T> ResultVO<T> failure (Integer code, String msg, Object data){
		return new ResultVO().setCode(code).setMsg(msg).setData(data);
	}
}
