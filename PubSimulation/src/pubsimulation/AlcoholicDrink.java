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
public abstract class AlcoholicDrink extends Drink {
    
    public void AddIce() {
        System.out.println("Adding ice...");
    }
    
    public void AddSpirit(int quantity) {
        System.out.println("Adding spirit(s) (" + quantity + ")...");
    }
    
    public void AddMixer() {
        System.out.println("Adding mixer...");
    }
    
    public void AddGarnish(String garnishType) {
        if (garnishType == "simple")
        {
            System.out.println("Adding simple garnish...");
        }
        else if(garnishType == "fancy") {
            System.out.println("Adding fancy garnish...");
        }
        else 
        {
            System.out.println("Adding an unknown garnish...");
        }
    }
}
