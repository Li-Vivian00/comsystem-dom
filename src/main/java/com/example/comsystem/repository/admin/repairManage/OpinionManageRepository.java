package com.example.comsystem.repository.admin.repairManage;

import com.example.comsystem.entity.OpinionManage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface OpinionManageRepository extends JpaRepository<OpinionManage, String> {
    @Query(value = "select * from opinion_manage where status =?1", nativeQuery = true)
    List<OpinionManage> getOpinionInfoByItem(String item);
}
