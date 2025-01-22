package com.example.dao;

import com.example.course.Course;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CourseDao {
    private String jdbcURL = "jdbc:mysql://localhost:3306/Login?serverTimezone=GMT%2B8";
    private String jdbcUsername = "root";
    private String jdbcPassword = "root";


    // JDBC 驱动名及数据库URL


    // JDBC 驱动名及数据库URL
    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    // 获取数据库连接
    private Connection getConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Login?serverTimezone=GMT%2B8", "root", "root");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }



        public List<Course> getAllCourses() {
            List<Course> course = new ArrayList<>();
            String sql = "SELECT * FROM course";

            try (Connection conn = getConnection();
                 PreparedStatement prep = conn.prepareStatement(sql);
                 ResultSet resultSet = prep.executeQuery()) {

                System.out.println("SQL 查询成功执行");
                while (resultSet.next()) {
                    System.out.println("查询结果集包含数据");
                    int id = resultSet.getInt("course_id");
                    String name = resultSet.getString("course_name");
                    String description = resultSet.getString("course_description");
                    String teacher = resultSet.getString("course_teacher");


                    course.add(new Course(id, name, description, teacher));
                }
            } catch (SQLException e) {
                e.printStackTrace();
                System.out.println("SQL 查询失败");
            }
            return course;
        }

        public void addCourse(Course course) {
            String sql = "INSERT INTO course (course_name, course_description, course_teacher) VALUES (?, ?, ?)";
            try (Connection conn = getConnection();
                 PreparedStatement prep = conn.prepareStatement(sql)) {
                prep.setString(1, course.getCourse_name());
                prep.setString(2, course.getCourse_description());
                prep.setString(3, course.getCourse_teacher());
                prep.executeUpdate();
                System.out.println("SQL 插入成功执行");
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }

        public List<Course> getCourses() {
            List<Course> courses = new ArrayList<>();

            String sql = "SELECT * FROM course";

            try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Login?serverTimezone=GMT%2B8", "root", "root");
                 PreparedStatement pstmt = conn.prepareStatement(sql);
                 ResultSet rs = pstmt.executeQuery()) {

                while (rs.next()) {
                    int id = rs.getInt("course_id");
                    String name = rs.getString("course_name");
                    String description = rs.getString("course_description");
                    String teacher = rs.getString("course_teacher");

                    Course course = new Course(id, name, description,teacher);
                    courses.add(course);
                }

            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }

            return courses;
        }

        public void deleteCourse(String id) {
            String sql = "DELETE FROM course WHERE course_id = ?";
            try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Login?serverTimezone=GMT%2B8", "root", "root");
                 PreparedStatement pstmt = conn.prepareStatement(sql)) {
                pstmt.setString(1, id);
                pstmt.executeUpdate();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }

        public void updateCourse(Course course) {
            String sql = "UPDATE course SET course_name = ?, course_description = ?, course_teacher = ? WHERE course_id = ?";
            try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Login?serverTimezone=GMT%2B8", "root", "root");
                 PreparedStatement pstmt = conn.prepareStatement(sql)) {
                pstmt.setString(1, course.getCourse_name());
                pstmt.setString(2, course.getCourse_description());
                pstmt.setInt(4, course.getCourse_id());
                pstmt.setString(3, course.getCourse_teacher());
                pstmt.executeUpdate();

            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }

    public List<Course> getCoursesByNameAndTeacher(String name, String teacher) {
        List<Course> courses = new ArrayList<>();
        String sql = "SELECT * FROM course WHERE course_name = ? AND course_teacher = ?";

        try (Connection conn = getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, name);
            pstmt.setString(2, teacher);
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("course_id");
                String courseName = rs.getString("course_name");
                String description = rs.getString("course_description");
                String courseTeacher = rs.getString("course_teacher");

                Course course = new Course(id, courseName, description, courseTeacher);
                courses.add(course);
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return courses;
    }
}
