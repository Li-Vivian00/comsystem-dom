package com.example.comsystem.repository.admin.userManage;

import com.example.comsystem.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;
import java.util.List;

public interface UserManageRepository extends JpaRepository<User, String> {

}
