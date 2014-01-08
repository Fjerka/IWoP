/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package conroller.textBased;

import data.Game;
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
        switch (i) {
            case 1:
                v.printParty();
                runPartyMenu(sc.nextInt());
                return;

            case 2:
                v.printEnd();
                System.exit(0);
                return;
            default:
                v.printErrorInput();
                GameMenu(sc.nextInt());
        }
    }

    public void runPartyMenu(int i) {
        switch (i) {
            case 1:
                v.printPKMN(1);
                runPKMN(i, sc.nextInt());
            case 2:
                v.printPKMN(1);
                runPKMN(i, sc.nextInt());
            case 3:
                v.printPKMN(1);
                runPKMN(i, sc.nextInt());
            case 4:
                v.printPKMN(1);
                runPKMN(i, sc.nextInt());
            case 5:
                v.printPKMN(1);
                runPKMN(i, sc.nextInt());
            case 6:
                v.printPKMN(1);
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
    
    public void runPKMN(int index, int i){
        switch (i){
            case 1:
                v.printParty();
                runPartyMenu(sc.nextInt());
            default:
                v.printErrorInput();
                runPKMN(index, sc.nextInt());
        }
    }
}
