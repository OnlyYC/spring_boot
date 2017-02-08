/**
 * Copyright 2016 Iflytek, Inc. All rights reserved.
 */
package mystarter;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * <p>
 * <code>MyStarterProperties</code>
 * </p>
 *
 * @author ybliao2
 * @version 1.0
 * @since 1.0
 */
@ConfigurationProperties(prefix =MyStarterProperties.STARTER_PREFIX )
public class MyStarterProperties {
	public static final String STARTER_PREFIX="my";
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "MyStarterProperties{" +
				"name='" + name + '\'' +
				'}';
	}
}
