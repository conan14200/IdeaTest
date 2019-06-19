package com.gg.ac.test;

public class Test {
    public static String getTest(){
        //System.out.println("当前路径：" + System.getProperty("user.dir"));
        return "-->>调用方法getTest()";
    }

    public static void main(String[] args) {
        System.out.println(getTest());
    }
}
