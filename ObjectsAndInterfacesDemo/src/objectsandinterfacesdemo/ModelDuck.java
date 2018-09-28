package objectsandinterfacesdemo;

/**
 *
 * @author James
 */
public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehaviour = new FlyNoWay();
    }
    
    public void display() {
        System.out.print("I'm a model duck...");
    }
}
