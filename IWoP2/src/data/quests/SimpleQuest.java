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
    private boolean completed;

    public SimpleQuest() {
    }

    public SimpleQuest(double id) {
        this.id = id;
        completed = false;
    }

    @Override
    public double getID() {
        return id;
    }

    @Override
    public boolean isCompleted() {
        return completed;
    }
    
}
