package com.liaoyb.configProject;

import com.liaoyb.configProject.config.MyConfig;
import com.liaoyb.configProject.config.MyProperties;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootApplicationTests {

	@Value("${name}")
	private String name;
	@Autowired
	private MyProperties myProperties;



	@Autowired
	private MyConfig myConfig;
	@Test
	public void contextLoads() {
		System.out.println("name:"+name);
		System.out.println(myConfig);
	}

}
