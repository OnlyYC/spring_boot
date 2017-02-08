package com.liaoyb.service;

import com.liaoyb.domain.Person;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author liaoyb
 */
public interface PersonService {
	List<Person>findAll();
	int addPerson(Person person);
}
