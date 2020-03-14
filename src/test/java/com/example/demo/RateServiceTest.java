package com.example.demo;

import com.example.comsystem.DemoApplication;
import com.example.comsystem.service.RateManageService;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DemoApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class RateServiceTest {
    @Autowired
    RateManageService rateManageService;


}
