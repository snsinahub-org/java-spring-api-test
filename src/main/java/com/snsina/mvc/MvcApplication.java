package com.snsina.mvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class MvcApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(MvcApplication.class, args);
	}

	

}
