package com.spring.jenkins.api;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringJenkins888ApplicationTests {
	public static Logger logger = LoggerFactory.getLogger(SpringJenkins888ApplicationTests.class);
	@Test
	void contextLoads() 
	{
		logger.info("Application in test cases.....");
	}

}
