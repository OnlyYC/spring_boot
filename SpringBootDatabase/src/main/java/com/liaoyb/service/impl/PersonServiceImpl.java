/**
 * Copyright 2016 Iflytek, Inc. All rights reserved.
 */
package com.liaoyb.service.impl;

import com.liaoyb.domain.Person;
import com.liaoyb.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * <p>
 * <code>PersonServiceImpl</code>
 * </p>
 *
 * @author ybliao2
 * @version 1.0
 * @since 1.0
 */
@Service
public class PersonServiceImpl implements PersonService {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Override
	public List<Person> findAll() {
		//queryForList这种反射类型的是将每一个数据列返回为T类型，故出错
		//只支持Integer.class String.class 这种单数据类型的
		//不支持自己定义复杂类型的Bean实体。因此可以返回单列的
//		return jdbcTemplate.queryForList("SELECT * FROM person",Person.class);
		String sql="SELECT * FROM person";
		return jdbcTemplate.query(sql, new RowMapper<Person>() {
					@Override
					public Person mapRow(ResultSet rs, int rowNum) throws SQLException {
						Person person=new Person();
						person.setId(rs.getInt("id"));
						person.setName(rs.getString("name"));
						person.setAge(rs.getInt("age"));
						return person;
					}
				}
		);
	}

	@Override
	public int addPerson(Person person) {
		return jdbcTemplate.update("INSERT INTO person(name,age) VALUES (?,?)",person.getName(),person.getAge());
	}
}
