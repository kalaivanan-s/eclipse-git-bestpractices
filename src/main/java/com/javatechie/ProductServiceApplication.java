package com.javatechie;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableCaching
@ComponentScan(basePackages = "com.*")
public class ProductServiceApplication {
	
	static Logger logger= LoggerFactory.getLogger(SpringApplication.class);

	public static void main(String[] args) {
		logger.info("changes made in devoler eclipse");
		SpringApplication.run(ProductServiceApplication.class, args);
	}

}
