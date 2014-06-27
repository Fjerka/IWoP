/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import controller.Controller;
import data.interfaces.IMove;
import data.interfaces.INature;
import data.interfaces.IPokemon;
import data.pokemons.NormalPokemon;
import data.quests.SimpleQuest;
import gui.View;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Stefan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        World[] worlds = {new World("New World", 1)};
        try {
            worlds[0].loadNewLocation("location1.txt", "Crossroads");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        Story story = new Story(worlds);
        story.addMainQuest(worlds[0], new SimpleQuest(1));
        IPokemon[] pokemons = {new NormalPokemon(1, 19, true, 50, 0.3, 3.5,
            "Rattata", "Fangy", "Living wherever there is food available, it ceaselessly scavenges for edibles the entire day.",
            100, 100, 15, 15, 15, 28, 12, 17, 17, 36, 0, 0, null, null), null, null, null, null, null};
        Player[] players = {new Player("Ash", "Ketchum", 0, true, 0, 100, 70, 70,
            100, 100, 50, 50, 100, 100, null, null, null, story, worlds[0],
            worlds[0].getLoactions()[0], 1, 1, pokemons, null, null)};
        Game game = new Game(players, worlds);
        View view = new View(game);
        Controller controller = new Controller(game, view);
    }
}

/*
 * 1, 19, true, 50, 0.3, 3.5, 
 "Rattata", "Fangy", "Living wherever there is food available, it ceaselessly scavenges for edibles the entire day.",
 100, 100, 15, 
 15, 15, 28, 12, 17, 17, 36, 
 40, 0, 0, 15, int actionPointsLevel, int attackLevel, 
 int specialAttackLevel, int defenseLevel, int specialDefenseLevel, int speedLevel, int evassivenssLevel, 
 IMove[] moves, INature nature
 */

/*
  1, 19, true, 50, 0.3, 3.5,
 "Rattata", "Fangy", "Living wherever there is food available, it ceaselessly scavenges for edibles the entire day.",
  100, 100, 15,15,
            15, 28, 12, 17, 17, 36,
             0, 0, null, null
 */