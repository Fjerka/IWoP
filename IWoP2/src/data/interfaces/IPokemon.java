/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package data.interfaces;

/**
 *
 * @author Stefan
 */
public interface IPokemon {
    
  public int[] getTypeRatio();
  
  public String getNickname();
  
  public int getHpMax();
  
  public int getHp();
  
  public int getEnergyMax();
  
  public int getEnergy();
  
  public void setPicture(String picture);
  
  public String getPicture();
}
