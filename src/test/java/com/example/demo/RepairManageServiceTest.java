package com.example.demo;

import com.example.comsystem.DemoApplication;
import com.example.comsystem.entity.RepairManage;
import com.example.comsystem.service.RepairManageService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DemoApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)

public class RepairManageServiceTest {
    @Autowired
    RepairManageService repairManageService;

    RepairManage info = new RepairManage();
    @Before
    public void setUp() {
        info.setRepair_type ("网络问题");
        info.setLoginid("user1");
        info.setUsername("jack");
        info.setPhone("1318888888");
        info.setRoom_id("A1-1001");
        info.setProblem_description("网速过慢，经常断网！");
        info.setSub_time("2020-2-28 17:30:55");
        info.setStatus("0");
        info.setRemark("");
        info.setHandle_time("");
    }

    @Test
    public void addRepairInfo () {
        String result = repairManageService.updateRepairInfo(info);
        Assert.assertEquals("success", result);
    }
}
