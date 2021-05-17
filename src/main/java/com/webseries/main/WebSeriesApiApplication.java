package com.webseries.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("com.webseries.WebSeries")
@EntityScan("com.webseries.WebSeries")
@EnableJpaRepositories("com.webseries.WebSeries")
public class WebSeriesApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebSeriesApiApplication.class, args);
	}

}
