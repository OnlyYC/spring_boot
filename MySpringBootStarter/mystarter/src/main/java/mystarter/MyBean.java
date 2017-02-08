/**
 * Copyright 2016 Iflytek, Inc. All rights reserved.
 */
package mystarter;

/**
 * <p>
 * <code>MyBean</code>
 * </p>
 *
 * @author ybliao2
 * @version 1.0
 * @since 1.0
 */
public class MyBean {
	private String name;

	public MyBean() {
	}

	public MyBean(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "MyBean{" +
				"name='" + name + '\'' +
				'}';
	}
}
