/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package data.abstracts;

import data.Inventory;
import data.interfaces.Constants;
import data.interfaces.IInventory;
import data.interfaces.ILocation;
import data.interfaces.IMove;
import data.interfaces.IPokemon;
import data.interfaces.ISkill;
import data.interfaces.IWorld;

/**
 *
 * @author Vera
 */
public abstract class ATrainer {
    
    String name;
    int id, level, ap, maxAp, attack, defense, spAttack, spDefense, speed, accuracy, evasiveness;
    ILocation location;
    IWorld world;
    IInventory inventory;
    IPokemon[] partyPokemons;
    ISkill[] skills;

    /**
     * Returns the name of the trainer.
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the trainer to the given value.
     * @param name 
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns the id of the trainer.
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the id of the trainer to the given value.
     * @param id 
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Returns the level of the trainer.
     * @return level
     */
    public int getLevel() {
        return level;
    }

    /**
     * Sets the level of trainer to the given value.
     * @param level 
     */
    public void setLevel(int level) {
        this.level = level;
    }

    /**
     * Returns the current action points of the trainer.
     * @return current action points
     */
    public int getAp() {
        return ap;
    }

    /**
     * Sets the action points of the trainer to the given value.
     * @param ap 
     */
    public void setAp(int ap) {
        this.ap = ap;
    }
    
    /**
     * Change current amount of AP by param i and return true if it was succesful or false otherwise.
     * @param i change of AP
     * @return succes
     */
    public boolean changeAP(int i) {
        if (ap + i >= 0) {
            ap += i;
            return true;
        } else {
            return false;
        }
    }
    
    /**
     * Reset current amount of AP to ist original value.
     */
    public void resetAP() {
        ap = maxAp;
    }

    /**
     * Returns the max number of action points of the trainer.
     * @return maximum of action points
     */
    public int getMaxAp() {
        return maxAp;
    }

    /**
     * Sets the maximum of action points of the trainer to the given value.
     * @param maxAp 
     */
    public void setMaxAp(int maxAp) {
        this.maxAp = maxAp;
    }
    
    /**
     * Return the location of the trainer.
     * @return location
     */
    public ILocation getLocation() {
        return location;
    }

    /**
     * Sets the location of the trainer to the given value.
     * @param location 
     */
    public void setLocation(ILocation location) {
        this.location = location;
    }

    /**
     * Retruns the world where the trainer is situated.
     * @return world
     */
    public IWorld getWorld() {
        return world;
    }

    /**
     * Sets the world where the trainer is situated to the given value.
     * @param world 
     */
    public void setWorld(IWorld world) {
        this.world = world;
    }

    /**
     * Returns the inventry of the trainer.
     * @return inventory
     */
    public IInventory getInventory() {
        return inventory;
    }

    /**
     * Sets the inventrorz of the trainer to the given value.
     * @param inventory 
     */
    public void setInventory(IInventory inventory) {
        this.inventory = inventory;
    }

    /**
     * Retruns the pokemon in the trainers party.
     * @return party pokemon
     */
    public IPokemon[] getPartyPokemons() {
        return partyPokemons;
    }

    /**
     * Sets the pokemon in the trainers party to the given value.
     * @param partyPokemons 
     */
    public void setPartyPokemons(IPokemon[] partyPokemons) {
        this.partyPokemons = partyPokemons;
    }

    /**
     * Returns the skills of the trainer.
     * @return skills
     */
    public ISkill[] getSkills() {
        return skills;
    }

    /**
     * Sets the skill of the trainer to the given value.
     * @param skills 
     */
    public void setSkills(ISkill[] skills) {
        this.skills = skills;
    }
    
    /**
     * Returns number of pokemons in trainers party.
     * @return number of pokemon
     */
    public int getNumberOfPokemonInParty() {
        int number = 0;
        for (int i = 0; i < partyPokemons.length; i++) {
            number = (partyPokemons[i] != null)? number++: number;
        }
        return number;
    }

    /**
     * Returns the attack of the trainer.
     * @return attack
     */
    public int getAttack() {
        return attack;
    }

    /**
     * Sets the attack of the trainer to hte given value.
     * @param attack 
     */
    public void setAttack(int attack) {
        this.attack = attack;
    }

    /**
     * Returns the defense of the trainer.
     * @return defense
     */
    public int getDefense() {
        return defense;
    }

    /**
     * Sets the defense of the trainer to the given value.
     * @param defense 
     */
    public void setDefense(int defense) {
        this.defense = defense;
    }

    /**
     * Returns the special attack of the trainer.
     * @return special attack
     */
    public int getSpAttack() {
        return spAttack;
    }

    /**
     * Sets the special attack of the trainer to the given value.
     * @param spAttack 
     */
    public void setSpAttack(int spAttack) {
        this.spAttack = spAttack;
    }

    /**
     * Return the special defense of the trainer.
     * @return special defense
     */
    public int getSpDefense() {
        return spDefense;
    }

    /**
     * Sets the special defense of the trainer to the given value.
     * @param spDefense 
     */
    public void setSpDefense(int spDefense) {
        this.spDefense = spDefense;
    }

    /**
     * Returns the speed of the trainer.
     * @return speed
     */
    public int getSpeed() {
        return speed;
    }

    /**
     * Sets the speed of the trainer to the given value.
     * @param speed 
     */
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    /**
     * Returns the accuracy of the trainer.
     * @return accuracy
     */
    public int getAccuracy() {
        return accuracy;
    }

    /**
     * Sets the accuracy of the trainer to the given value.
     * @param accuracy 
     */
    public void setAccuracy(int accuracy) {
        this.accuracy = accuracy;
    }

    /**
     * Returns the evasiveness of the trainer.
     * @return evasiveness
     */
    public int getEvasiveness() {
        return evasiveness;
    }

    /**
     * Sets the evasiveness of the trainer to the given value.
     * @param evasiveness 
     */
    public void setEvasiveness(int evasiveness) {
        this.evasiveness = evasiveness;
    }
    
    /**
     * 
     * @return selected attack
     */
    public abstract IMove attack(IPokemon attacker, IPokemon defender);
}
