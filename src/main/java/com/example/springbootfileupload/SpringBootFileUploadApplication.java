package com.example.springbootfileupload;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootFileUploadApplication {
	private static ApplicationContext applicationContext;


	public static void main(String[] args) {
		applicationContext = new AnnotationConfigApplicationContext(SpringBootFileUploadApplication.class);

		for (String beanName : applicationContext.getBeanDefinitionNames()) {
			System.out.println("After ComponentScan: " + beanName);
		}

		SpringApplication.run(SpringBootFileUploadApplication.class, args);
	}

}
