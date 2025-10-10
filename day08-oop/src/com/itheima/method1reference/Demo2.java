package com.itheima.method1reference;

import java.util.Arrays;

public class Demo2 {
    public static void main(String[] args) {
        test();
    }
    public static void test(){
        //准备一个学生类型的数组，存放6个学生对象
        Student[] students=new Student[6];
        students[0]=new Student("小王",24,170,'男');
        students[1]=new Student("小张",23,168,'女');
        students[2]=new Student("小李",22,169,'男');
        students[3]=new Student("小赵",21,170,'女');
        students[4]=new Student("小孙",20,171,'男');
        students[5]=new Student("小周",19,172,'女');
        //静态方法引用 类名::静态方法
        Arrays.sort(students,Student::compareByAge);
        //实例方法引用 对象名::实例方法
        Student t=new Student();
        Arrays.sort(students,t::compareByHeight);

        for (Student st:students){
            System.out.println(st);
        }
    }
}
