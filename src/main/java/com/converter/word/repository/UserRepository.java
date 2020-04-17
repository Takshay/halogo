package com.converter.word.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.converter.word.model.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{

	public User findByKey(int key);
}
