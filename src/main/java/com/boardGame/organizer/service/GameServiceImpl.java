package com.boardGame.organizer.service;

import com.boardGame.organizer.dao.GameDao;
import com.boardGame.organizer.model.Game;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("gameService")
@Transactional
public class GameServiceImpl implements GameService{
    @Autowired
    GameDao dao;

    @Override
    public Game indById(int id) {
        return dao.findById(id);
    }

    @Override
    public List<Game> findAll() {
        return dao.findAllGame();
    }
}
