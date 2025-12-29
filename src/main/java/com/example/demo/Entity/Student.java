package com.example.demo.Entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "Student", schema = "dbo")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String firstName;
    private String lastName;
    private String phone;

    @ManyToMany(mappedBy = "students")
    private List<Course> courses;
}
