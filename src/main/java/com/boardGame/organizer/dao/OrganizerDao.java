package com.boardGame.organizer.dao;

import com.boardGame.organizer.model.Organizer;

import java.util.List;

public interface OrganizerDao {
    Organizer findById(int id);
    void deleteById(int id);
    void delete(Organizer organizer);
    void save(Organizer organizer);
    void update(Organizer organizer);

    List<Organizer> findAllOrganizer();
}
