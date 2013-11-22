/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import data.interfaces.Constants;
import data.interfaces.IPlayer;
import data.interfaces.IPokemon;

/**
 *
 * @author Stefan
 */
public class Player implements IPlayer, Constants {

    IPokemon[] party;

    public Player(IPokemon[] party) {
        this.party = party;
    }

    @Override
    public IPokemon getPartyPokemon(int i) {
        if (i >= 0 & i < 6) {
            return party[i];
        } else {
            return null;
        }
    }
}
