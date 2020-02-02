package com.example.comsystem.service.impl.RateManageServiceImpl;

import com.example.comsystem.repository.admin.rateManage.RateManageRepository;
import com.example.comsystem.service.RateManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RateManageServiceImpl implements RateManageService {
    @Autowired
    RateManageRepository rateManageRepository;
}
