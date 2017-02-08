package com.liaoyb.service.impl;

import com.liaoyb.dao.PersonDao;
import com.liaoyb.domain.Person;
import com.liaoyb.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author liaoyb
 */
@Service("personService")
public class PersonServiceImpl implements PersonService {
	@Autowired
	private PersonDao personDao;

	@Override
	public List<Person> findAll() {
		return personDao.findAll();
	}

	@Override
	public int addPerson(Person person) {
		return personDao.add(person);
	}
}
