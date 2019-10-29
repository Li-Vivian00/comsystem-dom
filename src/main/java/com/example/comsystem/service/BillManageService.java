package com.example.comsystem.service;

import com.example.comsystem.entity.Bill;

import java.util.List;

public interface BillManageService {
    List<Bill> getAllBill();

    List<Bill> getBillByItem(String item);


    List<Bill> getBillByloginId(String loginid);
}
