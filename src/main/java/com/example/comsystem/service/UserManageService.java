package com.example.comsystem.service;

import com.example.comsystem.entity.User;

import java.util.List;

public interface UserManageService {

    //find all user
    public List<User> getAllUserInfoService();

    // find user info by item
    public List<User>  searchByItem(String item, String name);

    // delete user
    public void deleteUser(String Id);

    // update user
    public String updateUser(User user);
}
