/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package data.interfaces;

/**
 *
 * @author Stefan
 */
public interface IMove {
    
    /**
     * Get the main stat of the move.
     * @return main stat
     */
    int getMainStat();
    /**
     * Get the secondary stat of the move.
     * @return secondary stat
     */
    int getSecondaryStat();
    /**
     * Get the energy cost of the move.
     * @return energy cost
     */
    int getEnergyCost();
    /**
     * Get the HP cost of the move.
     * @return HP cost
     */
    int getHPCost();
    /**
     * Get the type of the move.
     * @return type of the move
     */
    int getType();
    /**
     * Get the duration of the move (usually 1 to 2 turns) .
     * @return duration of the move
     */
    int getDuration();
    /**
     * Get the effect of the move.
     * @return effect
     */
    IEffect getEffect();
    /**
     * Get the AP (action points) cost of the move.
     * @return AP cost
     */
    int getAPCost();
    
    
}
