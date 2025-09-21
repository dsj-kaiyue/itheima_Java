package com.itheima.interface1;

public class Test {
    public static void main(String[] args) {
        System.out.println(A.CHOOL_NAME);
        C c=new C();
        c.play();
    }
}

class C implements A,B{

    @Override
    public void run() {

    }

    @Override
    public void play() {
        System.out.println(A.CHOOL_NAME);
    }
}
