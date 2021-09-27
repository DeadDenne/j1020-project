package com.boardGame.organizer.service;

import com.boardGame.organizer.model.Game;

import java.util.List;

public interface GameService {
    Game indById(int id);

    List<Game> findAll();
}
