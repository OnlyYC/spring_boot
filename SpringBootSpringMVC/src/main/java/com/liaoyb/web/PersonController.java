package com.liaoyb.web;

import com.liaoyb.domain.Person;
import com.liaoyb.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.UUID;

/**
 * @author liaoyb
 */
@Controller
public class PersonController {
	@Autowired
	private PersonService personService;

	@RequestMapping("/findAllPerson")
	@ResponseBody
	public List<Person> findAllPerson(){
		return personService.findAll();
	}

	@RequestMapping("/addPerson")
	@ResponseBody
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


	@RequestMapping("/myTemplate")
	public String myTemplate(Map map){
		Person person=new Person();
		person.setId("007");
		person.setName("涛逼");
		person.setAge(22);
		map.put("person",person);

		//list
		map.put("persons",personService.findAll());
		return "temp_test";
	}

}
