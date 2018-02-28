package com.scarlatti;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Batch implements CommandLineRunner {

	Logger log = LoggerFactory.getLogger(Batch.class);

	public static void main(String[] args) {
		SpringApplication.run(Batch.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		log.info("hello Spring Boot!");
	}
}
