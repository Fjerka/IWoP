/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package data.interfaces;

import data.abstracts.ATrainer;

/**
 *
 * @author Vera
 */
public interface IBattle {
    
    /**
     * Returns trainers participating in the battle.
     * @return trainers
     */
    ATrainer[] getTrainers();
    
    /**
     * Return number of pokemon which can trainers use
     * @return number of allowed pokemon
     */
    int getAllowedNumberOfPokemons();
    
    /**
     * Returns round of the battle.
     * @return round
     */
    int getRound();
    
    /**
     * Returns attacking trainer.
     * @return attacking trainer
     */
    ATrainer getAttacker();
    
    /**
     * Returns deffending trainer.
     * @return deffending trainer
     */
    ATrainer getDefender();
    
    /**
     * Returns the array of attackers pokemons
     * @return attackers pokmemons
     */
    IPokemon[] getAttackerPokemons();
    
    /**
     * Returns the array of defenders pokemons.
     * @return defenders pokemons
     */
    IPokemon[] getDefenderPokemons();
    
    /**
     * Checkes if all pokemons for battle are selected.
     * @param pokemons
     * @return true if all pokemons are selected
     */
    boolean areAllPokemonsSelected(IPokemon[] pokemons);
}
