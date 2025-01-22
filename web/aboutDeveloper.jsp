<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>lime's blog - 我的播放器</title>
    <link href="https://fonts.googleapis.com/css2?family=Pacifico&display=swap" rel="stylesheet">
    <style>
        body {
            font-family: 'Helvetica Neue', sans-serif;
            margin: 0;
            padding: 0;
            background-color: #f5f7fa;
            background-image: url('https://source.unsplash.com/xa7jZrTAVCM');
            background-size: cover;
            background-attachment: fixed;
            overflow-x: hidden;
        }
        .header {
            background-color: rgba(63, 81, 181, 0.8);
            color: white;
            padding: 20px 0;
            text-align: center;
            box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
            transition: background-color 0.3s;
            animation: slideInDown 1s forwards;
        }
        @keyframes slideInDown {
            0% {
                transform: translateY(-100%);
                opacity: 0;
            }
            100% {
                transform: translateY(0);
                opacity: 1;
            }
        }
        .header:hover {
            background-color: rgba(44, 62, 80, 0.9);
        }
        .container {
            margin: 50px auto;
            padding: 30px;
            background: rgba(255, 255, 255, 0.9);
            border-radius: 8px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
            max-width: 800px;
        }
        .footer {
            background-color: rgba(44, 62, 80, 0.8);
            color: white;
            text-align: center;
            padding: 15px 0;
            position: fixed;
            bottom: 0;
            width: 100%;
            animation: slideInUp 1s 1s forwards;
        }
        @keyframes slideInUp {
            0% {
                transform: translateY(100%);
                opacity: 0;
            }
            100% {
                transform: translateY(0);
                opacity: 1;
            }
        }
        .footer a {
            color: white;
            text-decoration: none;
            transition: color 0.3s;
        }
        .footer a:hover {
            color: #3498db;
        }
        h1 {
            font-family: 'Pacifico', cursive;
            font-size: 2.5em;
            margin: 0;
            animation: flipInX 1s 0.5s forwards;
        }
        @keyframes flipInX {
            0% {
                transform: perspective(400px) rotateX(90deg);
                opacity: 0;
            }
            40% {
                transform: perspective(400px) rotateX(-10deg);
            }
            70% {
                transform: perspective(400px) rotateX(10deg);
            }
            100% {
                transform: perspective(400px) rotateX(0deg);
                opacity: 1;
            }
        }
        h2 {
            color: #2c3e50;
        }
        p {
            line-height: 1.6;
            color: #7f8c8d;
        }
        ul {
            color: #7f8c8d;
        }
        a.button {
            display: inline-block;
            padding: 10px 20px;
            margin-top: 20px;
            background-color: #3498db;
            color: white;
            text-align: center;
            border-radius: 5px;
            text-decoration: none;
            font-weight: 500;
            transition: background-color 0.3s, box-shadow 0.3s;
            box-shadow: 0 2px 4px rgba(0, 0, 0, 0.2);
        }
        a.button:hover {
            background-color: #2980b9;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.2);
        }
    </style>
</head>
<body>
<div class="header">
    <h1>lime's blog</h1>
</div>
<div class="container">
    <h2>欢迎来到我的播放器介绍</h2>
    <p>这里是我个人开发的播放器，它具有以下特点：</p>
    <ul>
        <li>支持多种音频格式</li>
        <li>简洁的用户界面</li>
        <li>高效的播放性能</li>
        <li>跨平台支持</li>
    </ul>
    <p>如果你对播放器有任何建议或反馈，欢迎随时联系我。</p>
    <p>联系方式：3447131904@qq.com</p>
    <a href="111.html" class="button">打开播放器</a>
</div>
<div class="footer">
    <p>&copy; 2024 from Lime <a href="https://space.bilibili.com/356616145">关于</a></p>
</div>
</body>
</html>
