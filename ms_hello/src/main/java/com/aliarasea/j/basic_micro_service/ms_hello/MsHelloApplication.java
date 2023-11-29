package com.aliarasea.j.basic_micro_service.ms_hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MsHelloApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsHelloApplication.class, args);
	}

}
