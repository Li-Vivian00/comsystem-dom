package com.example.comsystem.service;

import com.example.comsystem.entity.PhoneModule;

import java.util.List;

public interface VillaCenterService {
    // find all phone module
    public List<PhoneModule> getAllPhoneModuleInfo();

    // update phone number by item
    String updatePhoneModuleInfo(PhoneModule phoneModule);

    void deletePhoneModule(String Id);

    List<PhoneModule> searchByItem(String item, String phone);
}
