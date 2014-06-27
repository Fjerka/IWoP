/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import data.Location;
import data.Player;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Vera
 */
public class MainScreen extends JFrame {

    private MapApplet applet;
    private JLabel exhaustion, hunger, movementPoints;
    
    public MainScreen() {
    }
    
    public void create(Player player, Location location, int playerX, int playerY) {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setName("IWoP");
        setSize(150, 100);
        setFocusable(true);
        setResizable(false);

        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();

        JPanel playerInfo = new JPanel(new GridBagLayout());
        
        JLabel label1 = new JLabel(player.getFirstName() + " " + player.getSurname());
        c.fill = GridBagConstraints.CENTER;
        c.gridx = 0;
        c.gridy = 0;
        c.gridwidth = 2;
        playerInfo.add(label1, c);
        
        JLabel label2 = new JLabel("Exhaustion:");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 1;
        c.gridwidth = 1;
        playerInfo.add(label2, c);
        
        exhaustion = new JLabel(player.getCurrentExhaustion() + "/" + player.getMaxExhaustion());
        c.gridx = 1;
        c.gridy = 1;
        playerInfo.add(exhaustion, c);
        
        JLabel label3 = new JLabel("Hunger:");
        c.gridx = 0;
        c.gridy = 2;
        playerInfo.add(label3, c);
        
        hunger = new JLabel(player.getCurrentHunger() + "/" + player.getMaxHunger());
        c.gridx = 1;
        c.gridy = 2;
        playerInfo.add(hunger, c);
        
        JLabel label4 = new JLabel("Movement Points:");
        c.gridx = 0;
        c.gridy = 3;
        playerInfo.add(label4, c);
        
        movementPoints = new JLabel(player.getCurrentMovementPoints() + "/" + player.getMaxMovementPoints());
        c.gridx = 1;
        c.gridy = 3;
        playerInfo.add(movementPoints, c);
        
        c.weightx = 0.7;
        c.anchor = GridBagConstraints.NORTH;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 0;
        panel.add(playerInfo, c);

        applet = new MapApplet();
        applet.init();
        c.weightx = 0.3;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 1;
        c.gridy = 0;
        panel.add(applet, c);

        setContentPane(panel);
        pack();
        setVisible(true);
        repaintMap(player, location, playerX, playerY);
    }
    
    public void repaintMap(Player player, Location location, int playerX, int playerY) {
        exhaustion.setText(player.getCurrentExhaustion() + "/" + player.getMaxExhaustion());
        hunger.setText(player.getCurrentHunger() + "/" + player.getMaxHunger());
        movementPoints.setText(player.getCurrentMovementPoints() + "/" + player.getMaxMovementPoints());
        applet.setParameters(location, playerX, playerY);
        applet.repaint();
    }

    public MapApplet getApplet() {
        return applet;
    }
}
