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

    @Override
    public String addBill(Bill bill) {
        try {
            Bill result = billManageRepository.save(bill);
            return "success";
        } catch (Exception e) {
            e.printStackTrace();
            return "fail to update";
        }
    }

    @Override
    public String deleteBill(String Id) {
        Integer result = billManageRepository.deleteBill(Id);
        if (result > 0) {
            return "succcess to delete";
        }
        return "fail to delete";
    }

    @Override
    public List<Bill> getBillById(String id) {
        List<Bill> result = billManageRepository.getBillById(id);
        if (result != null) {
            return result;
        }
        return null;
    }

}
