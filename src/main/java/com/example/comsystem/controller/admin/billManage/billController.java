package com.example.comsystem.controller.admin.billManage;

import com.example.comsystem.entity.Bill;
import com.example.comsystem.service.BillManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    //get bill by item
    @RequestMapping(value = "/getBillByItem", method = RequestMethod.GET)
    public List<Bill> getBillByItem(@RequestParam(value = "value") String item) {
        List<Bill> result = billManageService.getBillByItem(item);
        return result;
    }
    //get bill by loginid
    @RequestMapping(value = "/getBillByloginId", method = RequestMethod.GET)
    public List<Bill> getBillByloginId(@RequestParam(value = "loginid") String loginid) {
        List<Bill> result = billManageService.getBillByloginId(loginid);
        return result;
    }
    //add bill
    @RequestMapping(value = "/addBill", method = RequestMethod.POST)
    public String addBill(@RequestBody Bill bill) {
        String result = billManageService.addBill(bill);
        return result;
    }

    //delete bill
    @RequestMapping(value = "/deleteBill", method = RequestMethod.POST)
    public String deleteBill(@RequestParam(value = "id") String Id) {
        String result = billManageService.deleteBill(Id);
        return result;
    }
}
