package com.example.comsystem.controller.admin.userManage;


import com.example.comsystem.entity.Admin;
import com.example.comsystem.entity.User;
import com.example.comsystem.service.AdminManageService;
import com.example.comsystem.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("/api/adminManage")
public class AdminManageController {
    @Autowired
    AdminManageService adminManageService;

    // find all user
    @RequestMapping(value = "/getAdmin",method = RequestMethod.GET)
    public List<Admin> getAllAdminInfo() {
        List<Admin> result = adminManageService.getAllUserInfoService();
        return result;
    }

    // delete user by id
    @RequestMapping(value = "/deleteAdmin", method = RequestMethod.POST)
    public  void deleteUser(@RequestBody String Id) {
        System.out.println(Id);
        adminManageService.deleteUser(Id);
    }

    // update user
    @RequestMapping(value = "/updateAdmin", method = RequestMethod.POST)
    public  String deleteUser(@RequestBody Admin user) {
        String result = adminManageService.updateUser(user);
        return result;
    }

    //find user info by item
    @RequestMapping(value = "/getOneAdmin", method = RequestMethod.GET)
    public  List<Admin> getOneUser(@RequestParam(value = "item") String item, @RequestParam(value = "name") String name) {
        List<Admin> result = adminManageService.searchByItem(item, name);
        return result;
    }
}
