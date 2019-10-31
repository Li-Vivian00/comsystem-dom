package com.example.comsystem.service.impl.BuildingManageServiceImpl;

import com.example.comsystem.entity.FloorInfo;
import com.example.comsystem.entity.RoomInfo;
import com.example.comsystem.repository.admin.buildingManage.BuildingManageRepository;
import com.example.comsystem.repository.user.RoomInfoRepository;
import com.example.comsystem.service.BuildingManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BuildingManageServiceImpl implements BuildingManageService {
    @Autowired
    BuildingManageRepository buildingManageRepository;

    @Autowired
    RoomInfoRepository roomInfoRepository;
    @Override
    public List<FloorInfo> getAllBuilding() {
        try {
            return buildingManageRepository.findAll();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public List<RoomInfo> getRoomByFloorId(String floorId) {
        List<RoomInfo> result =roomInfoRepository.getRoomByFloorId(floorId);
        if (result !=null) {
            return result;
        }
        return null;
    }
}
