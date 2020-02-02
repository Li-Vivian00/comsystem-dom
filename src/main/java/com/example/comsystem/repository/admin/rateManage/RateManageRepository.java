package com.example.comsystem.repository.admin.rateManage;

import com.example.comsystem.entity.Rate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface RateManageRepository extends JpaRepository<Rate, String> {
    @Query(value = "select * from rate where  loginid =?1", nativeQuery = true)
    List<Rate> getUserPoint(String loginId);
}
