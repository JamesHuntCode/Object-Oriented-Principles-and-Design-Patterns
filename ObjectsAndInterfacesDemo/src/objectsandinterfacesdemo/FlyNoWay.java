package objectsandinterfacesdemo;

/**
 *
 * @author James
 */
public abstract class FlyNoWay implements FlyBehaviour {
 
    public void fly() {
        System.out.print("I can't fly...");
    }
    
}
