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
public class TapDrink extends BottleTapDrink {

    @Override
    public void ServeDrink() {
        PutGlassUnderTap();
        PourDrinkIntoGlass();
    }
    
    public void PutGlassUnderTap() {
        System.out.println("Putting glass under tap...");
    }
    
}
