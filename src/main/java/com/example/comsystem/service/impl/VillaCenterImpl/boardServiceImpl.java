package com.example.comsystem.service.impl.VillaCenterImpl;

import com.example.comsystem.entity.PhoneModule;
import com.example.comsystem.repository.admin.villaCenter.BoardRepository;
import com.example.comsystem.service.VillaCenterService;
import com.example.comsystem.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class boardServiceImpl implements VillaCenterService {

    @Autowired
    BoardRepository boardRepository;
    // find all phone module
    @Override
    public List<PhoneModule> getAllPhoneModuleInfo() {
        return boardRepository.findAll();
    }

    // update phone number by item
    @Override
    public String updatePhoneModuleInfo(PhoneModule phoneModule) {
        try {
            PhoneModule result = boardRepository.save(phoneModule);
            return "success";
        } catch (Exception e) {
            e.printStackTrace();
            return "fail to update";
        }
    }

    // delete phone module
    @Override
    public void deletePhoneModule(String Id) {
        List<PhoneModule> phoneModules = new ArrayList<>();
        String [] ids = StringUtil.analysisArrayStr(Id);
        for (String id : ids) {
            Integer idI = Integer.parseInt(id);
            PhoneModule phoneModule = new PhoneModule();
            phoneModule.setId(idI);
            phoneModules.add(phoneModule);
        }
        try {
            boardRepository.deleteInBatch(phoneModules);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //get one phone module
    @Override
    public List<PhoneModule> searchByItem(String item) {
        try {
            List<PhoneModule> result = boardRepository.searchByItem(item);
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
