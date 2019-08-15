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

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String userLogin(@RequestBody User user) {
        String result =userService.userLoginService(user);
        return result;
    }

}
