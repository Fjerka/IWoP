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
public class LocationSwitch implements IMap{
    
    private String tile;
    private Location newLocation;
    private int newX, newY, movementPoints;

    public LocationSwitch(String tile, Location newLocation, int newX, int newY, int movementPoints) {
        this.tile = tile;
        this.newLocation = newLocation;
        this.newX = newX;
        this.newY = newY;
        this.movementPoints = movementPoints;
    }

    @Override
    public int getID() {
        return 1;
    }

    @Override
    public String getTileFile() {
        return tile;
    }

    @Override
    public int getMovementPoints() {
        return movementPoints;
    }

    @Override
    public Location getNewLocation() {
        return newLocation;
    }

    @Override
    public int getNewLocationX() {
        return newX;
    }

    @Override
    public int getNewLocationY() {
        return newY;
    }

    @Override
    public boolean isAccessible(Story story, World world) {
        return true;
    }
    
}
