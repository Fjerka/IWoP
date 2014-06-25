/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

<<<<<<< HEAD
import gui.MainFrame;
import javax.swing.JFrame;
=======
import data.accessibilities.Grass;
import data.interfaces.IAccessibility;
>>>>>>> 117adb1a330a8b4afc3146c3061bf4a31b7b616e

/**
 *
 * @author Stefan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
<<<<<<< HEAD
        // TODO code application logic here
        JFrame frame = new MainFrame();
=======
        int[][] map = {{1, 1, 1}, {1, 1, 1}, {1, 1, 1}};
        IAccessibility[][] access = {{new Grass(), new Grass(), new Grass()}, {new Grass(), new Grass(), new Grass()}, {new Grass(), new Grass(), new Grass()}};
        Location[] locations = {new Location("lokace 1", map, access)};
        World[] worlds = {new World("New World", locations)};
        Player[] players = {new Player("Ash", "Ketchum", true, 1, null, null, null, 0, 100, 100, 100, 100, 100, 100, 100, 100, 100, null, null, null, locations[0], access[0][0])};
        Game game = new Game(players, worlds);
>>>>>>> 117adb1a330a8b4afc3146c3061bf4a31b7b616e
    }
}
