package com.ralphgregorio.usaskunofficialapi.controller;

import com.ralphgregorio.usaskunofficialapi.service.DTO.ListCoursesServiceDTO;
import com.ralphgregorio.usaskunofficialapi.service.ListCoursesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ListCoursesController {
    @Autowired
    ListCoursesService listCoursesService;

    @RequestMapping(value="/courses/{course_code}", method= RequestMethod.GET)
    public List<ListCoursesServiceDTO> listCourses(@PathVariable(value = "course_code") String courseCode) {
        return listCoursesService.execute(courseCode);
    }
}
