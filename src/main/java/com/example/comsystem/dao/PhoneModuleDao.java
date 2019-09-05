package com.example.comsystem.dao;

import com.example.comsystem.entity.PhoneModule;

import java.util.List;

public interface PhoneModuleDao {
    public List<PhoneModule> searchByItem(String item, String phone);

}
