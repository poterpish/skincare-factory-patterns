package factorymethod;

public class FactoryMethodMain {

    public static void main(String[] args) {
        SkincareCreator creator;

        creator = new CleanserCreator();
        creator.useProduct();

        creator = new TonerCreator();
        creator.useProduct();

        creator = new SerumCreator();
        creator.useProduct();
    }
}