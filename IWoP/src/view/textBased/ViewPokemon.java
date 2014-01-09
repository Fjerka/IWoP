/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view.textBased;

import data.interfaces.Constants;
import data.interfaces.IPokemon;

/**
 *
 * @author Stefan
 */
public class ViewPokemon{

    public void printBasicInfo(IPokemon p, int i) {
        if (p == null) {
            System.out.printf("%2d)%n", i);
            return;
        }
        String sex;
        switch (p.getGender()) {
            case Constants.PKMN_MALE:
                sex = "male";
                break;
            case Constants.PKMN_FEMALE:
                sex = "female";
                break;
            case Constants.PKMN_GENDERLESS:
                sex = "non";
                break;
            default:
                sex = "ERROR";
        }
        System.out.printf("%2d) %-15s %6s%n", i, p.getName(), sex);
    }

    public void printAdvancedInfo(IPokemon p) {
        if (p == null) {
            return;
        }
        String sex, state;
        switch (p.getGender()) {
            case Constants.PKMN_MALE:
                sex = "male";
                break;
            case Constants.PKMN_FEMALE:
                sex = "female";
                break;
            case Constants.PKMN_GENDERLESS:
                sex = "non";
                break;
            default:
                sex = "ERROR";
        }
        switch (p.getState()) {
            case Constants.PKMN_FAINTED:
                state = "fainted";
                break;
            case Constants.PKMN_EXHAUSTED:
                state = "exhausted";
                break;
            case Constants.PKMN_VERY_TIRED:
                state = "very tired";
                break;
            case Constants.PKMN_TIRED:
                state = "tired";
                break;
            case Constants.PKMN_NORMAL:
                state = "normal";
                break;
            case Constants.PKMN_RESTED:
                state = "rested";
                break;
            default:
                state = "ERROR";
        }
        System.out.printf("%-15s %6s%n", p.getName(), sex);
        System.out.printf("Exp. %8d/%-8d Attitude: %3d%n",p.getCurrentExp(),p.getExp(), p.getLove());
        System.out.printf("HP: %5d/%-5d Energy: %5d/%-5d it is %-10s%n",p.getHP(),p.getMaxHP(),p.getEnergy(),p.getMaxEnrgy(),state);
        System.out.printf("%-10s %4s %6s   %-8s %4s %6s%n","","","Multi.","","","Multi.");
        System.out.printf("%-10s %4d %3d   %-11s %4d %3d%n","Attack",p.getAttack(),p.getAttackMultiplier(),"Speed",p.getSpeed(),p.getSpeedMultiplier());
        System.out.printf("%-10s %4d %3d   %-11s %4d %3d%n","Defense",p.getDefense(),p.getDefenseMultiplier(),"Accuracy",p.getAccuracy(),p.getAccuracyMultiplier());
        System.out.printf("%-10s %4d %3d   %-11s %4d %3d%n","spAttack",p.getSpAttack(),p.getSpAttackMultiplier(),"Evasiveness",p.getEvasiveness(),p.getEvasivenessMultiplier());
        System.out.printf("%-10s %4d %3d%n","spDefense",p.getSpDefense(),p.getSpDefenseMultiplier());
    }
}
