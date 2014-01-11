/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view.textBased;

import data.interfaces.Constants;
import data.interfaces.IBattle;

/**
 *
 * @author Vera
 */
public class ViewBattle {
    
    public void pickAPokemonForBattle() {
        System.out.println("Pick a pokemon for battle by writing respective number.");
        System.out.println("Pokemon which is selected first will battle first.");
    }
    
    public void printBattleView(IBattle battle){
        String state1, state2;
        switch (battle.getAttackerPokemons()[0].getState()) {
            case Constants.PKMN_FAINTED:
                state1 = "fainted";
                break;
            case Constants.PKMN_EXHAUSTED:
                state1 = "exhausted";
                break;
            case Constants.PKMN_VERY_TIRED:
                state1 = "very tired";
                break;
            case Constants.PKMN_TIRED:
                state1 = "tired";
                break;
            case Constants.PKMN_NORMAL:
                state1 = "normal";
                break;
            case Constants.PKMN_RESTED:
                state1 = "rested";
                break;
            default:
                state1 = "ERROR";
        }
        switch (battle.getDefenderPokemons()[0].getState()) {
            case Constants.PKMN_FAINTED:
                state2 = "fainted";
                break;
            case Constants.PKMN_EXHAUSTED:
                state2 = "exhausted";
                break;
            case Constants.PKMN_VERY_TIRED:
                state2 = "very tired";
                break;
            case Constants.PKMN_TIRED:
                state2 = "tired";
                break;
            case Constants.PKMN_NORMAL:
                state2 = "normal";
                break;
            case Constants.PKMN_RESTED:
                state2 = "rested";
                break;
            default:
                state2 = "ERROR";
        }
        
        System.out.printf("%-34s __________________ %-34s%n", battle.getAttacker().getName(),battle.getDefender().getName() );
        System.out.printf("%-15s %3d/%-3d %-10s __________________ %-15s %3d/%-3d %-10s %n", battle.getAttackerPokemons()[0].getName(), battle.getAttackerPokemons()[0].getHP(),battle.getAttackerPokemons()[0].getMaxHP(), state1, battle.getDefenderPokemons()[0].getName(), battle.getDefenderPokemons()[0].getHP(),battle.getDefenderPokemons()[0].getMaxHP(), state2);
    }
}
