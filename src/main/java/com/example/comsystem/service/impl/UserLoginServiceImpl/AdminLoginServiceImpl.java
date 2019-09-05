package com.example.comsystem.service.impl.UserLoginServiceImpl;

import com.example.comsystem.entity.AdminInfo;
import com.example.comsystem.repository.admin.userManage.AdminManageRepository;
import com.example.comsystem.repository.login.AdminLoginRepository;
import com.example.comsystem.service.AdminLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminLoginServiceImpl implements AdminLoginService {

    @Autowired
    AdminLoginRepository adminLoginRepository;


    // admin login
    @Override
    public String adminLoginService(AdminInfo adminInfo) {
        String loginid = adminInfo.getLoginid();
        String password = adminInfo.getPassword();
        List<AdminInfo> listUser = adminLoginRepository.findByAdminLoginid(loginid);
        AdminInfo result = adminLoginRepository.AdminLoginRep(loginid, password);
        if (listUser.size() <= 0) {
            return "loginid not exist";
        } else if (result == null) {
            return "password not correct";
        } else {
            return "success";
        }
    }

    // judge admin phone whether exist
    @Override
    public String judgeUserPhoneService(String phone) {
        try {
            List<AdminInfo> listUser = adminLoginRepository.findByAdminPhone(phone);
            if (listUser.size() > 0) {
                return "phone is exist";
            }
            return "phone not exist";
        } catch (Exception e) {
            e.printStackTrace();
            return "phone is exist";
        }
    }

    //modify password
    @Override
    public String modifyPassword(AdminInfo user) {
        try {
            String phone = user.getPhone();
            String password = user.getPassword();
            Integer result = adminLoginRepository.adminModifyPassword(password, phone);
            if (result == null || result == 0) {
                return "fail to update password";
            }
            return "success";
        } catch (Exception e) {
            e.printStackTrace();
            return "success";
        }
    }

    //get login admin info
    @Override
    public List<AdminInfo> getLoginAdminInfo(String adminLoginId) {
        try {
            List<AdminInfo> result = adminLoginRepository.findByAdminLoginid(adminLoginId);
            if (result != null) {
                return result;
            }
            return null;
        }
        catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    //judge admin phone whether exist
    @Override
    public String judgeAdminLoginId(String loginId) {
        try {
            List<AdminInfo> result = adminLoginRepository.findByAdminLoginid(loginId);
            if (result.size() > 0) {
                return "loginid is exist";
            }
            return "success";
        } catch (Exception e) {
            e.printStackTrace();
            return "loginid is exist";
        }
    }


}
