package com.springboot.mongodbapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories("com.springboot.repository")
@ComponentScan("com.springboot.*")
public class MongodbapplicationApplication {

	public static void main(String[] args) {
		SpringApplication.run(MongodbapplicationApplication.class, args);
	}

}
