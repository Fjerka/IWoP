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
        setPreferredSize(new Dimension(630, 630));
        setFocusable(true);
    }
    
    @Override
    public void paint(Graphics g) {
        if (location == null || playerX == -1 || playerY == -1) {
            g.setColor(Color.black);
            g.fillRect(0, 0, 630, 630);
            return;
        }
        int x = 0;
        int y = 0;
        for  (int i = -10; i <= 10; i++) {
            for (int j = -10; j <= 10; j++) {
                if ((playerX + i < 0 || playerY + j < 0) || (playerX + i >= location.getMap().length
                        || playerY + j >= location.getMap()[0].length)) {
                    g.setColor(Color.black);
                    g.fillRect((i + 10) * 30, (j + 10) * 30, 30, 30);
                } else {
                    g.setColor(Color.green);
                    g.fillRect((i + 10) * 30, (j + 10) * 30, 30, 30);
                    g.setColor(Color.gray);
                    g.drawRect((i + 10) * 30, (j + 10) * 30, 30, 30);
                }
            }
        }
        g.setColor(Color.blue);
        g.fillOval(302, 302, 26, 26);
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
