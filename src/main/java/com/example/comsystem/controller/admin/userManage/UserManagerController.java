package com.example.comsystem.controller.admin.userManage;


import com.example.comsystem.entity.User;
import com.example.comsystem.service.UserManageService;
import com.example.comsystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/userManage")
public class UserManagerController {
    @Autowired
    UserManageService userManageService;

    // find all user
    @RequestMapping(value = "/getUser", method = RequestMethod.GET)
    public List<User> getAllUserInfo() {
        List<User> result = userManageService.getAllUserInfoService();
        return result;
    }

    // delete user by id
    @RequestMapping(value = "/deleteUser", method = RequestMethod.POST)
    public  void deleteUser(@RequestBody String Id) {
        System.out.println(Id);
        userManageService.deleteUser(Id);
    }

    // update user
    @RequestMapping(value = "/updateUser", method = RequestMethod.POST)
    public  String deleteUser(@RequestBody User user) {
        System.out.println(user);
        String result = userManageService.updateUser(user);
        return result;
    }

    //get one user info
    @RequestMapping(value = "/getOneUser", method = RequestMethod.GET)
    public  List<User> getOneUser(@RequestParam(value = "item") String item, @RequestParam(value = "name") String name) {
        List<User> result = userManageService.searchByItem(item, name);
        return result;
    }

}
