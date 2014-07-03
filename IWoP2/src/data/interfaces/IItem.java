/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package data.interfaces;

import data.abstact.ATrainer;

/**
 *
 * @author Stefan
 */
public interface IItem {
    
    public double getWeight();
    
    public String getName();
    
    public double getPurchasePrice();
    
    public double getSellingPrice();
    
    public void use(ATrainer trainer, int index);
    
}
