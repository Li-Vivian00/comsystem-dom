package com.example.comsystem.repository.user;

import com.example.comsystem.entity.Bill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserBillRepository extends JpaRepository<Bill, String> {
    @Query(value = "select * from bill where status=?1 and loginid=?2", nativeQuery = true)
    List<Bill> getUserBillByItem(String item, String loginid);
}
