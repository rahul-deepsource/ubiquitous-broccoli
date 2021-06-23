package com.example.server;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.*;

public class Server extends HttpServlet {



    static final String DB_URL = "jdbc:mysql://localhost/users";
    static Connection conn;

    @Override protected void doPost(
        HttpServletRequest req, 
                          HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }

    @Override
    public void destroy() {
      super.destroy();
   }

    @Override
    public void init() throws ServletException {
       super.init();

        try {
            conn   = DriverManager.getConnection( DB_URL, "user" ,"");
        } catch (SQLException throwables) {
        throwables.printStackTrace();
        }

    }
}
