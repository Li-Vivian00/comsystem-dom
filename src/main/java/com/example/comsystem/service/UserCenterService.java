package com.example.comsystem.service;

import com.example.comsystem.entity.UserInfo;

import java.util.List;

public interface UserCenterService {
    List<UserInfo> getUserCenterInfo(String loginId);
}
