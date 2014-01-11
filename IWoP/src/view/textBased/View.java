/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view.textBased;

import data.*;
import data.abstracts.ATrainer;

/**
 *
 * @author Stefan
 */
public class View {

    Game g;
    ViewPokemon pkmn;
    ViewBattle battle;

    public View(Game g) {
        this.g = g;
        this.pkmn = new ViewPokemon();
        this.battle = new ViewBattle();
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
        int i = 1;
        while (i <= g.getCurrnetPlayer().getLocation().getNeighbours().length) {
            System.out.printf("%2d) Move to: %s.%n", i, g.getCurrnetPlayer().getLocation().getNeighbours()[i - 1].getName());
            i++;
        }
        System.out.printf("%2d) Check your party.%n", i);
        System.out.printf("%2d) Encounter a wild pokemon.%n", ++i);
        System.out.printf("%2d) End game.%n", ++i);
    }

    public void printParty(ATrainer trainer) {
        System.out.println("");
        System.out.println("Chose one from the following by writing respective number:");
        for (int i = 0; i < 6; i++) {
            pkmn.printBasicInfo(trainer.getPartyPokemons()[i], i + 1);
        }
        System.out.printf("%2d) Return to main menu.%n", 7);
    }
    
    public void printPKMN(ATrainer trainer, int i){
        System.out.println("");
        pkmn.printAdvancedInfo(trainer.getPartyPokemons()[i-1]);
        System.out.println("");
        System.out.println("Chose one from the following by writing respective number:");
        System.out.printf("%2d) Return to party.%n", 1);
    }
    
    public void printMoveToNextLocation() {
        System.out.println("");
        System.out.println("You have moved to the " + g.getCurrnetPlayer().getLocation().getName() + ".");
    }
    
    public void printBeginnigOfBattle(String player, String trainer, int number) {
        System.out.println("");
        System.out.print(player + " has chalenged " + trainer + " to a battle!");
        if (number > 1) {
            System.out.println(" Trainers may use " + number + " pokemons.");
        } else {
            System.out.println(" Trainers may use 1 pokemon.");
        }
    }
    
    public void printPickAPokemonForBattle(ATrainer trainer) {
        System.out.println("");
        battle.pickAPokemonForBattle();
        printParty(trainer);
    }
    
    public void printBattleView(){
        System.out.println("");
        battle.printBattleView(g.getBattle());
    }
}
