package com.ksk.reactive.todo.restApi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.data.r2dbc.repository.config.EnableR2dbcRepositories;


@SpringBootApplication
@EnableR2dbcRepositories
public class SpringbootReactiveTodoRestApi extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootReactiveTodoRestApi.class, args);
	}
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(SpringbootReactiveTodoRestApi.class);
	}
}
