/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package data.map;

import data.Location;
import data.interfaces.IMap;

/**
 *
 * @author Stefan
 */
public class Grass implements IMap{

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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getNewLocationX() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getNewLocationY() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isAccessible() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
