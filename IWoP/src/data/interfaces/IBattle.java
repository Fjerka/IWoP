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
    ATrainer getDeffender();
}
