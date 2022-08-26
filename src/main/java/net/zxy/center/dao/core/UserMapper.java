package net.zxy.center.dao.core;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import net.zxy.center.po.core.UserPO;
import net.zxy.center.vo.req.core.UserReqVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * <p>
 * 用户表 Mapper 接口
 * </p>
 * 继承 BaseMapper<UserPO> 可以代替配置 mapper-locations: classpath:mapper/*.xml
 *
 * @author zx
 * @since 2022-08-24
 */
@Mapper
public interface UserMapper extends BaseMapper<UserPO> {

	List<UserPO> selectUserList(UserReqVO vo);
}
