/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller.StartMenuListeners;

import controller.MainScreenListeners.MapKeyboardListener;
import gui.View;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;


/**
 *
 * @author Vera
 */
public class FirstLocationButtonListener implements ActionListener{
    
    private View view;
    
    public FirstLocationButtonListener(View view) {
        this.view = view;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        view.startMenu.closeFrame();
        view.createMainScreen();
        view.mainScreen.addKeyListener(new MapKeyboardListener());
    }
    
}
