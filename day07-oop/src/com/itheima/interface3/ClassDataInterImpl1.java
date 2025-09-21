package com.itheima.interface3;

public class ClassDataInterImpl1 implements ClassDataInter{
    private Student[] allStudents;

    public ClassDataInterImpl1(Student[] allStudents) {
        this.allStudents = allStudents;
    }

    @Override
    public void printAllStudentInfos() {
        //打印所有学生的信息
        System.out.println("全班信息如下：");
        for (int i = 0; i < allStudents.length; i++) {
            Student student=allStudents[i];
            System.out.println("姓名："+student.getName()+";性别："+student.getSex()+";成绩："+student.getScore()+"。");

        }
    }

    @Override
    public void printAverageScore() {
        //打印平均分
        double sum=0;
        for (int i = 0; i < allStudents.length; i++) {
            Student student=allStudents[i];
            sum+=student.getScore();
        }
        System.out.println("平均分："+sum/allStudents.length);

    }
}
