package net.zxy.center.common.config;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * mybatis-plus 配置
 *
 * @Author zx
 * @Date 2022/8/25
 **/
@Configuration
@EnableTransactionManagement
public class MybatisPlusConfig {
	/**
	 * 分页插件 保证分页有效
	 */
	@Bean
	public PaginationInterceptor paginationInterceptor() {
		return new PaginationInterceptor();
	}
}
