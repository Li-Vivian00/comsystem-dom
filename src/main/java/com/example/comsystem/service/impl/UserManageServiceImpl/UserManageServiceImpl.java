package com.example.comsystem.service.impl.UserManageServiceImpl;

import com.example.comsystem.dao.UserDao;
import com.example.comsystem.entity.UserInfo;
import com.example.comsystem.repository.admin.userManage.UserManageRepository;
import com.example.comsystem.service.UserManageService;
import com.example.comsystem.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class UserManageServiceImpl implements UserManageService {

    @Autowired
    UserDao userDao;
    @Autowired
    UserManageRepository userManageRepository;

    // find all user
    @Override
    public List<UserInfo> getAllUserInfo() {
        return userManageRepository.findAll();
    }

    // find user info by item
    @Override
    public List<UserInfo> searchByItem(String item, String name) {
        List<UserInfo> result = userDao.searchByItem(item, name);
        return result;
    }

    // delete user
    @Override
    public void deleteUser(String Id) {
        List<UserInfo> userInfos = new ArrayList<>();
        String [] ids = StringUtil.analysisArrayStr(Id);
        for (String id : ids) {
            Integer idI = Integer.parseInt(id);
            UserInfo userInfo = new UserInfo();
            userInfo.setId(idI);
            userInfos.add(userInfo);
        }
        try {
            userManageRepository.deleteInBatch(userInfos);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // update user
    @Override
    public String updateUser(UserInfo userInfo) {
        try {
            UserInfo result = userManageRepository.save(userInfo);
            return "success";
        } catch (Exception e) {
            e.printStackTrace();
            return "fail to update";
        }
    }
}

