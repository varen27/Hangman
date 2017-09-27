package com.company;
//import java.awt.Frame;
import javax.swing.JFrame;
import java.awt.*;
//import javax.swing.JLabel;
//import java.awt.*;
//import java.applet.*;


public class HangmanCanvas extends JFrame{
    public static void init(){
        HangmanCanvas frame=new HangmanCanvas();
        frame.setSize(400,700);
        frame.setTitle("Hangman v1.0");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        }
    }

//    @Override
//    public void paintComponents(Graphics g) {
//        super.paintComponents(g);
//        g.setColor(Color.red);
//        g.drawLine(100,110,100,100);
//    }


