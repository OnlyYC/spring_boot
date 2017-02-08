/**
 * Copyright 2016 Iflytek, Inc. All rights reserved.
 */
package com.liaoyb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * <p>
 * <code>Application</code>
 * </p>
 *
 * @author ybliao2
 * @version 1.0
 * @since 1.0
 */
@SpringBootApplication
@ComponentScan("com.liaoyb")
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class,args);
	}
}
