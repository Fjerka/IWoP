/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package data.items;

import data.abstact.ATrainer;
import data.interfaces.IItem;

/**
 *
 * @author Stefan
 */
public class Potion implements IItem{
    
    private double weight, purchasePrice, SellingPrice;
    private int healing;
    private String name;

    @Override
    public double getWeight() {
        return weight;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPurchasePrice() {
        return purchasePrice;
    }

    @Override
    public double getSellingPrice() {
        return SellingPrice;
    }

    @Override
    public void use(ATrainer trainer, int index) {
        
    }
    
}
