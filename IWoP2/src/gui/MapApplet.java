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
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import javax.imageio.ImageIO;
import javax.swing.JApplet;

/**
 *
 * @author Vera
 */
public class MapApplet extends JApplet {

    private Location location = null;
    private int playerX = -1;
    private int playerY = -1;
    private HashMap<Integer, BufferedImage> loadedImages = new HashMap();

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
        int x = -10 + playerX, y = -10 + playerY;
        if (x < 0) {
            x = 0;
        }
        if (y < 0) {
            y = 0;
        }
        boolean lineFromMap = false;
        for (int i = -10; i <= 10; i++) {
            for (int j = -10; j <= 10; j++) {
                if ((playerX + i < 0 || playerY + j < 0) || (playerX + i >= location.getMap().length
                        || playerY + j >= location.getMap()[x].length)) {
                    g.setColor(Color.black);
                    g.fillRect((i + 10) * 30, (j + 10) * 30, 30, 30);
                } else {
                    lineFromMap = true;
                    BufferedImage image = loadedImages.get(location.getMap()[x][y].getID());
                    if (image == null) {
                        try {
                            image = ImageIO.read(new File(location.getMap()[x][y].getTileFile()));
                            loadedImages.put(location.getMap()[x][y].getID(), image);
                            g.drawImage(image, (i + 10) * 30, (j + 10) * 30, null);
                        } catch (IOException e) {
                            System.out.println(location.getMap()[x][y].getTileFile());
                            g.setColor(Color.black);
                            g.fillRect((i + 10) * 30, (j + 10) * 30, 30, 30);
                        }
                    } else {
                        g.drawImage(image, (i + 10) * 30, (j + 10) * 30, null);
                    }
                    g.setColor(Color.gray);
                    g.drawRect((i + 10) * 30, (j + 10) * 30, 30, 30);
                    y++;
                }
            }
            if (lineFromMap) {
                x++;
            }
            lineFromMap = false;
            y = -10 + playerY;
            if (y < 0) {
                y = 0;
            }
        }
        g.setColor(Color.blue);
        g.fillOval(302, 302, 26, 26);
    }

    public void setParameters(Location location, int playerX, int playerY) {
        this.location = location;
        if (!this.location.equals(location)) {
            loadedImages.clear();
        }
        this.playerX = playerX;
        this.playerY = playerY;
    }
}
