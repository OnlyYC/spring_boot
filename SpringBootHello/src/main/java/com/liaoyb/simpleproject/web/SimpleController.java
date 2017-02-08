/**
 * Copyright 2016 Iflytek, Inc. All rights reserved.
 */
package com.liaoyb.simpleproject.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * <code>SimpleController</code>
 * </p>
 *
 * @author ybliao2
 * @version 1.0
 * @since 1.0
 */
@RestController
public class SimpleController {
	@RequestMapping("/hello")
	public String hello() {
		return "Hello World";
	}
}
