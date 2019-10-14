package com.example.comsystem.service.impl.userServiceImpl;

import com.example.comsystem.repository.user.RoomInfoRepository;
import com.example.comsystem.service.DailyNewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DailyNewsServiceImpl implements DailyNewsService {
    @Autowired
    RoomInfoRepository roomInfoRepository;
    @Override
    public List<Integer> getCountOfUser() {
        List<Integer> list = new ArrayList<>();
        Integer A1Count = roomInfoRepository.getCountOfUser("A1");
        Integer A2Count = roomInfoRepository.getCountOfUser("A2");
        Integer A3Count = roomInfoRepository.getCountOfUser("A3");
        Integer B1Count = roomInfoRepository.getCountOfUser("B1");
        Integer B2Count = roomInfoRepository.getCountOfUser("B2");
        Integer CCount = roomInfoRepository.getCountOfUser("C1");
        list.add(A1Count);
        list.add(A2Count);
        list.add(A3Count);
        list.add(B1Count);
        list.add(B2Count);
        list.add(CCount);
        return list;
    }

    @Override
    public List<Double> getAvgScore() {
        List<Double> list = new ArrayList<>();
        Double A1Count = roomInfoRepository.getAvgScore("A1");
        Double A2Count = roomInfoRepository.getAvgScore("A2");
        Double A3Count = roomInfoRepository.getAvgScore("A3");
        Double B1Count = roomInfoRepository.getAvgScore("B1");
        Double B2Count = roomInfoRepository.getAvgScore("B2");
        Double CCount = roomInfoRepository.getAvgScore("C1");
        list.add(A1Count);
        list.add(A2Count);
        list.add(A3Count);
        list.add(B1Count);
        list.add(B2Count);
        list.add(CCount);
        return list;
    }
}
