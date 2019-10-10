package com.example.comsystem.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@Table(name = "repair_manage")
@AllArgsConstructor
@NoArgsConstructor

public class RepairManage implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private Integer Id;
    private String repair_type;
    private String loginid;
    private String username;
    private String phone;
    private String room_id;
    private String problem_description;
    private String sub_time;
    private String status;
    private String remark;
    private String handle_time;
}
