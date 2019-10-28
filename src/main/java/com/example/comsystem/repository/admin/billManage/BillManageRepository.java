package com.example.comsystem.repository.admin.billManage;

import com.example.comsystem.entity.Bill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BillManageRepository extends JpaRepository<Bill, String> {
}
