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
    
    private int[] typeRatio = {1, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1};

    public NormalPokemon(int id, int dexNum, boolean gender, double genderRation, double height, double weight,
            String name, String nickname, String description, int energyMax, int energy, int actionPointsMax,
            int actionPoints, int hp, int attack, int specialAttack, int defense, int specialDefense, int speed,
            int love, int exepriencePoints, IMove[] moves, INature nature) {
        super(id, dexNum, gender, genderRation, height, weight, name, nickname, description,
                energyMax, energy, actionPointsMax, actionPoints, hp, attack, specialAttack,
                defense, specialDefense, speed, love, exepriencePoints, moves, nature);
    }

    
    
}
