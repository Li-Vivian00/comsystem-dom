package com.example.demo;

import com.example.comsystem.DemoApplication;
import com.example.comsystem.entity.FloorInfo;
import com.example.comsystem.entity.RoomInfo;
import com.example.comsystem.service.impl.BuildingManageServiceImpl.BuildingManageServiceImpl;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DemoApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class BuildingManageServiceTest {
    @Autowired
    BuildingManageServiceImpl buildingManageService;

    @Test
    public void test_getAllFloor() {
        List<FloorInfo> result = buildingManageService.getAllBuilding();
        System.out.println(result);
    }

    @Test
    public void test_getRoomByFloorId() {
        List<RoomInfo> result1 = buildingManageService.getRoomByFloorId("A1");
        Assert.assertNotNull(result1);
    }
}
