package com.example.comsystem.dao;

import com.example.comsystem.entity.AdminInfo;

import java.util.List;

public interface AdminDao {
    //find admin by item
    public List<AdminInfo> searchByItem(String item, String name);

}
