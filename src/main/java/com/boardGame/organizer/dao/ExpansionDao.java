package com.boardGame.organizer.dao;

import com.boardGame.organizer.model.Expansion;

import java.util.List;

public interface ExpansionDao {
    Expansion findById(int id);

    void save(Expansion expansion);

    void deleteById(int id);

    List<Expansion> findAll();

}
