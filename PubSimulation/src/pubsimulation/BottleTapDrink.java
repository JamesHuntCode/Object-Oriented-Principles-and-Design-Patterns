/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pubsimulation;

/**
 *
 * @author james
 */
public abstract class BottleTapDrink extends Drink {
    
    public void OpenBottle() {
        System.out.println("Opening bottle...");
    }
    
    public void PutGlassUnderTap() {
        System.out.println("Putting glass under tap...");
    }
    
    public void PourDrinkIntoGlass() {
        System.out.println("Pouring drink into glass...");
    }
}
