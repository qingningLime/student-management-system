<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>教务管理系统</title>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link href="https://fonts.googleapis.com/css2?family=Roboto:wght@400;500;700&display=swap" rel="stylesheet">
  <style>
    body {
      font-family: 'Roboto', sans-serif;
      margin: 0;
      padding: 0;
      background-color: #f5f7fa;
      background-image: url('https://source.unsplash.com/xa7jZrTAVCM');
      background-size: cover;
      background-attachment: fixed;
      display: flex;
      flex-direction: column;
      min-height: 100vh;
    }
    header {
      background-color: rgba(63, 81, 181, 0.9);
      color: white;
      padding: 20px 0;
      text-align: center;
      box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
      transition: background-color 0.3s;
    }
    header:hover {
      background-color: rgba(44, 62, 80, 0.95);
    }
    nav {
      background: rgba(44, 62, 80, 0.8);
      color: white;
      padding: 15px;
    }
    nav ul {
      list-style-type: none;
      margin: 0;
      padding: 0;
      text-align: center;
      display: flex;
      justify-content: center;
      flex-wrap: wrap;
    }
    nav ul li {
      margin: 0 15px;
    }
    nav ul li a {
      color: white;
      text-decoration: none;
      font-weight: 500;
      transition: color 0.3s;
      padding: 10px 15px;
      border-radius: 5px;
    }
    nav ul li a:hover {
      color: #3498db;
      background-color: rgba(255, 255, 255, 0.1);
    }
    .content {
      margin: 30px auto;
      padding: 30px;
      background: rgba(255, 255, 255, 0.95);
      border-radius: 8px;
      box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
      max-width: 800px;
      opacity: 0;
      transform: translateY(20px);
      animation: fadeInUp 1s forwards;
      flex: 1;
    }
    @keyframes fadeInUp {
      to {
        opacity: 1;
        transform: translateY(0);
      }
    }
    footer {
      background-color: rgba(44, 62, 80, 0.9);
      color: white;
      text-align: center;
      padding: 15px 0;
      width: 100%;
    }
    .button {
      display: inline-block;
      padding: 12px 24px;
      margin: 10px;
      background-color: #3498db;
      color: white;
      text-align: center;
      border-radius: 5px;
      text-decoration: none;
      font-weight: 500;
      transition: background-color 0.3s, box-shadow 0.3s, transform 0.3s;
      box-shadow: 0 2px 4px rgba(0, 0, 0, 0.2);
    }
    .button:hover {
      background-color: #2980b9;
      box-shadow: 0 4px 8px rgba(0, 0, 0, 0.2);
      transform: translateY(-2px);
    }
    .highlight {
      color: #e74c3c;
      font-weight: bold;
    }
    h2 {
      color: #2c3e50;
    }
    p {
      line-height: 1.6;
      color: #7f8c8d;
    }
    .additional-links {
      text-align: center;
      margin-top: 20px;
    }
    .additional-links a {
      color: #3498db;
      text-decoration: none;
      margin: 0 10px;
      font-weight: 500;
    }
    .additional-links a:hover {
      text-decoration: underline;
    }
    /* 移动端样式 */
    @media (max-width: 768px) {
      nav ul li {
        display: block;
        margin: 10px 0;
      }
      .content {
        margin: 15px;
        padding: 20px;
      }
      footer {
        position: relative;
      }
    }
  </style>
</head>
<body>
<header>
  <h1>教务管理系统</h1>
</header>
<nav>
  <ul>
    <li><a href="login.jsp">登录</a></li>
    <li><a href="register.jsp">注册</a></li>
    <li><a href="courses">课程查询</a></li>
    <li><a href="students">学生信息</a></li>
  </ul>
</nav>
<section class="content">
  <h2>欢迎来到教务管理系统</h2>
  <p>请通过上方菜单访问相关功能。</p>
  <div class="button-container">
    <a href="login.jsp" class="button">立即登录</a>
    <a href="register.jsp" class="button">立即注册</a>
  </div>
  <div class="additional-links">
    <!-- 其他链接 -->
  </div>
  <p>如果你有任何問題，請聯繫我們的 <span class="highlight">客服團隊</span>。</p>
</section>
<footer>
  <p>&copy; 2024 教务管理系统 <a href="aboutDeveloper.jsp" style="color: #868686; text-decoration: none;">关于开发者</a></p>
</footer>
<script>
  document.addEventListener('DOMContentLoaded', (event) => {
    const buttons = document.querySelectorAll('.button');
    buttons.forEach(button => {
      button.addEventListener('mouseover', () => {
        button.style.transform = 'scale(1.05)';
      });
      button.addEventListener('mouseout', () => {
        button.style.transform = 'scale(1)';
      });
    });
  });
</script>
</body>
</html>
