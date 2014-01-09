/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import data.interfaces.ILocation;
import data.interfaces.IWorld;
import java.util.ArrayList;

/**
 *
 * @author Vera
 */
public class World implements IWorld{
    
    int id;
    String name;
    ILocation[] locations;

    public World(int id, String name, int locations) {
        this.id = id;
        this.name = name;
        this.locations = new ILocation[locations];
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public ILocation[] getLocations() {
        return locations;
    }
}
