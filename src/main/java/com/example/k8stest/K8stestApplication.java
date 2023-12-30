package com.example.k8stest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.UUID;


@SpringBootApplication
public class K8stestApplication {

	public static void main(String[] args) {
		SpringApplication.run(K8stestApplication.class, args);
	}

	@Bean
	public UUID instanceUUID() {
		return UUID.randomUUID();
	}
}
