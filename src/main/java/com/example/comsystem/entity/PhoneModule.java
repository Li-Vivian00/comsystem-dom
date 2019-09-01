package com.example.comsystem.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="phone_module")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class PhoneModule implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private String police;
    private String fire;
    private String ambulance;
    private String plane_booking;
    private String train_booking;
    private String bus_hotline;
    private String consumer_complaints;
    private String weather_forecast;
}
