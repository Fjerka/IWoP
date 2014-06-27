/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import controller.Controller;
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
        Player[] players = {new Player("Ash", "Ketchum", 0, true, 0, 100, 100, 100,
                10000, 10000, 100, 100, 100, 100, null, null, null, story, worlds[0],
                worlds[0].getLoactions()[0], 1, 1, null, null, null)};

        Game game = new Game(players, worlds);
        View view = new View(game);
        Controller controller = new Controller(game, view);
    }
}
