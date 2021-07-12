package com.example.AdminSys;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class AdminSysApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdminSysApplication.class, args);
	}

}
