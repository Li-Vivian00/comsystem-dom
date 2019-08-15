package com.example.comsystem.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
@Entity
@Table(name="userinfo")
@Data
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String Id;
    private String loginid;
    private String username;
    private String password;
}
