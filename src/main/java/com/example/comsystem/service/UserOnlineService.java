package com.example.comsystem.service;

import com.example.comsystem.entity.OpinionManage;

import java.util.List;

public interface UserOnlineService {
    //find user opinion Info
    List<OpinionManage> getUserOpinionInfo(String loginId);
}
