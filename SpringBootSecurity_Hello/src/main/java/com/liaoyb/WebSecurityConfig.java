/**
 * Copyright 2017 Iflytek, Inc. All rights reserved.
 */
package com.liaoyb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * <p>
 * <code>WebSecurityConfig</code>
 * </p>
 *
 * @author ybliao2
 * @version 1.0
 * @since 1.0
 */
@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)//允许进入页面方法前检验
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

	/**
	 * Spring Security提供了一个过滤器来拦截请求并验证用户身份。
	 * 如果用户身份认证失败，页面就重定向到/login?error，并且页面中会展现相应的错误信息。
	 * 若用户想要注销登录，可以通过访问/login?logout请求，在完成注销之后，页面展现相应的成功消息。
	 */
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		//通过authorizeRequests()定义哪些URL需要被保护、哪些不需要被保护。
		// 例如以上代码指定了/和/home不需要任何认证就可以访问，其他的路径都必须通过身份验证。

		//formLogin()定义当需要用户登录时候，转到的登录页面。

		//如果不设置loginPage，会默认提供一个
		http.
			authorizeRequests()
				.antMatchers("/", "/home").permitAll()
				.antMatchers("/hello").hasAuthority("ROLE_USER")//登陆后之后拥有“ADMIN”权限才可以访问/hello
				.anyRequest().authenticated() //要放在antMatchers后面
				.and()
			.formLogin()
				.loginPage("/login")
				.permitAll()
				.and()
				.logout().logoutSuccessUrl("/")
				.permitAll();
	}


	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
		//在内存中创建了一个用户，该用户的名称为user，密码为password，用户角色为USER
		auth.inMemoryAuthentication()
				.withUser("user").password("user").roles("USER")
				.and()
				.withUser("admin").password("admin").roles("ADMIN");
	}
}
