package com.converter.word.service;

import java.util.List;

import com.converter.word.model.User;

public interface UserService {

	public List<User> getUsers();

	public User save(User user);

	public User getUser(int key);
}
