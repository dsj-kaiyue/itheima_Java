package com.itheima.code;

public class CodeDemo1 {
    public static String SchoolName;
    //静态代码块
    //基本作用：给静态变量赋值

    static {
        System.out.println("====静态代码块执行力====");
        SchoolName="清华大学";
    }
    public static void main(String[] args) {
        System.out.println("====main方法执行开始====");

    }
}
