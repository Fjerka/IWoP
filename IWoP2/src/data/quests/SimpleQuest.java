/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package data.quests;

import data.interfaces.IQuest;

/**
 *
 * @author Stefan
 */
public class SimpleQuest implements IQuest{
    
    private double id;
    private String name;
    private String description;

    public SimpleQuest() {
    }

    public SimpleQuest(double id) {
        this.id = id;
    }

    @Override
    public double getID() {
        return id;
    }
    
}
