package com.example.comsystem.service;

import com.example.comsystem.entity.Admin;

import java.util.List;

public interface AdminManageService {

    //find all user
    public List<Admin> getAllUserInfoService();

    // find user info by item
    public List<Admin>  searchByItem(String item, String name);

    // delete user
    public void deleteUser(String Id);

    // update user
    public String updateUser(Admin user);
}
