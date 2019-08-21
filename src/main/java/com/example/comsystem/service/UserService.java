package com.example.comsystem.service;

import com.example.comsystem.entity.UserInfo;

public interface UserService {

    // userLogin
    public String userLoginService(UserInfo userInfo);


//    public User searchUser(String loginId, String password);
//    public List<User> searchUser();

//    public User searchById(String i);

    // userRegister
    public String userRegisterService(UserInfo userInfo);

    // judge user loginid
    public String judgeUserLoginIdService(String loginId);

    // judge user phone
    public String judgeUserPhoneService(String phone);

    //modify password
    public String modifyPassword(UserInfo userInfo);
}
