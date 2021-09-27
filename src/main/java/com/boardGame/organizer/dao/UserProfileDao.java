package com.boardGame.organizer.dao;

import com.boardGame.organizer.model.UserProfile;

import java.util.List;



public interface UserProfileDao {

	List<UserProfile> findAll();
	
	UserProfile findByType(String type);
	
	UserProfile findById(int id);
}
