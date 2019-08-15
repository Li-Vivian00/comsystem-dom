package com.example.comsystem.service.impl;

import com.example.comsystem.entity.Admin;
import com.example.comsystem.entity.User;
import com.example.comsystem.repository.AdminRepository;
import com.example.comsystem.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    AdminRepository adminRepository;

    @Override
    public String adminLoginService(Admin admin) {
        String loginid = admin.getLoginid();
        String password = admin.getPassword();
        List<Admin> listUser = adminRepository.findByAdminLoginid(loginid);
        Admin result = adminRepository.AdminLoginRep(loginid, password);
        if (listUser.size() < 0) {
            return "-1";
        }
        else if (result == null) {
            return "0";
        }
        else {
            return "success";
        }
    }

}
