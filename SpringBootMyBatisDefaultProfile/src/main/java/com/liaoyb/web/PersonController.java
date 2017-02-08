package com.liaoyb.web;

import com.liaoyb.domain.Person;
import com.liaoyb.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Random;
import java.util.UUID;

/**
 * @author liaoyb
 */
@RestController
public class PersonController {
	@Autowired
	private PersonService personService;

	@RequestMapping("/findAllPerson")
	public List<Person> findAllPerson(){
		return personService.findAll();
	}

	@RequestMapping("/addPerson")
	public Person addPerson(){
		Person person=new Person();
		Random random=new Random();
		int randInt=random.nextInt(30);
		person.setId(UUID.randomUUID().toString());
		person.setName("gg"+randInt);
		person.setAge(randInt);
		personService.addPerson(person);
		return person;
	}
}
