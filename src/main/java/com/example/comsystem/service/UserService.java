package com.example.comsystem.service;

import com.example.comsystem.entity.User;

import java.util.List;

public interface UserService {

    // userLogin
    public String userLoginService(User user);


//    public User searchUser(String loginId, String password);
//    public List<User> searchUser();

//    public User searchById(String i);

    // userRegister
    public String userRegisterService(User user);

    // judge user loginid
    public String judgeUserLoginIdService(String loginId);

    // judge user phone
    public String judgeUserPhoneService(String phone);

    //modify password
    public String modifyPassword(User user);
}
