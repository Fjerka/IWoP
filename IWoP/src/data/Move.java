/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import data.interfaces.IEffect;
import data.interfaces.IMove;

/**
 *
 * @author Stefan
 */
public class Move implements IMove {

    int id, hpCost, energyCost, apCost, category, type, power, defenseRating, accuracy, criticalHitRatio, priority;
    String name, description;
    boolean contact;
    IEffect[] effects;

    public Move(int id, int hpCost, int energyCost, int apCost, int category, int type, int power, int defenseRating, int accuracy, int criticalHitRatio, int priority, String name, String description, boolean contact) {
        this.id = id;
        this.hpCost = hpCost;
        this.energyCost = energyCost;
        this.apCost = apCost;
        this.category = category;
        this.type = type;
        this.power = power;
        this.defenseRating = defenseRating;
        this.accuracy = accuracy;
        this.criticalHitRatio = criticalHitRatio;
        this.priority = priority;
        this.name = name;
        this.description = description;
        this.contact = contact;
        this.effects = new IEffect[3];
    }
    
    
    
    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public int getHPCost() {
        return hpCost;
    }

    @Override
    public int getEnergyCost() {
        return energyCost;
    }

    @Override
    public int getAPCost() {
        return apCost;
    }

    @Override
    public int getCategory() {
        return category;
    }

    @Override
    public int getType() {
        return type;
    }

    @Override
    public int getPower() {
        return power;
    }

    @Override
    public int getDefenseRating() {
        return defenseRating;
    }

    @Override
    public int getAccuracy() {
        return accuracy;
    }

    @Override
    public int getCriticalHitRatio() {
        return criticalHitRatio;
    }

    @Override
    public int getPriority() {
        return priority;
    }

    @Override
    public boolean getContact() {
        return contact;
    }

    @Override
    public IEffect getTargetEffect() {
        return effects[0];
    }

    @Override
    public IEffect getSelfEffect() {
        return effects[1];
    }

    @Override
    public IEffect getBattleEffect() {
        return effects[2];
    }
}
