package com.example.comsystem.service.impl.BillManageServiceImpl;

import com.example.comsystem.entity.Bill;
import com.example.comsystem.repository.admin.billManage.BillManageRepository;
import com.example.comsystem.service.BillManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BillManageServiceImpl implements BillManageService {
    @Autowired
    BillManageRepository billManageRepository;

    @Override
    public List<Bill> getAllBill() {
        List<Bill> result = billManageRepository.findAll();
        return result;
    }

    @Override
    public List<Bill> getBillByItem(String item) {
        List<Bill> result = billManageRepository.getBillByItem(item);
        if (result != null) {
            return result;
        }
        return null;
    }

    @Override
    public List<Bill> getBillByloginId(String loginid) {
        List<Bill> result = billManageRepository.getBillByloginId(loginid);
        return result;
    }

}
