package com.akshay.springbothelloworld.servletclasses;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter(filterName = "helloFilter", urlPatterns = "/helloServlet")
public class HelloFilter implements Filter {
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("executing doFilter() Method");
        chain.doFilter(request, response);
        System.out.println("done Executing doFilter() Method");
    }
}
