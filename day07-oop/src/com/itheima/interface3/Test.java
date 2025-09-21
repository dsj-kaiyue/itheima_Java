package com.itheima.interface3;

public class Test {
    public static void main(String[] args) {
        Student[] allStudents=new Student[10];
        //创建10个Student对象
        allStudents[0]=new Student("小王",'男',90.5);
        allStudents[1]=new Student("小张",'女',80.5);
        allStudents[2]=new Student("小李",'男',70.5);
        allStudents[3]=new Student("小赵",'女',60.5);
        allStudents[4]=new Student("小王",'男',50.5);
        allStudents[5]=new Student("小1",'男',40.5);
        allStudents[6]=new Student("小2",'男',30.5);
        allStudents[7]=new Student("小3",'男',20.5);
        allStudents[8]=new Student("小4",'男',10.5);
        allStudents[9]=new Student("小5",'男',0.5);

        //提供两套业务实现方案

        ClassDataInter cdi1=new ClassDataInterImpl1(allStudents);
        ClassDataInter cdi2=new ClassDataInterImpl2(allStudents);
        cdi1.printAllStudentInfos();
        cdi1.printAverageScore();

        cdi2.printAllStudentInfos();
        cdi2.printAverageScore();

    }
}
