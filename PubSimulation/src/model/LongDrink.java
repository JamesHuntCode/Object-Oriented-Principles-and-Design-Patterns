/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import model.AlcoholicDrink;

/**
 *
 * @author james
 */
public class LongDrink extends AlcoholicDrink {

    @Override
    public String[] ServeDrink() {
        
        return new String[] {AddIce(), AddSpirit(1), AddMixer(), AddGarnish("simple")};
        
    }
    
}
