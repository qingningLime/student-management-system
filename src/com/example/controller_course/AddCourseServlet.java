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
import java.util.UUID;

@WebServlet("/addCourse")
public class AddCourseServlet extends HttpServlet {
    private CourseDao  CourseDao;
    public void init() throws ServletException {
        // 初始化StudentDAO
       CourseDao = new CourseDao();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Integer id = UUID.randomUUID().hashCode();
        String name = req.getParameter("name");
        String description = req.getParameter("description");
        String teacher = req.getParameter("teacher");


        Course course = new Course(id,name, description,teacher);
        CourseDao.addCourse(course);
        List<Course> courses= CourseDao.getCourses();
        req.setAttribute("courses", courses);
        req.getRequestDispatcher("/courses.jsp").forward(req, resp);
    }
}

