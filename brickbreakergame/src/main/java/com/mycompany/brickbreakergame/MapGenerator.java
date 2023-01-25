/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.brickbreakergame;

import java.awt.BasicStroke;//to add border lines for outlining the graphics
import java.awt.Color;//to add color 
import java.awt.Graphics2D;//to provide control over geometry ,we have used X-Y plane

/**
 *
 * @author chinm
 */
public class MapGenerator {
     public int map[][];//creating 2-d array for bricks mapping
    public int bricksWidth;//for defining bricks width
    public int bricksHeight;//for defining bricks height
    public MapGenerator(int row , int col){ //constructor
        map = new int[row][col];
         for (int[] map1 : map) {//traversing the whole map
             for (int j = 0; j < map[0].length; j++) {
                 map1[j] = 1;//just put whole map as 1
             }
         }
        bricksWidth = 540/col; //you need to define one particular width and height of brick
        bricksHeight = 150/row;
    }
    public void draw(Graphics2D g) {
        for (int i = 0; i < map.length; i++) {//traversing whole map
            for (int j = 0; j < map[0].length; j++) {
                if (map[i][j] > 0) {
                    g.setColor(Color.red);//to set color as red
                    g.fillRect(j * bricksWidth + 80, i * bricksHeight + 50, bricksWidth, bricksHeight);
                    //to fill rectangle with color red
                    g.setStroke(new BasicStroke(3));//for outline
                    g.setColor(Color.black);//to set outline color as black
                    g.drawRect(j * bricksWidth + 80, i * bricksHeight + 50, bricksWidth, bricksHeight);

                }
            }

        }
    }
    public void setBricksValue(int value,int row,int col)
    {
        map[row][col] = value;

    }
    
}
//this is only for map for bricks .