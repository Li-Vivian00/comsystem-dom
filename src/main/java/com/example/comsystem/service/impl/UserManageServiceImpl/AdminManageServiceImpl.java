package com.example.comsystem.service.impl.UserManageServiceImpl;


import com.example.comsystem.dao.AdminDao;
import com.example.comsystem.entity.AdminInfo;
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
    public List<AdminInfo> getAllUserInfoService() {
        try {
            return adminManageRepository.findAll();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // find user info by item
    @Override
    public List<AdminInfo> searchByItem(String item, String name) {
        List<AdminInfo> result = adminDao.searchByItem(item, name);
        return result;
    }

    // delete user
    @Override
    public void deleteUser(String Id) {
        List<AdminInfo> users = new ArrayList<>();
        String[] ids = StringUtil.analysisArrayStr(Id);
        for (String id : ids) {
            Integer idI = Integer.parseInt(id);
            AdminInfo user = new AdminInfo();
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
    public String updateUser(AdminInfo user) {
        try {
            AdminInfo result = adminManageRepository.save(user);
            return "success";
        } catch (Exception e) {
            e.printStackTrace();
            return "fail to update";
        }
    }
}
