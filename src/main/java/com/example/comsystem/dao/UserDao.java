package com.example.comsystem.dao;


import com.example.comsystem.entity.User;

import java.util.List;

public interface UserDao {
    public List<User> searchByItem(String item, String name);

}
