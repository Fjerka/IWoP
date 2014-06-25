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
    private int x, y;

    public Player(String firstName, String surname, boolean sex, int level, IPokemon[] partyPokemons, IInventory inventory, List<ISkill> skills, int currentExp, int maxExp, int currentHunger, int maxHunger, int currentMovementPoints, int maxMovementPoints, int currentExhaustion, int maxExhaustion, int currentCapacity, int maxCapacity, List<ITrainingMethod> trainingMethods, List<IPokemon> storedPokemons, Map<World, List<IBadge>> badges, Location location, int x, int y) {
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
        this.x = x;
        this.y = y;
    }

    public void moveLeft() {
        if (x > 0 && location.getAccessibility()[x - 1][y].getMovementPoints() <= currentMovementPoints) {
            currentMovementPoints -= location.getAccessibility()[x - 1][y].getMovementPoints();
            x--;
        }
    }

    public void moveRight() {
        if (x < location.getAccessibility().length - 1 && location.getAccessibility()[x + 1][y].getMovementPoints() <= currentMovementPoints) {
            currentMovementPoints -= location.getAccessibility()[x + 1][y].getMovementPoints();
            x++;
        }
    }

    public void moveUp() {
        if (y > 0 && location.getAccessibility()[x][y - 1].getMovementPoints() <= currentMovementPoints) {
            currentMovementPoints -= location.getAccessibility()[x][y - 1].getMovementPoints();
            y--;
        }
    }

    public void moveDown() {
        if (y < location.getAccessibility()[x].length - 1 && location.getAccessibility()[x][y + 1].getMovementPoints() <= currentMovementPoints) {
            currentMovementPoints -= location.getAccessibility()[x][y + 1].getMovementPoints();
            y++;
        }
    }
}
