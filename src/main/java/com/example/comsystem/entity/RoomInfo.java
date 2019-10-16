package com.example.comsystem.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "room_info")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class RoomInfo implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "Id")

    private String floor_id;
    private String room_type;
    private String room_id;
    private String room_area;
    private String user_id;
    private String stay_date;
    private String score;
}
