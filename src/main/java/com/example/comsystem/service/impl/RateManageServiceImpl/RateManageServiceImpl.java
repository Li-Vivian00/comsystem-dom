package com.example.comsystem.service.impl.RateManageServiceImpl;

import com.example.comsystem.entity.Rate;
import com.example.comsystem.repository.admin.rateManage.RateManageRepository;
import com.example.comsystem.service.RateManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RateManageServiceImpl implements RateManageService {
    @Autowired
    RateManageRepository rateManageRepository;

    @Override
    public List<Rate> getAllUserPoint() {
        List<Rate> result = rateManageRepository.findAll();
        return result;
    }

    @Override
    public String updateUserPoint(Rate rate) {
        try {
            Rate result = rateManageRepository.save(rate);
            return "success to update";
        }
        catch (Exception e) {
            e.printStackTrace();
            return "fail to update";
        }
    }

}
