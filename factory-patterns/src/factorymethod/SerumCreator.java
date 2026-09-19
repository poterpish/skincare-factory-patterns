package factorymethod;

public class SerumCreator extends SkincareCreator {

    @Override
    public SkincareProduct createProduct() {
        return new Serum();
    }
}