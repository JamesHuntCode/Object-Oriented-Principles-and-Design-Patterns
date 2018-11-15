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
public class Tea extends HotDrink {

    @Override
    public String[] ServeDrink() {
        
        return new String[] {BoilWater(), StirTea(), PourDrinkIntoCup(), AddLemon()};
        
    }
    
    public String StirTea() {
        return "Stiring tea...";
    }
    
    public String AddLemon() {
        return "Adding lemon...";
    }
    
}
