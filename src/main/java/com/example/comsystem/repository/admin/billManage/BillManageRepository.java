package com.example.comsystem.repository.admin.billManage;

import com.example.comsystem.entity.Bill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BillManageRepository extends JpaRepository<Bill, String> {
    @Query(value = "select * from bill where status =?1", nativeQuery = true)
    List<Bill> getBillByItem(String item);

    @Query(value = "select * from bill where loginid =?1", nativeQuery = true)
    List<Bill> getBillByloginId(String loginid);

    @Query(value = "select * from bill where status=0 group by loginid", nativeQuery = true)
    List<Bill> getAllBillGroupByLoginId();
}
