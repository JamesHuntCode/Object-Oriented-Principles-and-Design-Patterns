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
public abstract class HotDrink extends Drink {
    
    public void BoilWater() {
        System.out.println("Boiling water...");
    }
    
    public void BrewCoffee() {
        System.out.println("Brewing coffee...");
    }
    
    public void StirTea() {
        System.out.println("Stiring tea...");
    }
    
    public void PourDrinkIntoCup() {
        System.out.println("Pouring drink into cup...");
    }
    
    public void AddMilk() {
        System.out.println("Adding milk...");
    }
    
    public void AddLemon() {
        System.out.println("Adding lemon...");
    }
    
}
