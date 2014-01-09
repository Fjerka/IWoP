/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package data.interfaces;

import java.util.ArrayList;

/**
 *
 * @author Stefan
 */
public interface IWorld {
    
    /**
     * Get the id of the World.
     * @return id
     */
    int getId();
    
    /**
     * Get the name of the World.
     * @return name
     */
    String getName();
    
    /**
     * Get list of all locations in the World.
     * @return list of Locations
     */
    ILocation[] getLocations();
 }
