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
public class PKMNDetailButtonListener implements ActionListener{
    
    int index;
    Game game;
    View view;

    public PKMNDetailButtonListener(int index, Game game, View view) {
        this.index = index;
        this.game = game;
        this.view = view;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        view.createDetailPokemon(game.getActivePlayer().getPartyPokemons()[index]);
    }
    
}
