package com.example.comsystem.service;

import com.example.comsystem.entity.FloorInfo;
import com.example.comsystem.entity.RoomInfo;

import java.util.List;

public interface BuildingManageService {
    List<FloorInfo> getAllBuilding();

    List<RoomInfo> getRoomByFloorId(String floorId);
}
