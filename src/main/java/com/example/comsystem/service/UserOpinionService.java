package com.example.comsystem.service;

import com.example.comsystem.entity.OpinionManage;

import java.util.List;

public interface UserOpinionService {
    //find user opinion Info
    List<OpinionManage> getUserOpinionInfo(String loginId);

    //submitOpinion
    String submitOpinion(OpinionManage opinionManage);
}
