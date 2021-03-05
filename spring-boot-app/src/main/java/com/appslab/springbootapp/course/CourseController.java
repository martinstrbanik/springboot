package com.appslab.springbootapp.course;

import com.appslab.springbootapp.employee.Employee;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
    CourseService courseService;

    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    @PostMapping(value = "/course")
    public void request(@RequestBody Course course) {
        courseService.saveCourse(course);
    }

    @PostMapping(value = "/addStudent")
    public void request(@RequestBody Course course, Employee employee) {
        course.getEmployees().add(employee);
        employee.getCourses().add(course);
        courseService.saveCourse(course);
    }
}
