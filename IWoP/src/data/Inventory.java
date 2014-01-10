/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import data.interfaces.IInventory;
import data.interfaces.IItem;
import java.util.ArrayList;

/**
 *
 * @author Stefan
 */
public class Inventory implements IInventory{

    int capacity, money;
    ArrayList<IItem> inventory;

    public Inventory(int capacity, int money) {
        this.capacity = capacity;
        this.money = money;
        this.inventory = new ArrayList<>();
    }
    
    
    
    @Override
    public int getCapacity() {
        return capacity;
    }

    @Override
    public ArrayList<IItem> getInventory() {
        return inventory;
    }

    @Override
    public int getMoney() {
        return money;
    }

    @Override
    public boolean changeMoney(int cost) {
        if (money + cost >= 0){
            money += cost;
            return true;
        }else{
            return false;
        }
    }
    
}
