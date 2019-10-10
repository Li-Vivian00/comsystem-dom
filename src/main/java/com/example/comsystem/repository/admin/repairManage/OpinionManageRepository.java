package com.example.comsystem.repository.admin.repairManage;

import com.example.comsystem.entity.OpinionManage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;
import java.util.List;

public interface OpinionManageRepository extends JpaRepository<OpinionManage, String> {
    //find opinion info by status
    @Query(value = "select * from opinion_manage where status =?1", nativeQuery = true)
    List<OpinionManage> getOpinionInfoByStatus(String item);

    //update opinion info
    @Transactional //注解用于提交事务，若没有带上这句，会报事务异常提示
    @Modifying(clearAutomatically = true)//自动清除实体里保存的数据。
    @Query(value = "update opinion_manage tb set tb.status =?1, tb.answer_content=?2, tb.answer_date=?3 where tb.Id=?4", nativeQuery = true)
    int updateOpinionInfo(String status, String answer_content, String answer_date, String id);

    @Query(value = "select * from opinion_manage where loginid =?1", nativeQuery = true)
    List<OpinionManage> getOpinionInfoByLoginId(String loginId);
}
