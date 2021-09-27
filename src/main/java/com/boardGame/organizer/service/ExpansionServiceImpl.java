package com.boardGame.organizer.service;

import com.boardGame.organizer.dao.ExpansionDao;
import com.boardGame.organizer.model.Expansion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("expansionService")
@Transactional
public class ExpansionServiceImpl implements ExpansionService {
    @Autowired
    ExpansionDao dao;

    @Override
    public Expansion findById(int id) {
        return dao.findById(id);
    }

    @Override
    public List<Expansion> findAll() {
        List<Expansion> expansions = dao.findAll();
        return expansions;
    }
}
