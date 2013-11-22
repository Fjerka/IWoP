/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view.textBased;

import data.*;

/**
 *
 * @author Stefan
 */
public class View {

    Game g;
    ViewPokemon pkmn;

    public View(Game g) {
        this.g = g;
        this.pkmn = new ViewPokemon();
    }

    public void printBeginning() {
        System.out.println("");
        System.out.println("New game has begun. Get ready!");
    }

    public void printEnd() {
        System.out.println("");
        System.out.println("Game has ended. Goodbye!");
    }

    public void printErrorInput() {
        System.out.println("");
        System.out.println("I dont understand you. Try again!");
    }

    public void printMenu() {
        System.out.println("");
        System.out.println("Chose one from the following by writing respective number:");
        System.out.printf("%2d) Check your party.%n", 1);
        System.out.printf("%2d) End game.%n", 2);
    }

    public void printParty() {
        System.out.println("");
        System.out.println("Chose one from the following by writing respective number:");
        for (int i = 0; i < 6; i++) {
            pkmn.printBasicInfo(g.getCurrentPlayersPKMN(i), i + 1);
        }
        System.out.printf("%2d) Return to main menu.%n", 7);
    }
    
    public void printPKMN(int i){
        System.out.println("");
        pkmn.printAdvancedInfo(g.getCurrentPlayersPKMN(i-1));
        System.out.println("");
        System.out.println("Chose one from the following by writing respective number:");
        System.out.printf("%2d) Return to party.%n", 1);
    }
}
