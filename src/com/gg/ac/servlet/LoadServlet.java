package com.gg.ac.servlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

public class LoadServlet extends HttpServlet {
    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("[LoadServlet]自动加载启动开始.");
        System.out.println("init(ServletConfig config)");
        String projectPath = config.getServletContext().getRealPath("/");
        System.out.println("projectPath:" + projectPath);
        super.init(config);
    }

    @Override
    public void init() throws ServletException {
        System.out.println("init");
        super.init();
    }

}
