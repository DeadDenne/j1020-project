package com.boardGame.organizer.service;

import com.boardGame.organizer.model.Protector;

import java.util.List;

public interface ProtectorService {

    Protector findById(int id);

    List<Protector> findAll();
}
