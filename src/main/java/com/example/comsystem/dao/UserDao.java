package com.example.comsystem.dao;


import com.example.comsystem.entity.User;

import java.util.List;

public interface UserDao {
    public List<User> searchByName(String item, String name);
}
