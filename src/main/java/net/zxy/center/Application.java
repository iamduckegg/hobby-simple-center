package net.zxy.center;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(basePackages = {"net.zxy.center.dao.*"})
//@EnableAutoConfiguration
@SpringBootApplication
//@ComponentScan("net.zxy.center.service")
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
