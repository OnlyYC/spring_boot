/**
 * Copyright 2016 Iflytek, Inc. All rights reserved.
 */
package com.liaoyb.configProject;

import com.liaoyb.configProject.config.MyProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.lang.model.element.Name;

/**
 * <p>
 * <code>SpringBootApplication</code>
 * </p>
 *
 * @author ybliao2
 * @version 1.0
 * @since 1.0
 */
@SpringBootApplication
public class MySpringBootApplication {
	public static void main(String[] args) {
		SpringApplication.run(MySpringBootApplication.class, args);
	}
}
