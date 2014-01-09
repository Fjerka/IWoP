/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package data.interfaces;

/**
 *
 * @author Vera
 */
public interface INature {
    
    /**
     * Returns the id of the nature
     * @return id
     */
    int getId();
    
    /**
     * Returns the name of the nature
     * @return name
     */
    String getName();
    
    /**
     * Returns the hit point modifier.
     * @return hit point modifier
     */
    int getHP();
    
    /**
     * Returns the energy modifier.
     * @return energy modifier
     */
    int getEnergy();
    
    /**
     * Returns the attack modifier.
     * @return attack modifier
     */
    int getAttack();
    
    /**
     * Returns the defense modifier.
     * @return defense modifier
     */
    int getDefense();
    
    /**
     * Returns the special attack modifier.
     * @return special attack modifier
     */
    int getSpAttack();
    
    /**
     * Returns the special defense modifier.
     * @return special defense modifier
     */
    int getSpDefens();
    
    /**
     * Returns the accuracy modifier.
     * @return accuracy modifier
     */
    int getAccuracy();
    
    /**
     * Returns the evasiveness modifier.
     * @return evasiveness modifier
     */
    int getEvasiveness();
    
    /**
     * Returns the speed modifier.
     * @return speed modifier
     */
    int getSpeed();
}
