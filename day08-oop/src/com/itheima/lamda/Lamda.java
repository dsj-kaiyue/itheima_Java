package com.itheima.lamda;


//Lamda 只能简化函数式接口的匿名内部类


import com.itheima.innnerclass3.Student;

import java.util.Arrays;

public class Lamda {
    public static void main(String[] args) {
        //准备一个学生类型的数组，存放6个学生对象
        Student[] students=new Student[6];
        students[0]=new Student("小王",24,170,'男');
        students[1]=new Student("小张",23,168,'女');
        students[2]=new Student("小李",22,169,'男');
        students[3]=new Student("小赵",21,170,'女');
        students[4]=new Student("小孙",20,171,'男');
        students[5]=new Student("小周",19,172,'女');

        Arrays.sort(students, (o1,o2 )-> {
                return o1.getAge()-o2.getAge();
        });
        for (Student st:students){
            System.out.println(st);
        }

    }
}
