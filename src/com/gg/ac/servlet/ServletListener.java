package com.gg.ac.servlet;

import com.gg.ac.test.Test;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ServletListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent context) {
        System.out.println("[ServletListener]自动加载启动开始.");
        System.out.println("ServletListener.contextInitialized()==========");
        System.out.println(Test.getTest());
    }

    @Override
    public void contextDestroyed(ServletContextEvent context) {
        System.out.println("ServletListener.contextDestroyed()......");
    }
}
