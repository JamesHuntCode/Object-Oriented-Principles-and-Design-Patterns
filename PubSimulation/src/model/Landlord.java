/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import pubsimulation.*;
import interfaces.IServe;

/**
 *
 * @author james
 */
public class Landlord implements IServe {
    
    private final DrinkFactory factory = new DrinkFactory();
    private IServe currentBeverage = null;
    
    @Override
    public String[] ServeDrink() {
        
        if (currentBeverage != null) {
            
            return currentBeverage.ServeDrink();
            
        } else {
            
            return new String[] {"We have no stock!"};
            
        }
        
    }
    
    public String[] createOrder(String order) {
        
        currentBeverage = factory.createDrink(order);
        
        return ServeDrink();
        
    }
    
}
