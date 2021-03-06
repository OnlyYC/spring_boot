package com.liaoyb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@EnableCaching
public class SpringBootPracticeApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringBootPracticeApplication.class, args);
	}
}
