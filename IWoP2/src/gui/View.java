/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import data.Game;
import data.Location;
import data.interfaces.IPokemon;

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
        mainScreen.create(game.getActivePlayer(), location, playerX, playerY);
        mainScreen.updateDate(game.getDate());
    }
    
    public void updateMainScreen(Location location, int playerX, int playerY) {
        mainScreen.repaintMap(game.getActivePlayer(), location, playerX, playerY);
        mainScreen.updateLeftPanelMapVIew(game.getActivePlayer());
        mainScreen.updateRightPanelMapView(game.getActivePlayer());
        mainScreen.updateDate(game.getDate());
        mainScreen.requestFocus();
    }
    
    public void createDetailPokemon(IPokemon pokemon) {
        mainScreen.createLeftPanelDetailPokemonView(pokemon);
        mainScreen.createRightPanelDetailPokemonView(pokemon);
    }
}
