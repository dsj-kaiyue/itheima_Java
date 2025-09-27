package com.itheima.demo;

public class SmartControl {
    //单例
    private static final SmartControl sc=new SmartControl();
    private SmartControl(){}
    public static SmartControl getInstance(){
        return sc;
    }
    public void control(JD jd) {
        System.out.println(jd.getName()+"的目前状态是"+(jd.getStatus()?"开着":"关闭"));
        System.out.println("开始你的操作,,,,,");
        jd.press();
        System.out.println(jd.getName()+"的目前状态是"+(jd.getStatus()?"开着":"关闭"));
    }

    public void printAll(JD[] jds) {
        int i=1;
        for (JD jd : jds) {
            System.out.println(i+":"+jd.getName()+"的目前状态是"+(jd.getStatus()?"开着":"关闭"));
            i++;
        }
    }
}
