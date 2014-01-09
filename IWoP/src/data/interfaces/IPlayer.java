/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package data.interfaces;

import java.util.ArrayList;

/**
 *
 * @author Stefan
 */
public interface IPlayer {
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
     * Get obtained badges.
     *
     * @return bages
     */
    int[] getBadges();

    /**
     * Get sex of the player.
     *
     * @return sex
     */
    int getSex();

    /**
     * Get current amount of AP of the player.
     *
     * @return current amount of AP
     */
    int getAP();

    /**
     * Change current amount of AP by param i.
     *
     * @param i change of AP
     */
    /**
     * Change current amount of AP by param i and return true if it was succesful or false otherwise.
     * @param i change of AP
     * @return succes
     */
    boolean changeAP(int i);

    /**
     * Reset current amount of AP to ist original value.
     */
    void resetAP();

    /**
     * Get current location of the player.
     *
     * @return location
     */
    ILocation getLocation();

    /**
     * Get current world of the player.
     *
     * @return world
     */
    IWorld getWorld();

    /**
     * Get current phase of the story of the player.
     *
     * @return phase of the story
     */
    int getStory();

    /**
     * Get current amount of exp of player.
     *
     * @return exp of player
     */
    int getExp();

    /**
     * Get required mount of exp for a new level of the player.
     *
     * @return
     */
    int getRequiredExp();

    /**
     * Change current value of exp by param i
     *
     * @param i change of exp
     */
    void changeExp(int i);

    /**
     * Return current level of the player.
     *
     * @return level
     */
    int getLevel();

    /**
     * Incerease current level of the player by param i. Param i must be higher or equal to 0.
     *
     * @param i change of level
     */
    void increaseLevel(int i);

    /**
     * Get current amount of accumulated skill points of the player.
     *
     * @return amount of skill points
     */
    int getSkillPoints();

    /**
     * Get training methods of the player.
     *
     * @return training methods.
     */
    ITrainingMethod[] getTrainingMethods();
    /**
     * Returns the list of stored pokemon of the player.
     * @return storedPokemon
     */
    ArrayList<IPokemon> getStoredPokemon();
    
    /**
     * Moves the player to the neighbouring location of given index (from the array of neighbours) from currnet location.
     * @param toLocation index of the neighbouring location
     */
    void moveToNextLocation(int toLocation);
}
