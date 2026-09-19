package factorymethod;

public class Cleanser implements SkincareProduct {

    @Override
    public void apply() {
        System.out.println("Applying cleanser to clean the skin.");
    }
}