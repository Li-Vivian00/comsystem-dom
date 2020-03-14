package com.example.demo;

import com.alibaba.fastjson.JSONObject;
import com.example.comsystem.DemoApplication;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.ConfigurableWebApplicationContext;
import org.springframework.web.context.WebApplicationContext;

import java.util.HashMap;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DemoApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class userLoginControllerTest {
//	@MockBean
//	UserLoginRepository userLoginRepository;

    @Autowired
    private ConfigurableWebApplicationContext webApplicationContext;
    private MockMvc mockMvc;

    @Before
    public void setUp() throws Exception {
        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
    }

    @Test
    public void test_userLoginController() throws Exception {
        Map<String, String> map = new HashMap<>();
        map.put("loginid", "user1");
        map.put("password", "user");

        //  Object turn into Json String
        String requestJson = JSONObject.toJSONString(map);

        MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders.post(("/api/userLogin/login"))
                .contentType(MediaType.APPLICATION_JSON_UTF8)
                .content(requestJson))
                .andDo(MockMvcResultHandlers.print())
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andReturn();
        int status = mvcResult.getResponse().getStatus();
        String result = mvcResult.getResponse().getContentAsString();
        Assert.assertEquals(200, status);
        Assert.assertEquals("password not correct", result);
    }

    @Test
    public void test_judgeUserLoginId() throws Exception {
        MvcResult mvcResultOne = mockMvc.perform(MockMvcRequestBuilders.get(("/api/userLogin/getUserLoginid"))
                .contentType(MediaType.APPLICATION_JSON_UTF8)
                .param("loginId", "username1"))
                .andDo(MockMvcResultHandlers.print())
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andReturn();
        String resultOne = mvcResultOne.getResponse().getContentAsString();

        MvcResult mvcResultTwo = mockMvc.perform(MockMvcRequestBuilders.get(("/api/userLogin/getUserLoginid"))
                .contentType(MediaType.APPLICATION_JSON_UTF8)
                .param("loginId", "newUserLoinId"))
                .andDo(MockMvcResultHandlers.print())
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andReturn();
        String resultTwo = mvcResultTwo.getResponse().getContentAsString();

        Assert.assertEquals("loginid is exist", resultOne);
        Assert.assertEquals("success", resultTwo);
    }

}
