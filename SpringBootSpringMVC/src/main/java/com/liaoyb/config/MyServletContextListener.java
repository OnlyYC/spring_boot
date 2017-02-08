/**
 * Copyright 2016 Iflytek, Inc. All rights reserved.
 */
package com.liaoyb.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * <p>
 * <code>MyServletContextListener</code>
 * </p>
 *
 * @author ybliao2
 * @version 1.0
 * @since 1.0
 */
@WebListener
public class MyServletContextListener implements ServletContextListener {
	private static Logger logger= LoggerFactory.getLogger(MyServletContextListener.class);
	@Override
	public void contextInitialized(ServletContextEvent servletContextEvent) {
		logger.error("ServletContextEvent初始化");
		ServletContext servletContext=servletContextEvent.getServletContext();
		servletContext.setAttribute("servletContext_param","哈哈哈哈哈哈");
		logger.error("servletContext_param:"+servletContext.getAttribute("servletContext_param"));
	}

	@Override
	public void contextDestroyed(ServletContextEvent servletContextEvent) {
		logger.error("ServletContextEvent销毁");
	}
}
