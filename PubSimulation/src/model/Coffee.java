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
public class Coffee extends HotDrink {

    @Override
    public String[] ServeDrink() {
        
        return new String[] {BoilWater(), BrewCoffee(), PourDrinkIntoCup(), AddMilk()};
        
    }
    
    public String BrewCoffee() {
        return "Brewing coffee...";
    }
    
    public String AddMilk() {
        return "Adding milk...";
    }
    
}
