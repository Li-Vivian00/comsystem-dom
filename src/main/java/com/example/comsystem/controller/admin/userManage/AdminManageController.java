package com.example.comsystem.controller.admin.userManage;


import com.example.comsystem.entity.Admin;
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
    AdminService adminService;

    // find all user
    @RequestMapping(value = "/getAdmin",method = RequestMethod.GET)
    public List<Admin> getAllAdminInfo() {
        List<Admin> result = adminService.getAllAdminInfoService();
        return result;
    }
}
