package com.ralphgregorio.usaskunofficialapi.service.DTO;

import com.ralphgregorio.usaskunofficialapi.model.Courses;

import java.util.ArrayList;
import java.util.List;

public class ListCoursesServiceDTO {
    public String courseCode;
    public int courseNumber;
    public int creditUnits;
    public String college;
    public String department;
    public List<String> prerequisites;

    public static ListCoursesServiceDTO mapToDto(Courses courses) {
        ListCoursesServiceDTO dto = new ListCoursesServiceDTO();
        dto.courseCode = courses.getCourseCode();
        dto.courseNumber = courses.getCourseNumber();
        dto.creditUnits = courses.getCreditUnits();
        dto.college = courses.getCollege();
        dto.department = courses.getDepartment();
        dto.prerequisites = new ArrayList<>();
        return dto;
    }
}
