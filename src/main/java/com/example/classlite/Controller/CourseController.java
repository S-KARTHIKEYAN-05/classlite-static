package com.example.classlite.Controller;

import com.example.classlite.model.Course;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {

    @GetMapping("/courses")
    public List<Course> getCourses() {
        return Arrays.asList(
                new Course(1L, "Math 101", "Basic Mathematics"),
                new Course(2L, "Science 201", "Introduction to Physics"),
                new Course(3L, "History 101", "World History Overview")
        );
    }
}
