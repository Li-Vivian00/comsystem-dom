package com.example.comsystem.dao.impl;

import com.example.comsystem.dao.UserDao;
import com.example.comsystem.entity.UserInfo;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository

public class UserDaoImpl implements UserDao {
    @PersistenceContext
    private EntityManager em;

    @Override
    public List<UserInfo> searchByItem(String item, String name) {
        String sql = "select * from userinfo where " + item + " = '" + name + "'";
        Query query = em.createNativeQuery(sql, UserInfo.class);
        return query.getResultList();
    }

}
