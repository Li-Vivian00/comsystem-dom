package com.example.comsystem.controller.login;

import com.example.comsystem.entity.User;
import com.example.comsystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/api/userLogin")
public class userLoginController {
    @Autowired
    UserService userService;

    // user login
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String userLogin(@RequestBody User user) {
        String result =userService.userLoginService(user);
        return result;
    }

    // user register
    @RequestMapping(value = "/addUser",method = RequestMethod.POST)
    public String userRegister(@RequestBody User user) {
        String result =userService.userRegisterService(user);
        return result;
    }

    //  judge loginid
    @RequestMapping(value = "/getUserLoginid",method = RequestMethod.GET)
    public String judgeUserLoginId(@RequestParam(name = "loginId") String loginId) {
        String result =userService.judgeUserLoginIdService(loginId);
        return result;
    }

    //  judge phone
    @RequestMapping(value = "/getUserPhone",method = RequestMethod.GET)
    public String judgeUserPhone(@RequestParam(name = "phone") String phone) {
        String result =userService.judgeUserPhoneService(phone);
        return result;
    }

    // modify password
    @RequestMapping(value = "/modifyPassword", method = RequestMethod.POST)
    public String modifyPassword(@RequestBody User user) {
        String result = userService.modifyPassword(user);
        return result;
    }
}
