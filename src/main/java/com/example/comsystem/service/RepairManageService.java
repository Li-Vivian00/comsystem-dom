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

    //delete repair info
    void deleteRepairInfo(String id);

    // find all opinion info
    List<OpinionManage> getAllOpinionInfo();

    //update opinion info
    String updateOpinionInfo(String status, String answer_content, String Id);

    //find opinion info by item
    List<OpinionManage> getOpinionInfoByItem(String item);

    //delete opinion info
    void deleteOpinionInfo(String id);
}
