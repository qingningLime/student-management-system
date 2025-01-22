<%--
  Created by IntelliJ IDEA.
  User: 86186
  Date: 2024/12/9
  Time: 21:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="com.example.course.Course" %>
<%@ page import="java.util.List" %>
<html>
<head>
  <title>课程列表</title>
  <style>
    body {
      font-family: Arial, sans-serif;
      background-color: #f4f4f4;
      margin: 40px;
    }
    h1 {
      text-align: center;
      color: #333;
    }
    a {
      display: inline-block;
      margin: 10px;
      padding: 10px 20px;
      background-color: #4CAF50;
      color: white;
      text-decoration: none;
      border-radius: 4px;
    }
    a:hover {
      background-color: #45a049;
    }
    table {
      width: 80%;
      margin: 20px auto;
      border-collapse: collapse;
      box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
      background-color: #fff;
    }
    th, td {
      padding: 12px;
      text-align: left;
      border-bottom: 1px solid #ddd;
    }
    th {
      background-color: #f2f2f2;
    }
    tr:hover {
      background-color: #f5f5f5;
    }
  </style>
</head>
<body>
<h1>课程列表</h1>
<a href="addcourses.jsp">添加课程</a>
<a href="searchCourse.jsp">查询课程</a>
<table>
  <tr>
    <th>课程ID</th>
    <th>课程名称</th>
    <th>课程描述</th>
    <th>教师</th>
    <th>操作</th>
  </tr>
  <%
    List<Course> courses = (List<Course>) request.getAttribute("courses");
    if (courses != null) {
      for (Course course : courses) {
  %>
  <tr>
    <td><%= course.getCourse_id() %></td>
    <td><%= course.getCourse_name() %></td>
    <td><%= course.getCourse_description() %></td>
    <td><%= course.getCourse_teacher() %></td>
    <td>
      <a href="updateCourse.jsp?id=<%= course.getCourse_id() %>">编辑</a>
      <a href="deleteCourse?id=<%= course.getCourse_id() %>">删除</a>
    </td>
  </tr>
  <%
    }
  } else {
  %>
  <tr>
    <td colspan="5">没有课程</td>
  </tr>
  <%
    }
  %>
</table>
</body>
</html>
