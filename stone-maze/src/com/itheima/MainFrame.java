package com.itheima;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

//自定义窗口类，创建对象，展示一个主窗口。
public class MainFrame extends JFrame {
    // 设置图片位置
    private static final String imagePath = "stone-maze/src/image/";
    //准备一个数组，用户存储数字色块的行列位置: 4行4列
    private int[][] imageData = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,0}
    };
    //准备一个赢了的数组
    private int[][] winData = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,0}
    };

    //定义两个整数变量，记录当前空白色块的位置
    private int row;
    private int col;

    //统计总共移动的步数
    private int count=0;
    public MainFrame (){
        // 调用一个初始化方法：初始化窗口大小等信息。
        initFrame();
        //打乱数字色块的顺序
        initRandomArray();
        // 初始化界面：展示数字色块。
        initImage();
        //初始化系统菜单
        initMenu();
        //给当前窗口绑定上下左右按键事件
        initKeyPressEvent();


    }


    private void initKeyPressEvent() {
        this.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                // 获取按键的编码
                int keyCode = e.getKeyCode();
                // 判断按键编码
                switch (keyCode){
                    case KeyEvent.VK_UP:
                        //用户按了上键，让图片向下移动
                        switchAndMove(Diection.UP);
                        break;
                    case KeyEvent.VK_DOWN:
                        //用户按了下键，让图片向上移动
                        switchAndMove(Diection.DOWN);
                        break;
                    case KeyEvent.VK_LEFT:
                        //用户按了左键，让图片向右移动
                        switchAndMove(Diection.LEFT);
                        break;
                    case KeyEvent.VK_RIGHT:
                        //用户按了右键，让图片向左移动
                        switchAndMove(Diection.RIGHT);
                        break;
                }
            }
        });
    }


    private void switchAndMove(Diection r){
        //判断图片的方向，再控制图片的移动
        switch (r){
            case UP:
                System.out.println("上");
                //上交换的条件是行小于3，然后开始交换
                if (row<imageData.length-1){
                    int temp=imageData[row][col];
                    imageData[row][col]=imageData[row+1][col];
                    imageData[row+1][col]=temp;
                    //更新当前空白色块的位置
                    row++;
                    count++;
                }
                break;
            case DOWN:
                System.out.println("下");
                //下交换的条件是行大于0，然后开始交换
                if (row>0){
                    int temp=imageData[row][col];
                    imageData[row][col]=imageData[row-1][col];
                    imageData[row-1][col]=temp;
                    //更新当前空白色块的位置
                    row--;
                    count++;
                }
                break;
            case LEFT:
                System.out.println("左");
                //左交换的条件是列小于3，然后开始交换
                if (col<imageData.length-1){
                    int temp=imageData[row][col];
                    imageData[row][col]=imageData[row][col+1];
                    imageData[row][col+1]=temp;
                    //更新当前空白色块的位置
                    col++;
                    count++;
                }
                break;
            case RIGHT:
                System.out.println("右");
                //右交换的条件是列大于0，然后开始交换
                if (col>0){
                    int temp=imageData[row][col];
                    imageData[row][col]=imageData[row][col-1];
                    imageData[row][col-1]=temp;
                    col--;
                    count++;
                }
                break;
        }
        //刷新界面
        initImage();
    }

    private void initRandomArray() {
        for (int i = 0; i < imageData.length; i++){
            for (int j = 0; j < imageData[i].length; j++){
                // 获取一个随机数
                int random = (int)(Math.random() * imageData.length);
                // 获取一个随机数
                int random2 = (int)(Math.random() * imageData.length);
                // 交换两个数字
                int temp = imageData[i][j];
                imageData[i][j] = imageData[random][random2];
                imageData[random][random2] = temp;
            }
        }

        //定位空白色块的位置
        //去二维数组中遍历每个数据，找到0
        OUT:
        for (int i = 0; i < imageData.length; i++) {
            for (int j = 0; j < imageData[i].length; j++) {
                if (imageData[i][j] == 0){
                    row = i;
                    col = j;
                    break OUT;
                }
            }
        }

    }

    private void initMenu() {
        JMenuBar menuBar = new JMenuBar();//创建菜单栏
        JMenu menu = new JMenu("系统");//创建菜单

        //创建退出菜单项
        JMenuItem exitJi=new JMenuItem("退出");
        menu.add(exitJi);// 添加菜单项
        exitJi.addActionListener(e -> {
            dispose();
        });

        //创建重启菜单项
        JMenuItem restartJi=new JMenuItem("重启");
        menu.add(restartJi);
        restartJi.addActionListener(e -> {
            // 重启游戏
            count=0;
            initRandomArray();
            initImage();
        });

        menuBar.add(menu);
        this.setJMenuBar(menuBar);
    }

    private void initImage() {
        //先清空窗口上的全部图层
        this.getContentPane().removeAll();

        //刷新界面时，刷新步数
        //给窗口田间一个展示文字的组件
        JLabel countTxt = new JLabel("当前移动" + count+"步");
        countTxt.setBounds(20,20,100,20);
        //把文字展示为红色
        countTxt.setForeground(Color.red);
        //把文字加粗
        countTxt.setFont(new Font("楷体",Font.BOLD,16));
        this.add(countTxt);

        //判断是否赢了
        if(isWin()){
            //展示胜利的图片
            JLabel label = new JLabel(new ImageIcon(imagePath + "win.png"));
            label.setBounds(124,230,266,88);
            this.add(label);
        }

        // 1、展示一个行列矩阵的图片色块依次铺满窗口（4 * 4）
        for (int i = 0; i < imageData.length; i++) {
            for (int j = 0; j < imageData[i].length; j++) {
                // 拿到图片的名称
                String imageName = imageData[i][j] + ".png";
                // 创建一个JLabel对象，设置图片给他展示。
                JLabel label = new JLabel(new ImageIcon(imagePath + imageName));
                // 设置图片位置展示出来
                label.setBounds(20 + j * 100,60 + i * 100, 100, 100);
                this.add(label);
            }
        }
        // 添加一个背景图片
        JLabel label = new JLabel(new ImageIcon(imagePath + "background.png"));
        label.setBounds(0,0,450,484);
        this.add(label);

        //刷新新图层
        this.repaint();
    }

    private boolean isWin() {
        for (int i = 0; i < imageData.length; i++){
            for (int j = 0; j < imageData[i].length; j++){
                if (winData[i][j]!=imageData[i][j]){
                    return false;
                }
            }
        }
        return true;
    }

    private void initFrame() {
        // 设置窗口的标题
        this.setTitle("石子迷宫 V 1.0 dlei");
        // 窗口的宽高
        this.setSize(465,575);
        // 窗口的关闭方式
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // 窗口的居中显示
        this.setLocationRelativeTo(null);
        // 窗口的布局方式
        this.setLayout(null);
        // 设置窗口的显示
        this.setVisible(true);

    }
}
