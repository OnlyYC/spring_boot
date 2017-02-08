/**
 * Copyright 2016 Iflytek, Inc. All rights reserved.
 */
package com.liaoyb.domain;

/**
 * <p>
 * <code>Person</code>
 * </p>
 *
 * @author ybliao2
 * @version 1.0
 * @since 1.0
 */
public class Person {
	private String name;

	public Person() {
	}

	public Person(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
