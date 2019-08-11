package com.codingTurtles.demo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@PropertySource("file:c:/properties/application.properties")
public class PropertySourceConfiguration {

	@Value("${app.name}")
	public void getName(String name) {
		System.out.println("load from external"+name);
	}
}
