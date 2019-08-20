package com.example.comsystem.service.impl;

import com.alibaba.fastjson.JSONArray;
import com.example.comsystem.dao.UserDao;
import com.example.comsystem.entity.Admin;
import com.example.comsystem.entity.User;
import com.example.comsystem.repository.admin.userManage.UserManageRepository;
import com.example.comsystem.repository.login.UserLoginRepository;
import com.example.comsystem.service.UserService;
import com.example.comsystem.util.StringUtil;
import com.mysql.cj.xdevapi.JsonArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserLoginRepository userLoginRepository;

    // get one user by loginid
//    @Override
//    public User searchById(String i) {
//        Optional<User> result = userLoginRepository.findById(i);
//        return result.get();
//    }


    // user login
    @Override
    public String userLoginService(User user) {
        String loginid = user.getLoginid();
        String password = user.getPassword();
        List<User> listUser = userLoginRepository.findByUserLoginid(loginid);
        User result = userLoginRepository.userLogin(loginid, password);
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
        try {
            User result = userLoginRepository.save(user);
            return "success";
        } catch (Exception e) {
            e.printStackTrace();
            return "fail to register";
        }
    }

    // judge user loginid whether exist
    @Override
    public String judgeUserLoginIdService(String loginId) {
        try {
            List<User> listUser = userLoginRepository.findByUserLoginid(loginId);
            if (listUser.size() > 0) {
                return "loginid is exist";
            }
            return "success";
        } catch (Exception e) {
            e.printStackTrace();
            return "loginid is exist";
        }
    }

    // judge user phone whether exist
    @Override
    public String judgeUserPhoneService(String phone) {
        try {
            List<User> listUser = userLoginRepository.findByUserPhone(phone);
            if (listUser.size() > 0) {
                return "phone is exist";
            }
            return "phone not exist";
        } catch (Exception e) {
            e.printStackTrace();
            return "phone is exist";
        }
    }

    //    //modify password
    @Override
    public String modifyPassword(User user) {
        try {
            String phone = user.getPhone();
            String password = user.getPassword();
            Integer result = userLoginRepository.userModifyPassword(password, phone);
            if (result == null || result == 0) {
                return "fail to update password";
            }
            return "success";
        } catch (Exception e) {
            e.printStackTrace();
            return "success";
        }
    }

}
