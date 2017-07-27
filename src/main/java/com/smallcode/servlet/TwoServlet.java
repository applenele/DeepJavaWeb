package com.smallcode.servlet;

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
public class TwoServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletContext context = this.getServletContext(); //获取ServletContext
        String contextValue = (String) context.getAttribute("demo");

        //获取指定名称的初始化参数  获取 context-param value 设置的值
        String jdbcUrl =  context.getInitParameter("jdbc-url");

        PrintWriter out = resp.getWriter();
        out.println("setted servlet context value:" + contextValue);
        out.println("context-param jdbc-url:" + jdbcUrl);

        //super.doGet(req, resp);
    }
}
