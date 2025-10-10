package com.itheima.method1reference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class Demo4 {
    public static void main(String[] args) {
        //目标：理解构造器引用

        CarFactory cf=new CarFactory() {
            @Override
            public Car getCar(String name) {
                return new Car(name);
            }
        };

        CarFactory cf1=name -> new Car(name);

        CarFactory cf2=Car::new;

        Car c1=cf.getCar("BWM");
        System.out.println(c1);
    }


}

interface CarFactory{
    Car getCar(String name);
}

@Data
@NoArgsConstructor
@AllArgsConstructor
class Car{
    private String name;
}
