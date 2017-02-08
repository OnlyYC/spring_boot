/**
 * Copyright 2016 Iflytek, Inc. All rights reserved.
 */
package com.liaoyb.web;

import com.liaoyb.domain.Person;
import com.liaoyb.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * <code>PersonController</code>
 * </p>
 *
 * @author ybliao2
 * @version 1.0
 * @since 1.0
 */
@RestController
public class PersonController {

	@Autowired
	private MyService myService;
	@RequestMapping("/findPerson")
	public Person findPerson(){
		return myService.findPerson();
	}
}
