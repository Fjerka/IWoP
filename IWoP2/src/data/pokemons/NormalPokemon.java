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
            int actionPoints, int hpMax, int hp, int attack, int specialAttack, int defense, int specialDefense,
            int speed, int love, int exepriencePoints, IMove[] moves, INature nature) {
        super(id, dexNum, gender, genderRation, height, weight, name, nickname, description,
                energyMax, energy, actionPointsMax, actionPoints, hpMax, hp, attack, specialAttack,
                defense, specialDefense, speed, love, exepriencePoints, moves, nature);
        typeRatio = new int[18];
        typeRatio[0] = 1;
        typeRatio[1] = 1;
        typeRatio[2] = 1;
        typeRatio[3] = 1;
        typeRatio[4] = 1;
        typeRatio[5] = 1;
        typeRatio[6] = 2;
        typeRatio[7] = 1;
        typeRatio[8] = 1;
        typeRatio[9] = 1;
        typeRatio[10] = 1;
        typeRatio[11] = 1;
        typeRatio[12] = 1;
        typeRatio[13] = 0;
        typeRatio[14] = 1;
        typeRatio[15] = 1;
        typeRatio[16] = 1;
        typeRatio[17] = 1;
    }
}
