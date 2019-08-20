package com.example.comsystem.service;

import com.example.comsystem.entity.Admin;

import java.util.List;

public interface AdminService {

    // adminLogin
    public String adminLoginService(Admin admin);

    // judge user phone
    public String judgeUserPhoneService(String phone);

    //modify password
    public String modifyPassword(Admin user);

}
