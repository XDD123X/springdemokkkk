package com.example.demo.Entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "Course", schema = "dbo")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
    private Integer duration;

    @ManyToOne
    @JoinColumn(name = "departmentName")
    private Department department;

    @ManyToOne
    @JoinColumn(name = "instructorID")
    private Instructor instructor;

    @ManyToMany
    @JoinTable(
            name = "course_student",
            joinColumns = @JoinColumn(name = "courseID"),
            inverseJoinColumns = @JoinColumn(name = "studentID")
    )
    private List<Student> students;
}

