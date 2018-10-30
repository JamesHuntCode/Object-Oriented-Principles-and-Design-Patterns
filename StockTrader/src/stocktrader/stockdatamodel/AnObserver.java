/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stocktrader.stockdatamodel;

import stocktrader.stockdatamodel.utilities.*;

/**
 *
 * @author james
 */
public class AnObserver implements IObserver {
    
    @Override
    public void update() {
        System.out.println("A change has been detected!");
    }
}
