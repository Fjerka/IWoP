/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gui;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Vera
 */
public class StartMenu extends JFrame{
    
    private JButton first;
    
    public StartMenu() {
    }
    
    public void create() {
        setName("First Location");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        first = new JButton("Firts Location");
        getContentPane().add(first);
        
        pack();
        setVisible(true);
    }

    public JButton getFirst() {
        return first;
    }
    
    public void closeFrame() {
        dispose();
    }
    
}
