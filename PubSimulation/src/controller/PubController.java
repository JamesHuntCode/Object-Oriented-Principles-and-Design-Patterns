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
    Model pubModel = new Model();
    String[] currentlyAvailableDrinks;
    
    public PubController() {
        
        pubModel.register(this);
        
    }
    
    @Override
    public void update() {
        
        currentlyAvailableDrinks = pubModel.getAvailableDrinks();

    }
    
    // Method to return the list of avaible drinks at the pub.
    public String[] getListOfAvailableDrinks() {
        
        currentlyAvailableDrinks = pubModel.getAvailableDrinks();
        
        return currentlyAvailableDrinks;
        
    }
    
    // Method to pass the user's order through to the model.
    public String[] takeDrinkOrder(String userInput)
    {
        return pubModel.processDrinkRequest(userInput);
    }
}
