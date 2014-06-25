/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gui;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JApplet;

/**
 *
 * @author Vera
 */
public class MainApplet extends JApplet{
    
    public MainApplet() {
    }
    
    @Override
    public void init() {
        setBackground(Color.red);
    }
    
    @Override
    public void paint(Graphics g) {
        g.drawRect(100,100,100,100); 
    }
}
