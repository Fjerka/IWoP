/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import data.interfaces.IAccessibility;

/**
 *
 * @author Stefan
 */
public class Location {
    
    private String name;
    private int[][] map;
    private IAccessibility[][] accessibilityMap;

    public Location(String name, int[][] map, IAccessibility[][] accessibilityMap) {
        this.name = name;
        this.map = map;
        this.accessibilityMap = accessibilityMap;
    }

   public int[][] getMap(){
       return map;
   }
   
   public IAccessibility[][] getAccessibility(){
       return accessibilityMap;
   }
    
}
