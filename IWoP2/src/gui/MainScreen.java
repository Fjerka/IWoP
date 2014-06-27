/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import data.Location;
import data.Player;
import data.interfaces.IPokemon;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
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
    private JLabel[] partyName = {new JLabel(), new JLabel(), new JLabel(), new JLabel(),
        new JLabel(), new JLabel()};
    private JLabel[] partyHp = {new JLabel(), new JLabel(), new JLabel(), new JLabel(),
        new JLabel(), new JLabel()};
    private JLabel[] partyEnergy = {new JLabel(), new JLabel(), new JLabel(), new JLabel(),
        new JLabel(), new JLabel()};

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
        c.anchor = GridBagConstraints.NORTH;
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

        c.weightx = 0.4;
        c.gridx = 0;
        c.gridy = 0;
        panel.add(playerInfo, c);

        applet = new MapApplet();
        applet.init();
        c.weightx = 0.2;
        c.gridx = 1;
        c.gridy = 0;
        panel.add(applet, c);

        JPanel playerParty = new JPanel(new GridBagLayout());

        for (int i = 0; i < 6; i++) {
            IPokemon pokemon = player.getPartyPokemons()[i];
            if (pokemon == null) {
                break;
            }
            partyName[i].setText(pokemon.getNickname());
            c.fill = GridBagConstraints.CENTER;
            c.gridx = 0;
            c.gridy = i * 3;
            c.gridwidth = 2;
            playerParty.add(partyName[i], c);

            JLabel pok1 = new JLabel("HP:");
            c.fill = GridBagConstraints.HORIZONTAL;
            c.gridx = 0;
            c.gridy = 1 + i * 3;
            c.gridwidth = 1;
            playerParty.add(pok1, c);

            partyHp[i].setText(pokemon.getHp() + "/" + pokemon.getHpMax());
            c.fill = GridBagConstraints.HORIZONTAL;
            c.gridx = 1;
            c.gridy = 1 + i * 3;
            playerParty.add(partyHp[i], c);
            
            JLabel pok2 = new JLabel("Energy:");
            c.gridx = 0;
            c.gridy = 2 + i * 3;
            playerParty.add(pok2, c);

            partyEnergy[i].setText(pokemon.getEnergy() + "/" + pokemon.getEnergyMax());
            c.gridx = 1;
            c.gridy = 2 + i * 3;
            playerParty.add(partyEnergy[i], c);

        }

        c.weightx = 0.4;
        c.gridx = 2;
        c.gridy = 0;
        panel.add(playerParty, c);

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
