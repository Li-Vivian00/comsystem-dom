package com.example.comsystem.repository.admin.billManage;

import com.example.comsystem.entity.Bill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;
import java.util.List;

public interface BillManageRepository extends JpaRepository<Bill, String> {
    @Query(value = "select * from bill where status =?1", nativeQuery = true)
    List<Bill> getBillByItem(String item);

    @Query(value = "select * from bill where loginid =?1", nativeQuery = true)
    List<Bill> getBillByloginId(String loginid);

    @Query(value = "select * from bill where status=0 group by loginid", nativeQuery = true)
    List<Bill> getAllBillGroupByLoginId();

    @Modifying(clearAutomatically = true)
    @Transactional
    @Query(value = "delete from bill where Id=?1", nativeQuery = true)
    Integer deleteBill(String id);

    @Query(value = "select * from bill where Id =?1", nativeQuery = true)
    List<Bill> getBillById(String id);
}
