package com.itheima.arrayList;

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        //掌握ArrayList集合的基本使用
        ArrayList<String> list=new ArrayList<>();  //泛型定义集合
        //增
        list.add("hello");
        list.add("world");
        list.add("java");
        list.add("java");
        System.out.println(list);
        //查看数据
        System.out.println(list.get(0));
        System.out.println(list.get(1));

        //遍历
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        //删除数据
        list.remove(0);
        System.out.println(list);
        //修改数据
        list.set(0,"java");
        System.out.println(list);
    }
}
