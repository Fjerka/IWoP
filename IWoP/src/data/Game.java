/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import data.interfaces.IBattle;
import data.interfaces.IPlayer;
import data.interfaces.IPokemon;

/**
 *
 * @author Stefan
 */
public class Game {

    int currentPlayer;
    Player[] players;
    IBattle battle;

    public Game(Player[] players) {
        currentPlayer = 0;
        this.players = players;
    }

    public void nextPlayer() {
        currentPlayer++;
        currentPlayer = currentPlayer % players.length;
    }

    public Player getCurrnetPlayer() {
        return players[currentPlayer];
    }

    public Player getPlayer(int i) {
        return players[i];
    }

    public IPokemon getPlayersPKMN(int Player, int PKMN) {
        if (Player >= 0 && Player < players.length) {
            return players[Player].getPartyPokemons()[PKMN];
        } else {
            return null;
        }
    }

    public IPokemon getCurrentPlayersPKMN(int PKMN) {
        return players[currentPlayer].getPartyPokemons()[PKMN];
    }

    public IBattle getBattle() {
        return battle;
    }

    public void setBattle(IBattle battle) {
        this.battle = battle;
    }
}
