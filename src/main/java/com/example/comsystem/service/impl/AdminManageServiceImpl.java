package com.example.comsystem.service.impl;


import com.example.comsystem.dao.AdminDao;
import com.example.comsystem.dao.UserDao;
import com.example.comsystem.entity.Admin;
import com.example.comsystem.repository.admin.userManage.AdminManageRepository;
import com.example.comsystem.service.AdminManageService;
import com.example.comsystem.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AdminManageServiceImpl implements AdminManageService {
    @Autowired
    AdminDao adminDao;
    @Autowired
    AdminManageRepository adminManageRepository;

    // find all user
    @Override
    public List<Admin> getAllUserInfoService() {
        return adminManageRepository.findAll();
    }

    // find user info by item
    @Override
    public List<Admin> searchByItem(String item, String name) {
        List<Admin> result = adminDao.searchByItem(item, name);
        return result;
    }

    // delete user
    @Override
    public void deleteUser(String Id) {
        List<Admin> users = new ArrayList<>();
        String [] ids = StringUtil.analysisArrayStr(Id);
        for (String id : ids) {
            Integer idI = Integer.parseInt(id);
            Admin user = new Admin();
            user.setId(idI);
            users.add(user);
        }
        try {
            adminManageRepository.deleteInBatch(users);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // update user
    @Override
    public String updateUser(Admin user) {
        try {
            Admin result = adminManageRepository.save(user);
            return "success";
        } catch (Exception e) {
            e.printStackTrace();
            return "fail to update";
        }
    }
}
