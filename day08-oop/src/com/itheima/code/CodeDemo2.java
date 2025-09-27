package com.itheima.code;

public class CodeDemo2 {
    //实例代码块
    //基本作用：初始化对象属性
    private String name;
    {
        System.out.println("====实例代码块执行开始====");
        name="itheima";
    }

    public static void main(String[] args) {

        System.out.println("====main方法执行开始====");
        new CodeDemo2();

        new CodeDemo2();
        new CodeDemo2();
    }




}
