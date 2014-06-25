/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import controller.StartMenuListeners.FirstLocationButtonListener;
import data.Game;
import gui.View;

/**
 *
 * @author Stefan
 */
public class Controller {
    
    Game game;
    View view;

    public Controller(Game game, View view) {
        this.game = game;
        this.view = view;
        createStartMenu();
        
    }
    
    private void createStartMenu() {
        this.view.startMenu.create();
        this.view.startMenu.getFirst().addActionListener(new FirstLocationButtonListener(view));
    }
    
}
