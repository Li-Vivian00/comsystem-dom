package com.example.comsystem.service;

import com.example.comsystem.entity.RepairManage;

import java.util.List;

public interface UserRepairService {
    List<RepairManage> getUserOpinionInfo(String loginId);
}
