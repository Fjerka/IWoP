/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import data.interfaces.IPlayer;
import data.interfaces.IPokemon;

/**
 *
 * @author Stefan
 */
public class Game {

    int currentPlayer;
    IPlayer[] players;

    public Game(IPlayer[] players) {
        currentPlayer = 0;
        this.players = players;
    }

    public void nextPlayer() {
        currentPlayer++;
        currentPlayer = currentPlayer % players.length;
    }

    public IPlayer getCurrnetPlayer() {
        return players[currentPlayer];
    }

    public IPlayer getPlayer(int i) {
        return players[i];
    }

    public IPokemon getPlayersPKMN(int Player, int PKMN) {
        if (Player >= 0 && Player < players.length) {
            return players[Player].getPartyPokemon()[PKMN];
        } else {
            return null;
        }
    }

    public IPokemon getCurrentPlayersPKMN(int PKMN) {
        return players[currentPlayer].getPartyPokemon()[PKMN];
    }
}
