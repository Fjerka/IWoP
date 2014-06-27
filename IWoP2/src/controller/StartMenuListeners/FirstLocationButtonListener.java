/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller.StartMenuListeners;

import controller.MainScreenListeners.MapKeyboardListener;
import controller.MainScreenListeners.NextTurnButtonListener;
import controller.MainScreenListeners.PKMNDetailButtonListener;
import data.Game;
import gui.MainScreen;
import gui.View;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 *
 * @author Vera
 */
public class FirstLocationButtonListener implements ActionListener{
    
    private View view;
    private Game game;
    
    public FirstLocationButtonListener(View view, Game game) {
        this.view = view;
        this.game = game;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        view.startMenu.closeFrame();
        view.createMainScreen(game.getActivePlayer().getLocation(), game.getActivePlayer().getX(), 
                game.getActivePlayer().getY());
        view.mainScreen.addKeyListener(new MapKeyboardListener(game, view));
        view.mainScreen.getNextTurnButton().addActionListener(new NextTurnButtonListener(game, view));
        for (int i = 0; i < 6; i++) {
            if (view.mainScreen.getPartyDetails()[i] != null){
                view.mainScreen.getPartyDetails()[i].addActionListener(new PKMNDetailButtonListener(i, game, view));
            }
        }
    }
    
}
