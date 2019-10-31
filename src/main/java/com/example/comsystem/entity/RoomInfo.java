package com.example.comsystem.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "room_info")
@Data

public class RoomInfo implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private String Id;
    private String floor_id;
    private String room_type;
    private String room_id;
    private String room_area;
    private String loginid;
    private String stay_date;
    private String score;
}
