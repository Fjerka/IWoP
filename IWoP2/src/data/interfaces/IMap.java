/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package data.interfaces;

import data.Location;

/**
 *
 * @author Stefan
 */
public interface IMap {
    
    public int getID();
    
    public String getTileFile();
    
    public int getMovementPoints();
    
    public Location getNewLocation();
    
    public int getNewLocationX();
    
    public int getNewLocationY();
    
    public boolean isAccessible();
    
}
