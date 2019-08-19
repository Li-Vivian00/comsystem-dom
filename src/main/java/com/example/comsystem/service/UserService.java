package com.example.comsystem.service;

import com.example.comsystem.entity.User;

import java.util.List;

public interface UserService {

    //find all user
    public List<User> getAllUserInfoService();

//    public User searchUser(String loginId, String password);
//    public List<User> searchUser();

    public User searchById(String i);

    public List<User>  searchByName(String item, String name);

    // userLogin
    public String userLoginService(User user);

    // userRegister
    public String userRegisterService(User user);

    // judgeUserLoginid
    public String judgeUserLoginIdService(String loginId);

    // delete user
    public void deleteUser(String Id);

    // update user
    public String updateUser(User user);
}
