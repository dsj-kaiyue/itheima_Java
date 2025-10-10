package com.itheima.gui2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//直接提供事件监听类，用于创建事件监听对象
public class Test2 {
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

        jb.addActionListener(new MyActionListener(jf));

        jf.setVisible(true);
    }
}
class MyActionListener implements ActionListener {

    private JFrame jf;
    public MyActionListener(JFrame jf){
        this.jf=jf;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        // e 是触发事件对象
        JOptionPane.showMessageDialog(jf,"有人点击了登录！！！");
        System.out.println("success");
    }
}