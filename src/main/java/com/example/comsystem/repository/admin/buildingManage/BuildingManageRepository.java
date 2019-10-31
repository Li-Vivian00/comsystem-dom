package com.example.comsystem.repository.admin.buildingManage;

import com.example.comsystem.entity.FloorInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BuildingManageRepository extends JpaRepository<FloorInfo, String> {

}
