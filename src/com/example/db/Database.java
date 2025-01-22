package com.example.db;

import com.example.model.usedata;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Database {
    Connection conn = null;
    private String username;

    public Database() throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.cj.jdbc.Driver");//注册驱动
        this.conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/login", "root", "root");
//


    }

    public void showConnect() {
        if (conn == null) {
            System.out.println("数据库连接失败");
        } else {
            System.out.println("数据库连接成功");
        }
    }

    //关闭连接
    public void closeConnect() throws SQLException {
        conn.close();
    }

    //    获取连接
    public void insert(String id ,String password,String username) throws SQLException {
        this.username = username;
        PreparedStatement prep = conn.prepareStatement("insert into login (id, password,username) values (?, ?,?)");
        prep.setString(1, id);
        prep.setString(2, password);
        prep.setString(3, username);
        prep.executeUpdate();
    }




    public ArrayList<usedata> getAlluser() throws SQLException {
        ArrayList<usedata> list = new ArrayList<>();
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/login", "root", "root");
             PreparedStatement prep = conn.prepareStatement("select * from Login.login")) {
            prep.execute();
            ResultSet resultSet = prep.getResultSet();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String password = resultSet.getString("password");
                String username = resultSet.getString("username");
                list.add(new usedata(id,username, password));
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw e;
        }
        return list;
    }
    //在表里查询数据
    public usedata  getUser(int id) throws SQLException {
        PreparedStatement prep = conn.prepareStatement("select * from login where id = ?");
        prep.setInt(1, id);
        prep.execute();
        ResultSet resultSet = prep.executeQuery();
        if (resultSet.next()) {//
            // System.out.println(resultSet.getString("password"));
            int myid = resultSet.getInt("id");
            String password = resultSet.getString("password");
            String username = resultSet.getString("username");
            return new usedata(id,username, password);
        }
        return null;
    }
    public usedata login(int id,String password) throws SQLException {
        PreparedStatement prep = conn.prepareStatement("select * from login where id = ? and password = ? ");
        prep.setInt(1, id);
        prep.setString(2, password);
        
        prep.execute();
        ResultSet resultSet = prep.executeQuery();
        if (resultSet.next()) {//
            String mypd = resultSet.getString("password");
            if (mypd.equals(password)) {
                return getUser(id);
            } else
                return null;

    }
        else
            return null;
    }
}


