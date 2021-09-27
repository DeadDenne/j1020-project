package com.boardGame.organizer.dao;


import com.boardGame.organizer.model.User;

import java.util.List;


public interface UserDao {

    User findById(int id);

    void save(User user);

    List<User> findAllUsers();

}

