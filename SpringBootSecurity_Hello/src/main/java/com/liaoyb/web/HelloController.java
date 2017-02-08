/**
 * Copyright 2017 Iflytek, Inc. All rights reserved.
 */
package com.liaoyb.web;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * <p>
 * <code>HelloController</code>
 * </p>
 *
 * @author ybliao2
 * @version 1.0
 * @since 1.0
 */
@Controller
public class HelloController {

	@RequestMapping("/")
	public String index(){
		return "index";
	}

	@RequestMapping("/hello")
	public String hello(){
		return "hello";
	}

	@RequestMapping("/login")
	public String login(){
		return "login";
	}

	//hasAuthority、hasAnyAuthority需要ROLE_前缀
	@PreAuthorize("hasAuthority('ROLE_USER')")
	@RequestMapping("/access")
	@ResponseBody
	public String access(){
		return "access success,访问成功";
	}
}
