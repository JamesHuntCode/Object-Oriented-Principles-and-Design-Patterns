/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import interfaces.*;
import java.util.*;
import model.*;

/**
 *
 * @author james
 */
public class Model implements IObservable {
    
    // Hold an instance of the landlord class:
    Landlord staffMember = new Landlord();
    ArrayList<IObserver> observers = new ArrayList<>();

    @Override
    public void register(IObserver newObserver) {
        
        observers.add(newObserver);
        
    }

    @Override
    public void unregister(IObserver removeMe) {
        
        observers.remove(removeMe);
        
    }

    @Override
    public void notifyObserver() {
        
        for (IObserver observer : observers) {
            
            observer.update();
            
        }
        
    }
    
    public String[] getAvailableDrinks() {
        
        String[] drinks = new String[6];  
        
        drinks[0] = "Tap Drink";
        drinks[1] = "Bottle Drink";
        drinks[2] = "Tea";
        drinks[3] = "Coffee";
        drinks[4] = "Long Drink";
        drinks[5] = "Cocktail";
        
        return drinks;
        
    }
    
    public String[] processDrinkRequest(String order) {
        
        return staffMember.createOrder(order);
        
    }
    
}
