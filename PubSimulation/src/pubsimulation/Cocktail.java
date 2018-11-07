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
public class Cocktail extends AlcoholicDrink {

    @Override
    public void ServeDrink() {
        AddIce();
        AddSpirit(2);
        AddMixer();
        AddGarnish("fancy");
    }
    
}
