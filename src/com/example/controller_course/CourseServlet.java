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

@WebServlet("/courses")
public class CourseServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        CourseDao courseDao = new CourseDao();
        List<Course> courses = courseDao.getAllCourses();


        req.setAttribute("courses", courses);
        req.getRequestDispatcher("/courses.jsp").forward(req, resp);
    }
}
