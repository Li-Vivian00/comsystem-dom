package com.example.comsystem.service.impl.RepairManageServiceImpl;

import com.example.comsystem.entity.RepairManage;
import com.example.comsystem.repository.admin.repairManage.RepairManageRepository;
import com.example.comsystem.service.RepairManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RepairManageServiceImpl implements RepairManageService {

    @Autowired
    RepairManageRepository repairManageRepository;

    @Override
    public List<RepairManage> getAllRepairInfo() {
        try {
            return repairManageRepository.findAll();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    //update repair info
    @Override
    public String updateRepairInfo(RepairManage repairManage) {
        try {
            RepairManage result = repairManageRepository.save(repairManage);
            return "success to update";
        } catch (Exception e) {
            e.printStackTrace();
            return "fail to update";
        }
    }

    @Override
    public List<RepairManage> getRepairInfoByItem(String item) {
        try {
            List<RepairManage> result = repairManageRepository.getRepairInfoByItem(item);
            if (result != null) {
                return result;
            }
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
