package com.example.nwr;

import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@Configuration 
@EnableAutoConfiguration
@EnableEurekaClient
@EnableWebMvc
@SpringBootApplication
@EnableDiscoveryClient
@EnableCircuitBreaker
@ComponentScan( {"controller","service"} )
@EnableHystrix
@EnableHystrixDashboard
@EnableFeignClients

public class DemoNewApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoNewApplication.class, args);
		
		CreateH2Database createH2Database = new CreateH2Database();
        createH2Database.create();
	}
}

