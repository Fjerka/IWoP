/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import data.Game;

/**
 *
 * @author Stefan
 */
public class View {
    
    Game game;
    public StartMenu startMenu;
    public MainScreen mainScreen;

    public View(Game game) {
        this.game = game;
        this.startMenu = new StartMenu();
    }
    
    public void createMainScreen(){
        mainScreen = new MainScreen();
        mainScreen.create();
    }
}
