package com.example.comsystem.controller.admin.villaCenter;


import com.example.comsystem.entity.PhoneModule;
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
    @RequestMapping(value = "updatePhoneModuleInfo", method = RequestMethod.POST)
    public String updatePhoneModuleInfo(@RequestBody PhoneModule phoneModule) {
        System.out.println("---------" + phoneModule);
        String result = villaCenterService.updatePhoneModuleInfo(phoneModule);
        return result;
    }

}
