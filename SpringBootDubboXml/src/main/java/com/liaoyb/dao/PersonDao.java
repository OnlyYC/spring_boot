package com.liaoyb.dao;

import com.liaoyb.domain.Person;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author liaoyb
 */
@Repository
@Mapper
public interface PersonDao {
	List<Person> findAll();
	int add(Person person);
}
