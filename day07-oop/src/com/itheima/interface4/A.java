package com.itheima.interface4;

import java.sql.SQLOutput;

public interface A {
    public default void go(){
        System.out.println("go");
    }

    private void run(){
        System.out.println("run");
    }

    static void show(){
        System.out.println("show");
    }

}
