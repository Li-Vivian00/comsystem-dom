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
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = DemoApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)

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
    public void test_userLoginService() throws Exception{
        String result = userLoginService.userLoginService(userInfo);
        Assert.assertEquals("password not correct", result);
    }

    @Test
    public void test_userRegisterService() {
        String result = userLoginService.userRegisterService(userInfo);
        Assert.assertEquals("success", result);
    }

    @Test
    public void judgeUserLoginIdService() throws Exception{
        Assert.assertEquals("loginid is exist", userLoginService.judgeUserLoginIdService("username1"));
        Assert.assertEquals("loginid is exist", userLoginService.judgeUserLoginIdService("username"));
        Assert.assertEquals("loginid is exist", userLoginService.judgeUserLoginIdService("login"));
        Assert.assertEquals("success", userLoginService.judgeUserLoginIdService("newLoginId1"));
        Assert.assertEquals("success", userLoginService.judgeUserLoginIdService("newLoginId2"));
        Assert.assertEquals("success", userLoginService.judgeUserLoginIdService("newLoginId3"));
    }


}
