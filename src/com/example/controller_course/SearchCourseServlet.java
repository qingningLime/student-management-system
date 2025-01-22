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
@WebServlet("/searchCourse")
public class SearchCourseServlet extends HttpServlet {
    private CourseDao courseDao = new CourseDao();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String name = req.getParameter("name");
        String teacher = req.getParameter("teacher");

        List<Course> courses = courseDao.getCoursesByNameAndTeacher(name, teacher);

        req.setAttribute("courses", courses);
        req.getRequestDispatcher("coureseList.jsp").forward(req, resp);
    }
    }


