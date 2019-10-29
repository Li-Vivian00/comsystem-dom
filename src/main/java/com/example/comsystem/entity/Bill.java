package com.example.comsystem.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "bill")
@Data
@Entity

public class Bill implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private Integer Id;
    private String loginid;
    private String username;
    private String phone;
    private String room_id;
    private String type;
    private String price;
    private String count;
    private String total;
    private String start_date;
    private String end_date;
    private String status;
    private String remark;
    private String order_date;
    private String pay_date;
}
