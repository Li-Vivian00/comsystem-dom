package com.example.comsystem.service.impl.UserServiceImpl;

import com.example.comsystem.entity.UserInfo;
import com.example.comsystem.repository.login.UserLoginRepository;
import com.example.comsystem.service.UserCenterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
class UserCenterServiceImpl implements UserCenterService {
    @Autowired
    UserLoginRepository userLoginRepository;

    //get user baseInfo
    @Override
    public List<UserInfo> getUserCenterInfo(String loginId) {
        List<UserInfo> result = userLoginRepository.findByUserLoginid(loginId);
        if (result != null) {
            return result;
        }
        return null;
    }

    ////user modifyPass
    @Override
    public String userModifyPassword(String loginid, String newPass) {
        Integer result = userLoginRepository.userModifyPasswordByLoginId(newPass, loginid);
        if (result == null || result == 0) {
            return "fail to update password";
        }
        return "success";
    }
}
