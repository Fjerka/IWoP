/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package data.moves;

import data.interfaces.IPKMNBonus;

/**
 *
 * @author Stefan
 */
public class PhysicalAttack {
    
    private int id;
    private String name;
    private int power, accuracy;
    private IPKMNBonus bonus;

    public PhysicalAttack(int id, String name, int power, int accuracy, IPKMNBonus bonus) {
        this.id = id;
        this.name = name;
        this.power = power;
        this.accuracy = accuracy;
        this.bonus = bonus;
    }
    
    
    
}
