package com.example.comsystem.service;

import com.example.comsystem.entity.UserInfo;

import java.util.List;

public interface UserCenterService {
    //get user baseInfo
    List<UserInfo> getUserCenterInfo(String loginId);

    //user modifyPass
    String userModifyPassword(String loginid, String newPass);
}
