package com.example.comsystem.controller.admin.buildingManage;

import com.example.comsystem.entity.FloorInfo;
import com.example.comsystem.entity.RoomInfo;
import com.example.comsystem.service.BuildingManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping(value = "/api/buildingManage")
@CrossOrigin
@RestController
public class BuildingManageController {
    @Autowired
    BuildingManageService buildingManageService;

    //get all building
    @RequestMapping(value = "/getAllBuilding")
    public List<FloorInfo> getAllBuilding () {
        List<FloorInfo> result = buildingManageService.getAllBuilding();
        return result;
    }

    //get floor by floor_id
    @RequestMapping(value = "/getRoomByFloorId")
    public List<RoomInfo> getRoomByFloorId (@RequestParam(value = "floorId", required = false) String floorId) {
        List<RoomInfo> result = buildingManageService.getRoomByFloorId(floorId);
        return result;
    }
}
