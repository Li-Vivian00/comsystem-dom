package com.example.comsystem.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
@Entity
@Table(name="user_info")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "Id")
    private Integer Id;
    private String loginid;
    private String username;
    private String password;
    private String sex;
    private String phone;
    private String email;
    private String card;
    private String stay_date;
    private String room_id = "1";
}
