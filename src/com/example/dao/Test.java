package com.example.dao;

import com.example.student.Student;

import java.util.List;

public class Test {

    public static void main(String[] args) {
        StudentDao studentDao = new StudentDao();
        List<Student> students = studentDao.getAllStudents();
        for (Student student : students) {
            System.out.println(student);

        }

    }
}
