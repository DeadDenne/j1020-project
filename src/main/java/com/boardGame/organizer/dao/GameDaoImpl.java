package com.boardGame.organizer.dao;

import com.boardGame.organizer.model.Game;
import com.boardGame.organizer.model.Organizer;
import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("GameDao")
public class GameDaoImpl extends AbstractDao<Integer, Game> implements GameDao{
    @Override
    public Game findById(int id) {
        Game game = findById(id);
        return game;
    }

    @Override
    public void deleteById(int id) {
        deleteById(id);
    }

    @Override
    public void save(Game game) {
        save(game);
    }

    @Override
    public List<Game> findAllGame() {
        Criteria criteria = createEntityCriteria().addOrder(Order.asc("id"));
        criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
        List<Game> games = (List<Game>) (criteria.list());
        return games;
    }

}
