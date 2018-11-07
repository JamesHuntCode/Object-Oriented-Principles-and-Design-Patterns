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
    
    public IServe drinkType;
    
    @Override
    public void ServeDrink() {
        
        if(drinkType != null) {
            
            System.out.println("Fetching you a drink...\n");
            drinkType.ServeDrink();
            
        }
        
    }
    
    public void GetDrink(String order) {
        
        
        
        
        switch (order) {
            case "coffee":
                
                SetDrinkType(new Coffee());
                
                break;
            case "tea":
                
                SetDrinkType(new Tea());
                
                break;
            case "cocktail":
                
                SetDrinkType(new Cocktail());
                
                break;
        }
        
        // Come back later and add in the other types of drinks...
        
    }
    
    private void SetDrinkType(IServe type) {
        
        drinkType = type;
        ServeDrink();
        
    }
}
