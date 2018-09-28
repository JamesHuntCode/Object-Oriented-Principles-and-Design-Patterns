package objectsandinterfacesdemo;

/**
 *
 * @author James
 */
public class ObjectsAndInterfacesDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehaviour(new FlyWithWings());
        model.performFly();
        
    }
    
}
