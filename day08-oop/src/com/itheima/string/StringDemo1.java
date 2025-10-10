package com.itheima.string;

import java.util.Scanner;

public class StringDemo1 {
    public static void main(String[] args) {
        //方式一  ==========推荐========
        String s1="hello";
        System.out.println(s1);
        System.out.println(s1.length());
        //方式二
        String s2=new String();
        System.out.println(s2); // ""
        System.out.println(s2.length());
        //方式三
        String s3=new String("hello");
        System.out.println(s3);
        //方式四
        char[] ch={'h','e','l','l','o'};
        String s4=new String(ch);
        System.out.println(s4);

        byte[] b={97,98,99,100,101};
        String s5=new String(b);
        System.out.println(s5);

        //调用字符串的方法，处理数据
        //简易版的登录
        String username="admin";
        System.out.println("请输入用户名：");
        Scanner sc=new Scanner(System.in);
        String loginName= sc.next();

        //字符串的内容比较，不要使用==，使用equals
        if(username.equals(loginName)){
            System.out.println("登录成功");
        }else{
            System.out.println("登录失败");
        }



    }
}
