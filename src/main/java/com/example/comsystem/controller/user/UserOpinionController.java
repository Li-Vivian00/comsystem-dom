package com.example.comsystem.controller.user;

import com.example.comsystem.entity.OpinionManage;
import com.example.comsystem.service.UserOpinionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/userOpinion")
public class UserOpinionController {
    @Autowired
    UserOpinionService userOpinionService;

    //find user opinion Info
    @RequestMapping(value = "/getUserOpinionInfo", method = RequestMethod.GET)
    public List<OpinionManage> getUserOpinionInfo(@RequestParam(value = "loginId") String loginId) {
        List<OpinionManage> result = userOpinionService.getUserOpinionInfo(loginId);
        return result;
    }

    //submitOpinion
    @RequestMapping(value = "/submitOpinion", method = RequestMethod.POST)
    public String submitOpinion(@RequestBody OpinionManage opinionManage) {
        String result = userOpinionService.submitOpinion(opinionManage);
        return result;
    }
}
