/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.brickbreakergame;

/**
 *
 * @author Mahakpreet Kaur
 */
import javax.swing.JFrame;
public class Brickbreakergame {

    public static void main(String[] args) {
        JFrame obj=new JFrame();
        Gameplay gameplay=new Gameplay(); //class created in which game working is implemented
        obj.setSize(700,600); // to set size of frame
        obj.setTitle("BrickBreaker");//to set the title
        obj.setLocationRelativeTo(null);//used to center the gui on the screen
        obj.setResizable(false);
        obj.setVisible(true);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//used to specify one of several options for the close button
        // to close the frame,the game should be turn off if someone exits
        obj.add(gameplay);
    }
}
