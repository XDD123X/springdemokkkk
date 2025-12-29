package com.example.demo.Entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "Department", schema = "dbo")
public class Department {

    @Id
    @Column(name = "name")
    private String name;

    private String location;

    @OneToMany(mappedBy = "department")
    private List<Course> courses;

    @OneToMany(mappedBy = "department")
    private List<Instructor> instructors;
}

