package com.ralphgregorio.usaskunofficialapi.repository;

import com.ralphgregorio.usaskunofficialapi.model.Courses;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CoursesRepository extends JpaRepository<Courses, Long> {
    List<Courses> findAllByCourseCode(String courseCode);
}
