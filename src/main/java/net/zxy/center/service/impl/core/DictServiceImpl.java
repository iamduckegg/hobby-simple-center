package net.zxy.center.service.impl.core;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import net.zxy.center.dao.core.DictMapper;
import net.zxy.center.po.core.DictPO;
import net.zxy.center.service.core.IDictService;
import net.zxy.center.vo.req.core.DictReqVO;
import net.zxy.center.vo.resp.core.DictRespVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 字典管理 服务实现类
 * </p>
 *
 * @author zx
 * @since 2022-08-25
 */
@Service
public class DictServiceImpl extends ServiceImpl<DictMapper, DictPO> implements IDictService {

	@Autowired
	private DictMapper dictMapper;

	/**
	 * 分页
	 * @param vo 入参
	 * @return
	 */
	@Override
	public IPage<DictRespVO> page(DictReqVO vo) {
		IPage<DictPO> page = new Page<>(vo.getCurrent(), vo.getSize(), true);
		QueryWrapper<DictPO> query = new QueryWrapper<>();
		IPage<DictPO> pageInfo = dictMapper.selectPage(page, query);
		//泛型转化
		return pageInfo.convert(p->{
			DictRespVO respVO = new DictRespVO();
			BeanUtils.copyProperties(p, respVO);
			return respVO;
		});
	}
}
