package com.boardGame.organizer.dao;

import com.boardGame.organizer.model.Game;

import java.util.List;

public interface GameDao {
    Game findById(int id);

    void deleteById(int id);

    void save(Game game);

    List<Game> findAllGame();

}
