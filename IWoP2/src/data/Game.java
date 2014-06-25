/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author Stefan
 */
public class Game {
    
    private Player[] players;
    private World[] worlds;
    private Player activePlayer;

    public Game(Player[] players, World[] worlds) {
        this.players = players;
        this.worlds = worlds;
        this.activePlayer = players[0];
    }

    public Player getActivePlayer() {
        return activePlayer;
    }
    
    
    
    
    
}
