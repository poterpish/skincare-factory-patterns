package factorymethod;

public class TonerCreator extends SkincareCreator {

    @Override
    public SkincareProduct createProduct() {
        return new Toner();
    }
}