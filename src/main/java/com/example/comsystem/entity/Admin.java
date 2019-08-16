package com.example.comsystem.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="admininfo")
@Data
public class Admin {
    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String Id;
    private String loginid;
    private String adminname;
    private String password;
    private String sex;
    private String phone;
    private String email;
    private String card;
}
