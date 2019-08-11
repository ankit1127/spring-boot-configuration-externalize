package com.codingTurtles.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class PropertyExternalizeDemoApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		args=	new String[]{"--spring.config.location=file:c:/properties/application.properties"};
		SpringApplication.run(PropertyExternalizeDemoApplication.class, args);
		

	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {

		return application.sources(PropertyExternalizeDemoApplication.class);
	
	}
	
}
