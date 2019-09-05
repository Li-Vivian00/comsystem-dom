package com.example.comsystem.service;

import com.example.comsystem.entity.PhoneModule;

import java.util.List;

public interface VillaCenterService {
    // find all phone module
    public List<PhoneModule> getAllPhoneModuleInfo();

    // update phone number by item
    String updatePhoneModuleInfo(PhoneModule phoneModule);

    // delete phone module
    void deletePhoneModule(String Id);

    //get one phone module
    List<PhoneModule> searchByItem(String item);
}
