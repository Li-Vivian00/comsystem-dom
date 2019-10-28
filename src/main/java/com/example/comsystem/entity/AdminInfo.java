package com.example.comsystem.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "admininfo")
@Data
public class AdminInfo implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")

    private Integer Id;
    private String loginid;
    private String username;
    private String password;
    private String sex;
    private String phone;
    private String email;
    private String card;
}
