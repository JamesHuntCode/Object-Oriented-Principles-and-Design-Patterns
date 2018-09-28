package objectsandinterfacesdemo;

/**
 *
 * @author James
 */
public abstract class Duck {
    
    FlyBehaviour flyBehaviour;
    
    public Duck() {
        
    }
    
    public void performFly() {
        flyBehaviour.fly();
    }
    
}
