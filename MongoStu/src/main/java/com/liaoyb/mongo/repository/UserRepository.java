package com.liaoyb.mongo.repository;

import com.liaoyb.mongo.domain.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 * @author ybliao2
 */
@Repository
public interface UserRepository extends MongoRepository<User, String> {

	List<User> findByNameLike(String name);
	Page<User> findByNameLike(String name,Pageable pageable);
	User findById(String id);
}
