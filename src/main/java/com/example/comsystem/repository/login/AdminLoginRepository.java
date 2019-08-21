package com.example.comsystem.repository.login;

import com.example.comsystem.entity.AdminInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;
import java.util.List;

public interface AdminLoginRepository extends JpaRepository <AdminInfo, String> {
    @Query(value = "select * from admininfo where loginid =?1 and password = ?2", nativeQuery = true)
    AdminInfo AdminLoginRep(String loginid, String password);

    @Query(value = "select * from admininfo where loginid =?1", nativeQuery = true)
    List<AdminInfo> findByAdminLoginid(String loginid);

    @Query(value = "select * from admininfo where phone =?1", nativeQuery = true)
    List<AdminInfo> findByAdminPhone(String phone);

    @Transactional
    @Modifying(clearAutomatically = true)
    @Query(value = "update admininfo u set u.password =?1 where u.phone =?2", nativeQuery = true)
    Integer adminModifyPassword (String password, String phone);
}
