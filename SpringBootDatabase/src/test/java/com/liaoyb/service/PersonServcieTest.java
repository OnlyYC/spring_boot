/**
 * Copyright 2016 Iflytek, Inc. All rights reserved.
 */
package com.liaoyb.service;

import com.liaoyb.domain.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Random;

/**
 * <p>
 * <code>PersonServcieTest</code>
 * </p>
 *
 * @author ybliao2
 * @version 1.0
 * @since 1.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class PersonServcieTest {
	@Autowired
	private PersonService personService;

	@Test
	public void testfindAll(){
		List<Person>persons= personService.findAll();
		System.out.println("persons:"+persons);
	}

	@Test
	public void testAddPerson(){
		Random random=new Random();
		int randInt=random.nextInt(50);
		Person person=new Person();
		person.setName("hhhh"+randInt);
		person.setAge(randInt);
		int rowAffect=personService.addPerson(person);
		System.out.println("添加用户:"+person);
		currentAllPersons();
	}

	
	public void currentAllPersons(){
		List<Person>persons= personService.findAll();
		System.out.println("当前所有用户:"+persons);
	}
}
