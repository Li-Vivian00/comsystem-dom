package com.example.comsystem.service;

import com.example.comsystem.entity.UserInfo;

import java.util.List;

public interface UserManageService {

    // find all user
    public List<UserInfo> getAllUserInfo();

    // find user info by item
    public List<UserInfo>  searchByItem(String item, String name);

    // delete user
    public void deleteUser(String Id);

    // update user and add user
    public String updateUser(UserInfo userInfo);

}
