package com.liaoyb.mongo.web;

import com.liaoyb.mongo.domain.User;
import com.liaoyb.mongo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author ybliao2
 */
@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	UserRepository userRepository;

	@RequestMapping("/findByName")
	public List<User>findByName(String name){
		return userRepository.findByNameLike(name);
	}



	@RequestMapping("/addUser")
	public User addUser(User user){
		return userRepository.save(user);
	}

	@RequestMapping("/findAll")
	public List<User>findAll(){
		return userRepository.findAll();
	}
}
