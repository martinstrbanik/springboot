package com.appslab.springbootapp.course;

import org.springframework.stereotype.Service;

@Service
public class CourseServiceImpl implements CourseService{
    CourseRepository courseRepository;

    public CourseServiceImpl(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    @Override
    public void saveCourse(Course course) {
        courseRepository.save(course);
    }
}
