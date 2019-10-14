package com.example.comsystem.controller.user;

import com.example.comsystem.service.DailyNewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(value = "/api/dailyNews")
public class NewsDailyController {
    @Autowired
    DailyNewsService dailyNewsService;

    // get count of user
    @RequestMapping(value = "/getCountOfUser", method = RequestMethod.GET)
    public List<Integer> getCountOfUser() {
        List<Integer> result = dailyNewsService.getCountOfUser();
        return result;
    }

    // get avg score
    @RequestMapping(value = "/getAvgScore", method = RequestMethod.GET)
    public List<Double> getAvgScore() {
        List<Double> result = dailyNewsService.getAvgScore();
        return result;
    }
}
