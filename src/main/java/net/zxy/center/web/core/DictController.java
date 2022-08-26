package net.zxy.center.web.core;


import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.core.metadata.IPage;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import net.zxy.center.service.core.IDictService;
import net.zxy.center.vo.base.ResultVO;
import net.zxy.center.vo.req.core.DictReqVO;
import net.zxy.center.vo.resp.core.DictRespVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 字典管理 前端控制器
 * </p>
 *
 * @author zx
 * @since 2022-08-25
 */
@Slf4j
@RestController
@RequestMapping("/dict")
@Api(value = "字典管理", tags = "字典管理")
public class DictController {

	@Autowired
	private IDictService dictService;

	@GetMapping("/page")
	@ApiOperation(value = "查询字典管理分页", notes = "查询字典信息")
	@ApiImplicitParams({@ApiImplicitParam(name = "current", value = "页数",  dataType = "int", paramType = "query", required = true),
			@ApiImplicitParam(name = "size", value = "条数",  dataType = "int", paramType = "query", required = true)})
	public ResultVO<IPage<DictRespVO>> page (@RequestParam(defaultValue = "1") int current,
	                                         @RequestParam(defaultValue = "10") int size) {
		DictReqVO vo = new DictReqVO();
		vo.setCurrent(current);
		vo.setSize(size);
		log.info("查询字典管理分页入参:{}", JSON.toJSONString(vo));
		return ResultVO.success(dictService.page(vo));
	}

}

