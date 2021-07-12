package com.example.EmployeeSys;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EmployeeSysApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeSysApplication.class, args);
	}

}
