package com.example.comsystem.service;

import com.example.comsystem.entity.AdminInfo;

import java.util.List;

public interface AdminManageService {

    //find all user
    public List<AdminInfo> getAllUserInfoService();

    // find user info by item
    public List<AdminInfo>  searchByItem(String item, String name);

    // delete user
    public void deleteUser(String Id);

    // update user
    public String updateUser(AdminInfo user);
}
