package com.example.controller_course;

import com.example.course.Course;
import com.example.dao.CourseDao;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
@WebServlet("/deleteCourse")
public class DeleteCourseServlet extends HttpServlet {
    //delete student
    private com.example.dao.CourseDao CourseDao;
    public void init() throws ServletException {
        // 初始化StudentDAO
        CourseDao = new CourseDao();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 获取要删除的课程的ID
        String courseId = req.getParameter("id");
        // 调用DAO删除课程
        CourseDao.deleteCourse(courseId);
        // 重定向到课程列表页面
        List<Course> courses= CourseDao.getCourses();

        req.setAttribute("courses", courses);
        req.getRequestDispatcher("/courses.jsp").forward(req, resp);

    }
}
