/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package data.interfaces;

import java.util.Map;

/**
 *
 * @author Stefan
 */
public interface IInventory {
    
    public double getCurrentWeightOfContent();
    
    public double getMaxContentWeight();
    
    public double getMaxItemWeight();
    
    public Map<IItem, Integer> getItems();
    
    public void addItem(IItem item, int count);
    
}
