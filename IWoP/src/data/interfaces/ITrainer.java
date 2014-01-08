/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package data.interfaces;

/**
 *
 * @author Stefan
 */
public interface ITrainer {
    /**
     * Get the name of the trainer.
     * @return name
     */
    String getName();
    /**
     * Get inventory of the trainer.
     * @return inventory
     */
    IInventory getInventory();
    /**
     * Get ID of the trainer.
     * @return ID
     */
    int getID();
    /**
     * Get skills of the trainer.
     * @return skills
     */
    ISkill[] getSkills();
    /**
     * Get six active pokemon of the trainer.
     * @return six active pokemon
     */
    IPokemon[] getPartyPokemon();
    /**
     * Determine if the player is defeated.
     * @return is defeated
     */
    int[] isDefeated();
    
    
    
}
