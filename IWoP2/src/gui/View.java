/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import data.Game;
import data.Location;

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
    
    public void createMainScreen(Location location, int playerX, int playerY){
        mainScreen = new MainScreen();
        mainScreen.create(location, playerX, playerY);
    }
}
