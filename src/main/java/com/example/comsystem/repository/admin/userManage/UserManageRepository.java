package com.example.comsystem.repository.admin.userManage;

import com.example.comsystem.entity.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserManageRepository extends JpaRepository<UserInfo, String> {

}
