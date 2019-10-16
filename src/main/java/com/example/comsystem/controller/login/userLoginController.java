package com.example.comsystem.controller.login;

import com.example.comsystem.entity.UserInfo;
import com.example.comsystem.service.UserLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/api/userLogin")
public class userLoginController {
    @Autowired
    UserLoginService userLoginService;

    // user login
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String userLogin(@RequestBody UserInfo userInfo) {
        String result = userLoginService.userLoginService(userInfo);
        return result;
    }

    // user register
    @RequestMapping(value = "/addUser", method = RequestMethod.POST)
    public String userRegister(@RequestBody UserInfo userInfo) {
        String result = userLoginService.userRegisterService(userInfo);
        return result;
    }

    //  judge loginid
    @RequestMapping(value = "/getUserLoginid", method = RequestMethod.GET)
    public String judgeUserLoginId(@RequestParam(name = "loginId") String loginId) {
        String result = userLoginService.judgeUserLoginIdService(loginId);
        return result;
    }

    //  judge phone
    @RequestMapping(value = "/getUserPhone", method = RequestMethod.GET)
    public String judgeUserPhone(@RequestParam(name = "phone") String phone) {
        String result = userLoginService.judgeUserPhoneService(phone);
        return result;
    }

    // modify password
    @RequestMapping(value = "/modifyPassword", method = RequestMethod.POST)
    public String modifyPassword(@RequestBody UserInfo userInfo) {
        String result = userLoginService.modifyPassword(userInfo);
        return result;
    }
}
