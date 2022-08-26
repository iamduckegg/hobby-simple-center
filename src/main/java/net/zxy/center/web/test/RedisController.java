package net.zxy.center.web.test;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import net.zxy.center.common.utils.RedisUtil;
import net.zxy.center.vo.base.ResultVO;
import org.springframework.web.bind.annotation.*;

/**
 * 缓存控制类
 * @Author zx
 * @Date 2022/8/26
 **/
@Slf4j
@RestController
@RequestMapping("/redis")
@Api(value = "缓存管理", tags = "缓存管理")
public class RedisController {


	@GetMapping("/get")
	@ApiOperation(value = "查询缓存", notes = "查询缓存")
	@ApiImplicitParams({@ApiImplicitParam(name = "key", value = "关键字",  dataType = "String", paramType = "query")})
	public ResultVO get (@RequestParam String key) {
		String result = RedisUtil.get(key);
		return ResultVO.success("成功",result);
	}

	@PostMapping("/set")
	@ApiOperation(value = "保存缓存", notes = "保存缓存")
	@ApiImplicitParams({@ApiImplicitParam(name = "key", value = "关键字",  dataType = "String"),
			@ApiImplicitParam(name = "value", value = "值",  dataType = "String"),
			@ApiImplicitParam(name = "seconds", value = "秒",  dataType = "long")})
	public ResultVO set (@RequestParam String key,
	                     @RequestParam String value,
	                     @RequestParam(required = false) Long seconds) {
		RedisUtil.set(key, value, seconds);
		return ResultVO.success();
	}


}
