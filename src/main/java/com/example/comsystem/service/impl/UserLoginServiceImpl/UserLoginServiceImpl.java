package com.example.comsystem.service.impl.UserLoginServiceImpl;

import com.example.comsystem.entity.UserInfo;
import com.example.comsystem.repository.login.UserLoginRepository;
import com.example.comsystem.service.UserLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserLoginServiceImpl implements UserLoginService {

    @Autowired
    UserLoginRepository userLoginRepository;

    // get one user by loginid
//    @Override
//    public User searchById(String i) {
//        Optional<User> result = userLoginRepository.findById(i);
//        return result.get();
//    }


    // user login
    @Override
    public String userLoginService(UserInfo userInfo) {
        String loginid = userInfo.getLoginid();
        String password = userInfo.getPassword();
        List<UserInfo> listUserInfo = userLoginRepository.findByUserLoginid(loginid);
        UserInfo result = userLoginRepository.userLogin(loginid, password);
        if (listUserInfo.size() <= 0) {
            return "loginid not exist";
        } else if (result == null) {
            return "password not correct";
        } else {
            return "success";
        }
    }

    // user register save user
    @Override
    public String userRegisterService(UserInfo userInfo) {
        try {
            UserInfo result = userLoginRepository.save(userInfo);
            return "success";
        } catch (Exception e) {
            e.printStackTrace();
            return "fail to register";
        }
    }

    // judge user loginid whether exist
    @Override
    public String judgeUserLoginIdService(String loginId) {
        try {
            List<UserInfo> listUserInfo = userLoginRepository.findByUserLoginid(loginId);
            if (listUserInfo.size() > 0) {
                return "loginid is exist";
            }
            return "success";
        } catch (Exception e) {
            e.printStackTrace();
            return "loginid is exist";
        }
    }

    // judge user phone whether exist
    @Override
    public String judgeUserPhoneService(String phone) {
        try {
            List<UserInfo> listUserInfo = userLoginRepository.findByUserPhone(phone);
            if (listUserInfo.size() > 0) {
                return "phone is exist";
            }
            return "phone not exist";
        } catch (Exception e) {
            e.printStackTrace();
            return "phone is exist";
        }
    }

    //    //modify password
    @Override
    public String modifyPassword(UserInfo userInfo) {
        try {
            String phone = userInfo.getPhone();
            String password = userInfo.getPassword();
            Integer result = userLoginRepository.userModifyPasswordByPhone(password, phone);
            if (result == null || result == 0) {
                return "fail to update password";
            }
            return "success";
        } catch (Exception e) {
            e.printStackTrace();
            return "success";
        }
    }

}
