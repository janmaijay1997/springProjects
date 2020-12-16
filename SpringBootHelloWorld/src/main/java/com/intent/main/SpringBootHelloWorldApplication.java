package com.intent.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootHelloWorldApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootHelloWorldApplication.class, args);

		for (String name : context.getBeanDefinitionNames()) {
			System.out.println(name);
		}
	}

}
