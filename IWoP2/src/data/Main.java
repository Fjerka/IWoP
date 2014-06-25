/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import data.accessibilities.Grass;
import data.interfaces.IAccessibility;

/**
 *
 * @author Stefan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] map = {{1, 1, 1}, {1, 1, 1}, {1, 1, 1}};
        IAccessibility[][] access = {{new Grass(), new Grass(), new Grass()}, {new Grass(), new Grass(), new Grass()}, {new Grass(), new Grass(), new Grass()}};
        Location[] locations = {new Location("lokace 1", map, access)};
        World[] worlds = {new World("New World", locations)};
        Player[] players = {new Player("Ash", "Ketchum", true, 1, null, null, null, 0, 100, 100, 100, 100, 100, 100, 100, 100, 100, null, null, null, locations[0], access[0][0])};
        Game game = new Game(players, worlds);
    }
}
