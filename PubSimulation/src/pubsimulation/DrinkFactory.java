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
public class DrinkFactory {
    
    public IServe createDrink(String request) {
        
        IServe orderedDrink = null;
        
        switch (request) {
            
            case "tap drink":
                
                orderedDrink = new TapDrink();
                
                break;
                
            case "bottle drink":
                
                orderedDrink = new BottledDrink();
                
                break;
                
            case "tea":
                
                orderedDrink = new Tea();
                
                break;
                
            case "coffee":
                
                orderedDrink = new Coffee();
                
                break;
                
            case "long drink":
                
                orderedDrink = new LongDrink();
                
                break;
                
            case "cocktail":
                
                orderedDrink = new Cocktail();
                
                break;
                
        }
        
        return orderedDrink;
        
    }
    
}
