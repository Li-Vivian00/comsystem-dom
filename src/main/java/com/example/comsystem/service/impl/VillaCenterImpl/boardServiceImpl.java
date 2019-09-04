package com.example.comsystem.service.impl.VillaCenterImpl;

import com.example.comsystem.entity.PhoneModule;
import com.example.comsystem.repository.admin.villaCenter.BoardRepository;
import com.example.comsystem.service.VillaCenterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class boardServiceImpl implements VillaCenterService {

    @Autowired
    BoardRepository boardRepository;

    @Override
    public List<PhoneModule> getAllPhoneModuleInfo() {
        return boardRepository.findAll();
    }

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
}
