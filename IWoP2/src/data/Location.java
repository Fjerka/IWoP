/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import data.interfaces.IMap;
import data.interfaces.INPC;

/**
 *
 * @author Stefan
 */
public class Location {
    
    private String name;
    private IMap[][] map;
    private INPC[][] npcs;

    public Location(String name, IMap[][] map, INPC[][] npcs) {
        this.name = name;
        this.map = map;
        this.npcs = npcs;
    }
   
   public IMap[][] getMap(){
       return map;
   }
   
   public String getName(){
       return name;
   }
}
