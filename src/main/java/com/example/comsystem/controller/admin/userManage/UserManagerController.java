package com.example.comsystem.controller.admin.userManage;


import com.example.comsystem.entity.User;
import com.example.comsystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/userManage")
public class UserManagerController {
    @Autowired
    UserService userService;

    // find all user
    @RequestMapping(value = "/getUser", method = RequestMethod.GET)
    public List<User> getAllUserInfo() {
        List<User> result = userService.getAllAdminInfoService();
        return result;
    }

    // delete user by id
    @RequestMapping(value = "/deleteUser", method = RequestMethod.POST)
    public  void deleteUser(@RequestBody List<User> Id) {
        System.out.println(Id);
        userService.deleteUser(Id);
    }
}
