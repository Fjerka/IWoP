/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package data.interfaces;

import java.util.ArrayList;

/**
 *
 * @author Stefan
 */
public interface IInventory {

    /**
     * Return capacity of inventory in grams.
     *
     * @return capacity
     */
    int getCapacity();

    /**
     * Return list of items in the invenotry.
     *
     * @return list of items
     */
    ArrayList<IItem> getInventory();

    /**
     * Return amount of money in the inventory.
     *
     * @return money
     */
    int getMoney();

    /**
     * Return true, if this change wont lower amount of money below 0 - and
     * change amount of money, or false (doesnt change amount of the money).
     *
     * @param cost cost
     * @return true if possible, false otherwise
     */
    boolean changeMoney(int cost);
}
