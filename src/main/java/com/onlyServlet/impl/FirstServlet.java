package com.onlyServlet.impl;

import jakarta.servlet.annotation.WebServlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/first")
public class FirstServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // 1. set the content type(format)
        response.setContentType("text/html; charset = utf-8");
        // 2. output the format form 1
        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<title>first test Servlet</title>");
        out.println("</html>");
    }

}
