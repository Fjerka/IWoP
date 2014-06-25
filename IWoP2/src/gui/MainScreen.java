/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import data.Location;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Vera
 */
public class MainScreen extends JFrame {

    private MapApplet applet;
    
    public MainScreen() {
    }
    
    public void create(Location location, int playerX, int playerY) {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setName("IWoP");
        setSize(150, 100);

        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();

        JButton button = new JButton("Jmeno");
        c.weightx = 0.3;
        c.anchor = GridBagConstraints.NORTH;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 0;
        panel.add(button, c);
        //this.getContentPane().add(button);

        applet = new MapApplet();
        applet.init();
        //applet.setSize(100, 100);
        c.weightx = 0.7;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 1;
        c.gridy = 0;
        panel.add(applet, c);
        //this.getContentPane().add(applet);

        setContentPane(panel);
        pack();
        setVisible(true);
        repaintMap(location, playerX, playerY);
    }
    
    public void repaintMap(Location location, int playerX, int playerY) {
        applet.setParameters(location, playerX, playerY);
        applet.repaint();
    }
}
