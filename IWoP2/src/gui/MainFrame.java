/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

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
public class MainFrame extends JFrame {

    public MainFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setName("IWoP");
        this.setSize(150, 100);

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

        JApplet applet = new MainApplet();
        applet.init();
        //applet.setSize(100, 100);
        c.weightx = 0.7;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 1;
        c.gridy = 0;
        panel.add(applet, c);
        //this.getContentPane().add(applet);

        this.setContentPane(panel);
        this.pack();
        this.setVisible(true);
    }
}
