/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import conroller.textBased.*;
import data.interfaces.Constants;
import data.interfaces.IMove;
import data.interfaces.IPlayer;
import data.interfaces.IPokemon;
import view.textBased.*;

/**
 *
 * 
 * @author Stefan
 */
public class Main {
    public static void main(String[] args) {
        
        IPokemon[] pokemons = new IPokemon[6];
        pokemons[0]=new Pokemon("Bulbasaur", 1, 28, 4, 120, 4, 23, Constants.PKMN_MALE, 3000, 15, 3, 20, 5, 20, 5, 12, 4, 10, 2, 53, 5, 34, 3, 2, null);
        IPlayer[] players = new IPlayer[1];
        players[0]= new Player(pokemons);
        Game g = new Game(players);
        View v = new View(g);
        ControllerScanner c = new ControllerScanner(g, v);
        System.out.println("If you want to begin a new game, write 'yes', if not, write 'no'.");
        c.beginNewGame(c.getNewString());
    }
}
