package com.boardGame.organizer.service;

import com.boardGame.organizer.model.Expansion;

import java.util.List;

public interface ExpansionService {
    Expansion findById(int id);
    List<Expansion> findAll();
}
