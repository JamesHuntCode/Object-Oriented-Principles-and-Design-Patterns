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
public class Tea extends HotDrink {

    @Override
    public void ServeDrink() {
        BoilWater();
        StirTea();
        PourDrinkIntoCup();
        AddLemon();
    }
    
    public void StirTea() {
        System.out.println("Stiring tea...");
    }
    
    public void AddLemon() {
        System.out.println("Adding lemon...");
    }
    
}
