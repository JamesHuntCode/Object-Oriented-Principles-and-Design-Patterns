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
public abstract class BottleTapDrink implements IServe {
    
    public String PourDrinkIntoGlass() {
        return "Pouring drink into glass...";
    }
}
