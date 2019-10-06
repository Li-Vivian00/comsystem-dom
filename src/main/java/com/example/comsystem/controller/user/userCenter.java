package com.example.comsystem.controller.user;

import com.example.comsystem.entity.UserInfo;
import com.example.comsystem.service.UserCenterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/user")
public class userCenter {
    @Autowired
    UserCenterService userCenterService;

    //get user baseInfo
    @RequestMapping(value = "/getUserCenterInfo", method = RequestMethod.GET)
    public List<UserInfo> getUserCenterInfo(@RequestParam(value = "loginId") String loginId) {
        List<UserInfo> result = userCenterService.getUserCenterInfo(loginId);
        return result;
    }
}
