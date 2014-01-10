/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package data.interfaces;

/**
 *
 * @author Stefan
 */
public interface IItem {

    /**
     * Returns name of the item.
     *
     * @return name
     */
    String getName();

    /**
     * Returns id of the item.
     *
     * @return id
     */
    int getId();

    /**
     * Return weight of item in grams.
     *
     * @return weight
     */
    int getWeight();

    /**
     * Return how many pieces of this item u have.
     *
     * @return count of the item
     */
    int getCount();
}
