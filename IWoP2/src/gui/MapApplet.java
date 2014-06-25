/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JApplet;

/**
 *
 * @author Vera
 */
public class MapApplet extends JApplet{
    
    public MapApplet() {
    }
    
    @Override
    public void init() {
        System.out.println("init");
        //setSize(100, 100);
        setPreferredSize(new Dimension(100, 100));
        ///setVisible(true);
        //(true);
        //setMinimumSize(new Dimension(100, 100));
    }
    
    @Override
    public void paint(Graphics g) {
        System.out.println("paint");
        g.setColor(Color.red);
        g.drawRect(100,100,100,100);
    }
}
