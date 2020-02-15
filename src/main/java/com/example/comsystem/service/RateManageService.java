package com.example.comsystem.service;

import com.example.comsystem.entity.Rate;

import java.util.List;

public interface RateManageService {
    List<Rate> getAllUserPoint();

    String updateUserPoint(Rate rate);
}
