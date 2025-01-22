package com.example.dao;

import com.example.student.Student;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentDao {
    private String jdbcURL = "jdbc:mysql://localhost:3306/Login";
    private String jdbcUsername = "root";
    private String jdbcPassword = "root";


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
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Login", "root", "root");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

    public List<Student> getAllStudents() {
        List<Student> students = new ArrayList<>();
        String sql = "SELECT * FROM score";

        try (Connection conn = getConnection();
             PreparedStatement prep = conn.prepareStatement(sql);
             ResultSet resultSet = prep.executeQuery()) {

            System.out.println("SQL 查询成功执行");
            while (resultSet.next()) {
                System.out.println("查询结果集包含数据");
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int age = resultSet.getInt("age");
                String gender = resultSet.getString("gender");
                String score = resultSet.getString("score");
                students.add(new Student(id, name, age, gender, score));
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("SQL 查询失败");
        }
        return students;
    }

    public void addStudent(Student student) {
        String sql = "INSERT INTO score (name, age, gender, score) VALUES (?, ?, ?, ?)";
        try (Connection conn = getConnection();
             PreparedStatement prep = conn.prepareStatement(sql)) {
            prep.setString(1, student.getName());
            prep.setInt(2, student.getAge());
            prep.setString(3, student.getGender());
            prep.setString(4, student.getScore());
            prep.executeUpdate();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Student> getStudents() {
        List<Student> students = new ArrayList<>();

        String sql = "SELECT * FROM score";

        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Login", "root", "root");
             PreparedStatement pstmt = conn.prepareStatement(sql);
             ResultSet rs = pstmt.executeQuery()) {

            while (rs.next()) {
                Integer id = rs.getInt("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");
                String gender = rs.getString("gender");
                String score = rs.getString("score");

                Student student = new Student(id, name, age, gender, score);
                students.add(student);
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return students;
    }

    public void deleteStudent(String id) {
        String sql = "DELETE FROM score WHERE id = ?";
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Login", "root", "root");
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, id);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void updateStudent(Student student) {
        String sql = "UPDATE score SET name = ?, age = ?, gender = ?, score = ? WHERE id = ?";
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Login", "root", "root");
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, student.getName());
            pstmt.setInt(2, student.getAge());
            pstmt.setString(3, student.getGender());
            pstmt.setString(4, student.getScore());
            pstmt.setInt(5, student.getId());
            pstmt.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public List<Student> getStudentsByNameAndAge(String name, int age) {
        List<Student> students = new ArrayList<>();
        String sql = "SELECT * FROM score WHERE name = ? AND age = ?";

        try (Connection conn = getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, name);
            pstmt.setInt(2, age);
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String studentName = rs.getString("name");
                int studentAge = rs.getInt("age");
                String gender = rs.getString("gender");
                String score = rs.getString("score");

                Student student = new Student(id, studentName, studentAge, gender, score);
                students.add(student);
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return students;
}


}
