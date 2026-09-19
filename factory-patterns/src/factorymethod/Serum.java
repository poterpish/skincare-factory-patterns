package factorymethod;

public class Serum implements SkincareProduct {

    @Override
    public void apply() {
        System.out.println("Applying serum to hydrate the skin.");
    }
}