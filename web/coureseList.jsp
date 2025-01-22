<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
<table>
    <tr>
        <th>ID</th>
        <th>课程名称</th>
        <th>课程描述</th>
        <th>教师</th>
    </tr>
    <c:forEach var="course" items="${courses}">
        <tr>
            <td>${course.course_id}</td>
            <td>${course.course_name}</td>
            <td>${course.course_description}</td>
            <td>${course.course_teacher}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
