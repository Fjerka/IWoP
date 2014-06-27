/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package data.pokemons;

import data.abstact.APokemon;
import data.interfaces.IMove;
import data.interfaces.INature;

/**
 *
 * @author Vera
 */
public class NormalPokemon extends APokemon{

    public NormalPokemon(int id, int dexNum, boolean gender, double genderRation, double height, double weight, 
            String name, String nickname, String description, int energyMax, int energy, int actionPointsMax, 
            int actionPoints, int hp, int attack, int specialAttack, int defense, int specialDefense, int speed, 
            int evassiveness, int love, int exepriencePoints, int hpLevel, int actionPointsLevel, int attackLevel, 
            int specialAttackLevel, int defenseLevel, int specialDefenseLevel, int speedLevel, int evassivenssLevel, 
            IMove[] moves, INature nature) {
        super(id, dexNum, gender, genderRation, height, weight, name, nickname, description, energyMax, energy, 
                actionPointsMax, actionPoints, hp, attack, specialAttack, defense, specialDefense, speed, evassiveness, 
                love, exepriencePoints, hpLevel, actionPointsLevel, attackLevel, specialAttackLevel, defenseLevel, 
                specialDefenseLevel, speedLevel, evassivenssLevel, moves, nature);
    }

    
    
}
