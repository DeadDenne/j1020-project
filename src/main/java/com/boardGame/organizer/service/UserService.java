package com.boardGame.organizer.service;

import com.boardGame.organizer.model.User;

import java.util.List;


public interface UserService {
	
	User findById(int id);
	List<User> findAllUsers();
	void saveUser(User user);
}