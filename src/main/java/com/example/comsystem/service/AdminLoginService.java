package com.example.comsystem.service;

import com.example.comsystem.entity.AdminInfo;

import java.util.List;

public interface AdminLoginService {

    // adminLogin
    public String adminLoginService(AdminInfo adminInfo);

    // judge user phone
    public String judgeUserPhoneService(String phone);

    //modify password
    public String modifyPassword(AdminInfo user);

    List<AdminInfo> getLoginAdminInfo(String adminLoginId);
}
