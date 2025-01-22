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

@WebServlet("/updateStudent")
public class UpdateStudentServlet extends HttpServlet {
    private StudentDao studentDao;
    @Override
    public void init() throws ServletException {
        // 初始化StudentDAO
        studentDao = new StudentDao();
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 获取要更新的学生的ID
        Integer id = Integer.parseInt(req.getParameter("id"));

        String name = req.getParameter("name");
        Integer age = Integer.parseInt(req.getParameter("age")); // 从请求参数中获取年龄
        String gender = req.getParameter("gender");
        String score = req.getParameter("score");
        // 创建学生对象
        Student student = new Student(id, name, age, gender, score );

        // 更新学生
        studentDao.updateStudent(student);

        // 获取学生列表
        List<Student> students = studentDao.getStudents();

        // 重定向到学生列表页面
        req.setAttribute("students", students);
        req.getRequestDispatcher("/students.jsp").forward(req, resp);
    }
}

