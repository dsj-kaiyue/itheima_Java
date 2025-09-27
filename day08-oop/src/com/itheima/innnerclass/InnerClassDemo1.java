package com.itheima.innnerclass;

public class InnerClassDemo1 {
    public static void main(String[] args) {
        Outer.Inner oi=new Outer().new Inner();
        oi.show();
    }

}
