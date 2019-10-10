package com.example.comsystem.controller.user;

import com.example.comsystem.entity.RepairManage;
import com.example.comsystem.service.UserRepairService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/userRepair")
public class UserRepairController {
    @Autowired
    UserRepairService userRepairService

    //find user repair Info
    @RequestMapping(value = "/getUserRepairInfo", method = RequestMethod.GET)
    public List<RepairManage> getUserOpinionInfo(@RequestParam(value = "loginId") String loginId) {
        List<RepairManage> result = userRepairService.getUserOpinionInfo(loginId);
        return result;
    }
}
