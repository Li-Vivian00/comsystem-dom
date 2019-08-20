package com.example.comsystem.dao.impl;

import com.example.comsystem.dao.AdminDao;
import com.example.comsystem.entity.Admin;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
public class AdminDaoImpl implements AdminDao {
    @PersistenceContext
    private EntityManager em;

    @Override
    public List<Admin> searchByItem(String item, String name) {
        String sql = "select * from admininfo where " + item + " = '" + name + "'";
        Query query = em.createNativeQuery(sql, Admin.class);
        return query.getResultList();
    }
}
