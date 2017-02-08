package com.liaoyb.service;

import com.liaoyb.domain.Person;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author liaoyb
 */
public interface PersonService {
	@Cacheable(value ="frequentCache" )
	List<Person>findAll();
	int addPerson(Person person);
}
