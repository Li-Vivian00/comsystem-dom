package com.example.comsystem.service.impl.UserServiceImpl;

import com.example.comsystem.entity.OpinionManage;
import com.example.comsystem.entity.Rate;
import com.example.comsystem.repository.admin.rateManage.RateManageRepository;
import com.example.comsystem.service.UserHandlePointService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserHandlePoint implements UserHandlePointService {
    @Autowired
    RateManageRepository rateManageRepository;

    @Override
    public String hanlePoint(Rate rate) {
        try {
            Rate result = rateManageRepository.save(rate);
            return "success";
        } catch (Exception e) {
            e.printStackTrace();
            return "fail to submit";
        }
    }

    @Override
    public List<Rate> getUserPoint(String loginId) {
        List<Rate> result = rateManageRepository.getUserPoint(loginId);
        if (result != null) {
            return result;
        }
        return null;
    }

}
