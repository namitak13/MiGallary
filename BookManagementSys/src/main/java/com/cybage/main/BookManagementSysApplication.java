package com.cybage.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;

@SpringBootApplication(exclude=ErrorMvcAutoConfiguration.class ,scanBasePackages="com.cybage")
public class BookManagementSysApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookManagementSysApplication.class, args);
	}

}
