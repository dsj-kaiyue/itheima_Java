package com.itheima.demo;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        JD[] jds=new JD[4];
        jds[0]=new TV("Xiaomi TV",true);
        jds[1]=new WashMachine("美的洗衣机",true);
        jds[2]=new Lamp("LED灯泡",true);
        jds[3]=new Air("美的空调",false);

        SmartControl sc=SmartControl.getInstance();
        while (true){
            //智能控制系统对象打印全部设备的状态信息
            sc.printAll(jds);

            Scanner scanner=new Scanner(System.in);
            String commmand=scanner.next();
            switch (commmand){
                case "1":
                    sc.control(jds[0]);
                    break;
                case "2":
                    sc.control(jds[1]);
                    break;
                case "3":
                    sc.control(jds[2]);
                    break;
                case "4":
                    sc.control(jds[3]);
                    break;
                case "exit":
                    System.out.println("退出APP！！！");
                    return;
                default:
                    System.out.println("输入有误");
                    break;
            }
        }
    }
}
