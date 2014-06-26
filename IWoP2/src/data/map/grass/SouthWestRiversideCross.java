/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package data.map.grass;

import data.Location;
import data.Story;
import data.World;
import data.interfaces.IMap;

/**
 *
 * @author Stefan
 */
public class SouthWestRiversideCross implements IMap{
    
    @Override
    public int getID() {
        return 110313;
    }

    @Override
    public String getTileFile() {
        return "images/tiles/grass/southWestRiversideCross.jpg";
    }

    @Override
    public int getMovementPoints() {
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
        return false;
    }
}
