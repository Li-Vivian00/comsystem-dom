package com.example.comsystem.repository.admin.userManage;

import com.example.comsystem.entity.AdminInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminManageRepository extends JpaRepository<AdminInfo, String> {
}
