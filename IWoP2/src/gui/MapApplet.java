/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gui;

import data.Location;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JApplet;

/**
 *
 * @author Vera
 */
public class MapApplet extends JApplet{
    
    private Location location = null;
    private int playerX = -1;
    private int playerY = -1;
    
    public MapApplet() {
    }
    
    @Override
    public void init() {
        setPreferredSize(new Dimension(500, 500));
    }
    
    @Override
    public void paint(Graphics g) {
        if (location == null || playerX == -1 || playerY == -1) {
            g.setColor(Color.black);
            g.fillRect(0, 0, 500, 500);
            return;
        }
        for (int i = 0; i < location.getMap().length; i++) {
            for (int j = 0; j < location.getMap()[0].length; j++) {
                if (i == 1 && j == 0) {
                    g.setColor(Color.red);
                } else {
                    g.setColor(Color.green);
                }
                g.fillRect(i * 50, j * 50, 50, 50);
            }
        }
    }
    
    public void setParameters(Location location, int playerX, int playerY) {
        this.location = location;
        this.playerX = playerX;
        this.playerY = playerY;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void setPlayerX(int playerX) {
        this.playerX = playerX;
    }

    public void setPlayerY(int playerY) {
        this.playerY = playerY;
    }
}
