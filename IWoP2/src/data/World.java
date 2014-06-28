/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import data.interfaces.IMap;
import data.interfaces.INPC;
import data.map.MapFactory;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/**
 *
 * @author Stefan
 */
public class World {

    private String name;
    private Location[] locations;

    public World(String name, int numberOfLocations) {
        this.name = name;
        this.locations = new Location[numberOfLocations];
    }

    public Location[] getLocations() {
        return locations;
    }
    
    public void createLocations(int numberOfLocations, String[] locationFiles,String[] locationNames) throws FileNotFoundException{
        locations = new Location[numberOfLocations];
        for (int i = 0; i < numberOfLocations; i++) {
            locations[i] = new Location(locationNames[i]);  
        }
        for (int i = 0; i < numberOfLocations; i++) {
            locations[i].loadNewLocation(locationFiles[i], locations);
        }   
    }
    
    public String getName(){
        return name;
    }
}
