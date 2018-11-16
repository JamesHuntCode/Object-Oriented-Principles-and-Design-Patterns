/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import interfaces.*;
import model.*;
import guis.*;

/**
 *
 * @author james
 */
public class PubController implements IObserver {

    // Hold instance of the model class:
    PubModel pubModel;
    PubView pubView;
    
    public PubController(PubView view) {
        
        // Configure global variables:
        this.pubView = view;
        this.pubModel = new PubModel();
        this.pubModel.register(this);
        
        // Configure the view:
        pubView.setDropDownValues(pubModel.getDrinks());
        
    }
    
    @Override
    public void update() {
        
        updateView(pubModel.getStepsToMakeLastDrink());

    }
    
    public void buttonClicked() {
        
        pubModel.processDrinkRequest(pubView.getChosenDrink());
        
    }
    
    private void updateView(String[] drinkProcess) {
        
        pubView.postCodeProcessToScreen(drinkProcess);
        
    }
}
