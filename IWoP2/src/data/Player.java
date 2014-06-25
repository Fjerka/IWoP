/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import data.interfaces.*;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Stefan
 */
public class Player extends Trainer {

    private int currentExp, maxExp, currentHunger, maxHunger,
            currentMovementPoints, maxMovementPoints, currentExhaustion,
            maxExhaustion, currentCapacity, maxCapacity;
    private List<ITrainingMethod> trainingMethods;
    private List<IPokemon> storedPokemons;
    private Map<World, List<IBadge>> badges;
    private Location location;

    public Player(String firstName, String surname, boolean sex, int level, IPokemon[] partyPokemons, IInventory inventory, List<ISkill> skills, int currentExp, int maxExp, int currentHunger, int maxHunger, int currentMovementPoints, int maxMovementPoints, int currentExhaustion, int maxExhaustion, int currentCapacity, int maxCapacity, List<ITrainingMethod> trainingMethods, List<IPokemon> storedPokemons, Map<World, List<IBadge>> badges, Location location) {
        super(firstName, surname, sex, level, partyPokemons, inventory, skills);
        this.currentExp = currentExp;
        this.maxExp = maxExp;
        this.currentHunger = currentHunger;
        this.maxHunger = maxHunger;
        this.currentMovementPoints = currentMovementPoints;
        this.maxMovementPoints = maxMovementPoints;
        this.currentExhaustion = currentExhaustion;
        this.maxExhaustion = maxExhaustion;
        this.currentCapacity = currentCapacity;
        this.maxCapacity = maxCapacity;
        this.trainingMethods = trainingMethods;
        this.storedPokemons = storedPokemons;
        this.badges = badges;
        this.location = location;
    }
}
