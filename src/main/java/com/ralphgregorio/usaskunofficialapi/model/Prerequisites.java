package com.ralphgregorio.usaskunofficialapi.model;

import jakarta.persistence.*;

@Entity
@Table(name = "prerequisites")
public class Prerequisites {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name="course_id")
    private Long courseId;

    @Column(name="prerequisite_course_id")
    private Long prerequisiteCourseId;

    public Long getId() {
        return id;
    }

    public Long getCourseId() {
        return courseId;
    }

    public Long getPrerequisiteCourseId() {
        return prerequisiteCourseId;
    }
}