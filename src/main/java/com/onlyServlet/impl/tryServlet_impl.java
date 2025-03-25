package com.onlyServlet.impl;

import com.onlyServlet.tryServlet;
import jakarta.servlet.annotation.WebServlet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/tryServlet_impl")
public class tryServlet_impl extends HttpServlet implements tryServlet {

    // method:
    @Override
    public void doServlet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        response.getWriter().write("<h1>Hello, Servlet!</h1>");

    }
}

