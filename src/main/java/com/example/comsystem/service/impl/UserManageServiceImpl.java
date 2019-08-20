package com.example.comsystem.service.impl;

import com.example.comsystem.dao.UserDao;
import com.example.comsystem.entity.User;
import com.example.comsystem.repository.admin.userManage.UserManageRepository;
import com.example.comsystem.repository.login.UserLoginRepository;
import com.example.comsystem.service.UserManageService;
import com.example.comsystem.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class UserManageServiceImpl implements UserManageService {

    @Autowired
    UserDao userDao;
    @Autowired
    UserManageRepository userManageRepository;

    // find all user
    @Override
    public List<User> getAllUserInfoService() {
        return userManageRepository.findAll();
    }

    // find user info by item
    @Override
    public List<User> searchByItem(String item, String name) {
        List<User> result = userDao.searchByItem(item, name);
        return result;
    }

    // delete user
    @Override
    public void deleteUser(String Id) {
        List<User> users = new ArrayList<>();
        String [] ids = StringUtil.analysisArrayStr(Id);
        for (String id : ids) {
            Integer idI = Integer.parseInt(id);
            User user = new User();
            user.setId(idI);
            users.add(user);
        }
        try {
            userManageRepository.deleteInBatch(users);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // update user
    @Override
    public String updateUser(User user) {
        try {
            User result = userManageRepository.save(user);
            return "success";
        } catch (Exception e) {
            e.printStackTrace();
            return "fail to update";
        }
    }
}

