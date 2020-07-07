package Swing;

import javax.swing.*;

public class Swing1 {

    public static void main(String[] args) {
        JFrame f=new JFrame();//creating instance of JFrame

        JButton b=new JButton("Button");//creating instance of JButton
        b.setBounds(100,50,80, 40);//x axis, y axis, width, height

        f.add(b);//adding button in JFrame
       // JDialog h=new JDialog()

        f.setSize(100,500);//400 width and 500 height
        f.setLayout(null);//using no layout managers
        f.setVisible(true);//making the frame visible
        f.setTitle("hello");
    }
}

