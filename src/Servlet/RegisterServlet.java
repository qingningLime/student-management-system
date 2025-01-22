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
import java.util.ArrayList;

@WebServlet(name = "RegisterServlet",urlPatterns = "/register")
public class RegisterServlet extends HttpServlet {
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

        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String confirmPassword = req.getParameter("confirmPassword");
        PrintWriter out = resp.getWriter();
       // out.println("账号: " + username + " 密码: " + password +"确认密码: " + confirmPassword);
        if (password.equals(confirmPassword)) {
            try{
                //将数据写入数据库
                Database database = new Database();
                database.insert(username,password,confirmPassword);
                out.println("注册成功");
                ArrayList<usedata> usedata=database.getAlluser();
                out.println("总表里面共有："+usedata.size()+"条数据");
                for (usedata u:usedata){
                    out.println(u.getUsername()+" "+u.getPassword());
                }
                out.println("<a href=\"http://localhost:8081/demo2/\">返回登录页面</a>");
            } catch (ClassNotFoundException e) {
               e.printStackTrace();
               out.println("注册失败");
            } catch (SQLException throwables) {
                throwables.printStackTrace();
                out.println("注册失败2");

            }

        }
        else{
            out.println("两次密码不一致");
            out.println("请返回重新注册"+"<a href=\"http://localhost:8081/demo2/register.jsp\">返回注册页面</a>");
        }
    }
}
