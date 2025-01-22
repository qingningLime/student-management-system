package com.example.controller;

import com.example.dao.StudentDao;
import com.example.service.StudentService;
import com.example.student.Student;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;
@WebServlet("/students")
public class StudentServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        StudentDao studentDao = new StudentDao();
        List<Student> students = studentDao.getAllStudents();
        HttpSession session = req.getSession();


        session.setAttribute("students", students);
        req.getRequestDispatcher("/students.jsp").forward(req, resp);

    }
}
