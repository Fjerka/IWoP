/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package data.actionables;

import data.interfaces.IActionable;

/**
 *
 * @author Stefan
 */
public class NPC implements IActionable{
    
    private String firstName, surname;
    private Conversation conversation;

    public NPC(String firstName, String surname) {
        this.firstName = firstName;
        this.surname = surname;
    }

    @Override
    public void makeAction() {
        
    }
    
    
    
}
