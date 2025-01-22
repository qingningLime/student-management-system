package com.example.service;

import com.example.dao.StudentDao;
import com.example.student.Student;

import java.util.List;

public interface StudentService {
 StudentDao   studentDao = new StudentDao();
    public List<Student> getAllStudents();




}
