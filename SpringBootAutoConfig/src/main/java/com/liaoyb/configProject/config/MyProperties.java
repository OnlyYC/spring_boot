/**
 * Copyright 2016 Iflytek, Inc. All rights reserved.
 */
package com.liaoyb.configProject.config;

import java.util.Arrays;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * <p>
 * <code>MyProperties</code>
 * </p>
 *
 * @author ybliao2
 * @version 1.0
 * @since 1.0
 */
@ConfigurationProperties(prefix = MyProperties.MY_PREFIX)
public class MyProperties {
	public static final String MY_PREFIX = "my";
	private String name;
	private String[] mul;

	public MyProperties() {
		System.out.println("我终于被初始化了");
	}

	@Override
	public String toString() {
		return "MyProperties{" + "name='" + name + '\'' + ", mul=" + Arrays.toString(mul) + '}';
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String[] getMul() {
		return mul;
	}

	public void setMul(String[] mul) {
		this.mul = mul;
	}
}
