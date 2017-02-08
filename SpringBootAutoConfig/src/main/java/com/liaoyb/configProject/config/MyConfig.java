/**
 * Copyright 2016 Iflytek, Inc. All rights reserved.
 */
package com.liaoyb.configProject.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * <p>
 * <code>MyConfig</code>
 * </p>
 *
 * @author ybliao2
 * @version 1.0
 * @since 1.0
 */
@EnableConfigurationProperties(MyProperties.class)
@Configuration
public class MyConfig {
	private static Logger logger = LoggerFactory.getLogger(MyConfig.class);
	@Autowired
	private MyProperties properties;

	public MyConfig() {
		logger.error("MyConfig:我被初始化了");
	}

	@Override
	public String toString() {
		return "MyConfig{" + "properties=" + properties + '}';
	}
}
