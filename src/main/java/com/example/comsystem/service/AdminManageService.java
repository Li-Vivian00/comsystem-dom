package com.example.comsystem.service;

import com.example.comsystem.entity.AdminInfo;

import java.util.List;

public interface AdminManageService {

    //find all user
    List<AdminInfo> getAllUserInfoService();

    // find user info by item
    List<AdminInfo>  searchByItem(String item, String name);

    // delete user
    void deleteUser(String Id);

    // update user
    String updateUser(AdminInfo user);
}
