/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import data.Location;
import data.Player;
import data.interfaces.IPokemon;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/**
 *
 * @author Vera
 */
public class MainScreen extends JFrame {

    private MapApplet applet;
    private JLabel exhaustion, hunger, movementPoints;
    private JPanel leftPanel = null, rightPanel = null;
    private JLabel statusLine;
    private JLabel[] partyName = {new JLabel(), new JLabel(), new JLabel(), new JLabel(),
        new JLabel(), new JLabel()};
    private JLabel[] partyHp = {new JLabel(), new JLabel(), new JLabel(), new JLabel(),
        new JLabel(), new JLabel()};
    private JLabel[] partyEnergy = {new JLabel(), new JLabel(), new JLabel(), new JLabel(),
        new JLabel(), new JLabel()};
    private JButton[] partyDetails = {new JButton("Details"), new JButton("Details"), 
        new JButton("Details"), new JButton("Details"), new JButton("Details"), new JButton("Details")};
    private JButton nextTurnButton;

    public MainScreen() {
    }
    
    public void create(Player player, Location location, int playerX, int playerY) {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setName("IWoP");
        setFocusable(true);
        setResizable(false);

        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();

        leftPanelMapView(player);
        c.anchor = GridBagConstraints.NORTH;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 0;
        panel.add(leftPanel, c);

        applet = new MapApplet();
        applet.init();
        //c.weightx = 0.2;
        c.gridx = 1;
        c.gridy = 0;
        c.insets = new Insets(0, 0, 0, 0);
        panel.add(applet, c);

        rightPanelMapView(player);
        c.gridx = 2;
        c.gridy = 0;
        panel.add(rightPanel, c);
        
        statusLine = new JLabel();
        statusLine.setPreferredSize(new Dimension(1030, 50));
        statusLine.setOpaque(true);
        statusLine.setBackground(Color.gray);
        c.gridx = 0;
        c.gridy = 1;
        c.gridwidth = 3;
        panel.add(statusLine, c);

        setContentPane(panel);
        pack();
        setVisible(true);
        repaintMap(player, location, playerX, playerY);
    }
    
    private void leftPanelMapView(Player player) {
        if (leftPanel == null) {
            leftPanel = new JPanel(new GridBagLayout());
        }
        leftPanel.removeAll();
        GridBagConstraints c = new GridBagConstraints();
        c.insets = new Insets(2, 2, 2, 2);
        c.anchor = GridBagConstraints.NORTH;
        
        JLabel label1 = new JLabel(player.getFirstName() + " " + player.getSurname());
        label1.setHorizontalAlignment(SwingConstants.CENTER);
        label1.setPreferredSize(new Dimension(200, 30));
        c.fill = GridBagConstraints.CENTER;
        c.gridx = 0;
        c.gridy = 0;
        c.gridwidth = 2;
        leftPanel.add(label1, c);

        JLabel label2 = new JLabel("Exhaustion:");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 1;
        c.gridwidth = 1;
        leftPanel.add(label2, c);

        exhaustion = new JLabel(player.getCurrentExhaustion() + "/" + player.getMaxExhaustion());
        exhaustion.setHorizontalAlignment(SwingConstants.RIGHT);
        c.gridx = 1;
        c.gridy = 1;
        leftPanel.add(exhaustion, c);

        JLabel label3 = new JLabel("Hunger:");
        c.gridx = 0;
        c.gridy = 2;
        leftPanel.add(label3, c);

        hunger = new JLabel(player.getCurrentHunger() + "/" + player.getMaxHunger());
        hunger.setHorizontalAlignment(SwingConstants.RIGHT);
        c.gridx = 1;
        c.gridy = 2;
        leftPanel.add(hunger, c);

        JLabel label4 = new JLabel("Movement Points:");
        c.gridx = 0;
        c.gridy = 3;
        leftPanel.add(label4, c);

        movementPoints = new JLabel(player.getCurrentMovementPoints() + "/" + player.getMaxMovementPoints());
        movementPoints.setHorizontalAlignment(SwingConstants.RIGHT);
        c.gridx = 1;
        c.gridy = 3;
        leftPanel.add(movementPoints, c);
        
        nextTurnButton = new JButton("Next Turn");
        c.gridx = 0;
        c.gridy = 4;
        c.gridwidth = 2;
        leftPanel.add(nextTurnButton, c);
    }
    
    private void rightPanelMapView(Player player) {
        if (rightPanel == null) {
            rightPanel = new JPanel(new GridBagLayout());
        }
        rightPanel.removeAll();
        GridBagConstraints c = new GridBagConstraints();
        c.anchor = GridBagConstraints.NORTH;
        c.insets = new Insets(2, 2, 2, 2);
        
        for (int i = 0; i < 6; i++) {
            IPokemon pokemon = player.getPartyPokemons()[i];
            if (pokemon == null) {
                break;
            }
            partyName[i].setText(pokemon.getNickname());
            partyName[i].setPreferredSize(new Dimension(200, 30));
            partyName[i].setHorizontalAlignment(SwingConstants.CENTER);
            c.fill = GridBagConstraints.CENTER;
            c.gridx = 0;
            c.gridy = i * 4;
            c.gridwidth = 2;
            rightPanel.add(partyName[i], c);

            JLabel pok1 = new JLabel("HP:");
            c.fill = GridBagConstraints.HORIZONTAL;
            c.gridx = 0;
            c.gridy = 1 + i * 4;
            c.gridwidth = 1;
            rightPanel.add(pok1, c);

            partyHp[i].setText(pokemon.getHp() + "/" + pokemon.getHpMax());
            partyHp[i].setHorizontalAlignment(SwingConstants.RIGHT);
            c.fill = GridBagConstraints.HORIZONTAL;
            c.gridx = 1;
            c.gridy = 1 + i * 4;
            rightPanel.add(partyHp[i], c);
            
            JLabel pok2 = new JLabel("Energy:");
            c.gridx = 0;
            c.gridy = 2 + i * 4;
            rightPanel.add(pok2, c);

            partyEnergy[i].setText(pokemon.getEnergy() + "/" + pokemon.getEnergyMax());
            partyEnergy[i].setHorizontalAlignment(SwingConstants.RIGHT);
            c.gridx = 1;
            c.gridy = 2 + i * 4;
            rightPanel.add(partyEnergy[i], c);
            
            c.gridx = 0;
            c.gridy = 3 + i * 4;
            c.gridwidth = 2;
            rightPanel.add(partyDetails[i], c);

            c.gridwidth = 1;
        }
    }

    private void leftPanelDetailPokemonView(IPokemon pokemon) {
        BufferedImage image = null;
        try {
            image = ImageIO.read(new File(pokemon.getPicture()));
        } catch (IOException ex) {
        }
    }
    
    public void updateDate(String date) {
        statusLine.setText(date);
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
    
    public JButton getNextTurnButton() {
        return nextTurnButton;
    }
}
