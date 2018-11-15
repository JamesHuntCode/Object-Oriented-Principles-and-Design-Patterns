/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

/**
 *
 * @author james
 */
public interface IObservable {
    
    public void register(IObserver newObserver);
    
    public void unregister(IObserver removeMe);
    
    public void notifyObserver();
    
}
