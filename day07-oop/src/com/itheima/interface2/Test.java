package com.itheima.interface2;


public class Test {
    public static void main(String[] args) {

        Peoople p=new Student();
        Driver d=new Student();
        BoyFriend b=new Student();

    }
}

interface Driver{};
interface BoyFriend{};
class Peoople{};


class Student extends Peoople implements Driver,BoyFriend{};
