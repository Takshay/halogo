package com.converter.word.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.converter.word.model.User;
import com.converter.word.repository.UserRepository;
import com.converter.word.util.CurrencyToWord;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserRepository userRepository;
	
	@Override
	public List<User> getUsers() {
		return userRepository.findAll();
	}

	@Override
	public User save(User user) {
		user.setCurrencyInWords(CurrencyToWord.convert(user.getCurrency()));
		return userRepository.save(user);
	}

	@Override
	public User getUser(int key) {
		return userRepository.findByKey(key);
	}

}
