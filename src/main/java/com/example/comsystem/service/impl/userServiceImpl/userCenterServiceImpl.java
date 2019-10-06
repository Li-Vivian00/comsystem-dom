package com.example.comsystem.service.impl.userServiceImpl;

import com.example.comsystem.entity.UserInfo;
import com.example.comsystem.repository.login.UserLoginRepository;
import com.example.comsystem.service.UserCenterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class userCenterServiceImpl implements UserCenterService {
    @Autowired
    UserLoginRepository userLoginRepository;

    @Override
    public List<UserInfo> getUserCenterInfo(String loginId) {
        List<UserInfo> result = userLoginRepository.findByUserLoginid(loginId);
        if (result != null) {
            return result;
        }
        return null;
    }
}
