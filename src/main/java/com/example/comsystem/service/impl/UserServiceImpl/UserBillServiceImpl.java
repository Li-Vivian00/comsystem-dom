package com.example.comsystem.service.impl.UserServiceImpl;

import com.example.comsystem.entity.Bill;
import com.example.comsystem.repository.user.UserBillRepository;
import com.example.comsystem.service.UserBillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserBillServiceImpl implements UserBillService {
    @Autowired
    UserBillRepository userBillRepository;
    @Override
    public List<Bill> getBillByItem(String item, String loginid) {
        List<Bill> result = userBillRepository.getUserBillByItem(item,loginid);
        if (result != null) {
            return result;
        }
        return null;
    }
}
