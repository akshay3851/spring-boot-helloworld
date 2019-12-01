package com.akshay.springbothelloworld.servletclasses;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name="helloServlet", urlPatterns = "/helloServlet")
public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
         response.getWriter().println("Hello From Servlet 1");
        System.out.println("Running our first Servlet doGet() method");
    }
}