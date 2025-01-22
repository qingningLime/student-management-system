<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login Page</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css">
    <link href="https://fonts.googleapis.com/css2?family=Pacifico&display=swap" rel="stylesheet">
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

        @keyframes Gradient {
            0% { background-position: 0% 50%; }
            100% { background-position: 100% 50%; }
        }

        .login-container {
            background-color: rgba(255, 255, 255, 0.2);
            padding: 40px;
            border-radius: 15px;
            box-shadow: 0 10px 20px rgba(0, 0, 0, 0.1);
            width: 400px;
            text-align: center;
            opacity: 0;
            transform: translateY(20px);
            animation: bounceIn 0.8s forwards;
            position: relative;
            z-index: 2;
            backdrop-filter: blur(10px);
        }

        @keyframes bounceIn {
            0% {
                opacity: 0;
                transform: translateY(20px) scale(0.9);
            }
            50% {
                opacity: 0.5;
                transform: translateY(-10px) scale(1.05);
            }
            70% {
                transform: translateY(5px) scale(0.95);
            }
            100% {
                opacity: 1;
                transform: translateY(0) scale(1);
            }
        }

        .login-container h2 {
            margin-bottom: 30px;
            font-size: 36px;
            color: #333;
            font-weight: normal;
            font-family: 'Pacifico', cursive;
        }

        .form-group {
            margin-bottom: 25px;
            position: relative;
        }

        .form-group i {
            position: absolute;
            left: 15px;
            top: 50%;
            transform: translateY(-50%);
            color: #aaa;
            font-size: 18px;
            transition: color 0.3s;
        }

        .form-group input {
            width: 100%;
            padding: 15px;
            padding-left: 40px;
            box-sizing: border-box;
            border: 2px solid #ccc;
            border-radius: 25px;
            font-size: 16px;
            transition: border-color 0.3s, box-shadow 0.3s;
        }

        .form-group input:focus {
            border-color: #007BFF;
            outline: none;
            box-shadow: 0 0 8px rgba(0, 123, 255, 0.5);
        }

        .form-group input:focus + i {
            color: #007BFF;
        }

        .form-group button {
            width: 100%;
            padding: 15px;
            border: none;
            border-radius: 25px;
            font-size: 18px;
            color: #fff;
            background: linear-gradient(270deg, #8E2DE2, #4A00E0);
            background-size: 200% 200%;
            animation: ButtonGradient 2s ease infinite alternate;
            cursor: pointer;
            transition: background-color 0.3s, transform 0.3s;
        }

        .form-group button:hover {
            background: #6c5b7b;
            animation: none;
            transform: translateY(-5px);
            box-shadow: 0 5px 15px rgba(0, 0, 0, 0.2);
        }

        @keyframes ButtonGradient {
            0% { background-position: 0% 50%; }
            100% { background-position: 100% 50%; }
        }

        @media (max-width: 500px) {
            .login-container {
                width: 90%;
                padding: 20px;
            }
        }
    </style>
</head>
<body>
<div class="login-container">
    <h2>Login</h2>
    <form action="<%=request.getContextPath()%>/login" method="post">
        <div class="form-group">
            <i class="fas fa-user"></i>
            <input type="text" placeholder="Username" name="id" required>
        </div>
        <div class="form-group">
            <i class="fas fa-lock"></i>
            <input type="password" placeholder="Password" name="password" required>
        </div>
        <div class="form-group">
            <button type="submit">Login</button>
        </div>
    </form>
</div>
</body>
</html>
