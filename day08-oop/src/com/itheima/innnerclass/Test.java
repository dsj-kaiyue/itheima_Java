package com.itheima.innnerclass;

public class Test {
    public static void main(String[] args) {
        A.name="test";
        System.out.println(A.name);
        A.B a=new A.B();
        a.show();
    }
}



