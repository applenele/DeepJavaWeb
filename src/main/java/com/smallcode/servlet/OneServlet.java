package com.smallcode.servlet;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Lenny on 2017/7/28.
 */
public class OneServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletContext context = this.getServletContext(); //获取ServletContext

        context.setAttribute("demo", "one");  // 设置ServletContext 值

        Object obj = context.getAttribute("demo"); //获取ServletContext  值

        PrintWriter out = resp.getWriter();
        out.println("set servletcontext");


        ApplicationContext ac = new FileSystemXmlApplicationContext("applicationContext.xml");
        ac.getBean("beanId");

        //super.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
