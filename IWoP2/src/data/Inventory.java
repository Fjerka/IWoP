/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import data.interfaces.IInventory;
import data.interfaces.IItem;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Stefan
 */
public class Inventory implements IInventory {

    private double maxWeight, maxItemWeight;
    private Map<IItem, Integer> items;

    public Inventory(double maxWeight, double maxItemWeight, Map<IItem, Integer> items) {
        this.maxWeight = maxWeight;
        this.maxItemWeight = maxItemWeight;
        this.items = items;
    }

    @Override
    public double getMaxContentWeight() {
        return maxWeight;
    }

    @Override
    public double getMaxItemWeight() {
        return maxItemWeight;
    }

    @Override
    public Map<IItem, Integer> getItems() {
        return items;
    }

    @Override
    public double getCurrentWeightOfContent() {
        Set<IItem> keys = items.keySet();
        double currentWeight = 0;
        for (IItem item : keys) {
            currentWeight += item.getWeight()*items.get(item);
        }
        return currentWeight;
    }

    @Override
    public void addItem(IItem item, int count) {
        if(items.containsKey(item)){
            int itemCurrCount = items.get(item)+count;
            items.remove(item);
            items.put(item, itemCurrCount);
        }else{
            items.put(item, count);
        }
    }
}
