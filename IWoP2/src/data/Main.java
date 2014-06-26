/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import controller.Controller;
import data.accessibilities.Grass;
import data.interfaces.IMap;
import gui.View;

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
        Player[] players = {new Player("Ash", "Ketchum", true, 1, null, null, null,
            0, 100, 100, 100, 100, 100, 100, 100, 100, 100, null, null, null, locations[0], 0, 0)};
        Game game = new Game(players, worlds);
        View view = new View(game);
        Controller controller = new Controller(game, view);
    }
}
