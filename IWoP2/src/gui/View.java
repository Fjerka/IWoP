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
        System.out.println("create");
        mainScreen = new MainScreen();
        mainScreen.create(game.getActivePlayer(), location, playerX, playerY);
        mainScreen.updateDate(game.getTextForStatusLine());
    }
    
    public void updateMainScreen(Location location, int playerX, int playerY) {
        System.out.println("update");
        mainScreen.repaintMap(game.getActivePlayer(), location, playerX, playerY);
        mainScreen.updateLeftPanelMapVIew(game.getActivePlayer());
        mainScreen.updateRightPanelMapView(game.getActivePlayer());
        mainScreen.updateDate(game.getTextForStatusLine());
        mainScreen.requestFocus();
    }
    
    public void createDetailPokemon(IPokemon pokemon) {
        mainScreen.createLeftPanelDetailPokemonView(pokemon);
        mainScreen.createRightPanelDetailPokemonView(pokemon);
    }
}
