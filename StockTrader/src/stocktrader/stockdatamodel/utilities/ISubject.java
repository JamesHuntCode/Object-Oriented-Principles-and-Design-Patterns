/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stocktrader.stockdatamodel.utilities;

/**
 *
 * @author james
 */
public interface ISubject {
    
    public boolean registerObserver(IObserver o);
    public boolean removeObserver(IObserver o);
    public void notifyObservers();
    
}
