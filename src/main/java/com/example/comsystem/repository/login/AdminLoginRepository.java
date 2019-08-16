package com.example.comsystem.repository.login;

import com.example.comsystem.entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AdminLoginRepository extends JpaRepository <Admin, String> {
    @Query(value = "select * from admininfo where loginid =?1 and password = ?2", nativeQuery = true)
    Admin AdminLoginRep(String loginid, String password);

    @Query(value = "select * from admininfo where loginid =?1", nativeQuery = true)
    List<Admin> findByAdminLoginid(String loginid);


}
