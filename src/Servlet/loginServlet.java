package Servlet;

import com.example.db.Database;
import com.example.model.usedata;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

@WebServlet("/login")
public class loginServlet extends HttpServlet {
//     重写doGet方法
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //解决网页乱码问题
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");
        resp.setCharacterEncoding("utf-8");

        //获取请求参数
        int id = Integer.parseInt(req.getParameter("id"));
        String password = req.getParameter("password");
        PrintWriter out = resp.getWriter();
        out.println("账号: " + id + " 密码: " +password);

        try {

            Database db = new Database();
            usedata usedata=db.login(id, password);
            if (usedata==null){
               out.println("该用户不存在或者密码错误"+"<a href=\"http://localhost:8088/SHIXUNZHOU_Web_exploded/\">返回登录页面</a>");

            }
            else {
              out.println("欢迎登录"+usedata.getUsername()+"用户"+"<a href=\"http://localhost:8088/SHIXUNZHOU_Web_exploded/\">返回登录页面</a>");
              //返回页面
                // 返回页面
//                resp.sendRedirect("http://localhost:8088/SHIXUNZHOU_Web_exploded/index.jsp");

            }
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
