package com.example.comsystem.repository.login;

import com.example.comsystem.entity.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;
import java.util.List;

public interface UserLoginRepository extends JpaRepository<UserInfo, String> {
    @Query(value = "select * from userinfo where loginid =?1 and password = ?2", nativeQuery = true)
    UserInfo userLogin(String loginid, String password);

    @Query(value = "select * from userinfo where loginid =?1", nativeQuery = true)
    List<UserInfo> findByUserLoginid(String loginid);

    @Query(value = "select * from userinfo where phone =?1", nativeQuery = true)
    List<UserInfo> findByUserPhone(String phone);

    @Transactional
    @Modifying(clearAutomatically = true)
    @Query(value = "update userinfo u set u.password =?1 where u.email =?2", nativeQuery = true)
    Integer userModifyPasswordByPhone(String password, String email);

    @Transactional
    @Modifying(clearAutomatically = true)
    @Query(value = "update userinfo u set u.password =?1 where u.loginid =?2", nativeQuery = true)
    Integer userModifyPasswordByLoginId(String newPass, String loginId);
}
