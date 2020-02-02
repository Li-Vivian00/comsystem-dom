package com.example.comsystem.controller.admin.rateManage;

import com.example.comsystem.service.RateManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value = "/api/rateManage")
@CrossOrigin
@RestController
public class rateController {
    @Autowired
    RateManageService rateManageService;
}
