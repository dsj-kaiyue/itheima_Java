package com.itheima.innnerclass3;

public class Test {
    public static void main(String[] args) {
        Animal a=new Animal() {
            @Override
            public void cry() {
                System.out.println("喵喵叫");
            }
        };
        a.cry();
    }


}


//class Cat extends Animal{
//
//    @Override
//    public void cry() {
//        System.out.println("喵喵叫");
//    }
//}
