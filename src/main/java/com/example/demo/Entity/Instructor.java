package com.example.demo.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Instructor", schema = "dbo")
public class Instructor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String firstName;
    private String lastName;
    private String phone;

    @ManyToOne
    @JoinColumn(name = "departmentName")
    private Department department;
}

