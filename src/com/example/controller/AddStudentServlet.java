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
import java.util.UUID;

@WebServlet("/addStudent")
public class AddStudentServlet extends HttpServlet {
    private StudentDao studentDao;
    @Override
    public void init() throws ServletException {
        // 初始化StudentDAO
        studentDao = new StudentDao();
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       Integer id = UUID.randomUUID().hashCode();
        // 获取表单数据
        String name = req.getParameter("name");
        int age = Integer.parseInt(req.getParameter("age"));
        String gender = req.getParameter("gender");
        String score = req.getParameter("score");
        // 创建Student对象
        // 将表单数据封装到Student对象中

        Student student = new Student(id, name, age, gender, score);
        studentDao.addStudent(student);
        // 重定向到学生列表页面
       // resp.sendRedirect("students.jsp");
        // 将学生列表存储在请求属性中

        // 获取学生列表
        List<Student> students = studentDao.getStudents();

        // 重定向到学生列表页面
        req.setAttribute("students", students);
        req.getRequestDispatcher("/students.jsp").forward(req, resp);


    }

}
