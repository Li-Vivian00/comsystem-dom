package com.example.demo;


import com.example.comsystem.DemoApplication;
import com.example.comsystem.entity.Bill;
import com.example.comsystem.service.BillManageService;
import com.example.comsystem.service.impl.BillManageServiceImpl.BillManageServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DemoApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)

public class BillManageServiceTest {
    @Autowired
    BillManageServiceImpl billManageServiceImpl;

    @Test
    public void test_getAllBill() {
        List<Bill> result = billManageServiceImpl.getAllBill();
        System.out.println(result);
    }
}
