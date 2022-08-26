package net.zxy.center.common.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;

import java.time.Duration;

/**
 * redis静态工具类
 *
 * @Author zx
 * @Date 2022/8/26
 **/
@Component
public class RedisUtil {

	private static StringRedisTemplate stringRedisTemplate;

	@Autowired
	public void setRedisTemplate(StringRedisTemplate stringRedisTemplate) {
		RedisUtil.stringRedisTemplate = stringRedisTemplate;
	}

	public static void set (String key, String value, Long seconds) {
		if (!ObjectUtils.isEmpty(seconds)) {
			stringRedisTemplate.opsForValue().set(key, value, Duration.ofSeconds(seconds));
		} else {
			stringRedisTemplate.opsForValue().set(key, value);
		}
	}

	public static String get (String key) {
		return stringRedisTemplate.opsForValue().get(key);
	}

}
