/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package data.map;

import data.Location;
import data.Story;
import data.World;
import data.interfaces.IMap;

/**
 *
 * @author Stefan
 */
public class Grass implements IMap{
    
    private double accessibility;

    public Grass() {
        accessibility = 0;
    }
    
    

    @Override
    public int getMovementPoints() {
        return 1;
    }

    @Override
    public String getTileFile() {
        return "images/tiles/grass.jpg";
    }

    @Override
    public int getID() {
        return 1;
    }

    @Override
    public Location getNewLocation() {
        return null;
    }

    @Override
    public int getNewLocationX() {
        return -1;
    }

    @Override
    public int getNewLocationY() {
        return -1;
    }

    @Override
    public boolean isAccessible(Story story, World world) {
        return accessibility <= story.getStoryLine(world);
    }
    
}
