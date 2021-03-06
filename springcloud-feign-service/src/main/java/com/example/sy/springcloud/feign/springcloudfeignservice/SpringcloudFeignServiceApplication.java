package com.example.sy.springcloud.feign.springcloudfeignservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@EnableDiscoveryClient
@EnableFeignClients
@SpringBootApplication
@EnableHystrixDashboard
@EnableCircuitBreaker
public class SpringcloudFeignServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudFeignServiceApplication.class, args);
	}

}
