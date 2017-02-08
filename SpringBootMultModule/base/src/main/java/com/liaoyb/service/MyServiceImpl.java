/**
 * Copyright 2016 Iflytek, Inc. All rights reserved.
 */
package com.liaoyb.service;

import com.liaoyb.domain.Person;
import org.springframework.stereotype.Service;

/**
 * <p>
 * <code>MyServiceImpl</code>
 * </p>
 *
 * @author ybliao2
 * @version 1.0
 * @since 1.0
 */
@Service
public class MyServiceImpl implements MyService {
	@Override
	public Person findPerson() {
		return new Person("hhhh");
	}
}
