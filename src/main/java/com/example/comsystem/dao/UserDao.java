package com.example.comsystem.dao;


import com.example.comsystem.entity.UserInfo;

import java.util.List;

public interface UserDao {
    public List<UserInfo> searchByItem(String item, String name);

}
