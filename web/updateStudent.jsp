<%--
  Created by IntelliJ IDEA.
  User: 86186
  Date: 2024/12/11
  Time: 00:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>编辑学生信息</title>
  <style>
    body {
      font-family: Arial, sans-serif;
      margin: 40px;
    }
    h1 {
      text-align: center;
      color: #333;
    }
    form {
      max-width: 400px;
      margin: 0 auto;
    }
    label {
      display: block;
      margin-top: 20px;
    }
    input[type="text"] {
      width: 100%;
      padding: 8px;
      margin-top: 5px;
      box-sizing: border-box;
    }
    input[type="submit"] {
      width: 100%;
      padding: 10px;
      margin-top: 20px;
      background-color: #4CAF50;
      color: white;
      border: none;
      cursor: pointer;
    }
    input[type="submit"]:hover {
      background-color: #45a049;
    }
  </style>
</head>
<body>
<h1>编辑学生信息</h1>
<form action="updateStudent" method="post">
  <label for="id">学生ID:</label>
  <input type="text" id="id" name="id" value="${student.id}" required><br><br>

  <label for="name">学生姓名:</label>
  <input type="text" id="name" name="name" value="${student.name}" required><br><br>

  <label for="age">学生年龄:</label>
  <input type="text" id="age" name="age" value="${student.age}" required><br><br>

  <label for="gender">学生性别:</label>
  <input type="text" id="gender" name="gender" value="${student.gender}" required><br><br>

  <label for="score">学生分数:</label>
  <input type="text" id="score" name="score" value="${student.score}" required><br><br>

  <input type="submit" value="更新">
</form>
</body>
</html>
