package com.example.comsystem.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
@Table(name = "floor_info")
@Data
@Entity
public class FloorInfo implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private Integer Id;
    private String floor_id;
    private String floor_name;
    private String start_date;
    private String end_date;
    private String floor_hold;
    private String floor_area;
}
