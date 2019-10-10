package com.example.comsystem.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "opinion_manage")
@Data
@AllArgsConstructor
@NoArgsConstructor

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
}
