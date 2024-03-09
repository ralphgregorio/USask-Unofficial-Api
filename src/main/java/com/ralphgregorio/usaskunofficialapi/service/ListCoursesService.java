package com.ralphgregorio.usaskunofficialapi.service;

import com.ralphgregorio.usaskunofficialapi.model.Courses;
import com.ralphgregorio.usaskunofficialapi.repository.CoursesRepository;
import com.ralphgregorio.usaskunofficialapi.service.DTO.ListCoursesServiceDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ListCoursesService {
    @Autowired
    private CoursesRepository coursesRepository;

    public List<ListCoursesServiceDTO> execute(String courseCode) {

        List<Courses> coursesList = coursesRepository.findAllByCourseCode(courseCode);

        return coursesList.stream().map(ListCoursesServiceDTO::mapToDto).toList();
    }
}
