package demo;

import javax.swing.*;

public class MySnake {
    public static void main(String[] args) {
        //todo 创建窗口
        JFrame frame = new JFrame();
        //todo 制定窗口x,y 位置以及窗口的宽度和高度值
        frame.setBounds(600, 100, 700, 900);
        //是否允许拖拽？不允许：
        frame.setResizable(false);
        //当点击窗口关闭按钮，执行操作是退出
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //添加画布
        frame.add(new MyPanel());
        //显示出来
        frame.setVisible(true);


    }
}
