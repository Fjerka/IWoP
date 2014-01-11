/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import conroller.textBased.*;
import data.abstracts.ATrainer;
import data.interfaces.Constants;
import data.interfaces.IMove;
import data.interfaces.INature;
import data.interfaces.IPlayer;
import data.interfaces.IPokemon;
import data.interfaces.IWorld;
import oracle.jrockit.jfr.tools.ConCatRepository;
import view.textBased.*;

/**
 *
 *
 * @author Stefan
 */
public class Main {

    public static void main(String[] args) {

        IWorld world = new World(0, "World", 4);
        world.getLocations()[0] = new Location(0, "Hometown", 3, Constants.LOCATION_CITY);
        world.getLocations()[1] = new Location(1, "Pokemon Center", 1, Constants.LOCATION_BUILDING);
        world.getLocations()[2] = new Location(2, "Route", 2, Constants.LOCATION_PLAIN);
        world.getLocations()[3] = new Location(3, "Forest", 2, Constants.LOCATION_FOREST);
        world.getLocations()[0].getNeighbours()[0] = world.getLocations()[1];
        world.getLocations()[0].getNeighbours()[1] = world.getLocations()[2];
        world.getLocations()[0].getNeighbours()[2] = world.getLocations()[3];
        world.getLocations()[1].getNeighbours()[0] = world.getLocations()[0];
        world.getLocations()[2].getNeighbours()[0] = world.getLocations()[0];
        world.getLocations()[2].getNeighbours()[1] = world.getLocations()[3];
        world.getLocations()[3].getNeighbours()[0] = world.getLocations()[0];
        world.getLocations()[3].getNeighbours()[1] = world.getLocations()[2];

        final INature hardy = new Nature("Hardy", 100, 100, 100, 100, 100, 100, 100, 100, 100, 100);

        IMove tackle = new Move(32, 0, 10, 2, Constants.MOVE_CATEGORY_PHYSICAL_ATTACK, Constants.MOVE_NOR, 50, 30, 100, 2, 0, "Tackle", "A physical attack in which the user charges and slams into the target with its whole body.", true);

        Player[] players = new Player[1];
        players[0] = new Player(Constants.PLAYER_MALE, "Pokusny Simpanz", 0, 1, world.getLocations()[0], world, 10000, 0);
        players[0].getPartyPokemons()[0] = new Pokemon("Bulbasaur", "Bulby", 1, 20, 4, 100, 5, 5, Constants.PKMN_MALE, 10, 6, 12, 7, 13, 8, 13, 7, 4, 3, 80, 10, 50, 5, 2, false, hardy);
        players[0].getPartyPokemons()[0].getMoves()[0] = tackle;
        players[0].getPartyPokemons()[1] = new Pokemon("Charmander", "Char", 4, 20, 4, 100, 5, 5, Constants.PKMN_MALE, 10, 6, 12, 7, 13, 8, 13, 7, 4, 3, 80, 10, 50, 5, 2, false, hardy);
        players[0].getPartyPokemons()[1].getMoves()[0] = tackle;
        players[0].getPartyPokemons()[2] = new Pokemon("Squirtle", "Bubly", 7, 20, 4, 100, 5, 5, Constants.PKMN_MALE, 10, 6, 12, 7, 13, 8, 13, 7, 4, 3, 80, 10, 50, 5, 2, false, hardy);
        players[0].getPartyPokemons()[2].getMoves()[0] = tackle;
        
        Game g = new Game(players);
        View v = new View(g);
        ControllerScanner c = new ControllerScanner(g, v);
        System.out.println("If you want to begin a new game, write 'yes', if not, write 'no'.");
        c.beginNewGame(c.getNewString());
        
        //ATrainer pok = new MyTrainer("jmeno trenera");
        //System.out.println(pok.getMyName());
    }
}
