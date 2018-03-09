package com.itmuch.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
//@EnableDiscoveryClient //支持其他服务注册中心的客户端
@EnableEurekaClient
public class MicroserviceSimpleProviderUsreApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceSimpleProviderUsreApplication.class, args);
	}
}
