/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import conroller.textBased.*;
import data.interfaces.Constants;
import data.interfaces.IPlayer;
import data.interfaces.IPokemon;
import view.textBased.*;

/**
 *
 * 
 * @author Stefan
 */
public class Main implements Constants{
    public static void main(String[] args) {
        IPokemon[] pokemons = new IPokemon[6];
        pokemons[0]=new Pokemon("Pikachu", 25, 40, 100, PKMN_MALE, 5, 150, 30, 20, 50, 20, 45, 80, 80, null);
        IPlayer[] players = new IPlayer[1];
        players[0]= new Player(pokemons);
        Game g = new Game(players);
        View v = new View(g);
        ControllerScanner c = new ControllerScanner(g, v);
        System.out.println("If you want to begin a new game, write 'yes', if not, write 'no'.");
        c.beginNewGame(c.getNewString());
    }
}
