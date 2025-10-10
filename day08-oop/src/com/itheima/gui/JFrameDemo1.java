package com.itheima.gui;
import javax.swing.*;


public class JFrameDemo1 {
    public static void main(String[] args) {
        //创建窗体
        JFrame jf=new JFrame("LoginFrame");
        JPanel panel=new JPanel();//创建面板
        jf.add(panel);//添加面板

        jf.setSize(400,300);//设置窗体的宽高
        jf.setLocationRelativeTo(null);//设置窗体居中
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//设置窗体关闭方式

        //创建按钮
        JButton jb=new JButton("login");
        jb.setBounds(100,100,80,30);
        panel.add(jb);
        jf.setVisible( true);

    }
}
