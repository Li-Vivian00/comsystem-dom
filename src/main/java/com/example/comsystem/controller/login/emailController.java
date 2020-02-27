package com.example.comsystem.controller.login;

import com.example.comsystem.service.impl.UserLoginServiceImpl.EmailServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Random;

@Slf4j
@RestController
@RequestMapping("/api/email")
public class emailController {
    @Autowired
    EmailServiceImpl emailService;

    @RequestMapping(value = "/getCheckCode", method = RequestMethod.GET)
    public RestResponse<String> getCheckCode(@RequestParam(value = "sendEmail") String userEmail){
        System.out.println("get in:"+ userEmail);
        RestResponse restResponse = new RestResponse();
        String checkCode = String.valueOf(new Random().nextInt(899999) + 100000);
        String message = "您的验证码为："+checkCode;
        try {
            emailService.sendSimpleMail(userEmail, "邮箱验证码", message);
        }catch (Exception e){
            restResponse.setData(e);
            return restResponse;
        }
        restResponse.setData(checkCode);
        return restResponse;
    }
}
