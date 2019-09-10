package com.example.comsystem.service;

import com.example.comsystem.entity.OpinionManage;
import com.example.comsystem.entity.RepairManage;

import java.util.List;

public interface RepairManageService {

    //find all repair info
    List<RepairManage> getAllRepairInfo();

    //update repair info
    String updateRepairInfo(RepairManage repairManage);

    //find repair info by item
    List<RepairManage> getRepairInfoByItem(String item);

    List<OpinionManage> getAllOpinionInfo();
}
