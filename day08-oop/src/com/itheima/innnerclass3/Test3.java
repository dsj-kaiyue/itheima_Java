package com.itheima.innnerclass3;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test3  {
    public static void main(String[] args) {
        JFrame win=new JFrame("登录窗口");
        win.setSize(400,300);
        win.setLocationRelativeTo(null);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel=new JPanel();
        win.add(panel);

        JButton btn=new JButton("登录");
        panel.add(btn);

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("登录成功");
            }
        });
        win.setVisible(true);
    }
}
