package com.example.comsystem.controller.login;

import com.example.comsystem.entity.Admin;
import com.example.comsystem.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class adminLoginController {
    @Autowired
    AdminService adminService;

    @RequestMapping(value = "/adminLogin/adminlogin",method = RequestMethod.POST)
    public String adminLogin(@RequestBody Admin admin) {
        String result =adminService.adminLoginService(admin);
        return result;
    }
}
