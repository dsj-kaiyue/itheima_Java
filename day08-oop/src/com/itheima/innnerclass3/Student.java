package com.itheima.innnerclass3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    //姓名、年龄、升高、性别
    private String name;
    private int age;
    private int height;
    private char sex;
}
