package com.example.comsystem.service.impl.userServiceImpl;

import com.example.comsystem.entity.OpinionManage;
import com.example.comsystem.repository.admin.repairManage.OpinionManageRepository;
import com.example.comsystem.service.UserOnlineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserOnlineServiceImpl implements UserOnlineService {
    @Autowired
    OpinionManageRepository opinionManageRepository;

    //find user opinion Info
    @Override
    public List<OpinionManage> getUserOpinionInfo(String loginId) {
        List<OpinionManage> result = opinionManageRepository.getOpinionInfoByLoginId(loginId);
        if (result != null) {
            return result;
        }
        return null;
    }
}
