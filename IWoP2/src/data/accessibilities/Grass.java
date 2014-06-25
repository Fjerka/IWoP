/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package data.accessibilities;

import data.interfaces.IAccessibility;

/**
 *
 * @author Stefan
 */
public class Grass implements IAccessibility{

    @Override
    public int getMovementPoints() {
        return 1;
    }
    
}
