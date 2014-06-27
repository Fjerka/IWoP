/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.MainScreenListeners;

import data.Game;
import gui.View;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Stefan
 */
public class NextTurnButtonListener implements ActionListener{
    
    Game game;
    View view;

    public NextTurnButtonListener(Game game, View view) {
        this.game = game;
        this.view = view;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        game.nextTurn();
        view.updateMainScreen(game.getActivePlayer().getLocation(), game.getActivePlayer().getX(), game.getActivePlayer().getY());
        view.mainScreen.updateDate(game.getTextForStatusLine());
    }
    
}
