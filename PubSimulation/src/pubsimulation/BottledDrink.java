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
public class BottledDrink extends BottleTapDrink {

    @Override
    public void ServeDrink() {
        OpenBottle();
        PourDrinkIntoGlass();
    }
    
    public void OpenBottle() {
        System.out.println("Opening bottle...");
    }
    
}