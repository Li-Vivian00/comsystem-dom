package com.example.comsystem.controller.admin.villaCenter;


import com.example.comsystem.entity.PhoneModule;
import com.example.comsystem.entity.WarningModule;
import com.example.comsystem.service.VillaCenterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/villaCenter")
public class BoadrController {
    @Autowired
    VillaCenterService villaCenterService;

    // find all phone module
    @RequestMapping(value = "/getPhoneModule", method = RequestMethod.GET)
    public List<PhoneModule> getAllPhoneModuleInfo() {
        List<PhoneModule> result = villaCenterService.getAllPhoneModuleInfo();
        return result;
    }

    // update phone number by item
    @RequestMapping(value = "/updatePhoneModuleInfo", method = RequestMethod.POST)
    public String updatePhoneModuleInfo(@RequestBody PhoneModule phoneModule) {
        String result = villaCenterService.updatePhoneModuleInfo(phoneModule);
        return result;
    }

    // delete phone module
    @RequestMapping(value = "/deletePhoneModule", method = RequestMethod.POST)
    public void deletePhoneModule(@RequestBody String Id) {
        System.out.println(Id);
        villaCenterService.deletePhoneModule(Id);
    }

    //get one phone module
    @RequestMapping(value = "/getOnePhoneModule", method = RequestMethod.GET)
    public  List<PhoneModule> getOnePhoneModule(@RequestParam(value = "item") String item)
    {
        System.out.println(item);
        List<PhoneModule> result = villaCenterService.searchByItem(item);
        return result;
    }

    // find all warning module
    @RequestMapping(value = "/getWarningModuleInfo", method = RequestMethod.GET)
    public List<WarningModule> getWarningModuleInfo() {
        List<WarningModule> result = villaCenterService.getWarningModuleInfo();
        return result;
    }

    // update warning module
    @RequestMapping(value = "/updateWarningModuleInfo", method = RequestMethod.POST)
    public String updateWarningModuleInfo(@RequestBody WarningModule warningModule) {
        System.out.println("---------" + warningModule);
        String result = villaCenterService.updateWarningModuleInfo(warningModule);
        return result;
    }
}
