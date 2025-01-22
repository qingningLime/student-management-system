<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>添加课程</title>
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
<h1>添加课程</h1>
<form action="addCourse" method="post">
  <label for="name">课程名称:</label>
  <input type="text" id="name" name="name" required><br><br>

  <label for="description">课程描述:</label>
  <input type="text" id="description" name="description" required><br><br>

  <label for="teacher">教师:</label>
  <input type="text" id="teacher" name="teacher" required><br><br>

  <input type="submit" value="添加">
</form>
</body>
</html>
