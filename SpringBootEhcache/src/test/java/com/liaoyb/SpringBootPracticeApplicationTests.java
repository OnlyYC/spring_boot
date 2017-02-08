package com.liaoyb;

import com.liaoyb.service.PersonService;
import org.hibernate.validator.constraints.CreditCardNumber;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootPracticeApplicationTests {

	@Autowired
	private PersonService personService;
	@Test
	public void contextLoads() {
	}

	@Test
	public void testFindAll(){
		System.out.println("第一次查询："+personService.findAll());
		System.out.println("第二次查询："+personService.findAll());
	}

}
