package com.example.comsystem.controller.user;

import com.example.comsystem.entity.Bill;
import com.example.comsystem.service.BillManageService;
import com.example.comsystem.service.UserBillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(value = "/api/userBill")
public class UserBillController {
    @Autowired
    UserBillService userBillService;
    @Autowired
    BillManageService billManageService;

    //get user bill by item
    @RequestMapping(value = "/getUserBillByItem", method = RequestMethod.GET)
    public List<Bill> getUserBillByItem (@RequestParam(value = "item") String item, @RequestParam(value = "loginid") String loginid) {
        List<Bill> result = userBillService.getBillByItem(item, loginid);
        return result;
    }

    // update the user bill status
    @RequestMapping(value = "/changeUserBillStatus", method = RequestMethod.GET)
    public String updateUserBillStatus (@RequestParam(value = "id") String Id, @RequestParam(value = "date") String date) {
        String result = billManageService.updateUserBillStatus(Id, date);
        return result;
    }
}
