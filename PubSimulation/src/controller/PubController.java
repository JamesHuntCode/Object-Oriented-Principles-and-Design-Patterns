/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import interfaces.*;
import model.*;

/**
 *
 * @author james
 */
public class PubController implements IObserver {

    // Hold instance of the model class:
    Model model = new Model();
    
    @Override
    public void update() {
        
    }
    
    // Method to return the list of avaible drinks at the pub.
    public String[] getListOfAvailableDrinks() {
        
        return model.getAvailableDrinks();
        
    }
    
    // Method to pass the user's order through to the model.
    public String[] takeDrinkOrder(String userInput)
    {
        return model.processDrinkRequest(userInput);
    }
}
