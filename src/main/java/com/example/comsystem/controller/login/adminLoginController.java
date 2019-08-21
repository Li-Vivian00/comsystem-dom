package com.example.comsystem.controller.login;

import com.example.comsystem.entity.AdminInfo;
import com.example.comsystem.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/api/adminLogin")
public class adminLoginController {
    @Autowired
    AdminService adminService;

    //admin login
    @RequestMapping(value = "/adminlogin",method = RequestMethod.POST)
    public String adminLogin(@RequestBody AdminInfo adminInfo) {
        String result =adminService.adminLoginService(adminInfo);
        return result;
    }

    //  judge phone
    @RequestMapping(value = "/getAdminPhone",method = RequestMethod.GET)
    public String judgeUserPhone(@RequestParam(name = "phone") String phone) {
        String result =adminService.judgeUserPhoneService(phone);
        return result;
    }
    // modify password
    @RequestMapping(value = "/modifyPassword", method = RequestMethod.POST)
    public String modifyPassword(@RequestBody AdminInfo user) {
        String result = adminService.modifyPassword(user);
        return result;
    }
}
