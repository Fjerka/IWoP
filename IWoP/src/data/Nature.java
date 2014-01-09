/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import data.interfaces.INature;

/**
 *
 * @author Vera
 */
public class Nature implements INature{
    
    String name;
    int id, hp, energy, attack, defense, spAttack, spDefense, accuracy, evasiveness, speed;

    public Nature(String name, int id, int hp, int energy, int attack, int defense, int spAttack, int spDefense, int accuracy, int evasiveness, int speed) {
        this.name = name;
        this.id = id;
        this.hp = hp;
        this.energy = energy;
        this.attack = attack;
        this.defense = defense;
        this.spAttack = spAttack;
        this.spDefense = spDefense;
        this.accuracy = accuracy;
        this.evasiveness = evasiveness;
        this.speed = speed;
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
    public int getHP() {
        return hp;
    }

    @Override
    public int getEnergy() {
        return energy;
    }

    @Override
    public int getAttack() {
        return attack;
    }

    @Override
    public int getDefense() {
        return defense;
    }

    @Override
    public int getSpAttack() {
        return spAttack;
    }

    @Override
    public int getSpDefens() {
        return spDefense;
    }

    @Override
    public int getAccuracy() {
        return accuracy;
    }

    @Override
    public int getEvasiveness() {
        return evasiveness;
    }

    @Override
    public int getSpeed() {
        return speed;
    }
    
}
