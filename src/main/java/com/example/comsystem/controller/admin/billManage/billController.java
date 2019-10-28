package com.example.comsystem.controller.admin.billManage;

import com.example.comsystem.entity.Bill;
import com.example.comsystem.service.BillManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping(value = "/api/billManage")
@CrossOrigin
@RestController
public class billController {
    @Autowired
    BillManageService billManageService;

    //get all bill
    @RequestMapping(value = "/getAllBill", method = RequestMethod.GET)
    public List<Bill> getAllBill() {
        List<Bill> result = billManageService.getAllBill();
        return result;
    }
}
