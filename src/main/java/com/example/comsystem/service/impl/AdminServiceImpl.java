package com.example.comsystem.service.impl;

import com.example.comsystem.entity.Admin;
import com.example.comsystem.repository.admin.userManage.AdminManageRepository;
import com.example.comsystem.repository.admin.userManage.UserManageRepository;
import com.example.comsystem.repository.login.AdminLoginRepository;
import com.example.comsystem.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    AdminLoginRepository adminLoginRepository;
    @Autowired
    AdminManageRepository adminManageRepository;
    // admin login
    @Override
    public String adminLoginService(Admin admin) {
        String loginid = admin.getLoginid();
        String password = admin.getPassword();
        List<Admin> listUser = adminLoginRepository.findByAdminLoginid(loginid);
        Admin result = adminLoginRepository.AdminLoginRep(loginid, password);
        if (listUser.size() <= 0) {
            return "loginid not exist";
        }
        else if (result == null) {
            return "password not correct";
        }
        else {
            return "success";
        }
    }


    // find all admin
    @Override
    public List<Admin> getAllAdminInfoService() {
        return adminManageRepository.findAll();
    }

}
