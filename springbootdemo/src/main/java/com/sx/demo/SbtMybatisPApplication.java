package com.sx.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.sx.demo.mapper")
public class SbtMybatisPApplication {
 
	public static void main(String[] args) {
		SpringApplication.run(SbtMybatisPApplication.class, args);
	}
 
}
