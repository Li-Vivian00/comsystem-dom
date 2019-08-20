package com.example.comsystem.repository.login;

import com.example.comsystem.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;
import java.util.List;

public interface UserLoginRepository extends JpaRepository <User, String> {
    @Query(value = "select * from user_info where loginid =?1 and password = ?2", nativeQuery = true)
    User userLogin(String loginid, String password);

    @Query(value = "select * from user_info where loginid =?1", nativeQuery = true)
    List<User> findByUserLoginid(String loginid);

    @Query(value = "select * from user_info where phone =?1", nativeQuery = true)
    List<User> findByUserPhone(String phone);

    @Transactional
    @Modifying(clearAutomatically = true)
    @Query(value = "update user_info u set u.password =?1 where u.phone =?2", nativeQuery = true)
    Integer userModifyPassword (String password, String phone);
}
