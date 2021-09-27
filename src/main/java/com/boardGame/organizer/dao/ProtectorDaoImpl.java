package com.boardGame.organizer.dao;

import com.boardGame.organizer.model.Protector;
import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("protectorDao")
public class ProtectorDaoImpl extends AbstractDao<Integer, Protector> implements ProtectorDao {
    @Override
    public Protector findById(int id){
        Protector protector = findById(id);
        return protector;
    }
    @Override
    public void save (Protector protector){
        save(protector);
    }
    @Override
    public void delete (Protector protector){
        delete(protector);
    }
    @Override
    public void deleteById (int id){
        Protector protector = getByKey(id);
        delete(protector);
    }
    @Override
    public void persist (Protector protector){
        persist(protector);
    }

    @Override
    public List<Protector> findAllProtectors() {
        Criteria criteria = createEntityCriteria().addOrder(Order.asc("id"));
        criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);//To avoid duplicates.
        List<Protector> protectors = (List<Protector>) criteria.list();
        return protectors;
    }
}
