package net.zxy.center.service.core;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import net.zxy.center.po.core.DictPO;
import net.zxy.center.vo.req.core.DictReqVO;
import net.zxy.center.vo.resp.core.DictRespVO;

/**
 * <p>
 * 字典管理 服务类
 * </p>
 *
 * @author zx
 * @since 2022-08-25
 */
public interface IDictService extends IService<DictPO> {

	IPage<DictRespVO> page (DictReqVO vo);
}
