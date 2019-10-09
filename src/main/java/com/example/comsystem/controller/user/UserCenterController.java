package com.example.comsystem.controller.user;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.example.comsystem.entity.UserInfo;
import com.example.comsystem.service.UserCenterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/user")
public class UserCenterController {
    @Autowired
    UserCenterService userCenterService;

    //get user baseInfo
    @RequestMapping(value = "/getUserCenterInfo", method = RequestMethod.GET)
    public List<UserInfo> getUserCenterInfo(@RequestParam(value = "loginId") String loginId) {
        List<UserInfo> result = userCenterService.getUserCenterInfo(loginId);
        return result;
    }

    //user modifyPass
    @RequestMapping(value = "/userModifyPassword", method = RequestMethod.GET)
    public String userModifyPassword(@RequestParam(value = "newPassword") String newPass, @RequestParam(value = "loginId") String loginid) {
        String result = userCenterService.userModifyPassword(loginid, newPass);
        return result;
    }
}
