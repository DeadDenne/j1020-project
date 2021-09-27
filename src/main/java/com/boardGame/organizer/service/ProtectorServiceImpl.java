package com.boardGame.organizer.service;

import com.boardGame.organizer.dao.ProtectorDao;
import com.boardGame.organizer.model.Protector;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("protectorService")
@Transactional
public class ProtectorServiceImpl implements ProtectorService {

    @Autowired
    ProtectorDao dao;


    @Override
    public Protector findById(int id) {
        return dao.findById(id);
    }

    @Override
    public List<Protector> findAll() {
        return dao.findAllProtectors();
    }
}
