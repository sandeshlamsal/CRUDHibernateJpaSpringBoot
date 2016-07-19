package com.Application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages="com")
@SpringBootApplication
public class CrudHiberateJpaSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudHiberateJpaSpringBootApplication.class, args);
	}
}
