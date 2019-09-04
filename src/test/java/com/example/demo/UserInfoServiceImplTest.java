package com.example.demo;

import com.example.comsystem.DemoApplication;
import com.example.comsystem.entity.UserInfo;
import com.example.comsystem.service.UserLoginService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = DemoApplication.class,webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT )

public class UserInfoServiceImplTest {
    @Autowired
    UserLoginService userLoginService;
//    @MockBean
//    UserLoginRepository userLoginRepository;

    UserInfo userInfo = new UserInfo();
    @Before
    public void setUp() {
        userInfo.setLoginid("username");
        userInfo.setPassword("123");
    }

    @Test
    public void test_userLoginService(){
        String result = userLoginService.userLoginService(userInfo);
        Assert.assertEquals("success",result);
    }
}
