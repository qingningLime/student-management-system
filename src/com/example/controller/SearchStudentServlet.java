package com.example.controller;

import com.example.dao.StudentDao;
import com.example.student.Student;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
@WebServlet("/search")
public class SearchStudentServlet extends HttpServlet {
    private StudentDao studentDao = new StudentDao();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String ageStr = req.getParameter("age");
        int age = ageStr != null ? Integer.parseInt(ageStr) : 0;

        List<Student> students = studentDao.getStudentsByNameAndAge(name, age);

        req.setAttribute("students", students);
        req.getRequestDispatcher("searchResult.jsp").forward(req, resp);
    }
}
