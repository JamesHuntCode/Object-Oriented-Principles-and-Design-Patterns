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
public abstract class HotDrink implements IServe {
    
    public String BoilWater() {
        return "Boiling water...";
    }
    

    public String PourDrinkIntoCup() {
        return "Pouring drink into cup...";
    }
    
}
