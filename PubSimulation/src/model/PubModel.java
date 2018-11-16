/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import interfaces.*;
import java.util.*;

/**
 *
 * @author james
 */
public class PubModel implements IObservable {
    
    // Hold an instance of the landlord class:
    private final Landlord staffMember;
    private ArrayList<IObserver> observers;
    private String[] drinks;
    
    private ArrayList<String> stepsForMostRecentDrink;
    
    public PubModel() {
        
        this.staffMember = new Landlord();
        this.observers = new ArrayList<>();
        this.drinks = new String[6];
        this.stepsForMostRecentDrink = new ArrayList<>();
        
        this.drinks[0] = "Tap Drink";
        this.drinks[1] = "Bottle Drink";
        this.drinks[2] = "Tea";
        this.drinks[3] = "Coffee";
        this.drinks[4] = "Long Drink";
        this.drinks[5] = "Cocktail";
        
    }

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
    
    // Method to return the list of available drinks currently at the bar.
    public String[] getDrinks() {
        
        return this.drinks;
        
    }
    
    // Method make a new drink and store it inside this class (the model).
    public void processDrinkRequest(String order) {
        
        this.stepsForMostRecentDrink = new ArrayList<>(Arrays.asList(staffMember.createOrder(order)));
        
        notifyObserver();
        
    }
    
    // Method to return the string values stored inside the ArrayList (steps for making a drink...).
    public String[] getStepsToMakeLastDrink() {
        
        String[] steps = new String[this.stepsForMostRecentDrink.size()];
        
        steps = this.stepsForMostRecentDrink.toArray(steps);
        
        return steps;
        
    }
    
}
