/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data.abstact;

import data.interfaces.IMove;
import data.interfaces.INature;
import data.interfaces.IPokemon;

/**
 *
 * @author Vera
 */
public abstract class APokemon implements IPokemon {

    private int id, dexNum;
    private boolean gender;
    private double genderRation, height, weight;
    private String name, nickname, description, picture;
    private int energyMax, energy, actionPointsMax, actionPoints, hpMax, hp, attack, specialAttack, defense,
            specialDefense, speed, evassiveness, love, exepriencePoints;
    private int hpLevel, actionPointsLevel, attackLevel, specialAttackLevel, defenseLevel, specialDefenseLevel,
            speedLevel, evassivenssLevel;
    private IMove[] moves;
    private INature nature;
    protected int[] typeRatio;

    public APokemon() {
    }

    public APokemon(int id, int dexNum, boolean gender, double genderRation, double height, double weight,
            String name, String nickname, String description, int energyMax, int energy, int actionPointsMax,
            int actionPoints, int hpMax, int hp, int attack, int specialAttack, int defense, int specialDefense,
            int speed, int love, int exepriencePoints, IMove[] moves, INature nature) {
        this.id = id;
        this.dexNum = dexNum;
        this.gender = gender;
        this.genderRation = genderRation;
        this.height = height;
        this.weight = weight;
        this.name = name;
        this.nickname = nickname;
        this.description = description;
        this.energyMax = energyMax;
        this.energy = energy;
        this.actionPointsMax = actionPointsMax;
        this.actionPoints = actionPoints;
        this.hpMax = hpMax;
        this.hp = hp;
        this.attack = attack;
        this.specialAttack = specialAttack;
        this.defense = defense;
        this.specialDefense = specialDefense;
        this.speed = speed;
        this.evassiveness = (this.speed+(this.attack/3)+(this.specialAttack/3)+(this.defense/6)+(this.specialDefense/6))/2;
        this.love = love;
        this.exepriencePoints = exepriencePoints;
        double EX = (this.attack + this.specialAttack + this.defense + this.specialDefense + this.speed + this.evassiveness) / 6.0;
        double[] normalizedValues = {EX / this.attack, EX / this.specialAttack, EX / this.defense, EX / this.specialDefense, EX / this.speed, EX / this.evassiveness};
        double sum = 0;
        for (double d : normalizedValues) {
            sum += d;
        }
        this.hpLevel = hp;
        this.actionPointsLevel = 100;
        this.attackLevel = (int) Math.ceil(60.0 * normalizedValues[0] / sum);
        this.specialAttackLevel = (int) Math.ceil(60.0 * normalizedValues[1] / sum);
        this.defenseLevel = (int) Math.ceil(60.0 * normalizedValues[2] / sum);
        this.specialDefenseLevel = (int) Math.ceil(60.0 * normalizedValues[3] / sum);
        this.speedLevel = (int) Math.ceil(60.0 * normalizedValues[4] / sum);
        this.evassivenssLevel = (int) Math.ceil(60.0 * normalizedValues[5] / sum);
        this.moves = moves;
        this.nature = nature;
    }
    
    @Override
    public int[] getTypeRatio() {
        return typeRatio;
    }

    @Override
    public String getNickname() {
        return nickname;
    }

    @Override
    public int getEnergy() {
        return energy;
    }

    @Override
    public int getEnergyMax() {
        return energyMax;
    }

    @Override
    public int getHp() {
        return hp;
    }

    @Override
    public int getHpMax() {
        return hpMax;
    }

    @Override
    public void setPicture(String picture) {
        this.picture = picture;
    }

    @Override
    public String getPicture() {
        return picture;
    }
    
}
