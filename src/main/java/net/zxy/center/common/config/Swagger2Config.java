package net.zxy.center.common.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Swagger2配置类
 *
 * @Author zx
 * @Date 2022/8/24
 **/
@Configuration
@EnableSwagger2
public class Swagger2Config {

	@Bean
	public Docket docket() {
		return new Docket(DocumentationType.SWAGGER_2)
				.apiInfo(apiInfo())
				.enable(true)
				.select()
				.apis(RequestHandlerSelectors.basePackage("net.zxy.center.web"))
				.paths(PathSelectors.any())
				.build();
	}

	private ApiInfo apiInfo() {
		return new ApiInfoBuilder()
				.title("爱好中心")
				.contact(new Contact("zhouxiao", "xxx", "1666789590@qq.com"))
				.version("1.0.0")
				.description("爱好数据录入平台")
				.build();
	}

}
