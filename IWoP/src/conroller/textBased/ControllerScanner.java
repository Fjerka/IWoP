/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package conroller.textBased;

import data.Battle;
import data.Game;
import data.Pokemon;
import data.abstracts.ATrainer;
import data.interfaces.Constants;
import data.trainers.WildEncounter;
import java.util.Scanner;
import view.textBased.*;

/**
 *
 * @author Stefan
 */
public class ControllerScanner {

    Game g;
    View v;
    Scanner sc;

    public ControllerScanner(Game g, View v) {
        this.g = g;
        this.v = v;
        sc = new Scanner(System.in);
    }

    public String getNewString() {
        return sc.next();
    }

    public void beginNewGame(String t) {
        switch (t) {
            case "yes":
                v.printBeginning();
                v.printMenu();
                GameMenu(sc.nextInt());
                return;
            case "no":
                v.printEnd();
                System.exit(0);
                return;
            default:
                v.printErrorInput();
                beginNewGame(sc.next());
        }
    }

    public void GameMenu(int i) {
        int numOfNeighbours = g.getCurrnetPlayer().getLocation().getNeighbours().length;
        if (i > numOfNeighbours) {
            switch (i - numOfNeighbours) {
                case 1:
                    v.printParty(g.getCurrnetPlayer());
                    runPartyMenu(sc.nextInt());
                    return;
                case 2:
                    ATrainer wild = new WildEncounter("Wild Bulbasaur", g.getCurrnetPlayer().getLocation(), g.getCurrnetPlayer().getWorld());
                    wild.getPartyPokemons()[0] = new Pokemon("Bulbasaur", "Bulbasaur", 1, 20, 4, 100, 5, 5, Constants.PKMN_MALE, 10, 6, 12, 7, 13, 8, 13, 7, 4, 3, 80, 10, 50, 5, 2, false, null);
                    g.setBattle(new Battle(g.getCurrnetPlayer(), wild, 1));
                    v.printBeginnigOfBattle(g.getCurrnetPlayer().getName(), wild.getName(), 1);
                    runBattle();
                    return;
                case 3:
                    v.printEnd();
                    System.exit(0);
                    return;
                default:
                    v.printErrorInput();
                    GameMenu(sc.nextInt());
            }
        } else {
            g.getCurrnetPlayer().moveToNextLocation(i - 1);
            v.printMoveToNextLocation();
            v.printMenu();
            GameMenu(sc.nextInt());
        }
    }

    public void runPartyMenu(int i) {
        switch (i) {
            case 1:
                v.printPKMN(g.getCurrnetPlayer(), 1);
                runPKMN(i, sc.nextInt());
            case 2:
                v.printPKMN(g.getCurrnetPlayer(), 2);
                runPKMN(i, sc.nextInt());
            case 3:
                v.printPKMN(g.getCurrnetPlayer(), 3);
                runPKMN(i, sc.nextInt());
            case 4:
                v.printPKMN(g.getCurrnetPlayer(), 4);
                runPKMN(i, sc.nextInt());
            case 5:
                v.printPKMN(g.getCurrnetPlayer(), 5);
                runPKMN(i, sc.nextInt());
            case 6:
                v.printPKMN(g.getCurrnetPlayer(), 6);
                runPKMN(i, sc.nextInt());
            case 7:
                v.printMenu();
                GameMenu(sc.nextInt());
                return;
            default:
                v.printErrorInput();
                runPartyMenu(sc.nextInt());
        }
    }

    public void runPKMN(int index, int i) {
        switch (i) {
            case 1:
                v.printParty(g.getCurrnetPlayer());
                runPartyMenu(sc.nextInt());
            default:
                v.printErrorInput();
                runPKMN(index, sc.nextInt());
        }
    }
    
    public void runBattle() {
        while (!g.getBattle().areAllPokemonsSelected(g.getBattle().getAttackerPokemons())) {
            if (g.getBattle().getAttacker().getId() >= 5) {
                g.getBattle().getAttacker().selectPokemonForBattle(g.getBattle().getAttackerPokemons(), 0);
                break;
            }
            v.printPickAPokemonForBattle(g.getBattle().getAttacker());
            g.getCurrnetPlayer().selectPokemonForBattle(g.getBattle().getAttackerPokemons(),sc.nextInt() - 1);
        }
        while (!g.getBattle().areAllPokemonsSelected(g.getBattle().getDefenderPokemons())) {
            if (g.getBattle().getDefender().getId() >= 5) {
                g.getBattle().getDefender().selectPokemonForBattle(g.getBattle().getDefenderPokemons(), 0);
                break;
            }
            v.printPickAPokemonForBattle(g.getBattle().getDefender());
            g.getCurrnetPlayer().selectPokemonForBattle(g.getBattle().getDefenderPokemons(),sc.nextInt() - 1);
        }
        v.printBattleView();
    }
}
