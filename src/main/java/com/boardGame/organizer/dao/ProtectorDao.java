package com.boardGame.organizer.dao;

import com.boardGame.organizer.model.Protector;

import java.util.List;

public interface ProtectorDao {
    Protector findById(int id);
    void save (Protector protector);
    void delete (Protector protector);
    void deleteById (int id);
    void persist (Protector protector);
    List<Protector> findAllProtectors();
}
