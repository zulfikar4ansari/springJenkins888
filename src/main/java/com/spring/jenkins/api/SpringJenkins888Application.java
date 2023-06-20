package com.spring.jenkins.api;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJenkins888Application {
	
	public static Logger logger = LoggerFactory.getLogger(SpringJenkins888Application.class);

	@PostConstruct
    public void init()
    {
		logger.info("Application Started....");
    }
			
	public static void main(String[] args) {
		logger.info("Application Executed....");
		SpringApplication.run(SpringJenkins888Application.class, args);
	}

}
