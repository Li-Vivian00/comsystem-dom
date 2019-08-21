package com.example.comsystem.dao;

import com.example.comsystem.entity.AdminInfo;

import java.util.List;

public interface AdminDao {
    public List<AdminInfo> searchByItem(String item, String name);

}
