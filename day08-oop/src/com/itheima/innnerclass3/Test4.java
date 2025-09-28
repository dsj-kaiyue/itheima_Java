package com.itheima.innnerclass3;

import java.util.Arrays;
import java.util.Comparator;

public class Test4 {
    public static void main(String[] args) {
        //准备一个学生类型的数组，存放6个学生对象
        Student[] students=new Student[6];
        students[0]=new Student("小王",24,170,'男');
        students[1]=new Student("小张",23,168,'女');
        students[2]=new Student("小李",22,169,'男');
        students[3]=new Student("小赵",21,170,'女');
        students[4]=new Student("小孙",20,171,'男');
        students[5]=new Student("小周",19,172,'女');


        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                //按照年龄升序
                return o1.getAge()-o2.getAge();
                //按照年龄降序
//                return o2.getAge()- o1.getAge();
            }
        });
        for (Student st:students){
            System.out.println(st);
        }

    }
}
