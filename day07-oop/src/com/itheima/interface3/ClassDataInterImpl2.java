package com.itheima.interface3;

public class ClassDataInterImpl2 implements ClassDataInter{
    private Student[] allStudents;

    public ClassDataInterImpl2(Student[] allStudents) {
        this.allStudents = allStudents;
    }
    @Override
    public void printAllStudentInfos() {
        //打印所有学生的信息，并且打印男生和女生总人数
        int maleCount=0;
        int femaleCount=0;
        System.out.println("全班信息如下：");
        for (int i = 0; i < allStudents.length; i++) {

            Student student=allStudents[i];
            System.out.println("姓名："+student.getName()+"；性别："+student.getSex()+"；成绩："+student.getScore()+"。");
            if(student.getSex()=='男'){
                maleCount++;
            }else{
                femaleCount++;
            }
        }
        System.out.println("男生总人数："+maleCount);
        System.out.println("女生总人数："+femaleCount);
    }



    @Override
    public void printAverageScore() {
        //实现打印平均分(去除最高分和最低分)
        double sum=0;
        double max=allStudents[0].getScore();
        double min=allStudents[0].getScore();
        for (int i = 0; i < allStudents.length; i++) {
            Student student=allStudents[i];
            sum+=student.getScore();

            if(student.getScore()>max){
                max=student.getScore();
            }
            if(student.getScore()<min){
                min=student.getScore();
            }
        }
        sum =sum-max-min;
        System.out.println("平均分："+sum/allStudents.length);
        System.out.println("最高分："+max);
        System.out.println("最低分："+min);
    }
}
