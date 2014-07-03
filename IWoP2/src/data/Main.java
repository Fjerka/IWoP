/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import controller.Controller;
import data.interfaces.IInventory;
import data.interfaces.IItem;
import data.interfaces.IPokemon;
import data.pokemons.NormalPokemon;
import data.quests.SimpleQuest;
import gui.View;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
        String[] locationFiles = {"location1.txt", "location2.txt"};
        String[] locationNames = {"Crossroads", "Bridge"};
        try {
            System.out.println("yes");
            worlds[0].createLocations(2, locationFiles, locationNames);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        Story story = new Story(worlds);
        story.addMainQuest(worlds[0], new SimpleQuest(1));
        IPokemon[] pokemons = {new NormalPokemon(1, 19, true, 50, 0.3, 3.5,
            "Rattata", "Fangy", "Living wherever there is food available, it ceaselessly scavenges for edibles the entire day.",
            100, 100, 15, 15, 15, 15, 28, 12, 17, 17, 36, 0, 0, null, null), new NormalPokemon(2, 19, true, 50, 0.3, 3.5,
            "Rattata", "Fangy2", "Living wherever there is food available, it ceaselessly scavenges for edibles the entire day.",
            100, 100, 15, 15, 15, 15, 28, 12, 17, 17, 36, 0, 0, null, null), null, null, null, null};
        pokemons[0].setPicture("images/pokemon/019Rattata.png");
        pokemons[1].setPicture("images/pokemon/019Rattata.png");
        List<IInventory> inventories = new ArrayList<>();
        inventories.add(new Inventory(50.0, 20.0, new HashMap<IItem, Integer>()));
        Player[] players = {new Player("Ash", "Ketchum", 0, true, 0, 100, 70, 70,
            100, 100, 50, 50, 100, 100, null, null, null, story, worlds[0],
            worlds[0].getLocations()[0], 1, 1, pokemons, inventories, null)};
        Game game = new Game(players, worlds);
        View view = new View(game);
        Controller controller = new Controller(game, view);
    }
}
