/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import data.interfaces.IInventory;
import data.interfaces.IPokemon;
import data.interfaces.ISkill;
import data.interfaces.ITrainer;

/**
 *
 * @author Stefan
 */
public class Trainer implements ITrainer {
    
    String name;
    IInventory inventory;
    int id;
    ISkill[] skills;
    IPokemon[] pokemons;
    int[] isDefeated;

    public Trainer(String name, IInventory inventory, int id, ISkill[] skills, IPokemon[] pokemons, int numberOfPlayers) {
        this.name = name;
        this.inventory = inventory;
        this.id = id;
        this.skills = skills;
        this.pokemons = pokemons;
        this.isDefeated = new int[numberOfPlayers];
    }
    
    
    
    @Override
    public String getName() {
        return name;
    }

    @Override
    public IInventory getInventory() {
        return inventory;
    }

    @Override
    public int getID() {
        return id;
    }

    @Override
    public ISkill[] getSkills() {
        return skills;
    }

    @Override
    public IPokemon[] getPartyPokemon() {
        return pokemons;
    }

    @Override
    public int[] isDefeated() {
        return isDefeated;
    }
    
}
