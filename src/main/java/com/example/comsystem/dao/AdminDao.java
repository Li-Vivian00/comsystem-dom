package com.example.comsystem.dao;

import com.example.comsystem.entity.Admin;

import java.util.List;

public interface AdminDao {
    public List<Admin> searchByItem(String item, String name);

}
