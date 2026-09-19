package factorymethod;

public class Toner implements SkincareProduct {

    @Override
    public void apply() {
        System.out.println("Applying toner to refresh the skin.");
    }
}