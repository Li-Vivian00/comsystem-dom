package com.example.comsystem.service;

import com.example.comsystem.entity.Bill;

import java.util.List;

public interface UserBillService {
    //get user bill by item
    List<Bill> getBillByItem(String item, String loginid);
}
