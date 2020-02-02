package com.example.comsystem.controller.user;

import com.example.comsystem.entity.OpinionManage;
import com.example.comsystem.entity.Rate;
import com.example.comsystem.service.impl.UserServiceImpl.UserHandlePoint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(value = "/api/userPoint")
public class HandlePointController {
    @Autowired
    UserHandlePoint userHandlePoint;

    //submitPoint
    @RequestMapping(value = "/handlePoint", method = RequestMethod.POST)
    public String handlePoint(@RequestBody Rate rate) {
        String result = userHandlePoint.hanlePoint(rate);
        return result;
    }

    //findPointByLoginid
    @RequestMapping(value = "/getUserPoint", method = RequestMethod.GET)
    public List<Rate> getUserPoint(@RequestParam(value = "loginId") String loginId) {
        List<Rate> result = userHandlePoint.getUserPoint(loginId);
        return result;
    }
}
