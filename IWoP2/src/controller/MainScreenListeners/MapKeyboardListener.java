/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.MainScreenListeners;

import data.Game;
import gui.View;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author Stefan
 */
public class MapKeyboardListener implements KeyListener {

    private Game game;
    private View view;

    public MapKeyboardListener(Game game, View view) {
        this.game = game;
        this.view = view;
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_W:
                game.getActivePlayer().moveUp();
                view.mainScreen.repaintMap(game.getActivePlayer(), game.getActivePlayer().getLocation(),
                        game.getActivePlayer().getX(),
                        game.getActivePlayer().getY());
                break;
            case KeyEvent.VK_A:
                game.getActivePlayer().moveLeft();
                view.mainScreen.repaintMap(game.getActivePlayer(), game.getActivePlayer().getLocation(),
                        game.getActivePlayer().getX(),
                        game.getActivePlayer().getY());
                break;
            case KeyEvent.VK_S:
                game.getActivePlayer().moveDown();
                view.mainScreen.repaintMap(game.getActivePlayer(), game.getActivePlayer().getLocation(),
                        game.getActivePlayer().getX(),
                        game.getActivePlayer().getY());
                break;
            case KeyEvent.VK_D:
                game.getActivePlayer().moveRight();
                view.mainScreen.repaintMap(game.getActivePlayer(), game.getActivePlayer().getLocation(),
                        game.getActivePlayer().getX(),
                        game.getActivePlayer().getY());
                break;
            case KeyEvent.VK_UP:
                game.getActivePlayer().moveUp();
                view.mainScreen.repaintMap(game.getActivePlayer(), game.getActivePlayer().getLocation(),
                        game.getActivePlayer().getX(),
                        game.getActivePlayer().getY());
                break;
            case KeyEvent.VK_DOWN:
                game.getActivePlayer().moveDown();
                view.mainScreen.repaintMap(game.getActivePlayer(), game.getActivePlayer().getLocation(),
                        game.getActivePlayer().getX(),
                        game.getActivePlayer().getY());
                break;
            case KeyEvent.VK_LEFT:
                game.getActivePlayer().moveLeft();
                view.mainScreen.repaintMap(game.getActivePlayer(), game.getActivePlayer().getLocation(),
                        game.getActivePlayer().getX(),
                        game.getActivePlayer().getY());
                break;
            case KeyEvent.VK_RIGHT:
                game.getActivePlayer().moveRight();
                view.mainScreen.repaintMap(game.getActivePlayer(), game.getActivePlayer().getLocation(),
                        game.getActivePlayer().getX(),
                        game.getActivePlayer().getY());
                break;
            case KeyEvent.VK_ENTER:
                game.nextTurn();
                view.updateMainScreen(game.getActivePlayer().getLocation(), game.getActivePlayer().getX(), game.getActivePlayer().getY());
                view.mainScreen.updateDate(game.getTextForStatusLine());
            case KeyEvent.VK_E:
                game.getActivePlayer().makeAction(game);
                view.updateMainScreen(game.getActivePlayer().getLocation(), game.getActivePlayer().getX(), game.getActivePlayer().getY());
            default:
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }
}
