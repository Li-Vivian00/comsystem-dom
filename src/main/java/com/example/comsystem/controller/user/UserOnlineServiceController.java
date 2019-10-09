package com.example.comsystem.controller.user;

import com.example.comsystem.entity.OpinionManage;
import com.example.comsystem.service.UserCenterService;
import com.example.comsystem.service.UserOnlineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@CrossOrigin
@RequestMapping("/api/userOpinion")
public class UserOnlineServiceController {
    @Autowired
    UserOnlineService userOnlineService;

    //find user opinion Info
    @RequestMapping(value = "/getUserOpinionInfo", method = RequestMethod.GET)
    public List<OpinionManage> getUserOpinionInfo(@RequestParam(value = "loginId") String loginId) {
        List<OpinionManage> result = userOnlineService.getUserOpinionInfo(loginId);
        System.out.println(result);
        return result;
    }
}
