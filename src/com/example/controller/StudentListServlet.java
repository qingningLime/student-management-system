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
@WebServlet("/studentList")
public class StudentListServlet extends HttpServlet {
    private StudentDao studentDao;
    @Override
    public void init() throws ServletException {
        // 初始化StudentDAO
        studentDao = new StudentDao();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        // 获取学生列表
        List<Student> students = studentDao.getStudents();
        // 将学生列表存储到请求属性中
        req.setAttribute("students", students);
        // 转发到JSP页面
        req.getRequestDispatcher("/studentList.jsp").forward(req, resp);


    }
}
