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
public abstract class APokemon implements IPokemon{
    
    private int id, dexNum;
    private boolean gender;
    private double genderRation, height, weight;
    private String name, nickname, description;
    private int energyMax, energy, actionPointsMax, actionPoints, hp, attack, specialAttack, defense, 
            specialDefense, speed, evassiveness, love, exepriencePoints;
    private int hpLevel, actionPointsLevel, attackLevel, specialAttackLevel, defenseLevel, specialDefenseLevel,
            speedLevel, evassivenssLevel;
    private IMove[] moves;
    private INature nature;

    public APokemon() {
    }

    public APokemon(int id, int dexNum, boolean gender, double genderRation, double height, double weight, 
            String name, String nickname, String description, int energyMax, int energy, int actionPointsMax, 
            int actionPoints, int hp, int attack, int specialAttack, int defense, int specialDefense, int speed, 
            int evassiveness, int love, int exepriencePoints, int hpLevel, int actionPointsLevel, int attackLevel, 
            int specialAttackLevel, int defenseLevel, int specialDefenseLevel, int speedLevel, int evassivenssLevel, 
            IMove[] moves, INature nature) {
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
        this.hp = hp;
        this.attack = attack;
        this.specialAttack = specialAttack;
        this.defense = defense;
        this.specialDefense = specialDefense;
        this.speed = speed;
        this.evassiveness = evassiveness;
        this.love = love;
        this.exepriencePoints = exepriencePoints;
        this.hpLevel = hpLevel;
        this.actionPointsLevel = actionPointsLevel;
        this.attackLevel = attackLevel;
        this.specialAttackLevel = specialAttackLevel;
        this.defenseLevel = defenseLevel;
        this.specialDefenseLevel = specialDefenseLevel;
        this.speedLevel = speedLevel;
        this.evassivenssLevel = evassivenssLevel;
        this.moves = moves;
        this.nature = nature;
    }
}
