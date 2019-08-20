package com.example.comsystem.repository.login;

import com.example.comsystem.entity.Admin;
import com.example.comsystem.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;
import java.util.List;

public interface AdminLoginRepository extends JpaRepository <Admin, String> {
    @Query(value = "select * from admin_info where loginid =?1 and password = ?2", nativeQuery = true)
    Admin AdminLoginRep(String loginid, String password);

    @Query(value = "select * from admin_info where loginid =?1", nativeQuery = true)
    List<Admin> findByAdminLoginid(String loginid);

    @Query(value = "select * from admin_info where phone =?1", nativeQuery = true)
    List<Admin> findByAdminPhone(String phone);

    @Transactional
    @Modifying(clearAutomatically = true)
    @Query(value = "update admin_info u set u.password =?1 where u.phone =?2", nativeQuery = true)
    Integer adminModifyPassword (String password, String phone);
}
