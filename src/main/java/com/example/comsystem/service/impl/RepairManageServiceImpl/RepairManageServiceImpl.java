package com.example.comsystem.service.impl.RepairManageServiceImpl;

import com.example.comsystem.dao.AdminDao;
import com.example.comsystem.entity.OpinionManage;
import com.example.comsystem.entity.RepairManage;
import com.example.comsystem.repository.admin.repairManage.OpinionManageRepository;
import com.example.comsystem.repository.admin.repairManage.RepairManageRepository;
import com.example.comsystem.service.RepairManageService;
import com.example.comsystem.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RepairManageServiceImpl implements RepairManageService {

    @Autowired
    RepairManageRepository repairManageRepository;
    @Autowired
    OpinionManageRepository opinionManageRepository;


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

    //find repair info by item
    @Override
    public List<RepairManage> getRepairInfoByItem(String item) {
        try {
            List<RepairManage> result = repairManageRepository.getRepairInfoByStatus(item);
            if (result != null) {
                return result;
            }
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    //delete repair info
    @Override
    public void deleteRepairInfo(String Id) {
        List<RepairManage> repairs = new ArrayList<>();
        String [] ids = StringUtil.analysisArrayStr(Id);
        for (String id : ids) {
            Integer idI = Integer.parseInt(id);
            RepairManage repair = new RepairManage();
            repair.setId(idI);
            repairs.add(repair);
        }
        try {
            repairManageRepository.deleteInBatch(repairs);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    //find all opinion info
    @Override
    public List<OpinionManage> getAllOpinionInfo() {
        try {
            return opinionManageRepository.findAll();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    //update opinion info
    @Override
    public String updateOpinionInfo(String status, String answer_content, String Id, String answer_date) {
        try {
            int result = opinionManageRepository.updateOpinionInfo(status, answer_content, answer_date, Id);
            return "success to update";
        } catch (Exception e) {
            e.printStackTrace();
            return "fail to update";
        }
    }

    //find opinion info by item
    @Override
    public List<OpinionManage> getOpinionInfoByItem(String item) {
        try {
            List<OpinionManage> result = opinionManageRepository.getOpinionInfoByStatus(item);
            if (result != null) {
                return result;
            }
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    //delete opinion info
    @Override
    public void deleteOpinionInfo(String Id) {
        List<OpinionManage> opinions = new ArrayList<>();
        String [] ids = StringUtil.analysisArrayStr(Id);
        for (String id : ids) {
            Integer idI = Integer.parseInt(id);
            OpinionManage opinion = new OpinionManage();
            opinion.setId(idI);
            opinions.add(opinion);
        }
        try {
            opinionManageRepository.deleteInBatch(opinions);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
