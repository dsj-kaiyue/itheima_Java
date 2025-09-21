package com.itheima.demo;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //创建金卡对象
        GoldCard gc = new GoldCard("GC001","张三","13800000001",1000);

        //创建银卡对象
        SilverCard sc = new SilverCard("SC001","张三","13800000002",1000);

        pay(gc);
    }


    //支付机
    public static void pay(Card card){
        System.out.println("请输入你当前消费的金额");
        Scanner sc = new Scanner(System.in);
        double money = sc.nextDouble();
        card.consume(money);

    }
}
