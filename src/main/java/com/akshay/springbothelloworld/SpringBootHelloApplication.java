package com.akshay.springbothelloworld;

import com.akshay.springbothelloworld.servletclasses.HelloFilter;
import com.akshay.springbothelloworld.servletclasses.HelloListener;
import com.akshay.springbothelloworld.servletclasses.HelloServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
// @ServletComponentScan
public class SpringBootHelloApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootHelloApplication.class, args);
	}

	// Register Servlet
	@Bean
    public ServletRegistrationBean getServletRegistrationBean() {
	    ServletRegistrationBean servletBean = new ServletRegistrationBean(new HelloServlet());
	    servletBean.addUrlMappings("/helloServlet");
	    return servletBean;
    }

    // Register Filter
    @Bean
    public FilterRegistrationBean getFilterRegistrationBean() {
	    FilterRegistrationBean filterBean = new FilterRegistrationBean(new HelloFilter());
	    // add url Patterns
	    filterBean.addUrlPatterns("/helloServlet");
	    return filterBean;
    }

    // Register Listener
    public ServletListenerRegistrationBean getServletListenerRegistrationBean() {
	    ServletListenerRegistrationBean listenerBean = new ServletListenerRegistrationBean(new HelloListener());
	    return listenerBean;
    }

}
