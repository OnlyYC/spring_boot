/**
 * Copyright 2016 Iflytek, Inc. All rights reserved.
 */
package com.liaoyb.service;

import com.liaoyb.domain.Person;

import java.util.List;

/**
 * <p>
 * <code>PersonService</code>
 * </p>
 *
 * @author ybliao2
 * @version 1.0
 * @since 1.0
 */
public interface PersonService {
	List<Person>findAll();
	int addPerson(Person person);
}
