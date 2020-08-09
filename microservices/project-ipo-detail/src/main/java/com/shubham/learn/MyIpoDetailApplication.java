package com.shubham.learn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient

public class MyIpoDetailApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyIpoDetailApplication.class, args);
	}

}