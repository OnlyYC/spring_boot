/**
 * Copyright 2016 Iflytek, Inc. All rights reserved.
 */
package com.liaoyb.config;

import org.apache.catalina.filters.RemoteIpFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.PathMatchConfigurer;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * <p>
 * <code>WebConfig</code>对url 的处理
 * </p>
 *
 * @author ybliao2
 * @version 1.0
 * @since 1.0
 */
@Configuration
public class WebConfig extends WebMvcConfigurerAdapter {
	//现在假设我们的应用程序运行在一台负载均衡代理服务器后方,因此需要将代理服务器发来的请求包含的IP地址转换成真正的用户IP。Tomcat 8 提供了对应的过滤器：RemoteIpFilter
	@Bean
	public RemoteIpFilter remoteIpFilter(){
		return new RemoteIpFilter();
	}


	//定制URL匹配规则
	@Override
	public void configurePathMatch(PathMatchConfigurer configurer) {
		//configurer.setUseSuffixPatternMatch(false),表示对外暴露的URL不会识别和匹配.*后缀
		//configurer.setUseTrailingSlashMatch(true),表示系统不区分URL的最后一个字符是否是斜杠/
		configurer.setUseSuffixPatternMatch(false).
				setUseTrailingSlashMatch(true);
	}

	//控制应用程序对静态文件（前提是被打包进部署包）的处理。
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/internal/**").
				addResourceLocations("classpath:/");
	}
}
