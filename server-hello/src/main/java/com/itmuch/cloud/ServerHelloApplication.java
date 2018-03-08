package com.itmuch.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
//表明该服务作为Eureka的客户端想Eureka注册
@EnableEurekaClient
public class ServerHelloApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerHelloApplication.class, args);
	}
}
