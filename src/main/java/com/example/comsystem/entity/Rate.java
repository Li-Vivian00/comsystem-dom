package com.example.comsystem.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "rate")
@Data
public class Rate {
    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")

    private Integer Id;
    private String loginid;
    private String public_security;
    private String equipment_maintenance;
    private String service_attitude;
    private String environmental_assessment;
    private String overall_evaluation;
}
