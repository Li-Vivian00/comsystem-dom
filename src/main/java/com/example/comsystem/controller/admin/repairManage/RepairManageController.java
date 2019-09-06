package com.example.comsystem.controller.admin.repairManage;

import com.example.comsystem.entity.RepairManage;
import com.example.comsystem.service.RepairManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/repairManage")
public class RepairManageController {
    @Autowired
    RepairManageService repairManageService;

    //find all repair info
    @RequestMapping(value = "/getAllRepairInfo", method = RequestMethod.GET)
    public List<RepairManage> getAllRepairInfo() {
        List<RepairManage> result = repairManageService.getAllRepairInfo();
        return result;
    }

    //udpate repair info
    @RequestMapping(value = "/updateRepairInfo", method = RequestMethod.POST)
    public String updateRepairInfo(@RequestBody RepairManage repairManage) {
        String result = repairManageService.updateRepairInfo(repairManage);
        System.out.println(result);
        return result;
    }
}
