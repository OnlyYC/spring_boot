/**
 * Copyright 2016 Iflytek, Inc. All rights reserved.
 */
package mystarter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * <p>
 * <code>MyStarterAutoConfiguration</code>
 * </p>
 *
 * @author ybliao2
 * @version 1.0
 * @since 1.0
 */
@Configuration
@EnableConfigurationProperties(MyStarterProperties.class)
public class MyStarterAutoConfiguration {

	@Autowired
	private MyStarterProperties properties;
	@Bean
	public MyBean myBean(){
		return new MyBean(properties.getName());
	}

	public MyStarterAutoConfiguration() {
		System.out.println("我被构造了");
	}
}
