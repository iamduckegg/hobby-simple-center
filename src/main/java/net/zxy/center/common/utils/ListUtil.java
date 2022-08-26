package net.zxy.center.common.utils;

import org.springframework.beans.BeanUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

/**
 * list工具类
 *
 * @Author zx
 * @Date 2022/8/23
 **/
public class ListUtil extends BeanUtils {

	/**
	 * 集合的拷贝
	 * @param sources 数据源类
	 * @param target 目标类::new (eg: UserVO::new)
	 * @return
	 */
	public static <S, T> List<T> copyProperties(List<S> sources, Supplier<T> target) {
		return copyProperties(sources, target, (BeanCopyUtilCallBack<S, T>) null);
	}

	/**
	 * 带有回调的集合拷贝
	 * @param sources 数据源类
	 * @param target 目标类::new (eg: UserVO::new)
	 * @param callBack 回调函数 eg: BeanCopyUtil.copyListProperties(userLiset,UserVO:: new, (userDo,userVo) ->{
	 *                 userVo.setSex("1");
	 *                 userVO.setName(userDo.getUserName());
	 *                 })
	 * @return
	 */
	public static <S, T> List<T> copyProperties(List<S> sources, Supplier<T> target, BeanCopyUtilCallBack<S, T> callBack) {
		List<T> list = new ArrayList<>(sources.size());
		for (S source : sources) {
			T t = target.get();
			copyProperties(source, t);
			list.add(t);
			if (callBack != null) {
				callBack.callBack(source, t);
			}
		}
		return list;
	}

}
