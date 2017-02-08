package com.liaoyb;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import mystarter.MyBean;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootApplicationTests {

	@Autowired
	private MyBean myBean;

	@Test
	public void contextLoads() {
		System.out.println(myBean);
	}

}
