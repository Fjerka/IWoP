/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import data.interfaces.IMap;
import data.interfaces.INPC;
import data.map.LocationSwitch;
import data.map.MapFactory;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/**
 *
 * @author Stefan
 */
public class Location {

    private String name;
    private IMap[][] map;
    private INPC[][] npcs;

    public Location(String name) {
        this.name = name;
    }

    public Location(String name, IMap[][] map, INPC[][] npcs) {
        this.name = name;
        this.map = map;
        this.npcs = npcs;
    }

    public IMap[][] getMap() {
        return map;
    }

    public String getName() {
        return name;
    }

    public void loadNewLocation(String file, Location[] locations) throws FileNotFoundException {
        Scanner s = new Scanner(new FileReader(new File(file)));
        int x = s.nextInt();
        int y = s.nextInt();
        map = new IMap[x][y];
        int i = 0, j = 0;
        MapFactory factory = new MapFactory();
        while (s.hasNext() && j < y) {
            map[i][j] = factory.create(s.nextInt());
            i++;
            if (i >= x) {
                i = 0;
                j++;
            }
        }
        int tmpX, tmpY;
        while (s.hasNext()) {
            tmpX = s.nextInt();
            tmpY = s.nextInt();
            int loca = s.nextInt();
            int nx = s.nextInt();
            int ny = s.nextInt();
            System.out.println(tmpX + " " + tmpY + " " + loca + " " + nx + " " + ny);
            map[tmpX][tmpY] = new LocationSwitch(map[tmpX][tmpY].getTileFile(), locations[loca], nx, ny, map[tmpX][tmpY].getMovementPoints());
        }
    }
}
