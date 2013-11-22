/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package data.interfaces;

/**
 *
 * @author Stefan
 */
public interface IPlayer {
    /**
     * Returns pokemon from party on the specified index.
     * @param index index of pokemon
     * @return IPokemon pokemon
     */
    IPokemon getPartyPokemon(int i);
}
