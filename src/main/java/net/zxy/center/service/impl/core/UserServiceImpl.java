package net.zxy.center.service.impl.core;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import net.zxy.center.common.utils.ListUtil;
import net.zxy.center.common.utils.PageUtils;
import net.zxy.center.dao.core.UserMapper;
import net.zxy.center.po.core.UserPO;
import net.zxy.center.service.core.IUserService;
import net.zxy.center.vo.req.core.UserReqVO;
import net.zxy.center.vo.resp.core.UserRespVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author zx
 * @since 2022-08-24
 */
@Service
public class UserServiceImpl implements IUserService {

	@Autowired
	private UserMapper userMapper;

	/**
	 * 列表
	 * @return
	 */
	@Override
	public List<UserRespVO> list (UserReqVO vo) {
		QueryWrapper<UserPO> query = new QueryWrapper<>();
		query.lambda().eq(!StringUtils.isEmpty(vo.getUserName()), UserPO::getUserName, vo.getUserName());
		List<UserPO> userPOS = userMapper.selectList(query);
		List<UserRespVO> userRespVOS = ListUtil.copyProperties(userPOS, UserRespVO::new);
		return userRespVOS;
	}

	/**
	 * 分页
	 * @return
	 */
	@Override
	public PageInfo<UserRespVO> page (UserReqVO vo) {
		PageHelper.startPage(vo.getPageNum(), vo.getPageSize(), true);
		List<UserPO> userPOS = userMapper.selectUserList(vo);
		PageInfo<UserPO> pagePO = new PageInfo<>(userPOS);
		PageInfo<UserRespVO> pageVO = PageUtils.convert(pagePO, UserRespVO.class);
		return pageVO;
	}

	/**
	 * 保存
	 * @param vo
	 * @return
	 */
	@Override
	public Integer save(UserReqVO vo) {
		UserPO po = new UserPO();
		BeanUtils.copyProperties(vo, po);
		int insert = userMapper.insert(po);
		return insert;
	}

}
