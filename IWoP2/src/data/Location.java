/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import data.interfaces.IMap;

/**
 *
 * @author Stefan
 */
public class Location {
    
    private String name;
    private IMap[][] map;

    public Location(String name, IMap[][] map) {
        this.name = name;
        this.map = map;
    }
   
   public IMap[][] getMap(){
       return map;
   }
}
