package com.itheima.gui2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginFrame extends JFrame implements ActionListener {
    public LoginFrame(){
        this.setTitle("登录界面");
        this.setSize(400,300);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        init();
    }

    private void init() {
        //添加一个登录按钮
        JButton btn=new JButton("登录");
        btn.addActionListener(this);//添加监听器
        JPanel jp=new JPanel();
        this.add(jp);
        jp.add(btn);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(this,"我被点击了");
    }
}
