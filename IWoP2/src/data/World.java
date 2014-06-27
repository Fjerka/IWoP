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

    public Location[] getLoactions() {
        return locations;
    }

    public void loadNewLocation(String file, String locationName) throws FileNotFoundException {
        Scanner s = new Scanner(new FileReader(new File(file)));
        int x = s.nextInt();
        int y = s.nextInt();
        IMap[][] map = new IMap[x][y];
        int i = 0, j = 0;
        MapFactory factory = new MapFactory();
        while (s.hasNext()) {
            map[i][j] = factory.create(s.nextInt());
            i++;
            if (i >= x) {
                i = 0;
                j++;
            }
        }
        for (int k = 0; k < locations.length; k++) {
            if (locations[k] == null) {
                locations[k] = new Location(locationName, map, null);
                return;
            }
        }
    }
    
    public String getName(){
        return name;
    }
}
