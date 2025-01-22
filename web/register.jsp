<%--
  Created by IntelliJ IDEA.
  User: 86186
  Date: 2024/12/9
  Time: 23:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册界面</title>
</head>

<style>
    body {
        font-family: 'Helvetica Neue', sans-serif;
        display: flex;
        justify-content: center;
        align-items: center;
        height: 100vh;
        margin: 0;
        background: linear-gradient(270deg, #ff9a9e, #fad0c4, #00aefd, #ffdde1, #6DD5FA, #FF758C, #FF7E5F);
        background-size: 800% 800%;
        animation: Gradient 15s ease infinite alternate;
    }

    .register-container {
        background-color: #fff;
        padding: 30px;
        border-radius: 8px;
        box-shadow: 0 4px 10px rgba(0, 0, 0, 0.1);
        width: 100%;
        max-width: 400px;
    }

    .register-container h2 {
        text-align: center;
        color: #333;
        margin-bottom: 20px;
    }

    .form-group {
        margin-bottom: 15px;
    }

    .form-group label {
        display: block;
        margin-bottom: 5px;
        color: #666;
    }

    .form-group input {
        width: 100%;
        padding: 12px;
        border: 1px solid #ddd;
        border-radius: 4px;
        box-sizing: border-box;
    }

    .form-group input:focus {
        outline: none;
        border-color: #007bff;
    }

    .form-group button {
        width: 100%;
        padding: 12px;
        border: none;
        border-radius: 4px;
        background-color: #007bff;
        color: white;
        cursor: pointer;
        margin-top: 10px;
    }

    .form-group button:hover {
        background-color: #0056b3;
    }

    .form-group button:disabled {
        background-color: #cccccc;
        cursor: not-allowed;
    }

    .form-group input[type="reset"] {
        background-color: #6c757d;
        margin-top: 10px;
    }

    .form-group input[type="reset"]:hover {
        background-color: #545b62;
    }
</style>
</head>
<body>

<div class="register-container">
    <h2>注册</h2>
    <form method="post" action="http://localhost:8081/demo2/register">
        <div class="form-group">
            <label for="username">用户名：</label>
            <input type="text" id="username" name="username" required>
        </div>
        <div class="form-group">
            <label for="password">密码：</label>
            <input type="password" id="password" name="password" required>
        </div>
        <div class="form-group">
            <label for="confirmPassword">确认密码：</label>
            <input type="password" id="confirmPassword" name="confirmPassword" required>
        </div>
        <div class="form-group">
            <button type="submit">注册</button>
        </div>
        <div class="form-group">
            <input type="reset" value="重置">
        </div>
    </form>
</div>

</body>
</html>
