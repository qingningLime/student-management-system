<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>添加学生</title>
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
    nav {
      background-color: #333;
      overflow: hidden;
    }
    nav ul {
      list-style-type: none;
      margin: 0;
      padding: 0;
    }
    nav ul li {
      float: left;
    }
    nav ul li a {
      display: block;
      color: white;
      text-align: center;
      padding: 14px 16px;
      text-decoration: none;
    }
    nav ul li a:hover {
      background-color: #111;
    }
    nav ul li a.active {
      background-color: #4CAF50;
      color: white;
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
<nav>
  <ul>
    <li><a href="index.jsp">首页</a></li>
    <li><a href="addStudent.jsp" class="active">添加学生</a></li>
    <li><a href="students">学生列表</a></li>
  </ul>
</nav>
<h1>添加学生</h1>
<form action="addStudent" method="post">
  <label for="name">姓名:</label>
  <input type="text" id="name" name="name" required><br><br>

  <label for="age">年龄:</label>
  <input type="text" id="age" name="age" required><br><br>

  <label for="gender">性别:</label>
  <input type="text" id="gender" name="gender" required><br><br>

  <label for="score">分数:</label>
  <input type="text" id="score" name="score" required><br><br>

  <input type="submit" value="添加学生">
</form>
</body>
</html>

