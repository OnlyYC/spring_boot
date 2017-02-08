/**
 * Copyright 2016 Iflytek, Inc. All rights reserved.
 */
package com.liaoyb;

import mystarter.EnableMyConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

/**
 * <p>
 * <code>MySpringBootApplication</code>
 * </p>
 *
 * @author ybliao2
 * @version 1.0
 * @since 1.0
 */
@SpringBootConfiguration
@EnableMyConfiguration
public class MySpringBootApplication {
	public static void main(String[] args) {
		SpringApplication.run(MySpringBootApplication.class, args);
	}
}
