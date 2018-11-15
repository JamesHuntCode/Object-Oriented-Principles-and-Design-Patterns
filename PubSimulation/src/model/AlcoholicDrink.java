/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import interfaces.IServe;

/**
 *
 * @author james
 */
public abstract class AlcoholicDrink implements IServe {
    
    public String AddIce() {
        return "Adding ice...";
    }
    
    public String AddSpirit(int quantity) {
        return "Adding spirit(s) (" + quantity + ")...";
    }
    
    public String AddMixer() {
        return "Adding mixer...";
    }
    
    public String AddGarnish(String garnishType) {
        
        if (null == garnishType)
        {
            
            return "Adding an unknown garnish...";
            
        }
        else switch (garnishType) {
            
            case "simple":
                
                return "Adding simple garnish...";
                
            case "fancy":
                
                return "Adding fancy garnish...";
                
            default:
                
                return "Adding an unknown garnish...";
                
        }
    }
}
