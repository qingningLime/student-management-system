package com.example.dao;

import com.example.course.Course;

import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        // 测试
        CourseDao courseDao = new CourseDao();
        List<Course> course = courseDao.getAllCourses();
        System.out.println(course);
    }
}
