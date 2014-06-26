/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package data.interfaces;

import data.Location;
import data.Story;
import data.World;

/**
 *
 * @author Stefan
 */
public interface IMap {
    
    /**
     * 6 digit number, first 2 digits represent background category, last 4 
     * digits represent actual tile in this category
     * @return 
     */
    public int getID();
    
    public String getTileFile();
    
    public int getMovementPoints();
    
    public Location getNewLocation();
    
    public int getNewLocationX();
    
    public int getNewLocationY();
    
    public boolean isAccessible(Story story, World world);
    
}
