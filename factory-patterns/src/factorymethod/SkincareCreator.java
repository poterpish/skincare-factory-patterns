package factorymethod;

public abstract class SkincareCreator {

    public abstract SkincareProduct createProduct();

    public void useProduct() {
        SkincareProduct product = createProduct();
        product.apply();
    }
}