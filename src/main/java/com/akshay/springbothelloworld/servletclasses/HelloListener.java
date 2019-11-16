package com.akshay.springbothelloworld.servletclasses;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class HelloListener implements ServletContextListener {
    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("Servlet Context destroyed");
    }

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("Servlet Context Initialized");
    }
}
