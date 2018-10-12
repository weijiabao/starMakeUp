package com.icepoint.restful;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"com.icepoint.restful.web", "com.icepoint.restful.service"})
@MapperScan(basePackages = "com.icepoint.restful.mapper")
@SpringBootApplication
public class RestfulApplication {

	public static void main(String[] args) {

		SpringApplication.run(RestfulApplication.class, args);
		System.out.println("Running...");
	}
}
