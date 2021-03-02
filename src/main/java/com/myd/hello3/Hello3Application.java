package com.myd.hello3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication(scanBasePackages = "com.myd.hello3")
@EnableMongoRepositories(basePackages = "com.myd.hello3.repository")
public class Hello3Application {

	public static void main(String[] args) {
		SpringApplication.run(Hello3Application.class, args);
	}

}
