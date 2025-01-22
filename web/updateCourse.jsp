<%--
  Created by IntelliJ IDEA.
  User: 86186
  Date: 2024/12/11
  Time: 11:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>更新课程</title>
  <style>
    body {
      font-family: Arial, sans-serif;
      margin: 40px;
      background-color: #f4f4f4;
    }
    h1 {
      text-align: center;
      color: #333;
    }
    form {
      max-width: 400px;
      margin: 0 auto;
      background: #fff;
      padding: 20px;
      border-radius: 8px;
      box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
    }
    label {
      display: block;
      margin-top: 20px;
      color: #333;
    }
    input[type="text"] {
      width: 100%;
      padding: 8px;
      margin-top: 5px;
      box-sizing: border-box;
      border: 1px solid #ccc;
      border-radius: 4px;
    }
    input[type="submit"] {
      width: 100%;
      padding: 10px;
      margin-top: 20px;
      background-color: #4CAF50;
      color: white;
      border: none;
      border-radius: 4px;
      cursor: pointer;
    }
    input[type="submit"]:hover {
      background-color: #45a049;
    }
  </style>
</head>
<body>
<h1>更新课程</h1>
<form action="updateCourse" method="post">
  <label for="id">课程ID:</label>
  <input type="text" id="id" name="id" value="<%= request.getAttribute("id") %>" required><br><br>

  <label for="name">课程名称:</label>
  <input type="text" id="name" name="name" value="<%= request.getAttribute("name") %>" required><br><br>

  <label for="description">课程描述:</label>
  <input type="text" id="description" name="description" value="<%= request.getAttribute("description") %>" required><br><br>

  <label for="teacher">教师:</label>
  <input type="text" id="teacher" name="teacher" value="<%= request.getAttribute("teacher") %>" required><br><br>

  <input type="submit" value="更新">
</form>
</body>
</html>
