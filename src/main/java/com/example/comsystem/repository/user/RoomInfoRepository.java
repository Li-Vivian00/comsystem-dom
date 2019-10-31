package com.example.comsystem.repository.user;

import com.example.comsystem.entity.RoomInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface RoomInfoRepository extends JpaRepository<RoomInfo, String> {
    @Query(value = "select count(user_id) from room_info where user_id is not null and room_id like CONCAT('%',:a1,'%')", nativeQuery = true)
    Integer getCountOfUser(@Param("a1") String a1);

    @Query(value = "select AVG(score) from room_info where user_id is not null and room_id like CONCAT('%',:a1,'%')", nativeQuery = true)
    Double getAvgScore(String a1);

    @Query(value = "select * from room_info where room_id LIKE CONCAT('%',:floorId,'%')", nativeQuery = true)
    List<RoomInfo> getRoomByFloorId(String floorId);
}
