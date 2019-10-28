package com.example.comsystem.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "opinion_manage")
@Data
public class OpinionManage implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private Integer Id;
    private String loginid;
    private String username;
    private String submit_date;
    private String phone;
    private String complaint_type;
    private String content;
    private String suggestion;
    private String status;
    private String answer_content;
    private String answer_date;
}
