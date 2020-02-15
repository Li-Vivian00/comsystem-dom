package com.example.comsystem.controller.admin.rateManage;

import com.example.comsystem.entity.Rate;
import com.example.comsystem.service.RateManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping(value = "/api/rateManage")
@CrossOrigin
@RestController
public class rateController {
    @Autowired
    RateManageService rateManageService;

    @RequestMapping(value = "/getAllUserPoint", method = RequestMethod.GET)
    public List<Rate> getAllUserPoint() {
        List<Rate> result = rateManageService.getAllUserPoint();
        return result;
    }

    @RequestMapping(value = "/updateUserPoint", method = RequestMethod.POST)
    public String updateUserPoint(@RequestBody Rate rate) {
        String result = rateManageService.updateUserPoint(rate);
        return result;
    }
}
