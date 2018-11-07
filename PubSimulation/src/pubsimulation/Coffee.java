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
public class Coffee extends HotDrink {

    @Override
    public void ServeDrink() {
        BoilWater();
        BrewCoffee();
        PourDrinkIntoCup();
        AddMilk();
    }
    
    public void BrewCoffee() {
        System.out.println("Brewing coffee...");
    }
    
    public void AddMilk() {
        System.out.println("Adding milk...");
    }
    
}
