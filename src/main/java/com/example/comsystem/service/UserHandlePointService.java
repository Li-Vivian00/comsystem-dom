package com.example.comsystem.service;

import com.example.comsystem.entity.OpinionManage;
import com.example.comsystem.entity.Rate;

import java.util.List;

public interface UserHandlePointService {
    String hanlePoint(Rate rate);

    List<Rate> getUserPoint(String loginId);
}
