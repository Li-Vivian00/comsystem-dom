package com.example.comsystem.controller.admin.repairManage;

import com.example.comsystem.entity.OpinionManage;
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

    //update repair info
    @RequestMapping(value = "/updateRepairInfo", method = RequestMethod.POST)
    public String updateRepairInfo(@RequestBody RepairManage repairManage) {
        System.out.println(repairManage);
        String result = repairManageService.updateRepairInfo(repairManage);
        return result;
    }

    //find repair info by item
    @RequestMapping(value = "/getRepairInfoByItem", method = RequestMethod.GET)
    public List<RepairManage> getRepairInfoByItem(@RequestParam (value = "item")  String item) {
        List<RepairManage> result = repairManageService.getRepairInfoByItem(item);
        return result;
    }

    //find all opinion info
    @RequestMapping(value = "/getAllOpinionInfo", method = RequestMethod.GET)
    public List<OpinionManage> getAllOpinionInfo() {
        List<OpinionManage> result = repairManageService.getAllOpinionInfo();
        return result;
    }

    //update opinion info
    @RequestMapping(value = "/updateOpinionInfo", method = RequestMethod.POST)
    public String updateOpinionInfo(@RequestBody OpinionManage opinionManage) {
        String result = repairManageService.updateOpinionInfo(opinionManage);
        return result;
    }

    //find opinion info by item
    @RequestMapping(value = "/getOpinionInfoByItem", method = RequestMethod.GET)
    public List<OpinionManage> getOpinionInfoByItem(@RequestParam (value = "item")  String item) {
        List<OpinionManage> result = repairManageService.getOpinionInfoByItem(item);
        return result;
    }
}
