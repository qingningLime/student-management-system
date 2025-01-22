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

@WebServlet("/deleteStudent")
public class DeleteStudentServlet extends HttpServlet {
    private StudentDao studentDao;
    @Override
    public void init() throws ServletException {
        // 初始化StudentDAO
        studentDao = new StudentDao();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 获取要删除的学生的ID
        String id = req.getParameter("id");

        // 删除学生
        studentDao.deleteStudent(id);
        // 获取学生列表
        List<Student> students = studentDao.getStudents();

        // 重定向到学生列表页面
        req.setAttribute("students", students);
        req.getRequestDispatcher("/students.jsp").forward(req, resp);
    }

}
