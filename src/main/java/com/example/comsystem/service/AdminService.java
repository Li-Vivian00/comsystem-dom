package com.example.comsystem.service;

import com.example.comsystem.entity.Admin;

import java.util.List;

public interface AdminService {
    String adminLoginService(Admin admin);

    // find all admin
    List<Admin> getAllAdminInfoService();
}
