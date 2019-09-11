package com.example.comsystem.repository.admin.repairManage;

import com.example.comsystem.entity.OpinionManage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;
import java.util.List;

public interface OpinionManageRepository extends JpaRepository<OpinionManage, String> {
    //find opinion info by item
    @Query(value = "select * from opinion_manage where status =?1", nativeQuery = true)
    List<OpinionManage> getOpinionInfoByItem(String item);

    //update opinion info
    @Transactional //注解用于提交事务，若没有带上这句，会报事务异常提示
    @Modifying(clearAutomatically = true)//自动清除实体里保存的数据。
    @Query(value = "update opinion_manage tb set tb.status =?1, tb.answer_content=?2 where tb.Id=?3", nativeQuery = true)
    int updateOpinionInfo(String status, String answer_content, String id);
}
