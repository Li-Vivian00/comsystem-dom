package com.example.comsystem.service;

import com.example.comsystem.entity.User;

import java.util.List;

public interface UserService {
//    public User searchUser(String loginId, String password);
    public List<User> searchUser();
    public User searchById(String i);
    public List<User>  searchByName(String item, String name);

    public String userLoginService(User user);
}
