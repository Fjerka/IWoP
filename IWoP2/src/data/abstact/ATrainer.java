/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package data.abstact;

import data.interfaces.*;
import java.util.List;

/**
 *
 * @author Stefan
 */
public abstract class ATrainer {
    
    private String firstName, surname;
    private boolean sex;
    private int level;
    private IPokemon[] partyPokemons;
    private IInventory inventory;
    private List<ISkill> skills;

   public ATrainer(String firstName, String surname, boolean sex, int level, IPokemon[] partyPokemons,
           IInventory inventory, List<ISkill> skills) {
        this.firstName = firstName;
        this.surname = surname;
        this.sex = sex;
        this.level = level;
        this.partyPokemons = partyPokemons;
        this.inventory = inventory;
        this.skills = skills;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSurname() {
        return surname;
    }
    
    
    
}
