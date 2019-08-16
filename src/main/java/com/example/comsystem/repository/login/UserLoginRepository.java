package com.example.comsystem.repository.login;

import com.example.comsystem.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserLoginRepository extends JpaRepository <User, String> {
    @Query(value = "select * from userinfo where loginid =?1 and password = ?2", nativeQuery = true)
    User userLoginRep(String loginid, String password);

    @Query(value = "select * from userinfo where loginid =?1", nativeQuery = true)
    List<User> findByUserLoginid(String loginid);
}
