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
public class Rock implements IMap{
    
    @Override
    public int getID() {
        return 110104;
    }

    @Override
    public String getTileFile() {
        return "images/tiles/grass/rock.jpg";
    }

    @Override
    public int getMovementPoints() {
        return 3;
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
        return true;
    }
}
