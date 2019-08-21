package com.example.comsystem.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="room_info")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RoomInfo implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "room_id")

    private String room_id;
    private String room_name;
    private String user_id;
    private String stay_date;
    private String floor_id;
}
