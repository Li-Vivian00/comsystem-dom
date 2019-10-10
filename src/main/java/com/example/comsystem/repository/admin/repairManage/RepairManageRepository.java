package com.example.comsystem.repository.admin.repairManage;

import com.example.comsystem.entity.RepairManage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface RepairManageRepository extends JpaRepository<RepairManage, String> {
    @Query(value = "select * from repair_manage where status =?1", nativeQuery = true)
    List<RepairManage> getRepairInfoByStatus(String item);

    @Query(value = "select * from repair_manage where loginid =?1", nativeQuery = true)
    List<RepairManage> getRepairInfoByLoginId(String loginId);
}
