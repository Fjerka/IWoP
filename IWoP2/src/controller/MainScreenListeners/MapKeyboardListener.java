/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.MainScreenListeners;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author Stefan
 */
public class MapKeyboardListener implements KeyListener {

    public MapKeyboardListener() {
        System.out.println("YES");
    }

    @Override
    public void keyTyped(KeyEvent e) {
        System.out.println("Typed: " + e.getKeyCode());
    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("Pressed: " + e.getKeyCode());
    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("Released: " + e.getKeyCode());
    }
}
