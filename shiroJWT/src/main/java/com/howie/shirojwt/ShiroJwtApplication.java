package com.howie.shirojwt;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@MapperScan(value = "com.howie.shirojwt.mapper")
//@ImportResource(locations= {"classpath:application-server.yml"})  //只能用来加载xml文件
@PropertySource(value={"classpath:application-server.yml"})
public class ShiroJwtApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShiroJwtApplication.class, args);
	}
}