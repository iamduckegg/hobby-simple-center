package net.zxy.center.web.core;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import net.zxy.center.service.core.IUserService;
import net.zxy.center.vo.base.ResultVO;
import net.zxy.center.vo.req.core.UserReqVO;
import net.zxy.center.vo.resp.core.UserRespVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 * 用户管理 前端控制器
 * </p>
 *
 * @author zx
 * @since 2022-08-24
 */
@Slf4j
@RestController
@RequestMapping("/user")
@Api(value = "用户管理", tags = "用户管理")
public class UserController {

	@Autowired
	private IUserService userService;

	@GetMapping("/list")
	@ApiOperation(value = "查询用户管理列表", notes = "查询用户信息")
	@ApiImplicitParams({@ApiImplicitParam(name = "userName", value = "用户名",  dataType = "String", paramType = "query")})
	public ResultVO<List<UserRespVO>> list (@RequestParam String userName) {
		UserReqVO vo = new UserReqVO();
		vo.setUserName(userName);
		log.info("查询用户管理列表入参:{}", JSON.toJSONString(vo));
		return ResultVO.<List<UserRespVO>>builder().code(200).msg("成功").data(userService.list(vo)).build();
	}

	@GetMapping("/page")
	@ApiOperation(value = "查询用户管理分页", notes = "查询用户信息")
	@ApiImplicitParams({@ApiImplicitParam(name = "userName", value = "用户名",  dataType = "String", paramType = "query"),
			@ApiImplicitParam(name = "pageNum", value = "页数",  dataType = "int", paramType = "query", required = true),
			@ApiImplicitParam(name = "pageSize", value = "条数",  dataType = "int", paramType = "query", required = true)})
	public ResultVO<PageInfo<UserRespVO>> page (@RequestParam String userName,
	                                            @RequestParam(defaultValue = "1") int pageNum,
	                                            @RequestParam(defaultValue = "10") int pageSize) {
		UserReqVO vo = new UserReqVO();
		vo.setUserName(userName);
		vo.setPageNum(pageNum);
		vo.setPageSize(pageSize);
		log.info("查询用户管理分页入参:{}", JSON.toJSONString(vo));
		return ResultVO.success(userService.page(vo));
	}

	@PostMapping("/save")
	@ApiOperation(value = "保存用户管理", notes = "保存用户信息")
	public ResultVO<Integer> save (@RequestBody UserReqVO vo) {
		log.info("保存用户管理入参:{}", JSON.toJSONString(vo));
		return ResultVO.success("保存成功", userService.save(vo));
	}


}

