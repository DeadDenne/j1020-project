package com.boardGame.organizer.dao;

import com.boardGame.organizer.model.Organizer;
import org.hibernate.Criteria;
import org.hibernate.criterion.Order;

import java.util.List;

public class OrganizerDaoImpl extends AbstractDao<Integer, Organizer> implements OrganizerDao {
    @Override
    public Organizer findById(int id) {
        Organizer organizer = findById(id);
        return organizer;
    }

    @Override
    public void deleteById(int id) {
        Organizer organizer = getByKey(id);
        delete(organizer);
    }

    @Override
    public void save(Organizer organizer) {
        save(organizer);
    }

    @Override
    public List<Organizer> findAllOrganizer() {
        Criteria criteria = createEntityCriteria().addOrder(Order.asc("id"));
        criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
        List<Organizer> organizers = (List<Organizer>) (criteria.list());
        return organizers;
    }
}
