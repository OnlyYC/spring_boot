package com.liaoyb.mongo;

import com.liaoyb.mongo.domain.User;
import com.liaoyb.mongo.repository.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author ybliao2
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserRepositoryTest {
	@Autowired
	private UserRepository userRepositoryp;

	@Test
	public void testFindByNamePage(){
		int page=1;
		int rows=10;
		PageRequest pageRequest=new PageRequest(page-1,rows);

		String name="涛";
		Page<User> userPage=userRepositoryp.findByNameLike(name,pageRequest);
	}
}
