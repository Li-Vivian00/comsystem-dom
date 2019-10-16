package com.example.comsystem.controller.login;

import com.example.comsystem.entity.AdminInfo;
import com.example.comsystem.service.AdminLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/adminLogin")
public class adminLoginController {
    @Autowired
    AdminLoginService adminLoginService;

    //admin login
    @RequestMapping(value = "/adminlogin", method = RequestMethod.POST)
    public String adminLogin(@RequestBody AdminInfo adminInfo) {
        String result = adminLoginService.adminLoginService(adminInfo);
        return result;
    }

    // get admin info to show admincenter
    @RequestMapping(value = "/getAdminInfo", method = RequestMethod.GET)
    public List<AdminInfo> getLoginAdminInfo(@RequestParam(name = "adminLoginId") String adminLoginId) {
        List<AdminInfo> result = adminLoginService.getLoginAdminInfo(adminLoginId);
        return result;
    }

    //  judge loginid
    @RequestMapping(value = "/getAdminLoginid", method = RequestMethod.GET)
    public String judgeAdminLoginId(@RequestParam(name = "loginId") String loginId) {
        String result = adminLoginService.judgeAdminLoginId(loginId);
        return result;
    }

    //  judge phone
    @RequestMapping(value = "/getAdminPhone", method = RequestMethod.GET)
    public String judgeUserPhone(@RequestParam(name = "phone") String phone) {
        String result = adminLoginService.judgeUserPhoneService(phone);
        return result;
    }

    // modify password
    @RequestMapping(value = "/modifyPassword", method = RequestMethod.POST)
    public String modifyPassword(@RequestBody AdminInfo user) {
        String result = adminLoginService.modifyPassword(user);
        return result;
    }
}
