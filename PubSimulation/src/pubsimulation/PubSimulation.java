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
public class PubSimulation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Define a new landlord.
        Landlord barStaff = new Landlord();
        
        // Serve a coffee.
        barStaff.GetDrink("coffee");
        
    }
    
}
