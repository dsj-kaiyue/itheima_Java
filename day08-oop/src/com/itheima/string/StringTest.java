package com.itheima.string;

public class StringTest {
    public static void main(String[] args) {
        //目标：生成验证码
        String s=getCode(5);
        System.out.println(s);
    }
    //帮我生成指定位数的随机验证码返回，每位可能是大小写字母或数字
    //帮我用String变量记住全部要用的字符
    public static String getCode(int n){
        String str="ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789abcdefghijklmnopqrstuvwxyz";
        String code="";
        for (int i = 0; i < n; i++) {
            int index=(int)(Math.random()*str.length());//[0,1)*50=[0,49]
            char c=str.charAt(index);
            code+=c;
        }
        return code;
    }

}
