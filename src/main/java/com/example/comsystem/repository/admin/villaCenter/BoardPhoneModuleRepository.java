package com.example.comsystem.repository.admin.villaCenter;

import com.example.comsystem.entity.PhoneModule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BoardPhoneModuleRepository extends JpaRepository<PhoneModule, String> {

    @Query(value = "select * from phone_module where item =?1", nativeQuery = true)
    List<PhoneModule> searchByItem(String item);
}
