package com.ralphgregorio.usaskunofficialapi.model;

import jakarta.persistence.*;

@Entity
@Table(name = "courses")
public class Courses {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name="course_code")
    private String courseCode;

    @Column(name="course_number")
    private int courseNumber;

    @Column(name="credit_units")
    private int creditUnits;

    @Column(name="college")
    private String college;

    @Column(name="department")
    private String department;

    public Long getId() {
        return id;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public int getCourseNumber() {
        return courseNumber;
    }

    public int getCreditUnits() {
        return creditUnits;
    }

    public String getCollege() {
        return college;
    }

    public String getDepartment() {
        return department;
    }
}