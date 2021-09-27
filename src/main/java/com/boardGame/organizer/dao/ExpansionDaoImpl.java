package com.boardGame.organizer.dao;

import com.boardGame.organizer.model.Expansion;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("ExpansionDao")
public class ExpansionDaoImpl extends AbstractDao<Integer, Expansion> implements ExpansionDao {
    @Override
    public Expansion findById(int id) {
        Expansion expansion = findById(id);
        return expansion;
    }

    @Override
    public void save(Expansion expansion) {
        save(expansion);
    }

    @Override
    public void deleteById(int id) {
        deleteById(id);
    }

    @Override
    public List<Expansion> findAll() {
        return null;
    }
}
