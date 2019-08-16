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
    // userLogin
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String userLogin(@RequestBody User user) {
        String result =userService.userLoginService(user);
        return result;
    }

    // userRegister
    @RequestMapping(value = "/addUser",method = RequestMethod.POST)
    public String userRegister(@RequestBody User user) {
        String result =userService.userRegisterService(user);
        return result;
    }

    //  judge loginId
    @RequestMapping(value = "/getUser",method = RequestMethod.GET)
    public String judgeUserLoginId(@RequestParam(name = "loginId") String loginId) {
        String result =userService.judgeUserLoginIdService(loginId);
        return result;
    }

}
