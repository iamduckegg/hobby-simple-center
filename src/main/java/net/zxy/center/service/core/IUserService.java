package net.zxy.center.service.core;

import com.github.pagehelper.PageInfo;
import net.zxy.center.vo.req.core.UserReqVO;
import net.zxy.center.vo.resp.core.UserRespVO;

import java.util.List;

/**
 * <p>
 * 用户表 服务类
 * </p>
 *
 * @author zx
 * @since 2022-08-24
 */
public interface IUserService {

	/**
	 * 列表查询
	 * @param vo
	 * @return
	 */
	List<UserRespVO> list (UserReqVO vo);

	/**
	 * 分页查询
	 * @param vo
	 * @return
	 */
	PageInfo<UserRespVO> page (UserReqVO vo);

	/**
	 * 保存
	 * @param vo
	 * @return
	 */
	Integer save (UserReqVO vo);
}
