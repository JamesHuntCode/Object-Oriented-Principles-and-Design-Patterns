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
public class Landlord implements IServe {
    
    private DrinkFactory factory = new DrinkFactory();
    private IServe currentBeverage = null;
    
    @Override
    public void ServeDrink() {
        
        if (currentBeverage != null) {
            
            currentBeverage.ServeDrink();
            
        } else {
            
            System.out.println("We have no stock!");
            
        }
        
    }
    
    public void TakeOrder(String order) {
        
        currentBeverage = factory.createDrink(order);
        ServeDrink();
        
    }
    
}
