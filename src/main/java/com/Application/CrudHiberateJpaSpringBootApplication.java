package com.Application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories("com.dao")
@EntityScan("com.Model")
@ComponentScan(basePackages="com")
@SpringBootApplication
@EnableAutoConfiguration
@PropertySource({"classpath:application.properties"}) 

//Error creating bean with name 'userController  will be shown if any annotations are missed from top
public class CrudHiberateJpaSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudHiberateJpaSpringBootApplication.class, args);
	}
}
