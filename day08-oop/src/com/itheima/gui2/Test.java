package com.itheima.gui2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Test {
    public static void main(String[] args) {

        JFrame jf=new JFrame("LoginFrame");//创建窗体
        JPanel panel=new JPanel();//创建面板
        jf.add(panel);//添加面板

        jf.setSize(400,300);//设置窗体的宽高
        jf.setLocationRelativeTo(null);//设置窗体居中
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//设置窗体关闭方式

        JButton jb=new JButton("login");//创建按钮
        jb.setBounds(100,100,80,30);//设置按钮的位置和宽高
        panel.add(jb);//添加按钮

        //添加事件监听
        jb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // e 是触发事件的对象
                JOptionPane.showMessageDialog(jf,"有人点击了登录！！！");
                System.out.println("success");
            }
        });

        //添加按键监听
        //监听上下左右四个按键，用if
        jf.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println("点击了方向键外的其他键");
                int keycode =e.getKeyCode();
                if(keycode==KeyEvent.VK_UP){
                    System.out.println("up");
                }else if(keycode==KeyEvent.VK_DOWN){
                    System.out.println("down");
                }else if(keycode==KeyEvent.VK_LEFT){
                    System.out.println("left");
                }else if(keycode==KeyEvent.VK_RIGHT){
                    System.out.println("right");
                }
            }
        });


        jf.setVisible( true);//显示窗体
        //让窗口成为焦点
        jf.requestFocus();
    }
}
