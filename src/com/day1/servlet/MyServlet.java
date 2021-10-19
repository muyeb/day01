package com.day1.servlet;

import com.sun.net.httpserver.HttpsServer;
import org.omg.CORBA.PUBLIC_MEMBER;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/ServletDay1")
public class MyServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset = utf-8");
        req.setAttribute("key","123456");
//        req.getRequestDispatcher("test2.jsp").forward(req,resp);
        resp.sendRedirect("test2.jsp");
    }

}
