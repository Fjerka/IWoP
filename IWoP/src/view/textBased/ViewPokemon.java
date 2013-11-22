/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view.textBased;

import data.interfaces.Constants;
import static data.interfaces.Constants.PKMN_FEMALE;
import static data.interfaces.Constants.PKMN_MALE;
import static data.interfaces.Constants.PKMN_NO_SEX;
import static data.interfaces.Constants.PKMN_VERY_TIRED;
import data.interfaces.IPokemon;

/**
 *
 * @author Stefan
 */
public class ViewPokemon implements Constants {

    public void printBasicInfo(IPokemon p, int i) {
        if (p == null) {
            System.out.printf("%2d)%n", i);
            return;
        }
        String sex;
        switch (p.getSex()) {
            case PKMN_MALE:
                sex = "male";
                break;
            case PKMN_FEMALE:
                sex = "female";
                break;
            case PKMN_NO_SEX:
                sex = "non";
                break;
            default:
                sex = "ERROR";
        }
        System.out.printf("%2d) %-15s %6s Lvl. %-3d%n", i, p.getName(), sex, p.getLvl());
    }

    public void printAdvancedInfo(IPokemon p) {
        if (p == null) {
            return;
        }
        String sex, state;
        switch (p.getSex()) {
            case PKMN_MALE:
                sex = "male";
                break;
            case PKMN_FEMALE:
                sex = "female";
                break;
            case PKMN_NO_SEX:
                sex = "non";
                break;
            default:
                sex = "ERROR";
        }
        switch (p.getState()) {
            case PKMN_FAINTED:
                state = "fainted";
                break;
            case PKMN_EXHAUSTED:
                state = "exhausted";
                break;
            case PKMN_VERY_TIRED:
                state = "very tired";
                break;
            case PKMN_TIRED:
                state = "tired";
                break;
            case PKMN_NORMAL:
                state = "normal";
                break;
            case PKMN_RESTED:
                state = "rested";
                break;
            default:
                state = "ERROR";
        }
        System.out.printf("%-15s %6s%n", p.getName(), sex);
        System.out.printf("Lvl. %-3d Exp. %8d/%-8d%n",p.getLvl(),p.getCurrentExp(),p.getExp());
        System.out.printf("HP: %5d/%-5d Energy: %5d/%-5d it is %-10s%n",p.getHP(),p.getMaxHP(),p.getEnergy(),p.getMaxEnrgy(),state);
        System.out.printf("%-10s %4d   %-11s %4d%n","Attack",p.getAttack(),"Speed",p.getSpeed());
        System.out.printf("%-10s %4d   %-11s %4d%n","Defense",p.getDefense(),"Accuracy",p.getAccuracy());
        System.out.printf("%-10s %4d   %-11s %4d%n","spAttack",p.getSpAttack(),"Evasiveness",p.getEvasiveness());
        System.out.printf("%-10s %4d%n","spDefense",p.getSpDefense());
    }
}
