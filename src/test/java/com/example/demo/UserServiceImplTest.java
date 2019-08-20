package com.example.demo;

import com.example.comsystem.DemoApplication;
import com.example.comsystem.entity.User;
import com.example.comsystem.repository.login.UserLoginRepository;
import com.example.comsystem.service.UserService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = DemoApplication.class,webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT )

public class UserServiceImplTest {
    @Autowired
    UserService userService;
//    @MockBean
//    UserLoginRepository userLoginRepository;

    User user = new User();
    @Before
    public void setUp() {
        user.setLoginid("username");
        user.setPassword("123");
    }

    @Test
    public void test_userLoginService(){
        String result = userService.userLoginService(user);
        Assert.assertEquals("success",result);
    }
}
