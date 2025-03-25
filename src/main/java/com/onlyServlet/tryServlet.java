package com.onlyServlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public interface tryServlet {
    void doServlet(HttpServletRequest request, HttpServletResponse response) throws IOException;
}
