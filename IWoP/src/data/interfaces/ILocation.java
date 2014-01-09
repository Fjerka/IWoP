/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package data.interfaces;

/**
 *
 * @author Stefan
 */
public interface ILocation {
    
    int getId();
    
    String getName();
    
    ILocation[] getNeighbours();
    
    int[] getWildPokemons();
    
    int getBiom();
}
