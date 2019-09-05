package com.example.comsystem.dao.impl;

import com.example.comsystem.dao.PhoneModuleDao;
import com.example.comsystem.entity.PhoneModule;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PhoneModuleDaoImpl implements PhoneModuleDao {
    @Override
    public List<PhoneModule> searchByItem(String item, String phone) {
        return null;
    }
}
