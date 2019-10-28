package com.example.comsystem.service.impl.UserServiceImpl;

import com.example.comsystem.entity.OpinionManage;
import com.example.comsystem.repository.admin.repairManage.OpinionManageRepository;
import com.example.comsystem.service.UserOpinionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserOpinionServiceImpl implements UserOpinionService {
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

    @Override
    public String submitOpinion(OpinionManage opinionManage) {
        try {
            OpinionManage result = opinionManageRepository.save(opinionManage);
            return "success";
        } catch (Exception e) {
            e.printStackTrace();
            return "fail to submit";
        }
    }
}
