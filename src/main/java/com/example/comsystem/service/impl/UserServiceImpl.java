package com.example.comsystem.service.impl;

import com.example.comsystem.dao.UserDao;
import com.example.comsystem.entity.Admin;
import com.example.comsystem.entity.User;
import com.example.comsystem.repository.admin.userManage.UserManageRepository;
import com.example.comsystem.repository.login.UserLoginRepository;
import com.example.comsystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserLoginRepository userLoginRepository;
    @Autowired
    UserDao userDao;
    @Autowired
    UserManageRepository userManageRepository;
    // find all user
    @Override
    public List<User> getAllAdminInfoService() {
        return userLoginRepository.findAll();
    }

    // get one user by loginid
    @Override
    public User searchById(String i) {
        Optional<User> result = userLoginRepository.findById(i);
        return result.get();
    }

    // get one user by item
    @Override
    public List<User> searchByName(String item, String name) {

        return userDao.searchByName(item, name);
    }

    // user login
    @Override
    public String userLoginService(User user) {
        String loginid = user.getLoginid();
        String password = user.getPassword();
        List<User> listUser = userLoginRepository.findByUserLoginid(loginid);
        User result = userLoginRepository.userLoginRep(loginid, password);
        if (listUser.size() <= 0) {
            return "loginid not exist";
        } else if (result == null) {
            return "password not correct";
        } else {
            return "success";
        }
    }

    // user register save user
    @Override
    public String userRegisterService(User user) {
        System.out.println(user);
        try {
            User result = userLoginRepository.save(user);
            return "success";
        } catch (Exception e) {
            e.printStackTrace();
            return "fail to register";
        }
    }

    // judge user login whether exist
    @Override
    public String judgeUserLoginIdService(String loginId) {
        try {
            List<User> listUser = userLoginRepository.findByUserLoginid(loginId);
            if (listUser.size() > 0) {
                return "fail to register";
            }
            return "success";
        } catch (Exception e) {
            e.printStackTrace();
            return "fail to register";
        }
    }

    @Override
    public void deleteUser(List<User> Id) {
        try {
            userManageRepository.deleteInBatch(Id);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
