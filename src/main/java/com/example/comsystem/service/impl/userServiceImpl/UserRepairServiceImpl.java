package com.example.comsystem.service.impl.userServiceImpl;

import com.example.comsystem.entity.RepairManage;
import com.example.comsystem.repository.admin.repairManage.RepairManageRepository;
import com.example.comsystem.service.UserRepairService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserRepairServiceImpl implements UserRepairService {
    @Autowired
    RepairManageRepository repairManageRepository;

    @Override
    public List<RepairManage> getUserRepairInfo(String loginId) {
        List<RepairManage> result = repairManageRepository.getRepairInfoByLoginId(loginId);
        if (result != null) {
            return result;
        }
        return null;
    }

    @Override
    public String submitRepair(RepairManage repairManage) {
        try {
            RepairManage result = repairManageRepository.save(repairManage);
            return "success";
        } catch (Exception e) {
            e.printStackTrace();
            return "fail to submit";
        }
    }
}
