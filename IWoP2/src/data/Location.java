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
    
    private int[][] map;
    private IAccessibility[][] accessibilityMap;

    public Location(int[][] map, IAccessibility[][] accessibilityMap) {
        this.map = map;
        this.accessibilityMap = accessibilityMap;
    }
    
    
}
