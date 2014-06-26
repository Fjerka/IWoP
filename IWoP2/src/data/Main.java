/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import controller.Controller;
import data.interfaces.IBadge;
import data.interfaces.IInventory;
import data.map.Grass;
import data.interfaces.IMap;
import data.interfaces.IPokemon;
import data.interfaces.ISkill;
import data.interfaces.ITrainingMethod;
import data.quests.SimpleQuest;
import gui.View;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Stefan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        IMap[][] access = {{new Grass(), new Grass(), new Grass(), new Grass(), new Grass(), new Grass()},
            {new Grass(), new Grass(), new Grass(), new Grass(), new Grass(), new Grass()},
            {new Grass(), new Grass(), new Grass(), new Grass(), new Grass(), new Grass()},
            {new Grass(), new Grass(), new Grass(), new Grass(), new Grass(), new Grass()},
            {new Grass(), new Grass(), new Grass(), new Grass(), new Grass(), new Grass()},
            {new Grass(), new Grass(), new Grass(), new Grass(), new Grass(), new Grass()}};
        Location[] locations = {new Location("lokace 1", access)};
        World[] worlds = {new World("New World", locations)};
        Story story = new Story(worlds);
        story.addMainQuest(worlds[0], new SimpleQuest(1));
        Player[] players = {new Player("Ash", "Ketchum", 0, true, 0, 100, 100, 100,
                100, 100, 100, 100, 100, 100, null, null, null, story, worlds[0],
                locations[0], 0, 0, null, null, null)};

        Game game = new Game(players, worlds);
        View view = new View(game);
        Controller controller = new Controller(game, view);
    }
}
/*
 "Ash", "Ketchum",0, true,  0, 100,
            100,100, 100,100,
            100, 100, 100, 100,
            null, null,
            null, story, worlds[0], locations[0], 0, 0,
            null, null, null
 
 */