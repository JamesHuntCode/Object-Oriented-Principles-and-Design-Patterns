/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author james
 */
public class TapDrink extends BottleTapDrink {

    @Override
    public String[] ServeDrink() {
        
        return new String[] {PutGlassUnderTap(), PourDrinkIntoGlass()};
        
    }
    
    public String PutGlassUnderTap() {
        return "Putting glass under tap...";
    }
    
}
