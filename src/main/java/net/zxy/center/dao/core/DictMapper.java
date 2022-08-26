package net.zxy.center.dao.core;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import net.zxy.center.po.core.DictPO;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 字典管理 Mapper 接口
 * </p>
 *
 * @author zx
 * @since 2022-08-25
 */
@Mapper
public interface DictMapper extends BaseMapper<DictPO> {

}
