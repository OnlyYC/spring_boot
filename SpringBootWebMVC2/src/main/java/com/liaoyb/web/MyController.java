/**
 * Copyright 2016 Iflytek, Inc. All rights reserved.
 */
package com.liaoyb.web;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * <code>MyController</code>
 * </p>
 *
 * @author ybliao2
 * @version 1.0
 * @since 1.0
 */
@RestController
public class MyController {
	@RequestMapping("/hello/{hh}")
	public String hello(@PathVariable String hh){
		return "Hello:"+hh;
	}
}
